// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzersRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListUserAnalyzersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzersRequest self = new ListUserAnalyzersRequest();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserAnalyzersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
