// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemoveApplicationEnvironmentVariablesRequest extends TeaModel {
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
    public java.util.List<String> variableNames;

    public static RemoveApplicationEnvironmentVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationEnvironmentVariablesRequest self = new RemoveApplicationEnvironmentVariablesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveApplicationEnvironmentVariablesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RemoveApplicationEnvironmentVariablesRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public RemoveApplicationEnvironmentVariablesRequest setVariableNames(java.util.List<String> variableNames) {
        this.variableNames = variableNames;
        return this;
    }
    public java.util.List<String> getVariableNames() {
        return this.variableNames;
    }

}
