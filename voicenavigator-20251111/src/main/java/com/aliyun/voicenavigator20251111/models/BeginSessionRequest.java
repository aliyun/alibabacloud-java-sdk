// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class BeginSessionRequest extends TeaModel {
    /**
     * <p>Specifies whether the draft version is used.</p>
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
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a88e269-01f5-49ac-97af-5830f0ccb271</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The vendor parameters.</p>
     * <blockquote>
     * <p>JSON format: {&quot;key1&quot;:&quot;value1&quot;}</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
     */
    @NameInMap("VendorParams")
    public String vendorParams;

    public static BeginSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionRequest self = new BeginSessionRequest();
        return TeaModel.build(map, self);
    }

    public BeginSessionRequest setDraftVersion(Boolean draftVersion) {
        this.draftVersion = draftVersion;
        return this;
    }
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    public BeginSessionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BeginSessionRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public BeginSessionRequest setVendorParams(String vendorParams) {
        this.vendorParams = vendorParams;
        return this;
    }
    public String getVendorParams() {
        return this.vendorParams;
    }

}
