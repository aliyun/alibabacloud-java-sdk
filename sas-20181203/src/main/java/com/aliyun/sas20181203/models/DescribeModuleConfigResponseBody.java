// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeModuleConfigResponseBody extends TeaModel {
    /**
     * <p>The number of configurations for the module.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>An array that consists of the configurations.</p>
     */
    @NameInMap("ModuleConfigList")
    public java.util.List<DescribeModuleConfigResponseBodyModuleConfigList> moduleConfigList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The ID of the server group to which the server belongs.</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The IP address of the server.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The region in which the server resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The UUID of the server.</p>
         */
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
        /**
         * <p>The name of the configuration.</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <p>An array that consists of the configuration items.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeModuleConfigResponseBodyModuleConfigListItems> items;

        /**
         * <p>The name of the module.</p>
         */
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
