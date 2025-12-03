// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesTaskStopRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-iBuGU1VxEY42zrQRQfNA****</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>09a81048-0528-4de5-9dbd-12c8a12b****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ChatMessagesTaskStopRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesTaskStopRequest self = new ChatMessagesTaskStopRequest();
        return TeaModel.build(map, self);
    }

    public ChatMessagesTaskStopRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ChatMessagesTaskStopRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
