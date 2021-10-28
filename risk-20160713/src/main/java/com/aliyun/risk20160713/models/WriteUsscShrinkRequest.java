// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class WriteUsscShrinkRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

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

    @NameInMap("Sign")
    public String sign;

    @NameInMap("SignTime")
    public String signTime;

    @NameInMap("UmidToken")
    public String umidToken;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("VerifyResult")
    public String verifyResult;

    public static WriteUsscShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteUsscShrinkRequest self = new WriteUsscShrinkRequest();
        return TeaModel.build(map, self);
    }

    public WriteUsscShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public WriteUsscShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public WriteUsscShrinkRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public WriteUsscShrinkRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public WriteUsscShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public WriteUsscShrinkRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public WriteUsscShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public WriteUsscShrinkRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public WriteUsscShrinkRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public WriteUsscShrinkRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public WriteUsscShrinkRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public WriteUsscShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WriteUsscShrinkRequest setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public String getVerifyResult() {
        return this.verifyResult;
    }

}
