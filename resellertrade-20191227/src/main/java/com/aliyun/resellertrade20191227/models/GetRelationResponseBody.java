// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetRelationResponseBody extends TeaModel {
    @NameInMap("Class")
    public String _class;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRelationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRelationResponseBody self = new GetRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRelationResponseBody set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public GetRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRelationResponseBody setData(GetRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRelationResponseBodyData getData() {
        return this.data;
    }

    public GetRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRelationResponseBodyDataResellerProductModeDO extends TeaModel {
        @NameInMap("Class")
        public String _class;

        @NameInMap("IsService")
        public Long isService;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        public static GetRelationResponseBodyDataResellerProductModeDO build(java.util.Map<String, ?> map) throws Exception {
            GetRelationResponseBodyDataResellerProductModeDO self = new GetRelationResponseBodyDataResellerProductModeDO();
            return TeaModel.build(map, self);
        }

        public GetRelationResponseBodyDataResellerProductModeDO set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public GetRelationResponseBodyDataResellerProductModeDO setIsService(Long isService) {
            this.isService = isService;
            return this;
        }
        public Long getIsService() {
            return this.isService;
        }

        public GetRelationResponseBodyDataResellerProductModeDO setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetRelationResponseBodyDataResellerProductModeDO setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class GetRelationResponseBodyDataResellerProductRuleDO extends TeaModel {
        @NameInMap("Class")
        public String _class;

        @NameInMap("CommodityRoute")
        public Boolean commodityRoute;

        @NameInMap("MultiOrder")
        public Boolean multiOrder;

        @NameInMap("PayMode")
        public String payMode;

        public static GetRelationResponseBodyDataResellerProductRuleDO build(java.util.Map<String, ?> map) throws Exception {
            GetRelationResponseBodyDataResellerProductRuleDO self = new GetRelationResponseBodyDataResellerProductRuleDO();
            return TeaModel.build(map, self);
        }

        public GetRelationResponseBodyDataResellerProductRuleDO set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public GetRelationResponseBodyDataResellerProductRuleDO setCommodityRoute(Boolean commodityRoute) {
            this.commodityRoute = commodityRoute;
            return this;
        }
        public Boolean getCommodityRoute() {
            return this.commodityRoute;
        }

        public GetRelationResponseBodyDataResellerProductRuleDO setMultiOrder(Boolean multiOrder) {
            this.multiOrder = multiOrder;
            return this;
        }
        public Boolean getMultiOrder() {
            return this.multiOrder;
        }

        public GetRelationResponseBodyDataResellerProductRuleDO setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

    }

    public static class GetRelationResponseBodyData extends TeaModel {
        // 是否可登陆官网
        // true：可登录
        // false：不可登陆
        @NameInMap("CanLoginOfficial")
        public Boolean canLoginOfficial;

        @NameInMap("Class")
        public String _class;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ResellerProductModeDO")
        public GetRelationResponseBodyDataResellerProductModeDO resellerProductModeDO;

        @NameInMap("ResellerProductRuleDO")
        public GetRelationResponseBodyDataResellerProductRuleDO resellerProductRuleDO;

        @NameInMap("ResellerUid")
        public Long resellerUid;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TopReseller")
        public Boolean topReseller;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("UserType")
        public String userType;

        public static GetRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRelationResponseBodyData self = new GetRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRelationResponseBodyData setCanLoginOfficial(Boolean canLoginOfficial) {
            this.canLoginOfficial = canLoginOfficial;
            return this;
        }
        public Boolean getCanLoginOfficial() {
            return this.canLoginOfficial;
        }

        public GetRelationResponseBodyData set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public GetRelationResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetRelationResponseBodyData setResellerProductModeDO(GetRelationResponseBodyDataResellerProductModeDO resellerProductModeDO) {
            this.resellerProductModeDO = resellerProductModeDO;
            return this;
        }
        public GetRelationResponseBodyDataResellerProductModeDO getResellerProductModeDO() {
            return this.resellerProductModeDO;
        }

        public GetRelationResponseBodyData setResellerProductRuleDO(GetRelationResponseBodyDataResellerProductRuleDO resellerProductRuleDO) {
            this.resellerProductRuleDO = resellerProductRuleDO;
            return this;
        }
        public GetRelationResponseBodyDataResellerProductRuleDO getResellerProductRuleDO() {
            return this.resellerProductRuleDO;
        }

        public GetRelationResponseBodyData setResellerUid(Long resellerUid) {
            this.resellerUid = resellerUid;
            return this;
        }
        public Long getResellerUid() {
            return this.resellerUid;
        }

        public GetRelationResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetRelationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRelationResponseBodyData setTopReseller(Boolean topReseller) {
            this.topReseller = topReseller;
            return this;
        }
        public Boolean getTopReseller() {
            return this.topReseller;
        }

        public GetRelationResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public GetRelationResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
