// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class ValidateVerifyCodeShrinkRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("Collina")
    public String collina;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("MteeCode")
    public String mteeCode;

    @NameInMap("RiskRequestId")
    public String riskRequestId;

    @NameInMap("UmidToken")
    public String umidToken;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static ValidateVerifyCodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateVerifyCodeShrinkRequest self = new ValidateVerifyCodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ValidateVerifyCodeShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ValidateVerifyCodeShrinkRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public ValidateVerifyCodeShrinkRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public ValidateVerifyCodeShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public ValidateVerifyCodeShrinkRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ValidateVerifyCodeShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ValidateVerifyCodeShrinkRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public ValidateVerifyCodeShrinkRequest setRiskRequestId(String riskRequestId) {
        this.riskRequestId = riskRequestId;
        return this;
    }
    public String getRiskRequestId() {
        return this.riskRequestId;
    }

    public ValidateVerifyCodeShrinkRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public ValidateVerifyCodeShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ValidateVerifyCodeShrinkRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
