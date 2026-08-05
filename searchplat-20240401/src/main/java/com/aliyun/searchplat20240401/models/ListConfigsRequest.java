// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListConfigsRequest extends TeaModel {
    /**
     * <p>The field-level equality filter condition. The value is a URL-encoded JSON string (which decodes to a {&quot;fieldName&quot;: value} object). Multiple fields have an AND relationship, meaning all conditions must be met for a result to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>%7B%22enabled%22%3Atrue%7D</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>page</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsRequest self = new ListConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListConfigsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
