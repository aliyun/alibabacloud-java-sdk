// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListSubtaskItemsRequest extends TeaModel {
    /**
     * <p>The page number of the annotated data for task packages. The starting value is 1, and the default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of annotated data entries per page to display in a paged query. Default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSubtaskItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubtaskItemsRequest self = new ListSubtaskItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubtaskItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSubtaskItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
