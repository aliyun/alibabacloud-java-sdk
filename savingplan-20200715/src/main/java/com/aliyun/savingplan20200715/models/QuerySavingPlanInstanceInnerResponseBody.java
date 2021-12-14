// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class QuerySavingPlanInstanceInnerResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public QuerySavingPlanInstanceInnerResponseBodyData data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static QuerySavingPlanInstanceInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingPlanInstanceInnerResponseBody self = new QuerySavingPlanInstanceInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySavingPlanInstanceInnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySavingPlanInstanceInnerResponseBody setData(QuerySavingPlanInstanceInnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySavingPlanInstanceInnerResponseBodyData getData() {
        return this.data;
    }

    public QuerySavingPlanInstanceInnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySavingPlanInstanceInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySavingPlanInstanceInnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySavingPlanInstanceInnerResponseBodyDataDatas extends TeaModel {
        // commodityCode
        @NameInMap("CommodityCode")
        public String commodityCode;

        // currency
        @NameInMap("Currency")
        public String currency;

        // cycle
        @NameInMap("Cycle")
        public String cycle;

        // endTime
        @NameInMap("EndTime")
        public Long endTime;

        // instanceFamily
        @NameInMap("InstanceFamily")
        public String instanceFamily;

        // payMode
        @NameInMap("PayMode")
        public String payMode;

        // poolValue
        @NameInMap("PoolValue")
        public Float poolValue;

        // region
        @NameInMap("Region")
        public String region;

        // site
        @NameInMap("Site")
        public String site;

        // spnInstanceCode
        @NameInMap("SpnInstanceCode")
        public String spnInstanceCode;

        // spnInstanceId
        @NameInMap("SpnInstanceId")
        public Long spnInstanceId;

        // spnType
        @NameInMap("SpnType")
        public String spnType;

        // startTime
        @NameInMap("StartTime")
        public Long startTime;

        // status
        @NameInMap("Status")
        public String status;

        // userId
        @NameInMap("UserId")
        public Long userId;

        public static QuerySavingPlanInstanceInnerResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingPlanInstanceInnerResponseBodyDataDatas self = new QuerySavingPlanInstanceInnerResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setInstanceFamily(String instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setPoolValue(Float poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public Float getPoolValue() {
            return this.poolValue;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setSpnInstanceCode(String spnInstanceCode) {
            this.spnInstanceCode = spnInstanceCode;
            return this;
        }
        public String getSpnInstanceCode() {
            return this.spnInstanceCode;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setSpnInstanceId(Long spnInstanceId) {
            this.spnInstanceId = spnInstanceId;
            return this;
        }
        public Long getSpnInstanceId() {
            return this.spnInstanceId;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setSpnType(String spnType) {
            this.spnType = spnType;
            return this;
        }
        public String getSpnType() {
            return this.spnType;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySavingPlanInstanceInnerResponseBodyDataDatas setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class QuerySavingPlanInstanceInnerResponseBodyData extends TeaModel {
        // currentPage
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // datas
        @NameInMap("Datas")
        public java.util.List<QuerySavingPlanInstanceInnerResponseBodyDataDatas> datas;

        // pageSize
        @NameInMap("PageSize")
        public Integer pageSize;

        // totalCount
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySavingPlanInstanceInnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingPlanInstanceInnerResponseBodyData self = new QuerySavingPlanInstanceInnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySavingPlanInstanceInnerResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySavingPlanInstanceInnerResponseBodyData setDatas(java.util.List<QuerySavingPlanInstanceInnerResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<QuerySavingPlanInstanceInnerResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public QuerySavingPlanInstanceInnerResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingPlanInstanceInnerResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
