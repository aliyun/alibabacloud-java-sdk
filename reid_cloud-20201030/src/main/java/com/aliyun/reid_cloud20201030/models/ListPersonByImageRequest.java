// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListPersonByImageRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    public static ListPersonByImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersonByImageRequest self = new ListPersonByImageRequest();
        return TeaModel.build(map, self);
    }

    public ListPersonByImageRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public ListPersonByImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
