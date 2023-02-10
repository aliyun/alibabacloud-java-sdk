// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeModuleConfigResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ModuleConfigList")
    public java.util.List<DescribeModuleConfigResponseBodyModuleConfigList> moduleConfigList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeModuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModuleConfigResponseBody self = new DescribeModuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModuleConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeModuleConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeModuleConfigResponseBody setModuleConfigList(java.util.List<DescribeModuleConfigResponseBodyModuleConfigList> moduleConfigList) {
        this.moduleConfigList = moduleConfigList;
        return this;
    }
    public java.util.List<DescribeModuleConfigResponseBodyModuleConfigList> getModuleConfigList() {
        return this.moduleConfigList;
    }

    public DescribeModuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeModuleConfigResponseBodyModuleConfigListItems extends TeaModel {
        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Region")
        public String region;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeModuleConfigResponseBodyModuleConfigListItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModuleConfigResponseBodyModuleConfigListItems self = new DescribeModuleConfigResponseBodyModuleConfigListItems();
            return TeaModel.build(map, self);
        }

        public DescribeModuleConfigResponseBodyModuleConfigListItems setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeModuleConfigResponseBodyModuleConfigListItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeModuleConfigResponseBodyModuleConfigListItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeModuleConfigResponseBodyModuleConfigListItems setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeModuleConfigResponseBodyModuleConfigListItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeModuleConfigResponseBodyModuleConfigListItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeModuleConfigResponseBodyModuleConfigList extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("Items")
        public java.util.List<DescribeModuleConfigResponseBodyModuleConfigListItems> items;

        @NameInMap("ModuleName")
        public String moduleName;

        public static DescribeModuleConfigResponseBodyModuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeModuleConfigResponseBodyModuleConfigList self = new DescribeModuleConfigResponseBodyModuleConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeModuleConfigResponseBodyModuleConfigList setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeModuleConfigResponseBodyModuleConfigList setItems(java.util.List<DescribeModuleConfigResponseBodyModuleConfigListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeModuleConfigResponseBodyModuleConfigListItems> getItems() {
            return this.items;
        }

        public DescribeModuleConfigResponseBodyModuleConfigList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
