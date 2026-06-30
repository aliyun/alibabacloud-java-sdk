// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslatedFileUrlRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTranslatedFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranslatedFileUrlRequest self = new GetTranslatedFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTranslatedFileUrlRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public GetTranslatedFileUrlRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
