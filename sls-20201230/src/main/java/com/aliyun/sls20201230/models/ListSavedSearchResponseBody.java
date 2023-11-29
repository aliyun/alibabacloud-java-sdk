// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListSavedSearchResponseBody extends TeaModel {
    /**
     * <p>The number of saved searches returned on the current page.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The saved searches.</p>
     */
    @NameInMap("savedsearchItems")
    public java.util.List<SavedSearch> savedsearchItems;

    /**
     * <p>The total number of saved searches that meet the query conditions.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListSavedSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSavedSearchResponseBody self = new ListSavedSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSavedSearchResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListSavedSearchResponseBody setSavedsearchItems(java.util.List<SavedSearch> savedsearchItems) {
        this.savedsearchItems = savedsearchItems;
        return this;
    }
    public java.util.List<SavedSearch> getSavedsearchItems() {
        return this.savedsearchItems;
    }

    public ListSavedSearchResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
