// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToVbrShrinkRequest extends TeaModel {
    @NameInMap("GrantType")
    public String grantType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VbrInstanceIds")
    public String vbrInstanceIdsShrink;

    @NameInMap("VbrOwnerUid")
    public Long vbrOwnerUid;

    @NameInMap("VbrRegionNo")
    public String vbrRegionNo;

    public static GrantInstanceToVbrShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToVbrShrinkRequest self = new GrantInstanceToVbrShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToVbrShrinkRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GrantInstanceToVbrShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantInstanceToVbrShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantInstanceToVbrShrinkRequest setVbrInstanceIdsShrink(String vbrInstanceIdsShrink) {
        this.vbrInstanceIdsShrink = vbrInstanceIdsShrink;
        return this;
    }
    public String getVbrInstanceIdsShrink() {
        return this.vbrInstanceIdsShrink;
    }

    public GrantInstanceToVbrShrinkRequest setVbrOwnerUid(Long vbrOwnerUid) {
        this.vbrOwnerUid = vbrOwnerUid;
        return this;
    }
    public Long getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    public GrantInstanceToVbrShrinkRequest setVbrRegionNo(String vbrRegionNo) {
        this.vbrRegionNo = vbrRegionNo;
        return this;
    }
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

}
