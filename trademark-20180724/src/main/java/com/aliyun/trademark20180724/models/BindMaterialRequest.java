// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class BindMaterialRequest extends TeaModel {
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LoaOssKey")
    public String loaOssKey;

    @NameInMap("LegalNoticeKey")
    public String legalNoticeKey;

    public static BindMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        BindMaterialRequest self = new BindMaterialRequest();
        return TeaModel.build(map, self);
    }

    public BindMaterialRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public BindMaterialRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BindMaterialRequest setLoaOssKey(String loaOssKey) {
        this.loaOssKey = loaOssKey;
        return this;
    }
    public String getLoaOssKey() {
        return this.loaOssKey;
    }

    public BindMaterialRequest setLegalNoticeKey(String legalNoticeKey) {
        this.legalNoticeKey = legalNoticeKey;
        return this;
    }
    public String getLegalNoticeKey() {
        return this.legalNoticeKey;
    }

}
