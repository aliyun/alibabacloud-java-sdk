// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class PatchPolarClawConfigShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;tools&quot;: {
     *         &quot;web&quot;: {
     *             &quot;search&quot;: {
     *                 &quot;enabled&quot;: false
     *             }
     *         }
     *     }
     * }</p>
     */
    @NameInMap("ConfigPatch")
    public String configPatchShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static PatchPolarClawConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchPolarClawConfigShrinkRequest self = new PatchPolarClawConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PatchPolarClawConfigShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public PatchPolarClawConfigShrinkRequest setConfigPatchShrink(String configPatchShrink) {
        this.configPatchShrink = configPatchShrink;
        return this;
    }
    public String getConfigPatchShrink() {
        return this.configPatchShrink;
    }

    public PatchPolarClawConfigShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
