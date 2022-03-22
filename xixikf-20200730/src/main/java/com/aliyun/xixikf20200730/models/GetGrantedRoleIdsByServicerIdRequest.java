// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetGrantedRoleIdsByServicerIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServicerId")
    public Long servicerId;

    public static GetGrantedRoleIdsByServicerIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGrantedRoleIdsByServicerIdRequest self = new GetGrantedRoleIdsByServicerIdRequest();
        return TeaModel.build(map, self);
    }

    public GetGrantedRoleIdsByServicerIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetGrantedRoleIdsByServicerIdRequest setServicerId(Long servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public Long getServicerId() {
        return this.servicerId;
    }

}
