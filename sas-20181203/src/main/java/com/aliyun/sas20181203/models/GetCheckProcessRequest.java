// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckProcessRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <blockquote>
     * <p>You can call the <a href="~~SubmitCheck~~">SubmitCheck</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5347c7b6-c85c-4070-846a-3029e08e****</p>
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
