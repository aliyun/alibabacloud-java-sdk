// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateExecutionRequest extends TeaModel {
    /**
     * <p>The description of the execution.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>执行的描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the execution.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>A JSON string consisting of a collection of parameters. Default value: {}.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutionRequest self = new UpdateExecutionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateExecutionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public UpdateExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
