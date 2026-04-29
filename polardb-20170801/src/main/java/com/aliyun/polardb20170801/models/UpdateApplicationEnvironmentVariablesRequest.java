// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationEnvironmentVariablesRequest extends TeaModel {
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
    public java.util.Map<String, ?> variables;

    public static UpdateApplicationEnvironmentVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationEnvironmentVariablesRequest self = new UpdateApplicationEnvironmentVariablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationEnvironmentVariablesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationEnvironmentVariablesRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdateApplicationEnvironmentVariablesRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

}
