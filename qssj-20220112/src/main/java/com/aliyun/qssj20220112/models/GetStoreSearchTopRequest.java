// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetStoreSearchTopRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetStoreSearchTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStoreSearchTopRequest self = new GetStoreSearchTopRequest();
        return TeaModel.build(map, self);
    }

    public GetStoreSearchTopRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
