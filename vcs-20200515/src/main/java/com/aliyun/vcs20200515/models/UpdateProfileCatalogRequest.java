// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateProfileCatalogRequest extends TeaModel {
    @NameInMap("CatalogId")
    public Long catalogId;

    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    public String isvSubId;

    public static UpdateProfileCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileCatalogRequest self = new UpdateProfileCatalogRequest();
        return TeaModel.build(map, self);
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

}
