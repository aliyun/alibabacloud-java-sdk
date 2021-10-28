// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class ValidateVerifyCodeRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("Collina")
    public String collina;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

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

    public static ValidateVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateVerifyCodeRequest self = new ValidateVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public ValidateVerifyCodeRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ValidateVerifyCodeRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public ValidateVerifyCodeRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public ValidateVerifyCodeRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public ValidateVerifyCodeRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ValidateVerifyCodeRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ValidateVerifyCodeRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public ValidateVerifyCodeRequest setRiskRequestId(String riskRequestId) {
        this.riskRequestId = riskRequestId;
        return this;
    }
    public String getRiskRequestId() {
        return this.riskRequestId;
    }

    public ValidateVerifyCodeRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public ValidateVerifyCodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ValidateVerifyCodeRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
