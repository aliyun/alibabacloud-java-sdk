// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsConfigAttributesRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteMsConfigAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsConfigAttributesRequest self = new DeleteMsConfigAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsConfigAttributesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteMsConfigAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
