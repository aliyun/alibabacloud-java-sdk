// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the scheduled tasks.</p>
     * <br>
     * <p>For more information, see [ScheduledTask](~~173610~~).</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    /**
     * <p>The total number of the returned scheduled tasks.</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksResponseBody self = new ListScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledTasksResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public ListScheduledTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
