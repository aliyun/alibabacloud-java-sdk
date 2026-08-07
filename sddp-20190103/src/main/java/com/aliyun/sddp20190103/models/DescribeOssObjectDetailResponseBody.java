// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the OSS storage object.</p>
     */
    @NameInMap("OssObjectDetail")
    public DescribeOssObjectDetailResponseBodyOssObjectDetail ossObjectDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
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

    public static class DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags extends TeaModel {
        /**
         * <p>The data tag ID of the detection model. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: personal sensitive information.</li>
         * <li><strong>102</strong>: personal information.</li>
         * <li><strong>103</strong>: important data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The data tag name of the detection model. Valid values:</p>
         * <ul>
         * <li>Personal sensitive information.</li>
         * <li>Personal information.</li>
         * <li>Important data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>personal sensitive data</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags self = new DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList extends TeaModel {
        /**
         * <p>The object type name of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>Excel</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The number of times the sensitive data detection rule is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The list of data tags for the detection model that is hit.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags> modelTags;

        /**
         * <p>The risk level ID of the OSS storage object. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: No sensitive data is detected.</li>
         * <li><strong>2</strong>: Level 1 sensitive data.</li>
         * <li><strong>3</strong>: Level 2 sensitive data.</li>
         * <li><strong>4</strong>: Level 3 sensitive data.</li>
         * <li><strong>5</strong>: Level 4 sensitive data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The risk level name of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the sensitive data detection rule that is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
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

        public DescribeOssObjectDetailResponseBodyOssObjectDetailRuleList setModelTags(java.util.List<DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeOssObjectDetailResponseBodyOssObjectDetailRuleListModelTags> getModelTags() {
            return this.modelTags;
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
        /**
         * <p>The name of the bucket to which the OSS storage object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>bucke***</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The object type name of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>Excel</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The name of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>obj_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-***</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The risk level name of the OSS storage object.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The list of sensitive data detection rules that the OSS storage object hits.</p>
         */
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
