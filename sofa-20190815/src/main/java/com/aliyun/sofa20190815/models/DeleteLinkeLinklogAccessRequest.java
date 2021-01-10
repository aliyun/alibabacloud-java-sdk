// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogAccessRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("StoreId")
    public String storeId;

    public static DeleteLinkeLinklogAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogAccessRequest self = new DeleteLinkeLinklogAccessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogAccessRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DeleteLinkeLinklogAccessRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
