// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateTempFileTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateTempFileTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTempFileTaskRequest self = new CreateTempFileTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTempFileTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
