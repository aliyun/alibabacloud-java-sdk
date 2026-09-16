// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ChatMessagesTaskStopRequest extends TeaModel {
    /**
     * <p>The unique ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>09a81048-0528-4de5-9dbd-12c8a12b****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The ContextDB workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ChatMessagesTaskStopRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatMessagesTaskStopRequest self = new ChatMessagesTaskStopRequest();
        return TeaModel.build(map, self);
    }

    public ChatMessagesTaskStopRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ChatMessagesTaskStopRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
