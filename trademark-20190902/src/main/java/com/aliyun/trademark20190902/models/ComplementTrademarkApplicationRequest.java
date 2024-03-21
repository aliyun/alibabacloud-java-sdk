// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ComplementTrademarkApplicationRequest extends TeaModel {
    @NameInMap("AgreementId")
    public String agreementId;

    @NameInMap("AuthorizationOssKey")
    public String authorizationOssKey;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("IsBlackIcon")
    public Boolean isBlackIcon;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OrderData")
    public String orderData;

    @NameInMap("Source")
    public String source;

    @NameInMap("TrademarkComment")
    public String trademarkComment;

    @NameInMap("TrademarkIconOssKey")
    public String trademarkIconOssKey;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("TrademarkNameType")
    public String trademarkNameType;

    @NameInMap("TrademarkType")
    public Integer trademarkType;

    public static ComplementTrademarkApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ComplementTrademarkApplicationRequest self = new ComplementTrademarkApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ComplementTrademarkApplicationRequest setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public ComplementTrademarkApplicationRequest setAuthorizationOssKey(String authorizationOssKey) {
        this.authorizationOssKey = authorizationOssKey;
        return this;
    }
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
    }

    public ComplementTrademarkApplicationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ComplementTrademarkApplicationRequest setIsBlackIcon(Boolean isBlackIcon) {
        this.isBlackIcon = isBlackIcon;
        return this;
    }
    public Boolean getIsBlackIcon() {
        return this.isBlackIcon;
    }

    public ComplementTrademarkApplicationRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public ComplementTrademarkApplicationRequest setOrderData(String orderData) {
        this.orderData = orderData;
        return this;
    }
    public String getOrderData() {
        return this.orderData;
    }

    public ComplementTrademarkApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ComplementTrademarkApplicationRequest setTrademarkComment(String trademarkComment) {
        this.trademarkComment = trademarkComment;
        return this;
    }
    public String getTrademarkComment() {
        return this.trademarkComment;
    }

    public ComplementTrademarkApplicationRequest setTrademarkIconOssKey(String trademarkIconOssKey) {
        this.trademarkIconOssKey = trademarkIconOssKey;
        return this;
    }
    public String getTrademarkIconOssKey() {
        return this.trademarkIconOssKey;
    }

    public ComplementTrademarkApplicationRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public ComplementTrademarkApplicationRequest setTrademarkNameType(String trademarkNameType) {
        this.trademarkNameType = trademarkNameType;
        return this;
    }
    public String getTrademarkNameType() {
        return this.trademarkNameType;
    }

    public ComplementTrademarkApplicationRequest setTrademarkType(Integer trademarkType) {
        this.trademarkType = trademarkType;
        return this;
    }
    public Integer getTrademarkType() {
        return this.trademarkType;
    }

}
