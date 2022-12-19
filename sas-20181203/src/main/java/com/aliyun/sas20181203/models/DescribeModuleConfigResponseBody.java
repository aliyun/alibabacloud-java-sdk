// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeModuleConfigResponseBody extends TeaModel {
    // The number of configurations for the module.
    @NameInMap("Count")
    public Integer count;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // An array that consists of the configurations.
    @NameInMap("ModuleConfigList")
    public java.util.List<DescribeModuleConfigResponseBodyModuleConfigList> moduleConfigList;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the call is successful. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
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
        // The ID of the server group to which the server belongs.
        @NameInMap("GroupId")
        public Integer groupId;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The IP address of the server.
        @NameInMap("Ip")
        public String ip;

        // The region in which the server resides.
        @NameInMap("Region")
        public String region;

        // The UUID of the server.
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
        // The name of the configuration.
        @NameInMap("ConfigName")
        public String configName;

        // The configuration items.
        @NameInMap("Items")
        public java.util.List<DescribeModuleConfigResponseBodyModuleConfigListItems> items;

        // The name of the module.
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
