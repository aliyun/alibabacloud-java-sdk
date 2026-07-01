// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetCatalogsRequest extends TeaModel {
    /**
     * <p>The name of the catalog. If this parameter is left empty, all catalogs are listed.</p>
     * 
     * <strong>example:</strong>
     * <p>paimon</p>
     */
    @NameInMap("catalogName")
    public String catalogName;

    public static GetCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogsRequest self = new GetCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogsRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

}
