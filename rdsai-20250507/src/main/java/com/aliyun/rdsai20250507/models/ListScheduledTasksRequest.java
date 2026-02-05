// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListScheduledTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    public static ListScheduledTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksRequest self = new ListScheduledTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListScheduledTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScheduledTasksRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

}
