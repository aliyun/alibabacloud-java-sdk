// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateTrademarkOrderRequest extends TeaModel {
    @NameInMap("AgreementId")
    public String agreementId;

    @NameInMap("BigDipperSource")
    public String bigDipperSource;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("IsBlackIcon")
    public Boolean isBlackIcon;

    @NameInMap("LegalNoticeKey")
    public String legalNoticeKey;

    @NameInMap("LoaOssKey")
    public String loaOssKey;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OrderData")
    public String orderData;

    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("RealUserName")
    public String realUserName;

    @NameInMap("RegisterName")
    public String registerName;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("RenewInfoId")
    public String renewInfoId;

    @NameInMap("RootCode")
    public String rootCode;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TmComment")
    public String tmComment;

    @NameInMap("TmIcon")
    public String tmIcon;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("TmNameType")
    public String tmNameType;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Ua")
    public String ua;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("UserId")
    public Long userId;

    public static CreateTrademarkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrademarkOrderRequest self = new CreateTrademarkOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrademarkOrderRequest setAgreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }
    public String getAgreementId() {
        return this.agreementId;
    }

    public CreateTrademarkOrderRequest setBigDipperSource(String bigDipperSource) {
        this.bigDipperSource = bigDipperSource;
        return this;
    }
    public String getBigDipperSource() {
        return this.bigDipperSource;
    }

    public CreateTrademarkOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateTrademarkOrderRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateTrademarkOrderRequest setIsBlackIcon(Boolean isBlackIcon) {
        this.isBlackIcon = isBlackIcon;
        return this;
    }
    public Boolean getIsBlackIcon() {
        return this.isBlackIcon;
    }

    public CreateTrademarkOrderRequest setLegalNoticeKey(String legalNoticeKey) {
        this.legalNoticeKey = legalNoticeKey;
        return this;
    }
    public String getLegalNoticeKey() {
        return this.legalNoticeKey;
    }

    public CreateTrademarkOrderRequest setLoaOssKey(String loaOssKey) {
        this.loaOssKey = loaOssKey;
        return this;
    }
    public String getLoaOssKey() {
        return this.loaOssKey;
    }

    public CreateTrademarkOrderRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CreateTrademarkOrderRequest setOrderData(String orderData) {
        this.orderData = orderData;
        return this;
    }
    public String getOrderData() {
        return this.orderData;
    }

    public CreateTrademarkOrderRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public CreateTrademarkOrderRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateTrademarkOrderRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public CreateTrademarkOrderRequest setRealUserName(String realUserName) {
        this.realUserName = realUserName;
        return this;
    }
    public String getRealUserName() {
        return this.realUserName;
    }

    public CreateTrademarkOrderRequest setRegisterName(String registerName) {
        this.registerName = registerName;
        return this;
    }
    public String getRegisterName() {
        return this.registerName;
    }

    public CreateTrademarkOrderRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public CreateTrademarkOrderRequest setRenewInfoId(String renewInfoId) {
        this.renewInfoId = renewInfoId;
        return this;
    }
    public String getRenewInfoId() {
        return this.renewInfoId;
    }

    public CreateTrademarkOrderRequest setRootCode(String rootCode) {
        this.rootCode = rootCode;
        return this;
    }
    public String getRootCode() {
        return this.rootCode;
    }

    public CreateTrademarkOrderRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateTrademarkOrderRequest setTmComment(String tmComment) {
        this.tmComment = tmComment;
        return this;
    }
    public String getTmComment() {
        return this.tmComment;
    }

    public CreateTrademarkOrderRequest setTmIcon(String tmIcon) {
        this.tmIcon = tmIcon;
        return this;
    }
    public String getTmIcon() {
        return this.tmIcon;
    }

    public CreateTrademarkOrderRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public CreateTrademarkOrderRequest setTmNameType(String tmNameType) {
        this.tmNameType = tmNameType;
        return this;
    }
    public String getTmNameType() {
        return this.tmNameType;
    }

    public CreateTrademarkOrderRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateTrademarkOrderRequest setUa(String ua) {
        this.ua = ua;
        return this;
    }
    public String getUa() {
        return this.ua;
    }

    public CreateTrademarkOrderRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public CreateTrademarkOrderRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
