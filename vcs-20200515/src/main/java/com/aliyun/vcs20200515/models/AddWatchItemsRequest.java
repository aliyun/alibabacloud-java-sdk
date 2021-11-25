// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddWatchItemsRequest extends TeaModel {
    @NameInMap("WatchItemList")
    public java.util.List<AddWatchItemsRequestWatchItemList> watchItemList;

    @NameInMap("WatchPolicyId")
    public String watchPolicyId;

    public static AddWatchItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatchItemsRequest self = new AddWatchItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddWatchItemsRequest setWatchItemList(java.util.List<AddWatchItemsRequestWatchItemList> watchItemList) {
        this.watchItemList = watchItemList;
        return this;
    }
    public java.util.List<AddWatchItemsRequestWatchItemList> getWatchItemList() {
        return this.watchItemList;
    }

    public AddWatchItemsRequest setWatchPolicyId(String watchPolicyId) {
        this.watchPolicyId = watchPolicyId;
        return this;
    }
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

    public static class AddWatchItemsRequestWatchItemList extends TeaModel {
        @NameInMap("ItemAttributes")
        public String itemAttributes;

        @NameInMap("ItemImageUrl")
        public String itemImageUrl;

        @NameInMap("WatchItemId")
        public String watchItemId;

        @NameInMap("WatchItemName")
        public String watchItemName;

        public static AddWatchItemsRequestWatchItemList build(java.util.Map<String, ?> map) throws Exception {
            AddWatchItemsRequestWatchItemList self = new AddWatchItemsRequestWatchItemList();
            return TeaModel.build(map, self);
        }

        public AddWatchItemsRequestWatchItemList setItemAttributes(String itemAttributes) {
            this.itemAttributes = itemAttributes;
            return this;
        }
        public String getItemAttributes() {
            return this.itemAttributes;
        }

        public AddWatchItemsRequestWatchItemList setItemImageUrl(String itemImageUrl) {
            this.itemImageUrl = itemImageUrl;
            return this;
        }
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        public AddWatchItemsRequestWatchItemList setWatchItemId(String watchItemId) {
            this.watchItemId = watchItemId;
            return this;
        }
        public String getWatchItemId() {
            return this.watchItemId;
        }

        public AddWatchItemsRequestWatchItemList setWatchItemName(String watchItemName) {
            this.watchItemName = watchItemName;
            return this;
        }
        public String getWatchItemName() {
            return this.watchItemName;
        }

    }

}
