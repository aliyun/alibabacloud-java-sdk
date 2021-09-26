// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("LastFinishTimeStart")
    public Long lastFinishTimeStart;

    @NameInMap("LastFinishTimeEnd")
    public Long lastFinishTimeEnd;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("UserType")
    public Integer userType;

    @NameInMap("SensLevelName")
    public String sensLevelName;

    @NameInMap("Source")
    public String source;

    @NameInMap("CheckStatus")
    public Integer checkStatus;

    @NameInMap("NameAccurate")
    public String nameAccurate;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeInstancesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeInstancesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeInstancesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeInstancesRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeInstancesRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstancesRequest setLastFinishTimeStart(Long lastFinishTimeStart) {
        this.lastFinishTimeStart = lastFinishTimeStart;
        return this;
    }
    public Long getLastFinishTimeStart() {
        return this.lastFinishTimeStart;
    }

    public DescribeInstancesRequest setLastFinishTimeEnd(Long lastFinishTimeEnd) {
        this.lastFinishTimeEnd = lastFinishTimeEnd;
        return this;
    }
    public Long getLastFinishTimeEnd() {
        return this.lastFinishTimeEnd;
    }

    public DescribeInstancesRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public DescribeInstancesRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

    public DescribeInstancesRequest setSensLevelName(String sensLevelName) {
        this.sensLevelName = sensLevelName;
        return this;
    }
    public String getSensLevelName() {
        return this.sensLevelName;
    }

    public DescribeInstancesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeInstancesRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeInstancesRequest setNameAccurate(String nameAccurate) {
        this.nameAccurate = nameAccurate;
        return this;
    }
    public String getNameAccurate() {
        return this.nameAccurate;
    }

    public DescribeInstancesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeInstancesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
