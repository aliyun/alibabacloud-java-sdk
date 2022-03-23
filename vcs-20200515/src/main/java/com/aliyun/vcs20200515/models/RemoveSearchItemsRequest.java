// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RemoveSearchItemsRequest extends TeaModel {
    @NameInMap("SearchItemIds")
    public String searchItemIds;

    @NameInMap("SearchTableId")
    public String searchTableId;

    public static RemoveSearchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSearchItemsRequest self = new RemoveSearchItemsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSearchItemsRequest setSearchItemIds(String searchItemIds) {
        this.searchItemIds = searchItemIds;
        return this;
    }
    public String getSearchItemIds() {
        return this.searchItemIds;
    }

    public RemoveSearchItemsRequest setSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
        return this;
    }
    public String getSearchTableId() {
        return this.searchTableId;
    }

}
