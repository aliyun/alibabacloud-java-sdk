// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteProfileCatalogRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    @Validation(required = true)
    public String isvSubId;

    @NameInMap("CatalogId")
    @Validation(required = true)
    public String catalogId;

    public static DeleteProfileCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileCatalogRequest self = new DeleteProfileCatalogRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProfileCatalogRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteProfileCatalogRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public DeleteProfileCatalogRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

}
