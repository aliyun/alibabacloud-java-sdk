// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveApplicationEnvironmentVariablesShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-********************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Specifies whether to restart the gateway after removing the variables. The default is <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>A list of the environment variable names to remove.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VariableNames")
    public String variableNamesShrink;

    public static RemoveApplicationEnvironmentVariablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationEnvironmentVariablesShrinkRequest self = new RemoveApplicationEnvironmentVariablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationEnvironmentVariablesShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RemoveApplicationEnvironmentVariablesShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public RemoveApplicationEnvironmentVariablesShrinkRequest setVariableNamesShrink(String variableNamesShrink) {
        this.variableNamesShrink = variableNamesShrink;
        return this;
    }
    public String getVariableNamesShrink() {
        return this.variableNamesShrink;
    }

}
