// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class CancelTranslationTaskRequest extends TeaModel {
    /**
     * <p>The API key, the identity of member accounts. You can obtain it from the RuiYiBao console.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-5****7</p>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The task ID.</p>
     * <ul>
     * <li>The TaskId is returned after a task is submitted by calling SubmitTranslationTask.</li>
     * <li>Only running tasks can be canceled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelTranslationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTranslationTaskRequest self = new CancelTranslationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelTranslationTaskRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public CancelTranslationTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
