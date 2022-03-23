// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddSearchItemsRequest extends TeaModel {
    @NameInMap("SearchItemList")
    public java.util.List<AddSearchItemsRequestSearchItemList> searchItemList;

    @NameInMap("SearchTableId")
    public String searchTableId;

    public static AddSearchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSearchItemsRequest self = new AddSearchItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddSearchItemsRequest setSearchItemList(java.util.List<AddSearchItemsRequestSearchItemList> searchItemList) {
        this.searchItemList = searchItemList;
        return this;
    }
    public java.util.List<AddSearchItemsRequestSearchItemList> getSearchItemList() {
        return this.searchItemList;
    }

    public AddSearchItemsRequest setSearchTableId(String searchTableId) {
        this.searchTableId = searchTableId;
        return this;
    }
    public String getSearchTableId() {
        return this.searchTableId;
    }

    public static class AddSearchItemsRequestSearchItemList extends TeaModel {
        @NameInMap("ItemImageUrl")
        public String itemImageUrl;

        @NameInMap("SearchItemId")
        public String searchItemId;

        @NameInMap("SearchItemName")
        public String searchItemName;

        public static AddSearchItemsRequestSearchItemList build(java.util.Map<String, ?> map) throws Exception {
            AddSearchItemsRequestSearchItemList self = new AddSearchItemsRequestSearchItemList();
            return TeaModel.build(map, self);
        }

        public AddSearchItemsRequestSearchItemList setItemImageUrl(String itemImageUrl) {
            this.itemImageUrl = itemImageUrl;
            return this;
        }
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        public AddSearchItemsRequestSearchItemList setSearchItemId(String searchItemId) {
            this.searchItemId = searchItemId;
            return this;
        }
        public String getSearchItemId() {
            return this.searchItemId;
        }

        public AddSearchItemsRequestSearchItemList setSearchItemName(String searchItemName) {
            this.searchItemName = searchItemName;
            return this;
        }
        public String getSearchItemName() {
            return this.searchItemName;
        }

    }

}
