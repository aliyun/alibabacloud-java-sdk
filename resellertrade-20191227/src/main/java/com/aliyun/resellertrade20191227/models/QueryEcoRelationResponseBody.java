// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryEcoRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    @NameInMap("Data")
    public QueryEcoRelationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEcoRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEcoRelationResponseBody self = new QueryEcoRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEcoRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEcoRelationResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public QueryEcoRelationResponseBody setData(QueryEcoRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEcoRelationResponseBodyData getData() {
        return this.data;
    }

    public QueryEcoRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEcoRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEcoRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEcoRelationResponseBodyDataResellerProductModeDO extends TeaModel {
        @NameInMap("IsService")
        public Integer isService;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        public static QueryEcoRelationResponseBodyDataResellerProductModeDO build(java.util.Map<String, ?> map) throws Exception {
            QueryEcoRelationResponseBodyDataResellerProductModeDO self = new QueryEcoRelationResponseBodyDataResellerProductModeDO();
            return TeaModel.build(map, self);
        }

        public QueryEcoRelationResponseBodyDataResellerProductModeDO setIsService(Integer isService) {
            this.isService = isService;
            return this;
        }
        public Integer getIsService() {
            return this.isService;
        }

        public QueryEcoRelationResponseBodyDataResellerProductModeDO setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryEcoRelationResponseBodyDataResellerProductModeDO setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QueryEcoRelationResponseBodyDataResellerProductRuleDO extends TeaModel {
        @NameInMap("CommodityRoute")
        public Boolean commodityRoute;

        @NameInMap("MultiOrder")
        public Boolean multiOrder;

        @NameInMap("PayMode")
        public String payMode;

        public static QueryEcoRelationResponseBodyDataResellerProductRuleDO build(java.util.Map<String, ?> map) throws Exception {
            QueryEcoRelationResponseBodyDataResellerProductRuleDO self = new QueryEcoRelationResponseBodyDataResellerProductRuleDO();
            return TeaModel.build(map, self);
        }

        public QueryEcoRelationResponseBodyDataResellerProductRuleDO setCommodityRoute(Boolean commodityRoute) {
            this.commodityRoute = commodityRoute;
            return this;
        }
        public Boolean getCommodityRoute() {
            return this.commodityRoute;
        }

        public QueryEcoRelationResponseBodyDataResellerProductRuleDO setMultiOrder(Boolean multiOrder) {
            this.multiOrder = multiOrder;
            return this;
        }
        public Boolean getMultiOrder() {
            return this.multiOrder;
        }

        public QueryEcoRelationResponseBodyDataResellerProductRuleDO setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

    }

    public static class QueryEcoRelationResponseBodyData extends TeaModel {
        @NameInMap("CanLoginOfficial")
        public Boolean canLoginOfficial;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsTopReseller")
        public Boolean isTopReseller;

        @NameInMap("ResellerProductModeDO")
        public QueryEcoRelationResponseBodyDataResellerProductModeDO resellerProductModeDO;

        @NameInMap("ResellerProductRuleDO")
        public QueryEcoRelationResponseBodyDataResellerProductRuleDO resellerProductRuleDO;

        @NameInMap("ResellerUid")
        public Long resellerUid;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("UserType")
        public String userType;

        public static QueryEcoRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEcoRelationResponseBodyData self = new QueryEcoRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEcoRelationResponseBodyData setCanLoginOfficial(Boolean canLoginOfficial) {
            this.canLoginOfficial = canLoginOfficial;
            return this;
        }
        public Boolean getCanLoginOfficial() {
            return this.canLoginOfficial;
        }

        public QueryEcoRelationResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryEcoRelationResponseBodyData setIsTopReseller(Boolean isTopReseller) {
            this.isTopReseller = isTopReseller;
            return this;
        }
        public Boolean getIsTopReseller() {
            return this.isTopReseller;
        }

        public QueryEcoRelationResponseBodyData setResellerProductModeDO(QueryEcoRelationResponseBodyDataResellerProductModeDO resellerProductModeDO) {
            this.resellerProductModeDO = resellerProductModeDO;
            return this;
        }
        public QueryEcoRelationResponseBodyDataResellerProductModeDO getResellerProductModeDO() {
            return this.resellerProductModeDO;
        }

        public QueryEcoRelationResponseBodyData setResellerProductRuleDO(QueryEcoRelationResponseBodyDataResellerProductRuleDO resellerProductRuleDO) {
            this.resellerProductRuleDO = resellerProductRuleDO;
            return this;
        }
        public QueryEcoRelationResponseBodyDataResellerProductRuleDO getResellerProductRuleDO() {
            return this.resellerProductRuleDO;
        }

        public QueryEcoRelationResponseBodyData setResellerUid(Long resellerUid) {
            this.resellerUid = resellerUid;
            return this;
        }
        public Long getResellerUid() {
            return this.resellerUid;
        }

        public QueryEcoRelationResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryEcoRelationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryEcoRelationResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public QueryEcoRelationResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
