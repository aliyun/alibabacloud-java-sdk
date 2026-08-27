// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslationTaskRequest extends TeaModel {
    /**
     * <p>The API key that identifies a member accounts identity. You can obtain it from the RuiYiBao console.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The translation task ID, which is the TaskId obtained from UploadTranslationFile.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTranslationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranslationTaskRequest self = new GetTranslationTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTranslationTaskRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public GetTranslationTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
