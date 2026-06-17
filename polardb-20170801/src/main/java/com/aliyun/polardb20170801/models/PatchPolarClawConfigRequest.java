// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class PatchPolarClawConfigRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>A JSON merge-patch object.</p>
     * 
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
    public java.util.Map<String, ?> configPatch;

    /**
     * <p>Specifies whether to restart the gateway after applying the patch. The default is <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static PatchPolarClawConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchPolarClawConfigRequest self = new PatchPolarClawConfigRequest();
        return TeaModel.build(map, self);
    }

    public PatchPolarClawConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public PatchPolarClawConfigRequest setConfigPatch(java.util.Map<String, ?> configPatch) {
        this.configPatch = configPatch;
        return this;
    }
    public java.util.Map<String, ?> getConfigPatch() {
        return this.configPatch;
    }

    public PatchPolarClawConfigRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
