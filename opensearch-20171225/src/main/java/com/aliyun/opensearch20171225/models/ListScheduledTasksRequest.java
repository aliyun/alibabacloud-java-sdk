// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListScheduledTasksRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The scheduled task type. Valid values:</p>
     * <ul>
     * <li>wipe: data cleaning.</li>
     * <li>fork: reindexing.</li>
     * <li>check-status: application status check.</li>
     * <li>index: reindexing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wipe</p>
     */
    @NameInMap("type")
    public String type;

    public static ListScheduledTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksRequest self = new ListScheduledTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListScheduledTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScheduledTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
