// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogStoreRequest extends TeaModel {
    @NameInMap("StoreId")
    public String storeId;

    public static GetLinkeLinklogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogStoreRequest self = new GetLinkeLinklogStoreRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogStoreRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
