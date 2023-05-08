// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeUserProduceResponseBody extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    @NameInMap("OrderPrice")
    public String orderPrice;

    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SolutionBizId")
    public String solutionBizId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>UserId</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeUserProduceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProduceResponseBody self = new DescribeUserProduceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserProduceResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeUserProduceResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeUserProduceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUserProduceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeUserProduceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeUserProduceResponseBody setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public DescribeUserProduceResponseBody setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public DescribeUserProduceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeUserProduceResponseBody setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    public DescribeUserProduceResponseBody setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public String getOrderPrice() {
        return this.orderPrice;
    }

    public DescribeUserProduceResponseBody setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public DescribeUserProduceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserProduceResponseBody setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    public DescribeUserProduceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUserProduceResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeUserProduceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUserProduceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
