// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLaboratoryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteLaboratoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaboratoryRequest self = new DeleteLaboratoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLaboratoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
