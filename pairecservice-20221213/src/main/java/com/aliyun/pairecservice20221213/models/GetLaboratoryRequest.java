// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLaboratoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLaboratoryRequest self = new GetLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public GetLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
