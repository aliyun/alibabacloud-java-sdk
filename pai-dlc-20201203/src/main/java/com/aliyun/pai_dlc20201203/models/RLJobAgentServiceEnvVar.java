// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobAgentServiceEnvVar extends TeaModel {
    /**
     * <p>The name of the environment variable, which must be non-empty and unique within the list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E2B_DOMAIN</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The value of the environment variable.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Value")
    public String value;

    public static RLJobAgentServiceEnvVar build(java.util.Map<String, ?> map) throws Exception {
        RLJobAgentServiceEnvVar self = new RLJobAgentServiceEnvVar();
        return TeaModel.build(map, self);
    }

    public RLJobAgentServiceEnvVar setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RLJobAgentServiceEnvVar setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
