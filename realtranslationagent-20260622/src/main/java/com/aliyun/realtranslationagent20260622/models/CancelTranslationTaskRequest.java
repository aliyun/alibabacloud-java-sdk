// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class CancelTranslationTaskRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>This parameter is required.</p>
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
