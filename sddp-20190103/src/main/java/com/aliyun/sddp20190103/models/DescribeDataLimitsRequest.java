// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    @NameInMap("CheckStatus")
    public Integer checkStatus;

    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("DatamaskStatus")
    public Integer datamaskStatus;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static DescribeDataLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitsRequest self = new DescribeDataLimitsRequest();
        return TeaModel.build(map, self);
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

    public DescribeDataLimitsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataLimitsRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public DescribeDataLimitsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDataLimitsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataLimitsRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeDataLimitsRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public DescribeDataLimitsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
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

    public DescribeDataLimitsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDataLimitsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
