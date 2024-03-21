// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("AgreementId")
    public String agreementId;

    @NameInMap("ApplicantId")
    public String applicantId;

    @NameInMap("ApplicationType")
    public Integer applicationType;

    @NameInMap("AuthorizationOssKey")
    public String authorizationOssKey;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("BlackAndWhiteIcon")
    public String blackAndWhiteIcon;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("Classifications")
    public String classifications;

    @NameInMap("IdempotentId")
    public String idempotentId;

    @NameInMap("LegalNoticeKey")
    public String legalNoticeKey;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PaymentCallback")
    public String paymentCallback;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("Source")
    public String source;

    @NameInMap("TrademarkComment")
    public String trademarkComment;

    @NameInMap("TrademarkIcon")
    public String trademarkIcon;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("TrademarkNameType")
    public String trademarkNameType;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public CreateOrderRequest setApplicantId(String applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public String getApplicantId() {
        return this.applicantId;
    }

    public CreateOrderRequest setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public Integer getApplicationType() {
        return this.applicationType;
    }

    public CreateOrderRequest setAuthorizationOssKey(String authorizationOssKey) {
        this.authorizationOssKey = authorizationOssKey;
        return this;
    }
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
    }

    public CreateOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateOrderRequest setBlackAndWhiteIcon(String blackAndWhiteIcon) {
        this.blackAndWhiteIcon = blackAndWhiteIcon;
        return this;
    }
    public String getBlackAndWhiteIcon() {
        return this.blackAndWhiteIcon;
    }

    public CreateOrderRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateOrderRequest setClassifications(String classifications) {
        this.classifications = classifications;
        return this;
    }
    public String getClassifications() {
        return this.classifications;
    }

    public CreateOrderRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public CreateOrderRequest setLegalNoticeKey(String legalNoticeKey) {
        this.legalNoticeKey = legalNoticeKey;
        return this;
    }
    public String getLegalNoticeKey() {
        return this.legalNoticeKey;
    }

    public CreateOrderRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateOrderRequest setPaymentCallback(String paymentCallback) {
        this.paymentCallback = paymentCallback;
        return this;
    }
    public String getPaymentCallback() {
        return this.paymentCallback;
    }

    public CreateOrderRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public CreateOrderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateOrderRequest setTrademarkComment(String trademarkComment) {
        this.trademarkComment = trademarkComment;
        return this;
    }
    public String getTrademarkComment() {
        return this.trademarkComment;
    }

    public CreateOrderRequest setTrademarkIcon(String trademarkIcon) {
        this.trademarkIcon = trademarkIcon;
        return this;
    }
    public String getTrademarkIcon() {
        return this.trademarkIcon;
    }

    public CreateOrderRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public CreateOrderRequest setTrademarkNameType(String trademarkNameType) {
        this.trademarkNameType = trademarkNameType;
        return this;
    }
    public String getTrademarkNameType() {
        return this.trademarkNameType;
    }

}
