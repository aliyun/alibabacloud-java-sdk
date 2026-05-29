// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class ChatShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Bearer%20eyJhb****...****k</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    /**
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Role&quot;:&quot;user&quot;,&quot;Content&quot;:[{&quot;Type&quot;:&quot;text&quot;,&quot;Text&quot;:&quot;你好&quot;}]}]</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("RoutingKey")
    public String routingKey;

    /**
     * <strong>example:</strong>
     * <p>test-session-001</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;OutputFileMode&quot;: &quot;url&quot;}</p>
     */
    @NameInMap("Settings")
    public String settingsShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;IncludeReasoning&quot;: false, &quot;IncludeToolCalls&quot;: false}</p>
     */
    @NameInMap("StreamOptions")
    public String streamOptionsShrink;

    /**
     * <strong>example:</strong>
     * <p>template-abc123</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static ChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatShrinkRequest self = new ChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatShrinkRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public ChatShrinkRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ChatShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public ChatShrinkRequest setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }
    public String getRoutingKey() {
        return this.routingKey;
    }

    public ChatShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatShrinkRequest setSettingsShrink(String settingsShrink) {
        this.settingsShrink = settingsShrink;
        return this;
    }
    public String getSettingsShrink() {
        return this.settingsShrink;
    }

    public ChatShrinkRequest setStreamOptionsShrink(String streamOptionsShrink) {
        this.streamOptionsShrink = streamOptionsShrink;
        return this;
    }
    public String getStreamOptionsShrink() {
        return this.streamOptionsShrink;
    }

    public ChatShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
