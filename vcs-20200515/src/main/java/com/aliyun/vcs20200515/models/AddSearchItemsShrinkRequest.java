// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddSearchItemsShrinkRequest extends TeaModel {
    @NameInMap("SearchItemList")
    public String searchItemListShrink;

    @NameInMap("SearchTableId")
    public String searchTableId;

    public static AddSearchItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSearchItemsShrinkRequest self = new AddSearchItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddSearchItemsShrinkRequest setSearchItemListShrink(String searchItemListShrink) {
        this.searchItemListShrink = searchItemListShrink;
        return this;
    }
    public String getSearchItemListShrink() {
        return this.searchItemListShrink;
    }

    public AddSearchItemsShrinkRequest setSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
        return this;
    }
    public String getSearchTableId() {
        return this.searchTableId;
    }

}
