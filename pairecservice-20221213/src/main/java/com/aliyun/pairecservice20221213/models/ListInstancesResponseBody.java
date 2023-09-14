// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

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
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

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
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

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
        @NameInMap("DataManagements")
        public java.util.List<ListInstancesResponseBodyInstancesConfigDataManagements> dataManagements;

        @NameInMap("Engines")
        public java.util.List<ListInstancesResponseBodyInstancesConfigEngines> engines;

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

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Config")
        public ListInstancesResponseBodyInstancesConfig config;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

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
