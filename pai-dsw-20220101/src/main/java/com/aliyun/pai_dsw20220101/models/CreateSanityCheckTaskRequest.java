// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateSanityCheckTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateSanityCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSanityCheckTaskRequest self = new CreateSanityCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSanityCheckTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
