// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsSyncProjectsShrinkRequest extends TeaModel {
    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("StatusList")
    public String statusListShrink;

    @NameInMap("SyncType")
    public String syncType;

    public static ListOmsSyncProjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOmsSyncProjectsShrinkRequest self = new ListOmsSyncProjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOmsSyncProjectsShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsSyncProjectsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOmsSyncProjectsShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListOmsSyncProjectsShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public ListOmsSyncProjectsShrinkRequest setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    public String getSyncType() {
        return this.syncType;
    }

}
