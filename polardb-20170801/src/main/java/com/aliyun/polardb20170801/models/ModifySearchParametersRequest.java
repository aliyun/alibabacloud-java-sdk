// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySearchParametersRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB primary cluster, which is used to locate the Search cluster associated with the current account. Before you call this operation, you must enable the Search feature in the console. You can check the status by using the SearchClusterStatus field returned by DescribeDBClusterAttribute. Usage notes: Prerequisites: The cluster must have the Search feature enabled in the console. You can verify the status by using the SearchClusterStatus field returned by DescribeDBClusterAttribute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>A non-empty JSON object string where the keys are parameter names and all values must be strings, such as 10% for percentages or 48mb for capacities. You can only modify parameters that are visible and modifiable in the template of the current version. Dynamic parameters take effect and are persisted immediately. Static parameters take effect after a restart triggered by the task flow. A success response only indicates that the task is accepted.</p>
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
