// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311.models;

import com.aliyun.tea.*;

public class ChatShrinkRequest extends TeaModel {
    /**
     * <p>Bearer + JWT returned by GetAccessToken. URL-encode the entire string and pass it as a query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer%20eyJhb****...****k</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    /**
     * <p>The user ID from the external system.</p>
     * 
     * <strong>example:</strong>
     * <p>test-user</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The message list (JSON string), sorted in chronological order.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Role&quot;:&quot;user&quot;,&quot;Content&quot;:[{&quot;Type&quot;:&quot;text&quot;,&quot;Text&quot;:&quot;你好&quot;}]}]</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("Model")
    public String model;

    @NameInMap("Resume")
    public Boolean resume;

    /**
     * <p>The routing key that specifies the backend instance to process the request.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("RoutingKey")
    public String routingKey;

    /**
     * <p>The session ID for multi-turn conversation context persistence.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session-001</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The additional settings. Contains the output file mode control parameter OutputFileMode (string, valid values: url or base64. Defaults to base64 for legacy compatibility. We recommend url).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OutputFileMode&quot;: &quot;url&quot;}</p>
     */
    @NameInMap("Settings")
    public String settingsShrink;

    /**
     * <p>The streaming output control options. Contains IncludeReasoning (boolean, default true, specifies whether to include the model thinking process) and IncludeToolCalls (boolean, default true, specifies whether to include tool invocation details). If not specified or set to a null object, the behavior is consistent with the legacy version.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;IncludeReasoning&quot;: false, &quot;IncludeToolCalls&quot;: false}</p>
     */
    @NameInMap("StreamOptions")
    public String streamOptionsShrink;

    /**
     * <p>The agent template ID.</p>
     * 
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

    public ChatShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ChatShrinkRequest setResume(Boolean resume) {
        this.resume = resume;
        return this;
    }
    public Boolean getResume() {
        return this.resume;
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
