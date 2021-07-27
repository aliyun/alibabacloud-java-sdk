// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class GetEmapIpcDataListByStoreIdRequest extends TeaModel {
    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("SearchTimestamp")
    public Long searchTimestamp;

    public static GetEmapIpcDataListByStoreIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmapIpcDataListByStoreIdRequest self = new GetEmapIpcDataListByStoreIdRequest();
        return TeaModel.build(map, self);
    }

    public GetEmapIpcDataListByStoreIdRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public GetEmapIpcDataListByStoreIdRequest setSearchTimestamp(Long searchTimestamp) {
        this.searchTimestamp = searchTimestamp;
        return this;
    }
    public Long getSearchTimestamp() {
        return this.searchTimestamp;
    }

}
