// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileCatalogRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("CatalogId")
    @Validation(required = true)
    public Long catalogId;

    @NameInMap("CatalogName")
    @Validation(required = true)
    public String catalogName;

    public static UpdateProfileCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileCatalogRequest self = new UpdateProfileCatalogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProfileCatalogRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateProfileCatalogRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public UpdateProfileCatalogRequest setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public Long getCatalogId() {
        return this.catalogId;
    }

    public UpdateProfileCatalogRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

}
