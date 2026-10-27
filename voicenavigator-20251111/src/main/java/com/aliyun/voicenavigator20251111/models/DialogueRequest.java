// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DialogueRequest extends TeaModel {
    /**
     * <p>Extras.
     * For example, a silence timeout: [{&quot;dataType&quot;:&quot;Silence&quot;}]</p>
     * <blockquote>
     * <p>Notice: Valid values for <code>dataType</code>: <code>DTMF</code>, <code>Silence</code>, or <code>RuntimePrompts</code>.</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li><p>If <code>dataType</code> is <code>DTMF</code>, use the format: <code>[{&quot;dataType&quot;:&quot;DTMF&quot;,&quot;dtmf&quot;:&quot;xxxx&quot;}]</code></p>
     * </li>
     * <li><p>If <code>dataType</code> is <code>Silence</code>, use the format: <code>[{&quot;dataType&quot;:&quot;Silence&quot;}]</code></p>
     * </li>
     * <li><p>If <code>dataType</code> is <code>RuntimePrompts</code>, use the format: <code>[{&quot;dataType&quot;:&quot;RuntimePrompts&quot;,&quot;prompts&quot;:&quot;xxxx&quot;,&quot;persistent&quot;:false/true}]</code></p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;dataType&quot;: &quot;Silence&quot;
     * }]</p>
     */
    @NameInMap("Extras")
    public String extras;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a88e269-01f5-49ac-97af-5830f0ccb271</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>07d72ea0-6e38-48d4-8371-14deaaba996f</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The user\&quot;s input for the conversational turn.</p>
     * 
     * <strong>example:</strong>
     * <p>行吧，那我就不打扰您了，再见。</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    public static DialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DialogueRequest self = new DialogueRequest();
        return TeaModel.build(map, self);
    }

    public DialogueRequest setExtras(String extras) {
        this.extras = extras;
        return this;
    }
    public String getExtras() {
        return this.extras;
    }

    public DialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DialogueRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DialogueRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DialogueRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
