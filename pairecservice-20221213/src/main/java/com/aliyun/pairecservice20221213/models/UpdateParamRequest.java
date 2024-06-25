// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateParamRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>house</p>
     */
    @NameInMap("Value")
    public String value;

    public static UpdateParamRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParamRequest self = new UpdateParamRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateParamRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
