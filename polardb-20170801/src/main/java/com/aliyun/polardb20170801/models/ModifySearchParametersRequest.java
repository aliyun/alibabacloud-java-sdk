// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySearchParametersRequest extends TeaModel {
    /**
     * <p>The ID of the primary PolarDB cluster, which is used to locate the Search cluster associated with the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>A non-empty JSON object string where the keys are parameter names and all values must be strings, such as 10% for a percentage or 48mb for a capacity. Only parameters that are visible and modifiable in the current version template can be modified. Dynamic parameters take effect and are persisted immediately, whereas static parameters take effect after a restart triggered by the task flow. A successful response only indicates that the task has been accepted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;indices.memory.index_buffer_size&quot;:&quot;10%&quot;,&quot;indices.memory.min_index_buffer_size&quot;:&quot;48mb&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    public static ModifySearchParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySearchParametersRequest self = new ModifySearchParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifySearchParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifySearchParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
