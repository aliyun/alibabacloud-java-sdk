// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrShrinkRequest extends TeaModel {
    @NameInMap("GrantType")
    public String grantType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VbrInstanceIds")
    public String vbrInstanceIdsShrink;

    @NameInMap("VbrOwnerUid")
    public String vbrOwnerUid;

    @NameInMap("VbrRegionNo")
    public String vbrRegionNo;

    public static RevokeInstanceFromVbrShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromVbrShrinkRequest self = new RevokeInstanceFromVbrShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromVbrShrinkRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public RevokeInstanceFromVbrShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeInstanceFromVbrShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeInstanceFromVbrShrinkRequest setVbrInstanceIdsShrink(String vbrInstanceIdsShrink) {
        this.vbrInstanceIdsShrink = vbrInstanceIdsShrink;
        return this;
    }
    public String getVbrInstanceIdsShrink() {
        return this.vbrInstanceIdsShrink;
    }

    public RevokeInstanceFromVbrShrinkRequest setVbrOwnerUid(String vbrOwnerUid) {
        this.vbrOwnerUid = vbrOwnerUid;
        return this;
    }
    public String getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    public RevokeInstanceFromVbrShrinkRequest setVbrRegionNo(String vbrRegionNo) {
        this.vbrRegionNo = vbrRegionNo;
        return this;
    }
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

}
