// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateLakebaseS3AccountRequest extends TeaModel {
    /**
     * <p>The PolarFS instance ID. You can obtain the ID from the PolarFsInstanceId parameter returned by the CreatePolarFs operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PfsInstanceId")
    public String pfsInstanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The access key of the S3 account.</p>
     * <blockquote>
     * <p>The account name supports only uppercase and lowercase letters and digits, and can be up to 32 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accname</p>
     */
    @NameInMap("UserAccAk")
    public String userAccAk;

    /**
     * <p>The policy document in JSON format that defines the permissions of the S3 account. If this parameter is not specified, the default policy is used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;s3:<em>&quot;],&quot;Resource&quot;:[&quot;</em>&quot;]}]}</p>
     */
    @NameInMap("UserAccPolicy")
    public String userAccPolicy;

    /**
     * <p>The secret key of the S3 account (@sensitive, encryption in transit).</p>
     * <blockquote>
     * <p>The value must contain both uppercase and lowercase letters and digits, and must be 19 to 32 characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password***</p>
     */
    @NameInMap("UserAccSk")
    public String userAccSk;

    public static CreateLakebaseS3AccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLakebaseS3AccountRequest self = new CreateLakebaseS3AccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateLakebaseS3AccountRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public CreateLakebaseS3AccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLakebaseS3AccountRequest setUserAccAk(String userAccAk) {
        this.userAccAk = userAccAk;
        return this;
    }
    public String getUserAccAk() {
        return this.userAccAk;
    }

    public CreateLakebaseS3AccountRequest setUserAccPolicy(String userAccPolicy) {
        this.userAccPolicy = userAccPolicy;
        return this;
    }
    public String getUserAccPolicy() {
        return this.userAccPolicy;
    }

    public CreateLakebaseS3AccountRequest setUserAccSk(String userAccSk) {
        this.userAccSk = userAccSk;
        return this;
    }
    public String getUserAccSk() {
        return this.userAccSk;
    }

}
