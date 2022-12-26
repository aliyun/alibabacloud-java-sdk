// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRisksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Risks")
    public java.util.List<DescribeRisksResponseBodyRisks> risks;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRisksResponseBody self = new DescribeRisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRisksResponseBody setRisks(java.util.List<DescribeRisksResponseBodyRisks> risks) {
        this.risks = risks;
        return this;
    }
    public java.util.List<DescribeRisksResponseBodyRisks> getRisks() {
        return this.risks;
    }

    public DescribeRisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRisksResponseBodyRisks extends TeaModel {
        @NameInMap("RiskDetail")
        public String riskDetail;

        @NameInMap("RiskId")
        public Long riskId;

        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("RiskType")
        public String riskType;

        @NameInMap("SubRiskType")
        public String subRiskType;

        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        @NameInMap("TypeAlias")
        public String typeAlias;

        public static DescribeRisksResponseBodyRisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRisksResponseBodyRisks self = new DescribeRisksResponseBodyRisks();
            return TeaModel.build(map, self);
        }

        public DescribeRisksResponseBodyRisks setRiskDetail(String riskDetail) {
            this.riskDetail = riskDetail;
            return this;
        }
        public String getRiskDetail() {
            return this.riskDetail;
        }

        public DescribeRisksResponseBodyRisks setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

        public DescribeRisksResponseBodyRisks setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public DescribeRisksResponseBodyRisks setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public DescribeRisksResponseBodyRisks setSubRiskType(String subRiskType) {
            this.subRiskType = subRiskType;
            return this;
        }
        public String getSubRiskType() {
            return this.subRiskType;
        }

        public DescribeRisksResponseBodyRisks setSubTypeAlias(String subTypeAlias) {
            this.subTypeAlias = subTypeAlias;
            return this;
        }
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        public DescribeRisksResponseBodyRisks setTypeAlias(String typeAlias) {
            this.typeAlias = typeAlias;
            return this;
        }
        public String getTypeAlias() {
            return this.typeAlias;
        }

    }

}
