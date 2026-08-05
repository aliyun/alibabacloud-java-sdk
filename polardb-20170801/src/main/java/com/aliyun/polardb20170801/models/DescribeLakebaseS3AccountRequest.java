// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseS3AccountRequest extends TeaModel {
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for your account, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Access Key of the S3 account.</p>
     * <blockquote>
     * <p>The account name supports only uppercase letters, lowercase letters, and digits, with a maximum length of 32 characters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accname</p>
     */
    @NameInMap("UserAccAk")
    public String userAccAk;

    public static DescribeLakebaseS3AccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseS3AccountRequest self = new DescribeLakebaseS3AccountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseS3AccountRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public DescribeLakebaseS3AccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLakebaseS3AccountRequest setUserAccAk(String userAccAk) {
        this.userAccAk = userAccAk;
        return this;
    }
    public String getUserAccAk() {
        return this.userAccAk;
    }

}
