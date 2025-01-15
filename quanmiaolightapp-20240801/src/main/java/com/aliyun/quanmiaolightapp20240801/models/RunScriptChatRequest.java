// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunScriptChatRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static RunScriptChatRequest build(java.util.Map<String, ?> map) throws Exception {
        RunScriptChatRequest self = new RunScriptChatRequest();
        return TeaModel.build(map, self);
    }

    public RunScriptChatRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunScriptChatRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
