// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantSecurityConfigsResponseBody extends TeaModel {
    /**
     * <p>The list of parameters.</p>
     */
    @NameInMap("Configs")
    public DescribeTenantSecurityConfigsResponseBodyConfigs configs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTenantSecurityConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantSecurityConfigsResponseBody self = new DescribeTenantSecurityConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantSecurityConfigsResponseBody setConfigs(DescribeTenantSecurityConfigsResponseBodyConfigs configs) {
        this.configs = configs;
        return this;
    }
    public DescribeTenantSecurityConfigsResponseBodyConfigs getConfigs() {
        return this.configs;
    }

    public DescribeTenantSecurityConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs extends TeaModel {
        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("ConfigDescription")
        public String configDescription;

        /**
         * <p>The group of the risk.</p>
         */
        @NameInMap("ConfigGroup")
        public String configGroup;

        /**
         * <p>The name of the risk.</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <p>Indicates whether the risk causes security issues.</p>
         */
        @NameInMap("Risk")
        public Boolean risk;

        /**
         * <p>The description of the risk.</p>
         */
        @NameInMap("RiskDescription")
        public String riskDescription;

        public static DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs self = new DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs setConfigDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }
        public String getConfigDescription() {
            return this.configDescription;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs setConfigGroup(String configGroup) {
            this.configGroup = configGroup;
            return this;
        }
        public String getConfigGroup() {
            return this.configGroup;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs setRisk(Boolean risk) {
            this.risk = risk;
            return this;
        }
        public Boolean getRisk() {
            return this.risk;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs setRiskDescription(String riskDescription) {
            this.riskDescription = riskDescription;
            return this;
        }
        public String getRiskDescription() {
            return this.riskDescription;
        }

    }

    public static class DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs extends TeaModel {
        /**
         * <p>The number of detected tenant security risks.</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <p>The list of risks.</p>
         */
        @NameInMap("SecurityConfigs")
        public java.util.List<DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs> securityConfigs;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the tenant.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs self = new DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs setSecurityConfigs(java.util.List<DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs> securityConfigs) {
            this.securityConfigs = securityConfigs;
            return this;
        }
        public java.util.List<DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigsSecurityConfigs> getSecurityConfigs() {
            return this.securityConfigs;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

    public static class DescribeTenantSecurityConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The unique identifier of the check.</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <p>The time when the check was performed.</p>
         */
        @NameInMap("CheckTime")
        public String checkTime;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The check result.</p>
         */
        @NameInMap("TenantSecurityConfigs")
        public java.util.List<DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs> tenantSecurityConfigs;

        /**
         * <p>The total number of security check items.</p>
         */
        @NameInMap("TotalCheckCount")
        public Integer totalCheckCount;

        /**
         * <p>The total number of detected security risks.</p>
         */
        @NameInMap("TotalRiskCount")
        public Integer totalRiskCount;

        public static DescribeTenantSecurityConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantSecurityConfigsResponseBodyConfigs self = new DescribeTenantSecurityConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigs setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigs setCheckTime(String checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public String getCheckTime() {
            return this.checkTime;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigs setTenantSecurityConfigs(java.util.List<DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs> tenantSecurityConfigs) {
            this.tenantSecurityConfigs = tenantSecurityConfigs;
            return this;
        }
        public java.util.List<DescribeTenantSecurityConfigsResponseBodyConfigsTenantSecurityConfigs> getTenantSecurityConfigs() {
            return this.tenantSecurityConfigs;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigs setTotalCheckCount(Integer totalCheckCount) {
            this.totalCheckCount = totalCheckCount;
            return this;
        }
        public Integer getTotalCheckCount() {
            return this.totalCheckCount;
        }

        public DescribeTenantSecurityConfigsResponseBodyConfigs setTotalRiskCount(Integer totalRiskCount) {
            this.totalRiskCount = totalRiskCount;
            return this;
        }
        public Integer getTotalRiskCount() {
            return this.totalRiskCount;
        }

    }

}
