// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class CreateChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;solutionDetail&quot;:{&quot;formValues&quot;:{&quot;params&quot;:{&quot;InstanceId&quot;:&quot;dsw-g54******qg9&quot;},&quot;content&quot;:{&quot;EcsSpec&quot;:&quot;ecs.gn6i-c8g1.2xlarge&quot;}},&quot;success&quot;:true}}</p>
     */
    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("Payload")
    public java.util.Map<String, ?> payload;

    @NameInMap("Question")
    public ChatDetail question;

    @NameInMap("Title")
    public String title;

    public static CreateChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatRequest self = new CreateChatRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public CreateChatRequest setPayload(java.util.Map<String, ?> payload) {
        this.payload = payload;
        return this;
    }
    public java.util.Map<String, ?> getPayload() {
        return this.payload;
    }

    public CreateChatRequest setQuestion(ChatDetail question) {
        this.question = question;
        return this;
    }
    public ChatDetail getQuestion() {
        return this.question;
    }

    public CreateChatRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
