// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class AssociateEipRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Role")
    public String role;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    public static AssociateEipRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateEipRequest self = new AssociateEipRequest();
        return TeaModel.build(map, self);
    }

    public AssociateEipRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public AssociateEipRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AssociateEipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateEipRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AssociateEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateEipRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
