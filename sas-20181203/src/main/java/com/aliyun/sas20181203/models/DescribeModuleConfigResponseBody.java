// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeModuleConfigResponseBody extends TeaModel {
    /**
     * <p>The number of configurations for the module.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>An array that consists of the configurations of the module.</p>
     */
    @NameInMap("ModuleConfigList")
    public java.util.List<DescribeModuleConfigResponseBodyModuleConfigList> moduleConfigList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>173</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6435dn4t59b9av****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>inStanceName****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>31.13.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>a47e3713-ed22-4015-93a3-d88ebe6****</p>
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
         * 
         * <strong>example:</strong>
         * <p>timescan</p>
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
         * 
         * <strong>example:</strong>
         * <p>alihids</p>
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
