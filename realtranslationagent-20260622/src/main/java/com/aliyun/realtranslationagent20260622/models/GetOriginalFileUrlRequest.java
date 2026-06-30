// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetOriginalFileUrlRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>This parameter is required.</p>
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
