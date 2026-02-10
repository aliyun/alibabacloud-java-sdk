// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DataJuicerConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>config</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("EnableResourceEstimation")
    public Boolean enableResourceEstimation;

    /**
     * <strong>example:</strong>
     * <p>standalone</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    @NameInMap("ResourceLimit")
    public ResourceLimit resourceLimit;

    public static DataJuicerConfig build(java.util.Map<String, ?> map) throws Exception {
        DataJuicerConfig self = new DataJuicerConfig();
        return TeaModel.build(map, self);
    }

    public DataJuicerConfig setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public DataJuicerConfig setEnableResourceEstimation(Boolean enableResourceEstimation) {
        this.enableResourceEstimation = enableResourceEstimation;
        return this;
    }
    public Boolean getEnableResourceEstimation() {
        return this.enableResourceEstimation;
    }

    public DataJuicerConfig setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public DataJuicerConfig setResourceLimit(ResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }
    public ResourceLimit getResourceLimit() {
        return this.resourceLimit;
    }

}
