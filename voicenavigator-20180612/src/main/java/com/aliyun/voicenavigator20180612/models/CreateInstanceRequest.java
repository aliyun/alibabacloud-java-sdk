// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Concurrency")
    public Long concurrency;

    @NameInMap("ChatbotInstanceId")
    public String chatbotInstanceId;

    @NameInMap("NluServiceType")
    public String nluServiceType;

    @NameInMap("ChatbotName")
    public String chatbotName;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public CreateInstanceRequest setChatbotInstanceId(String chatbotInstanceId) {
        this.chatbotInstanceId = chatbotInstanceId;
        return this;
    }
    public String getChatbotInstanceId() {
        return this.chatbotInstanceId;
    }

    public CreateInstanceRequest setNluServiceType(String nluServiceType) {
        this.nluServiceType = nluServiceType;
        return this;
    }
    public String getNluServiceType() {
        return this.nluServiceType;
    }

    public CreateInstanceRequest setChatbotName(String chatbotName) {
        this.chatbotName = chatbotName;
        return this;
    }
    public String getChatbotName() {
        return this.chatbotName;
    }

}
