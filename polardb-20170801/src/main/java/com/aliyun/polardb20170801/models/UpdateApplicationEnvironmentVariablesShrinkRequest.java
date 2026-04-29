// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationEnvironmentVariablesShrinkRequest extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;ENV_TEST&quot;: &quot;test-value&quot;
     * }</p>
     */
    @NameInMap("Variables")
    public String variablesShrink;

    public static UpdateApplicationEnvironmentVariablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationEnvironmentVariablesShrinkRequest self = new UpdateApplicationEnvironmentVariablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationEnvironmentVariablesShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationEnvironmentVariablesShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdateApplicationEnvironmentVariablesShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

}
