// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class QueryDeliveredSupplyItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<QueryDeliveredSupplyItemsResponseBody> body;

    public static QueryDeliveredSupplyItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeliveredSupplyItemsResponse self = new QueryDeliveredSupplyItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeliveredSupplyItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeliveredSupplyItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeliveredSupplyItemsResponse setBody(java.util.List<QueryDeliveredSupplyItemsResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<QueryDeliveredSupplyItemsResponseBody> getBody() {
        return this.body;
    }

    public static class QueryDeliveredSupplyItemsResponseBody extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("commodityTypeCode")
        public String commodityTypeCode;

        @NameInMap("demandPlanId")
        public Long demandPlanId;

        @NameInMap("planTitle")
        public String planTitle;

        @NameInMap("region")
        public String region;

        @NameInMap("zone")
        public String zone;

        @NameInMap("commodityCode")
        public String commodityCode;

        @NameInMap("demandCount")
        public Integer demandCount;

        @NameInMap("deliveredAmount")
        public Integer deliveredAmount;

        @NameInMap("openCount")
        public Integer openCount;

        public static QueryDeliveredSupplyItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
            QueryDeliveredSupplyItemsResponseBody self = new QueryDeliveredSupplyItemsResponseBody();
            return TeaModel.build(map, self);
        }

        public QueryDeliveredSupplyItemsResponseBody setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public QueryDeliveredSupplyItemsResponseBody setCommodityTypeCode(String commodityTypeCode) {
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        public QueryDeliveredSupplyItemsResponseBody setDemandPlanId(Long demandPlanId) {
            this.demandPlanId = demandPlanId;
            return this;
        }
        public Long getDemandPlanId() {
            return this.demandPlanId;
        }

        public QueryDeliveredSupplyItemsResponseBody setPlanTitle(String planTitle) {
            this.planTitle = planTitle;
            return this;
        }
        public String getPlanTitle() {
            return this.planTitle;
        }

        public QueryDeliveredSupplyItemsResponseBody setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDeliveredSupplyItemsResponseBody setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryDeliveredSupplyItemsResponseBody setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryDeliveredSupplyItemsResponseBody setDemandCount(Integer demandCount) {
            this.demandCount = demandCount;
            return this;
        }
        public Integer getDemandCount() {
            return this.demandCount;
        }

        public QueryDeliveredSupplyItemsResponseBody setDeliveredAmount(Integer deliveredAmount) {
            this.deliveredAmount = deliveredAmount;
            return this;
        }
        public Integer getDeliveredAmount() {
            return this.deliveredAmount;
        }

        public QueryDeliveredSupplyItemsResponseBody setOpenCount(Integer openCount) {
            this.openCount = openCount;
            return this;
        }
        public Integer getOpenCount() {
            return this.openCount;
        }

    }

}
