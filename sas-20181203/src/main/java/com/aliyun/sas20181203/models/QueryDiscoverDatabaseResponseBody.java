// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryDiscoverDatabaseResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The progress of the database scan task in percentage.</p>
     */
    @NameInMap("TaskProgress")
    public Integer taskProgress;

    public static QueryDiscoverDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDiscoverDatabaseResponseBody self = new QueryDiscoverDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDiscoverDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDiscoverDatabaseResponseBody setTaskProgress(Integer taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }
    public Integer getTaskProgress() {
        return this.taskProgress;
    }

}
