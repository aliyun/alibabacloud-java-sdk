// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileCatalogRequest extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("ParentCatalogId")
    public Long parentCatalogId;

    public static AddProfileCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProfileCatalogRequest self = new AddProfileCatalogRequest();
        return TeaModel.build(map, self);
    }

    public AddProfileCatalogRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public AddProfileCatalogRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddProfileCatalogRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public AddProfileCatalogRequest setParentCatalogId(Long parentCatalogId) {
        this.parentCatalogId = parentCatalogId;
        return this;
    }
    public Long getParentCatalogId() {
        return this.parentCatalogId;
    }

}
