// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionDefaultInstanceRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    public static UpdateFunctionDefaultInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionDefaultInstanceRequest self = new UpdateFunctionDefaultInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionDefaultInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
