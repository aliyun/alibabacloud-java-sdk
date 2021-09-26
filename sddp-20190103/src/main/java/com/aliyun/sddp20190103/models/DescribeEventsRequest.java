// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Id")
    public Long id;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("DealUserId")
    public String dealUserId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TypeCode")
    public String typeCode;

    @NameInMap("SubTypeCode")
    public String subTypeCode;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("TargetProductCode")
    public String targetProductCode;

    @NameInMap("UserName")
    public String userName;

    public static DescribeEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsRequest self = new DescribeEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeEventsRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public DescribeEventsRequest setDealUserId(String dealUserId) {
        this.dealUserId = dealUserId;
        return this;
    }
    public String getDealUserId() {
        return this.dealUserId;
    }

    public DescribeEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeEventsRequest setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public String getTypeCode() {
        return this.typeCode;
    }

    public DescribeEventsRequest setSubTypeCode(String subTypeCode) {
        this.subTypeCode = subTypeCode;
        return this;
    }
    public String getSubTypeCode() {
        return this.subTypeCode;
    }

    public DescribeEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeEventsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeEventsRequest setTargetProductCode(String targetProductCode) {
        this.targetProductCode = targetProductCode;
        return this;
    }
    public String getTargetProductCode() {
        return this.targetProductCode;
    }

    public DescribeEventsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
