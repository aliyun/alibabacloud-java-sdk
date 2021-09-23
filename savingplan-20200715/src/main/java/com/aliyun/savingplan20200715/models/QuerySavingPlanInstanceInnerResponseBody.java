// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class QuerySavingPlanInstanceInnerResponseBody extends TeaModel {
    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public String data;

    // code
    @NameInMap("Code")
    public QuerySavingPlanInstanceInnerResponseBodyCode code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static QuerySavingPlanInstanceInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingPlanInstanceInnerResponseBody self = new QuerySavingPlanInstanceInnerResponseBody();
        return TeaModel.build(map, self);
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

    public QuerySavingPlanInstanceInnerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QuerySavingPlanInstanceInnerResponseBody setCode(QuerySavingPlanInstanceInnerResponseBodyCode code) {
        this.code = code;
        return this;
    }
    public QuerySavingPlanInstanceInnerResponseBodyCode getCode() {
        return this.code;
    }

    public QuerySavingPlanInstanceInnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySavingPlanInstanceInnerResponseBodyCodeDatas extends TeaModel {
        // spnInstanceId
        @NameInMap("SpnInstanceId")
        public Long spnInstanceId;

        // spnInstanceCode
        @NameInMap("SpnInstanceCode")
        public String spnInstanceCode;

        // payMode
        @NameInMap("PayMode")
        public String payMode;

        // spnType
        @NameInMap("SpnType")
        public String spnType;

        // instanceFamily
        @NameInMap("InstanceFamily")
        public String instanceFamily;

        // region
        @NameInMap("Region")
        public String region;

        // cycle
        @NameInMap("Cycle")
        public String cycle;

        // startTime
        @NameInMap("StartTime")
        public Long startTime;

        // endTime
        @NameInMap("EndTime")
        public Long endTime;

        // poolValue
        @NameInMap("PoolValue")
        public Float poolValue;

        // userId
        @NameInMap("UserId")
        public Long userId;

        // site
        @NameInMap("Site")
        public String site;

        // currency
        @NameInMap("Currency")
        public String currency;

        // commodityCode
        @NameInMap("CommodityCode")
        public String commodityCode;

        // status
        @NameInMap("Status")
        public String status;

        public static QuerySavingPlanInstanceInnerResponseBodyCodeDatas build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingPlanInstanceInnerResponseBodyCodeDatas self = new QuerySavingPlanInstanceInnerResponseBodyCodeDatas();
            return TeaModel.build(map, self);
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setSpnInstanceId(Long spnInstanceId) {
            this.spnInstanceId = spnInstanceId;
            return this;
        }
        public Long getSpnInstanceId() {
            return this.spnInstanceId;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setSpnInstanceCode(String spnInstanceCode) {
            this.spnInstanceCode = spnInstanceCode;
            return this;
        }
        public String getSpnInstanceCode() {
            return this.spnInstanceCode;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setSpnType(String spnType) {
            this.spnType = spnType;
            return this;
        }
        public String getSpnType() {
            return this.spnType;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setInstanceFamily(String instanceFamily) {
            this.instanceFamily = instanceFamily;
            return this;
        }
        public String getInstanceFamily() {
            return this.instanceFamily;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setPoolValue(Float poolValue) {
            this.poolValue = poolValue;
            return this;
        }
        public Float getPoolValue() {
            return this.poolValue;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCodeDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QuerySavingPlanInstanceInnerResponseBodyCode extends TeaModel {
        // totalCount
        @NameInMap("TotalCount")
        public Integer totalCount;

        // pageSize
        @NameInMap("PageSize")
        public Integer pageSize;

        // currentPage
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // datas
        @NameInMap("Datas")
        public java.util.List<QuerySavingPlanInstanceInnerResponseBodyCodeDatas> datas;

        public static QuerySavingPlanInstanceInnerResponseBodyCode build(java.util.Map<String, ?> map) throws Exception {
            QuerySavingPlanInstanceInnerResponseBodyCode self = new QuerySavingPlanInstanceInnerResponseBodyCode();
            return TeaModel.build(map, self);
        }

        public QuerySavingPlanInstanceInnerResponseBodyCode setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCode setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCode setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySavingPlanInstanceInnerResponseBodyCode setDatas(java.util.List<QuerySavingPlanInstanceInnerResponseBodyCodeDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<QuerySavingPlanInstanceInnerResponseBodyCodeDatas> getDatas() {
            return this.datas;
        }

    }

}
