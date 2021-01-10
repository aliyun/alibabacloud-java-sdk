// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogStoretokensRequest extends TeaModel {
    @NameInMap("StoreId")
    public String storeId;

    public static GetLinkeLinklogStoretokensRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogStoretokensRequest self = new GetLinkeLinklogStoretokensRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogStoretokensRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
