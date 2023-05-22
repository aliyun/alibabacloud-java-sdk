// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrShrinkRequest extends TeaModel {
    /**
     * <p>The VBRs for which you want to revoke permissions on the VPC. Valid values:</p>
     * <br>
     * <p>*   **ALL**: Permissions on the VPC are revoked for all VBRs in the specified region. **VbrInstanceIds** can be left empty.</p>
     * <p>*   **Specify**: Permissions on the VPC are revoked for the specified VBRs. **VbrInstanceIds** must be assigned a value.</p>
     */
    @NameInMap("GrantType")
    public String grantType;

    /**
     * <p>The VPC ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the VPC is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the VBRs for which you want to revoke the permissions.</p>
     */
    @NameInMap("VbrInstanceIds")
    public String vbrInstanceIdsShrink;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
     */
    @NameInMap("VbrOwnerUid")
    public String vbrOwnerUid;

    /**
     * <p>The ID of the region where the VBR is deployed.</p>
     */
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
