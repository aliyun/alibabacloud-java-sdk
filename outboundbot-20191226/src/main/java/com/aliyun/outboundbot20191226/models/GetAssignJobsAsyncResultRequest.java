// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAssignJobsAsyncResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc79b0f9-a781-4305-85e2-d5d56679ae69</p>
     */
    @NameInMap("AsyncTaskId")
    public String asyncTaskId;

    public static GetAssignJobsAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssignJobsAsyncResultRequest self = new GetAssignJobsAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAssignJobsAsyncResultRequest setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

}
