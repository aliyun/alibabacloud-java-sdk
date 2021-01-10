// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsConfigResourcesRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMsConfigResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsConfigResourcesRequest self = new DeleteMsConfigResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsConfigResourcesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteMsConfigResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
