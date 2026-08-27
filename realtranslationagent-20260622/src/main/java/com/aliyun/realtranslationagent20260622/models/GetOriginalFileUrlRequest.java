// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetOriginalFileUrlRequest extends TeaModel {
    /**
     * <p>The API key that identifies a member account. You can obtain it from the Ruiyi Bao console.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The task ID.</p>
     * <ul>
     * <li>The TaskId is returned after a task is submitted by calling SubmitTranslationTask.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetOriginalFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOriginalFileUrlRequest self = new GetOriginalFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetOriginalFileUrlRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public GetOriginalFileUrlRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
