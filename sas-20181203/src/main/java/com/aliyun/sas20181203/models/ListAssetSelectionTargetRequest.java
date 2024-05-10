// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetSelectionTargetRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The globally unique identifier (GUID) of the asset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    public static ListAssetSelectionTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetSelectionTargetRequest self = new ListAssetSelectionTargetRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetSelectionTargetRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAssetSelectionTargetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAssetSelectionTargetRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

}
