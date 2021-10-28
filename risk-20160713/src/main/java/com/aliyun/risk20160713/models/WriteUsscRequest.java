// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class WriteUsscRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

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

    public static WriteUsscRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteUsscRequest self = new WriteUsscRequest();
        return TeaModel.build(map, self);
    }

    public WriteUsscRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public WriteUsscRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public WriteUsscRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public WriteUsscRequest setCollina(String collina) {
        this.collina = collina;
        return this;
    }
    public String getCollina() {
        return this.collina;
    }

    public WriteUsscRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public WriteUsscRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public WriteUsscRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public WriteUsscRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public WriteUsscRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public WriteUsscRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public WriteUsscRequest setUmidToken(String umidToken) {
        this.umidToken = umidToken;
        return this;
    }
    public String getUmidToken() {
        return this.umidToken;
    }

    public WriteUsscRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WriteUsscRequest setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public String getVerifyResult() {
        return this.verifyResult;
    }

}
