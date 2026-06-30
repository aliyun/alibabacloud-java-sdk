// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslationTaskRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>This parameter is required.</p>
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
