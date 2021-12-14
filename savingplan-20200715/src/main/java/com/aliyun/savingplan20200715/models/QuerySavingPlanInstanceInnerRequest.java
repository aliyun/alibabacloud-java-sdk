// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class QuerySavingPlanInstanceInnerRequest extends TeaModel {
    // currentPage
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // endTime
    @NameInMap("EndTime")
    public Float endTime;

    // fromAppCode
    @NameInMap("FromAppCode")
    public String fromAppCode;

    // fromAppName
    @NameInMap("FromAppName")
    public String fromAppName;

    // instanceCode
    @NameInMap("InstanceCode")
    public String instanceCode;

    // instanceFamily
    @NameInMap("InstanceFamily")
    public String instanceFamily;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // region
    @NameInMap("Region")
    public String region;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // spnType
    @NameInMap("SpnType")
    public String spnType;

    // startTime
    @NameInMap("StartTime")
    public Float startTime;

    // userId
    @NameInMap("UserId")
    public String userId;

    public static QuerySavingPlanInstanceInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingPlanInstanceInnerRequest self = new QuerySavingPlanInstanceInnerRequest();
        return TeaModel.build(map, self);
    }

    public QuerySavingPlanInstanceInnerRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuerySavingPlanInstanceInnerRequest setEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }
    public Float getEndTime() {
        return this.endTime;
    }

    public QuerySavingPlanInstanceInnerRequest setFromAppCode(String fromAppCode) {
        this.fromAppCode = fromAppCode;
        return this;
    }
    public String getFromAppCode() {
        return this.fromAppCode;
    }

    public QuerySavingPlanInstanceInnerRequest setFromAppName(String fromAppName) {
        this.fromAppName = fromAppName;
        return this;
    }
    public String getFromAppName() {
        return this.fromAppName;
    }

    public QuerySavingPlanInstanceInnerRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public QuerySavingPlanInstanceInnerRequest setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }
    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    public QuerySavingPlanInstanceInnerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySavingPlanInstanceInnerRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QuerySavingPlanInstanceInnerRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingPlanInstanceInnerRequest setSpnType(String spnType) {
        this.spnType = spnType;
        return this;
    }
    public String getSpnType() {
        return this.spnType;
    }

    public QuerySavingPlanInstanceInnerRequest setStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }
    public Float getStartTime() {
        return this.startTime;
    }

    public QuerySavingPlanInstanceInnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
