// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class PushDataRequest extends TeaModel {
    @NameInMap("AliyunIdkp")
    public String aliyunIdkp;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("MteeCode")
    public String mteeCode;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("UserId")
    public String userId;

    public static PushDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDataRequest self = new PushDataRequest();
        return TeaModel.build(map, self);
    }

    public PushDataRequest setAliyunIdkp(String aliyunIdkp) {
        this.aliyunIdkp = aliyunIdkp;
        return this;
    }
    public String getAliyunIdkp() {
        return this.aliyunIdkp;
    }

    public PushDataRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public PushDataRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public PushDataRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public PushDataRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public PushDataRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public PushDataRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public PushDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
