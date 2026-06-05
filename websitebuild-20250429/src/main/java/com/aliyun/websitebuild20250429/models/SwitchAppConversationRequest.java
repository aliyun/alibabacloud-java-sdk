// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SwitchAppConversationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>Zero2</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <strong>example:</strong>
     * <p>IMAGE_LOGO</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static SwitchAppConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchAppConversationRequest self = new SwitchAppConversationRequest();
        return TeaModel.build(map, self);
    }

    public SwitchAppConversationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SwitchAppConversationRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public SwitchAppConversationRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
