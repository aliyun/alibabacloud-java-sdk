// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryAppTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryAppTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAppTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppTasksResponseBody self = new QueryAppTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppTasksResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAppTasksResponseBody setData(QueryAppTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppTasksResponseBodyData getData() {
        return this.data;
    }

    public QueryAppTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppTasksResponseBodyDataList extends TeaModel {
        @NameInMap("AccountNo")
        public String accountNo;

        @NameInMap("AllContentStatus")
        public Integer allContentStatus;

        @NameInMap("Balance")
        public Long balance;

        @NameInMap("BalanceDay")
        public Long balanceDay;

        @NameInMap("BrandUserId")
        public Long brandUserId;

        @NameInMap("ChargeCost")
        public Long chargeCost;

        @NameInMap("ContentIds")
        public String contentIds;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenScene")
        public Integer openScene;

        @NameInMap("PopularizePosition")
        public Integer popularizePosition;

        @NameInMap("PriceType")
        public String priceType;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProxyUserId")
        public Long proxyUserId;

        @NameInMap("Quota")
        public Long quota;

        @NameInMap("QuotaDay")
        public Long quotaDay;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TimeSchema")
        public String timeSchema;

        public static QueryAppTasksResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAppTasksResponseBodyDataList self = new QueryAppTasksResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAppTasksResponseBodyDataList setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public QueryAppTasksResponseBodyDataList setAllContentStatus(Integer allContentStatus) {
            this.allContentStatus = allContentStatus;
            return this;
        }
        public Integer getAllContentStatus() {
            return this.allContentStatus;
        }

        public QueryAppTasksResponseBodyDataList setBalance(Long balance) {
            this.balance = balance;
            return this;
        }
        public Long getBalance() {
            return this.balance;
        }

        public QueryAppTasksResponseBodyDataList setBalanceDay(Long balanceDay) {
            this.balanceDay = balanceDay;
            return this;
        }
        public Long getBalanceDay() {
            return this.balanceDay;
        }

        public QueryAppTasksResponseBodyDataList setBrandUserId(Long brandUserId) {
            this.brandUserId = brandUserId;
            return this;
        }
        public Long getBrandUserId() {
            return this.brandUserId;
        }

        public QueryAppTasksResponseBodyDataList setChargeCost(Long chargeCost) {
            this.chargeCost = chargeCost;
            return this;
        }
        public Long getChargeCost() {
            return this.chargeCost;
        }

        public QueryAppTasksResponseBodyDataList setContentIds(String contentIds) {
            this.contentIds = contentIds;
            return this;
        }
        public String getContentIds() {
            return this.contentIds;
        }

        public QueryAppTasksResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAppTasksResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAppTasksResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAppTasksResponseBodyDataList setOpenScene(Integer openScene) {
            this.openScene = openScene;
            return this;
        }
        public Integer getOpenScene() {
            return this.openScene;
        }

        public QueryAppTasksResponseBodyDataList setPopularizePosition(Integer popularizePosition) {
            this.popularizePosition = popularizePosition;
            return this;
        }
        public Integer getPopularizePosition() {
            return this.popularizePosition;
        }

        public QueryAppTasksResponseBodyDataList setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }
        public String getPriceType() {
            return this.priceType;
        }

        public QueryAppTasksResponseBodyDataList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public QueryAppTasksResponseBodyDataList setProxyUserId(Long proxyUserId) {
            this.proxyUserId = proxyUserId;
            return this;
        }
        public Long getProxyUserId() {
            return this.proxyUserId;
        }

        public QueryAppTasksResponseBodyDataList setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public QueryAppTasksResponseBodyDataList setQuotaDay(Long quotaDay) {
            this.quotaDay = quotaDay;
            return this;
        }
        public Long getQuotaDay() {
            return this.quotaDay;
        }

        public QueryAppTasksResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryAppTasksResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAppTasksResponseBodyDataList setTimeSchema(String timeSchema) {
            this.timeSchema = timeSchema;
            return this;
        }
        public String getTimeSchema() {
            return this.timeSchema;
        }

    }

    public static class QueryAppTasksResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("List")
        public java.util.List<QueryAppTasksResponseBodyDataList> list;

        public static QueryAppTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppTasksResponseBodyData self = new QueryAppTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppTasksResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryAppTasksResponseBodyData setList(java.util.List<QueryAppTasksResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAppTasksResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
