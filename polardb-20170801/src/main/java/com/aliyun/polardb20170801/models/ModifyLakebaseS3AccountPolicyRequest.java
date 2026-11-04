// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLakebaseS3AccountPolicyRequest extends TeaModel {
    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PfsInstanceId")
    public String pfsInstanceId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the regions of all clusters under the target account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The access key of the S3 account whose policy you want to modify.</p>
     * <blockquote>
     * <p>You cannot modify the default account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accname</p>
     */
    @NameInMap("UserAccAk")
    public String userAccAk;

    /**
     * <p>The user account policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;s3:GetObject&quot;,&quot;s3:PutObject&quot;],&quot;Resource&quot;:[&quot;arn:aws:s3:::my-bucket/*&quot;]}]}</p>
     */
    @NameInMap("UserAccPolicy")
    public String userAccPolicy;

    public static ModifyLakebaseS3AccountPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakebaseS3AccountPolicyRequest self = new ModifyLakebaseS3AccountPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLakebaseS3AccountPolicyRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public ModifyLakebaseS3AccountPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLakebaseS3AccountPolicyRequest setUserAccAk(String userAccAk) {
        this.userAccAk = userAccAk;
        return this;
    }
    public String getUserAccAk() {
        return this.userAccAk;
    }

    public ModifyLakebaseS3AccountPolicyRequest setUserAccPolicy(String userAccPolicy) {
        this.userAccPolicy = userAccPolicy;
        return this;
    }
    public String getUserAccPolicy() {
        return this.userAccPolicy;
    }

}
