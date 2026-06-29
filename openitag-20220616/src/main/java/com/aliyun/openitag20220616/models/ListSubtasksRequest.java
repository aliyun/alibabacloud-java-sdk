// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListSubtasksRequest extends TeaModel {
    /**
     * <p>The page number of the subtask List. The starting value is 1, and the default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of subtasks displayed per page in a paged query. Default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSubtasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubtasksRequest self = new ListSubtasksRequest();
        return TeaModel.build(map, self);
    }

    public ListSubtasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSubtasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
