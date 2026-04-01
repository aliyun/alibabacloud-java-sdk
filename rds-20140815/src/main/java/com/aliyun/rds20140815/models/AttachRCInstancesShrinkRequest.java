// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The node IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The key pair of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_test</p>
     */
    @NameInMap("KeyPair")
    public String keyPair;

    /**
     * <p>The logon password of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <blockquote>
     * <p>This is a reserved parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static AttachRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachRCInstancesShrinkRequest self = new AttachRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachRCInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public AttachRCInstancesShrinkRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public AttachRCInstancesShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AttachRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachRCInstancesShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
