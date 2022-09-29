// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CatalogCommonResult extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    public static CatalogCommonResult build(java.util.Map<String, ?> map) throws Exception {
        CatalogCommonResult self = new CatalogCommonResult();
        return TeaModel.build(map, self);
    }

    public CatalogCommonResult setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
