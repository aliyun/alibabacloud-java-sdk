// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The number of annotated members displayed per page in a paged query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page number of the annotate member list. The starting value is 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
