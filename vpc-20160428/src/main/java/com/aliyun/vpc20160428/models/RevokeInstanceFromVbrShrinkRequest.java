// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrShrinkRequest extends TeaModel {
    /**
     * <p>The scope of VBR instances from which the authorization of the VPC-connected instance is revoked. Valid values:</p>
     * <ul>
     * <li><p><strong>ALL</strong>: revokes the authorization between the VPC-connected instance and all VBR instances in the specified region. In this case, the <strong>VbrInstanceIds</strong> parameter can be left empty.</p>
     * </li>
     * <li><p><strong>Specify</strong>: revokes the authorization between the VPC-connected instance and the specified VBR instances. In this case, the <strong>VbrInstanceIds</strong> parameter is required.</p>
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
     * <p>The VPC-connected instance ID for which you want to revoke the authorization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1brjuegjc88v3u9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the VPC-connected instance for which you want to revoke the authorization. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of VBR instance IDs from which the authorization of the VPC-connected instance is revoked.</p>
     */
    @NameInMap("VbrInstanceIds")
    public String vbrInstanceIdsShrink;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the VBR instance from which the authorization is revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("VbrOwnerUid")
    public String vbrOwnerUid;

    /**
     * <p>The region ID of the VBR instance from which the authorization of the VPC-connected instance is revoked.</p>
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
