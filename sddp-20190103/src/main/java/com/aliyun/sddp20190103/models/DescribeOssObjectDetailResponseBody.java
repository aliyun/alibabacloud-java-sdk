// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailResponseBody extends TeaModel {
    @NameInMap("OssObjectDetail")
    public DescribeOssObjectDetailResponseBodyOssObjectDetail ossObjectDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOssObjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailResponseBody self = new DescribeOssObjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailResponseBody setOssObjectDetail(DescribeOssObjectDetailResponseBodyOssObjectDetail ossObjectDetail) {
        this.ossObjectDetail = ossObjectDetail;
        return this;
    }
    public DescribeOssObjectDetailResponseBodyOssObjectDetail getOssObjectDetail() {
        return this.ossObjectDetail;
    }

    public DescribeOssObjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Count")
        public Long count;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList self = new DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class DescribeOssObjectDetailResponseBodyOssObjectDetail extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleList")
        public java.util.List<DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList> ruleList;

        public static DescribeOssObjectDetailResponseBodyOssObjectDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailResponseBodyOssObjectDetail self = new DescribeOssObjectDetailResponseBodyOssObjectDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetail setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetail setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetail setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetail setRuleList(java.util.List<DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
