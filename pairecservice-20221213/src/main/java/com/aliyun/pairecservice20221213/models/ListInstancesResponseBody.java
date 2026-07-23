// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>A list of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BDB621CB-A81E-5D39-8793-39A365CBCC74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned instances.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesConfigDataManagements extends TeaModel {
        /**
         * <p>The component code.</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The metadata of the component.</p>
         */
        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstancesResponseBodyInstancesConfigDataManagements build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesConfigDataManagements self = new ListInstancesResponseBodyInstancesConfigDataManagements();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesConfigDataManagements setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public ListInstancesResponseBodyInstancesConfigDataManagements setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListInstancesResponseBodyInstancesConfigDataManagements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstancesResponseBodyInstancesConfigEngines extends TeaModel {
        /**
         * <p>The component code.</p>
         * 
         * <strong>example:</strong>
         * <p>feature</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The metadata of the component.</p>
         */
        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstancesResponseBodyInstancesConfigEngines build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesConfigEngines self = new ListInstancesResponseBodyInstancesConfigEngines();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesConfigEngines setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public ListInstancesResponseBodyInstancesConfigEngines setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListInstancesResponseBodyInstancesConfigEngines setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstancesResponseBodyInstancesConfigMonitors extends TeaModel {
        /**
         * <p>The component code.</p>
         * 
         * <strong>example:</strong>
         * <p>featuresets</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The metadata of the component.</p>
         */
        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>Platform</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstancesResponseBodyInstancesConfigMonitors build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesConfigMonitors self = new ListInstancesResponseBodyInstancesConfigMonitors();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesConfigMonitors setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public ListInstancesResponseBodyInstancesConfigMonitors setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListInstancesResponseBodyInstancesConfigMonitors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstancesResponseBodyInstancesConfig extends TeaModel {
        /**
         * <p>A list of data management configurations.</p>
         */
        @NameInMap("DataManagements")
        public java.util.List<ListInstancesResponseBodyInstancesConfigDataManagements> dataManagements;

        /**
         * <p>A list of service engines.</p>
         */
        @NameInMap("Engines")
        public java.util.List<ListInstancesResponseBodyInstancesConfigEngines> engines;

        /**
         * <p>A list of monitoring components.</p>
         */
        @NameInMap("Monitors")
        public java.util.List<ListInstancesResponseBodyInstancesConfigMonitors> monitors;

        public static ListInstancesResponseBodyInstancesConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesConfig self = new ListInstancesResponseBodyInstancesConfig();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesConfig setDataManagements(java.util.List<ListInstancesResponseBodyInstancesConfigDataManagements> dataManagements) {
            this.dataManagements = dataManagements;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesConfigDataManagements> getDataManagements() {
            return this.dataManagements;
        }

        public ListInstancesResponseBodyInstancesConfig setEngines(java.util.List<ListInstancesResponseBodyInstancesConfigEngines> engines) {
            this.engines = engines;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesConfigEngines> getEngines() {
            return this.engines;
        }

        public ListInstancesResponseBodyInstancesConfig setMonitors(java.util.List<ListInstancesResponseBodyInstancesConfigMonitors> monitors) {
            this.monitors = monitors;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesConfigMonitors> getMonitors() {
            return this.monitors;
        }

    }

    public static class ListInstancesResponseBodyInstancesOperatingTool extends TeaModel {
        /**
         * <p>Specifies whether the operating tool is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The tool is enabled.</p>
         * </li>
         * <li><p><code>false</code>: The tool is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsEnable")
        public Boolean isEnable;

        public static ListInstancesResponseBodyInstancesOperatingTool build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesOperatingTool self = new ListInstancesResponseBodyInstancesOperatingTool();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesOperatingTool setIsEnable(Boolean isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public Boolean getIsEnable() {
            return this.isEnable;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The billing method of the instance. Only <code>Subscription</code> (prepaid) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>airec_developers_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The instance configuration.</p>
         */
        @NameInMap("Config")
        public ListInstancesResponseBodyInstancesConfig config;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-14 00:00:00.0</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-13 17:34:52.0</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-05 09:02:30.0</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The configuration of the operating tool.</p>
         */
        @NameInMap("OperatingTool")
        public ListInstancesResponseBodyInstancesOperatingTool operatingTool;

        /**
         * <p>The region ID. Valid values:</p>
         * <ul>
         * <li><p><code>cn-shenzhen</code>: China (Shenzhen)</p>
         * </li>
         * <li><p><code>cn-hangzhou</code>: China (Hangzhou)</p>
         * </li>
         * <li><p><code>cn-beijing</code>: China (Beijing)</p>
         * </li>
         * <li><p><code>cn-shanghai</code>: China (Shanghai)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p><code>Initializing</code>: The instance is initializing.</p>
         * </li>
         * <li><p><code>Stopped</code>: The instance is stopped.</p>
         * </li>
         * <li><p><code>Running</code>: The instance is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initializing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><p><code>basic</code>: Basic Edition</p>
         * </li>
         * <li><p><code>high-level</code>: High-level Edition</p>
         * </li>
         * <li><p><code>advanced</code>: Advanced Edition</p>
         * </li>
         * <li><p><code>standard</code>: Standard Edition</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListInstancesResponseBodyInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInstancesResponseBodyInstances setConfig(ListInstancesResponseBodyInstancesConfig config) {
            this.config = config;
            return this;
        }
        public ListInstancesResponseBodyInstancesConfig getConfig() {
            return this.config;
        }

        public ListInstancesResponseBodyInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListInstancesResponseBodyInstances setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstancesResponseBodyInstances setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setOperatingTool(ListInstancesResponseBodyInstancesOperatingTool operatingTool) {
            this.operatingTool = operatingTool;
            return this;
        }
        public ListInstancesResponseBodyInstancesOperatingTool getOperatingTool() {
            return this.operatingTool;
        }

        public ListInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
