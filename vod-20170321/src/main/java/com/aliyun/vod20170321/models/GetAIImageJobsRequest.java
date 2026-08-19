// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIImageJobsRequest extends TeaModel {
    /**
     * <p>The IDs of AI image processing tasks. The value consists of one or more job IDs. A job ID is the value of the JobId parameter returned by the <a href="https://help.aliyun.com/document_detail/186922.html">SubmitAIImageJob</a> operation.</p>
     * <ul>
     * <li>A maximum of 10 IDs are supported.</li>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cf08a2c6e11e*****de1711b738b9067</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static GetAIImageJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIImageJobsRequest self = new GetAIImageJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetAIImageJobsRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public GetAIImageJobsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetAIImageJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetAIImageJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetAIImageJobsRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
