// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailV2ResponseBody extends TeaModel {
    /**
     * <p>The details of the OSS object.</p>
     */
    @NameInMap("OssObjectDetail")
    public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail ossObjectDetail;

    /**
     * <p>The ID of the request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOssObjectDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailV2ResponseBody self = new DescribeOssObjectDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailV2ResponseBody setOssObjectDetail(DescribeOssObjectDetailV2ResponseBodyOssObjectDetail ossObjectDetail) {
        this.ossObjectDetail = ossObjectDetail;
        return this;
    }
    public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail getOssObjectDetail() {
        return this.ossObjectDetail;
    }

    public DescribeOssObjectDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags extends TeaModel {
        /**
         * <p>The ID of the data tag for the detection model.</p>
         * <ul>
         * <li><p><strong>101</strong>: Personal sensitive information.</p>
         * </li>
         * <li><p><strong>102</strong>: Personal information.</p>
         * </li>
         * <li><p><strong>103</strong>: Important data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data tag for the detection model.</p>
         * <ul>
         * <li><p>Personal sensitive information.</p>
         * </li>
         * <li><p>Personal information.</p>
         * </li>
         * <li><p>Important data.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Personal sensitive information</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags self = new DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList extends TeaModel {
        /**
         * <p>The parent category of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>敏感图片信息</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The number of times the sensitive data detection rule was matched.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>A list of tags for the detection model.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags> modelTags;

        /**
         * <p>The ID of the risk level that is specified in the rule.</p>
         * <ul>
         * <li><p><strong>1</strong>: N/A</p>
         * </li>
         * <li><p><strong>2</strong>: S1</p>
         * </li>
         * <li><p><strong>3</strong>: S2</p>
         * </li>
         * <li><p><strong>4</strong>: S3</p>
         * </li>
         * <li><p><strong>5</strong>: S4</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the risk level that is specified in the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the matched sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ID card number</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList self = new DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setModelTags(java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleListModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class DescribeOssObjectDetailV2ResponseBodyOssObjectDetail extends TeaModel {
        /**
         * <p>The name of the bucket that stores the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>sddp-api-scan-demo</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The parent category of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Sensitive image information</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>Image file</p>
         */
        @NameInMap("FileCategoryName")
        public String fileCategoryName;

        /**
         * <p>The unique ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>1757262735738932224</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The data tags, separated by commas. Example: 101,102. Valid values:</p>
         * <ul>
         * <li><p><strong>101</strong>: Personal sensitive information.</p>
         * </li>
         * <li><p><strong>102</strong>: Personal information.</p>
         * </li>
         * <li><p><strong>107</strong>: General information.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101,102</p>
         */
        @NameInMap("ModelTagIds")
        public String modelTagIds;

        /**
         * <p>The name of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>dir1/test.png</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The access control list (ACL) of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ObjectAcl")
        public String objectAcl;

        /**
         * <p>The ID of the region where the OSS object is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the risk level of the data asset. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: N/A.</p>
         * </li>
         * <li><p><strong>2</strong>: S1.</p>
         * </li>
         * <li><p><strong>3</strong>: S2.</p>
         * </li>
         * <li><p><strong>4</strong>: S3.</p>
         * </li>
         * <li><p><strong>5</strong>: S4.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A return value of 1 or less indicates N/A.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RiskLevelId")
        public Integer riskLevelId;

        /**
         * <p>The name of the risk level of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The list of sensitive data detection rules that the OSS object matches.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList> ruleList;

        /**
         * <p>The size of the file in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        public static DescribeOssObjectDetailV2ResponseBodyOssObjectDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssObjectDetailV2ResponseBodyOssObjectDetail self = new DescribeOssObjectDetailV2ResponseBodyOssObjectDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setFileCategoryName(String fileCategoryName) {
            this.fileCategoryName = fileCategoryName;
            return this;
        }
        public String getFileCategoryName() {
            return this.fileCategoryName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setModelTagIds(String modelTagIds) {
            this.modelTagIds = modelTagIds;
            return this;
        }
        public String getModelTagIds() {
            return this.modelTagIds;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setObjectAcl(String objectAcl) {
            this.objectAcl = objectAcl;
            return this;
        }
        public String getObjectAcl() {
            return this.objectAcl;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRiskLevelId(Integer riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Integer getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setRuleList(java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeOssObjectDetailV2ResponseBodyOssObjectDetailRuleList> getRuleList() {
            return this.ruleList;
        }

        public DescribeOssObjectDetailV2ResponseBodyOssObjectDetail setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
