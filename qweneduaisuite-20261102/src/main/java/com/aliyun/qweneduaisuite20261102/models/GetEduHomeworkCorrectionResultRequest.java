// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class GetEduHomeworkCorrectionResultRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b18eabc4-5d84-40b0-ae20-e0eb2f585781</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetEduHomeworkCorrectionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEduHomeworkCorrectionResultRequest self = new GetEduHomeworkCorrectionResultRequest();
        return TeaModel.build(map, self);
    }

    public GetEduHomeworkCorrectionResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
