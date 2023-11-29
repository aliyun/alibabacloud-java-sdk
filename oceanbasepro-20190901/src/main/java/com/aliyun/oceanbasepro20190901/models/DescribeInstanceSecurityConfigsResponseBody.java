// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSecurityConfigsResponseBody extends TeaModel {
    @NameInMap("InstanceSecurityConfigs")
    public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs instanceSecurityConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceSecurityConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSecurityConfigsResponseBody self = new DescribeInstanceSecurityConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSecurityConfigsResponseBody setInstanceSecurityConfigs(DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs instanceSecurityConfigs) {
        this.instanceSecurityConfigs = instanceSecurityConfigs;
        return this;
    }
    public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs getInstanceSecurityConfigs() {
        return this.instanceSecurityConfigs;
    }

    public DescribeInstanceSecurityConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs extends TeaModel {
        @NameInMap("ConfigDescription")
        public String configDescription;

        @NameInMap("ConfigGroup")
        public String configGroup;

        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("Risk")
        public Boolean risk;

        @NameInMap("RiskDescription")
        public String riskDescription;

        public static DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs self = new DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs setConfigDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }
        public String getConfigDescription() {
            return this.configDescription;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs setConfigGroup(String configGroup) {
            this.configGroup = configGroup;
            return this;
        }
        public String getConfigGroup() {
            return this.configGroup;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs setRisk(Boolean risk) {
            this.risk = risk;
            return this;
        }
        public Boolean getRisk() {
            return this.risk;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs setRiskDescription(String riskDescription) {
            this.riskDescription = riskDescription;
            return this;
        }
        public String getRiskDescription() {
            return this.riskDescription;
        }

    }

    public static class DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs extends TeaModel {
        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("CheckTime")
        public String checkTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SecurityConfigs")
        public java.util.List<DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs> securityConfigs;

        @NameInMap("TotalCheckCount")
        public Integer totalCheckCount;

        @NameInMap("TotalRiskCount")
        public Integer totalRiskCount;

        public static DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs self = new DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs setCheckTime(String checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public String getCheckTime() {
            return this.checkTime;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs setSecurityConfigs(java.util.List<DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs> securityConfigs) {
            this.securityConfigs = securityConfigs;
            return this;
        }
        public java.util.List<DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigsSecurityConfigs> getSecurityConfigs() {
            return this.securityConfigs;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs setTotalCheckCount(Integer totalCheckCount) {
            this.totalCheckCount = totalCheckCount;
            return this;
        }
        public Integer getTotalCheckCount() {
            return this.totalCheckCount;
        }

        public DescribeInstanceSecurityConfigsResponseBodyInstanceSecurityConfigs setTotalRiskCount(Integer totalRiskCount) {
            this.totalRiskCount = totalRiskCount;
            return this;
        }
        public Integer getTotalRiskCount() {
            return this.totalRiskCount;
        }

    }

}
