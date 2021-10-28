// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class PushDataShrinkRequest extends TeaModel {
    @NameInMap("AliyunIdkp")
    public String aliyunIdkp;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("MteeCode")
    public String mteeCode;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("UserId")
    public String userId;

    public static PushDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDataShrinkRequest self = new PushDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushDataShrinkRequest setAliyunIdkp(String aliyunIdkp) {
        this.aliyunIdkp = aliyunIdkp;
        return this;
    }
    public String getAliyunIdkp() {
        return this.aliyunIdkp;
    }

    public PushDataShrinkRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public PushDataShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public PushDataShrinkRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public PushDataShrinkRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public PushDataShrinkRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public PushDataShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public PushDataShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
