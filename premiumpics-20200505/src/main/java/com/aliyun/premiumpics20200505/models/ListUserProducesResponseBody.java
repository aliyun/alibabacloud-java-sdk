// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserProducesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUserProducesResponseBodyData> data;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListUserProducesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProducesResponseBody self = new ListUserProducesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProducesResponseBody setData(java.util.List<ListUserProducesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserProducesResponseBodyData> getData() {
        return this.data;
    }

    public ListUserProducesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserProducesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserProducesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProducesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserProducesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserProducesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListUserProducesResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>BizType</p>
         */
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("IntentionBizId")
        public String intentionBizId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        @NameInMap("OrderPrice")
        public String orderPrice;

        @NameInMap("OrderTime")
        public String orderTime;

        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("SolutionBizId")
        public String solutionBizId;

        @NameInMap("Status")
        public Integer status;

        /**
         * <p>UserId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUserProducesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserProducesResponseBodyData self = new ListUserProducesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserProducesResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListUserProducesResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListUserProducesResponseBodyData setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListUserProducesResponseBodyData setIntentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        public ListUserProducesResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListUserProducesResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListUserProducesResponseBodyData setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public ListUserProducesResponseBodyData setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public String getOrderPrice() {
            return this.orderPrice;
        }

        public ListUserProducesResponseBodyData setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

        public ListUserProducesResponseBodyData setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public ListUserProducesResponseBodyData setSolutionBizId(String solutionBizId) {
            this.solutionBizId = solutionBizId;
            return this;
        }
        public String getSolutionBizId() {
            return this.solutionBizId;
        }

        public ListUserProducesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserProducesResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
