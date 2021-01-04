// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateExecutionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutionRequest self = new UpdateExecutionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public UpdateExecutionRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public UpdateExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
