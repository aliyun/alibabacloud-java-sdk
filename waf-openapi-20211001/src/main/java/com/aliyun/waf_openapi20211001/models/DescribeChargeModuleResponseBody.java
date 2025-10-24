// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeModuleResponseBody extends TeaModel {
    @NameInMap("ChargeModules")
    public java.util.List<DescribeChargeModuleResponseBodyChargeModules> chargeModules;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChargeModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeModuleResponseBody self = new DescribeChargeModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChargeModuleResponseBody setChargeModules(java.util.List<DescribeChargeModuleResponseBodyChargeModules> chargeModules) {
        this.chargeModules = chargeModules;
        return this;
    }
    public java.util.List<DescribeChargeModuleResponseBodyChargeModules> getChargeModules() {
        return this.chargeModules;
    }

    public DescribeChargeModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChargeModuleResponseBodyChargeModules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NORMAL_PRICE</p>
         */
        @NameInMap("ChargeMode")
        public String chargeMode;

        @NameInMap("ChargeModeDetails")
        public java.util.List<String> chargeModeDetails;

        /**
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsageUnitFactor")
        public Integer usageUnitFactor;

        public static DescribeChargeModuleResponseBodyChargeModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeChargeModuleResponseBodyChargeModules self = new DescribeChargeModuleResponseBodyChargeModules();
            return TeaModel.build(map, self);
        }

        public DescribeChargeModuleResponseBodyChargeModules setChargeMode(String chargeMode) {
            this.chargeMode = chargeMode;
            return this;
        }
        public String getChargeMode() {
            return this.chargeMode;
        }

        public DescribeChargeModuleResponseBodyChargeModules setChargeModeDetails(java.util.List<String> chargeModeDetails) {
            this.chargeModeDetails = chargeModeDetails;
            return this;
        }
        public java.util.List<String> getChargeModeDetails() {
            return this.chargeModeDetails;
        }

        public DescribeChargeModuleResponseBodyChargeModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeChargeModuleResponseBodyChargeModules setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public DescribeChargeModuleResponseBodyChargeModules setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
        public String getUsageType() {
            return this.usageType;
        }

        public DescribeChargeModuleResponseBodyChargeModules setUsageUnitFactor(Integer usageUnitFactor) {
            this.usageUnitFactor = usageUnitFactor;
            return this;
        }
        public Integer getUsageUnitFactor() {
            return this.usageUnitFactor;
        }

    }

}
