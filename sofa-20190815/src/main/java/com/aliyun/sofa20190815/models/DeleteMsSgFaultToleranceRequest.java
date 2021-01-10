// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgFaultToleranceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMsSgFaultToleranceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgFaultToleranceRequest self = new DeleteMsSgFaultToleranceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgFaultToleranceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteMsSgFaultToleranceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
