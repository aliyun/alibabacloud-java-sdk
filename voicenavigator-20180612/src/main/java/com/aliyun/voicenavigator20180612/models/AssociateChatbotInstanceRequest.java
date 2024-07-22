// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AssociateChatbotInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>chatbot-720edd02b66a</p>
     */
    @NameInMap("ChatbotInstanceId")
    public String chatbotInstanceId;

    @NameInMap("ChatbotName")
    public String chatbotName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NluServiceParamsJson")
    public String nluServiceParamsJson;

    @NameInMap("NluServiceType")
    public String nluServiceType;

    @NameInMap("UnionSource")
    public String unionSource;

    public static AssociateChatbotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateChatbotInstanceRequest self = new AssociateChatbotInstanceRequest();
        return TeaModel.build(map, self);
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

    public AssociateChatbotInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateChatbotInstanceRequest setNluServiceParamsJson(String nluServiceParamsJson) {
        this.nluServiceParamsJson = nluServiceParamsJson;
        return this;
    }
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    public AssociateChatbotInstanceRequest setNluServiceType(String nluServiceType) {
        this.nluServiceType = nluServiceType;
        return this;
    }
    public String getNluServiceType() {
        return this.nluServiceType;
    }

    public AssociateChatbotInstanceRequest setUnionSource(String unionSource) {
        this.unionSource = unionSource;
        return this;
    }
    public String getUnionSource() {
        return this.unionSource;
    }

}
