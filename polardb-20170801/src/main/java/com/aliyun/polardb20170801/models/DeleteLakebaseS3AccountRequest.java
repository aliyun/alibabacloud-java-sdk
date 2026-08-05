// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteLakebaseS3AccountRequest extends TeaModel {
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The access key of the S3 account to delete.</p>
     * <blockquote>
     * <p>The default account cannot be deleted.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accname</p>
     */
    @NameInMap("UserAccAk")
    public String userAccAk;

    public static DeleteLakebaseS3AccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakebaseS3AccountRequest self = new DeleteLakebaseS3AccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLakebaseS3AccountRequest setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public DeleteLakebaseS3AccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLakebaseS3AccountRequest setUserAccAk(String userAccAk) {
        this.userAccAk = userAccAk;
        return this;
    }
    public String getUserAccAk() {
        return this.userAccAk;
    }

}
