// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>airec_developers_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Config")
    public GetInstanceResponseBodyConfig config;

    /**
     * <strong>example:</strong>
     * <p>2022-12-14 00:00:00.0</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <strong>example:</strong>
     * <p>2022-10-13 17:34:52.0</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2022-11-05 09:02:30.0</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Initializing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public GetInstanceResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetInstanceResponseBody setConfig(GetInstanceResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetInstanceResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetInstanceResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public GetInstanceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class GetInstanceResponseBodyConfigDataManagements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetInstanceResponseBodyConfigDataManagements build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyConfigDataManagements self = new GetInstanceResponseBodyConfigDataManagements();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyConfigDataManagements setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public GetInstanceResponseBodyConfigDataManagements setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public GetInstanceResponseBodyConfigDataManagements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceResponseBodyConfigEngines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>feature</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetInstanceResponseBodyConfigEngines build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyConfigEngines self = new GetInstanceResponseBodyConfigEngines();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyConfigEngines setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public GetInstanceResponseBodyConfigEngines setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public GetInstanceResponseBodyConfigEngines setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceResponseBodyConfigMonitors extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>featuresets</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>Platform</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetInstanceResponseBodyConfigMonitors build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyConfigMonitors self = new GetInstanceResponseBodyConfigMonitors();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyConfigMonitors setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public GetInstanceResponseBodyConfigMonitors setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public GetInstanceResponseBodyConfigMonitors setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceResponseBodyConfig extends TeaModel {
        @NameInMap("DataManagements")
        public java.util.List<GetInstanceResponseBodyConfigDataManagements> dataManagements;

        @NameInMap("Engines")
        public java.util.List<GetInstanceResponseBodyConfigEngines> engines;

        @NameInMap("Monitors")
        public java.util.List<GetInstanceResponseBodyConfigMonitors> monitors;

        public static GetInstanceResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyConfig self = new GetInstanceResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyConfig setDataManagements(java.util.List<GetInstanceResponseBodyConfigDataManagements> dataManagements) {
            this.dataManagements = dataManagements;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyConfigDataManagements> getDataManagements() {
            return this.dataManagements;
        }

        public GetInstanceResponseBodyConfig setEngines(java.util.List<GetInstanceResponseBodyConfigEngines> engines) {
            this.engines = engines;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyConfigEngines> getEngines() {
            return this.engines;
        }

        public GetInstanceResponseBodyConfig setMonitors(java.util.List<GetInstanceResponseBodyConfigMonitors> monitors) {
            this.monitors = monitors;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyConfigMonitors> getMonitors() {
            return this.monitors;
        }

    }

}
