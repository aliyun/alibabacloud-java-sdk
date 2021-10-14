// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsRequest extends TeaModel {
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("CheckStatus")
    public Integer checkStatus;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DatamaskStatus")
    public Integer datamaskStatus;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDataLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitsRequest self = new DescribeDataLimitsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitsRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public DescribeDataLimitsRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeDataLimitsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataLimitsRequest setDatamaskStatus(Integer datamaskStatus) {
        this.datamaskStatus = datamaskStatus;
        return this;
    }
    public Integer getDatamaskStatus() {
        return this.datamaskStatus;
    }

    public DescribeDataLimitsRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public DescribeDataLimitsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataLimitsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeDataLimitsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataLimitsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDataLimitsRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public DescribeDataLimitsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataLimitsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
