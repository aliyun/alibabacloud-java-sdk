// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DataJuicerConfig extends TeaModel {
    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>shell: shell command.</li>
     * <li>config: DataJuicer YAML configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>config</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>Specifies whether to enable resource estimation. When resource estimation is enabled, the execution mode must be distributed, and the command type must be config (DataJuicer YAML configuration).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableResourceEstimation")
    public Boolean enableResourceEstimation;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li>standalone: single-node.</li>
     * <li>distributed: distributed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standalone</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The resource estimation limit. This parameter takes effect only when resource estimation is enabled.</p>
     */
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
