// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckProcessRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <br>
     * <p>> You can call the [SubmitCheck](~~SubmitCheck~~) operation to query the ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetCheckProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckProcessRequest self = new GetCheckProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckProcessRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
