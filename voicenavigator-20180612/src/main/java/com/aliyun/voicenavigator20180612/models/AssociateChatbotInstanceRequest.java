// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AssociateChatbotInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ChatbotInstanceId")
    public String chatbotInstanceId;

    @NameInMap("ChatbotName")
    public String chatbotName;

    public static AssociateChatbotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateChatbotInstanceRequest self = new AssociateChatbotInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AssociateChatbotInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateChatbotInstanceRequest setChatbotInstanceId(String chatbotInstanceId) {
        this.chatbotInstanceId = chatbotInstanceId;
        return this;
    }
    public String getChatbotInstanceId() {
        return this.chatbotInstanceId;
    }

    public AssociateChatbotInstanceRequest setChatbotName(String chatbotName) {
        this.chatbotName = chatbotName;
        return this;
    }
    public String getChatbotName() {
        return this.chatbotName;
    }

}
