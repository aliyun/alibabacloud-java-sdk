// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogStoreRequest extends TeaModel {
    @NameInMap("StoreId")
    public String storeId;

    public static DeleteLinkeLinklogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogStoreRequest self = new DeleteLinkeLinklogStoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogStoreRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
