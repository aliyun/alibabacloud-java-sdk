// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateEntityTagRelationRequest extends TeaModel {
    @NameInMap("EntityTagParam")
    public String entityTagParam;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateEntityTagRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityTagRelationRequest self = new UpdateEntityTagRelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityTagRelationRequest setEntityTagParam(String entityTagParam) {
        this.entityTagParam = entityTagParam;
        return this;
    }
    public String getEntityTagParam() {
        return this.entityTagParam;
    }

    public UpdateEntityTagRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
