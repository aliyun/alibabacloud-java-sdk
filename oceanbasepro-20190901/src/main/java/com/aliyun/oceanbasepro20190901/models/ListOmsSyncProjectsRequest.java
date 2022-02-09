// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsSyncProjectsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    @NameInMap("SyncType")
    public String syncType;

    public static ListOmsSyncProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOmsSyncProjectsRequest self = new ListOmsSyncProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListOmsSyncProjectsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOmsSyncProjectsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOmsSyncProjectsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListOmsSyncProjectsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListOmsSyncProjectsRequest setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    public String getSyncType() {
        return this.syncType;
    }

}
