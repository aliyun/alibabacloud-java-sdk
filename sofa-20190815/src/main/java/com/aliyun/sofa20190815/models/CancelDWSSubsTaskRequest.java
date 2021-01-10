// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelDWSSubsTaskRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CancelDWSSubsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDWSSubsTaskRequest self = new CancelDWSSubsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelDWSSubsTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CancelDWSSubsTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
