// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrShrinkRequest extends TeaModel {
    /**
     * <p>The scope of VBR instances for which the VPC-connected instance authorization is being revoked. Valid values:</p>
     * <ul>
     * <li><p><strong>ALL</strong>: Revokes the VPC-connected instance authorization for all VBR instances in the specified region. In this case, the <strong>VbrInstanceIds</strong> parameter can be left empty.</p>
     * </li>
     * <li><p><strong>Specify</strong>: Revokes the VPC-connected instance authorization for the specified VBR instances. In this case, the <strong>VbrInstanceIds</strong> parameter is required.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("GrantType")
    public String grantType;

    /**
     * <p>The instance ID of the VPC-connected instance for which you want to revoke the authorization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1brjuegjc88v3u9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the VPC-connected instance for which you want to revoke the authorization.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of VBR instance IDs for which the VPC-connected instance authorization is being revoked.</p>
     */
    @NameInMap("VbrInstanceIds")
    public String vbrInstanceIdsShrink;

    /**
     * <p>The Alibaba Cloud account ID of the VBR instance for which the authorization is being revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("VbrOwnerUid")
    public String vbrOwnerUid;

    /**
     * <p>The region ID of the VBR instance for which the VPC-connected instance authorization is being revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
