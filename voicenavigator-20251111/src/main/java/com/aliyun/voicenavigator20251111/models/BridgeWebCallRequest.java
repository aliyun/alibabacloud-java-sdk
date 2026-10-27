// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class BridgeWebCallRequest extends TeaModel {
    /**
     * <p>The channel ID.</p>
     * <blockquote>
     * <p>This parameter is valid only when AccessChannelType is set to Web or Trial.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>33606503-c22c-4547-a51c-dda5e8d87962</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <p>The channel type.</p>
     * <blockquote>
     * <ul>
     * <li>Text: text test window</li>
     * <li>Test: test window</li>
     * <li>Trial: trial link</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("AccessChannelType")
    public String accessChannelType;

    /**
     * <p>The caller number.</p>
     * 
     * <strong>example:</strong>
     * <p>010123*****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>The device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d4c38420-<strong><strong>-43bc-b001-56bfc274</strong></strong></p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Specifies whether the test environment is used.</p>
     * <blockquote>
     * <p>Default value: false.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DraftVersion")
    public Boolean draftVersion;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sampling rate.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("SampleRate")
    public Integer sampleRate;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a88e269-01f5-49ac-97af-5830f0ccb271</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The attached data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The timeout period.</p>
     * <blockquote>
     * <ul>
     * <li>If the call is not connected within the time specified by this parameter, the system actively hangs up the call. Unit: seconds. Default value: 60.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static BridgeWebCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BridgeWebCallRequest self = new BridgeWebCallRequest();
        return TeaModel.build(map, self);
    }

    public BridgeWebCallRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public BridgeWebCallRequest setAccessChannelType(String accessChannelType) {
        this.accessChannelType = accessChannelType;
        return this;
    }
    public String getAccessChannelType() {
        return this.accessChannelType;
    }

    public BridgeWebCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public BridgeWebCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BridgeWebCallRequest setDraftVersion(Boolean draftVersion) {
        this.draftVersion = draftVersion;
        return this;
    }
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    public BridgeWebCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BridgeWebCallRequest setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Integer getSampleRate() {
        return this.sampleRate;
    }

    public BridgeWebCallRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public BridgeWebCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public BridgeWebCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
