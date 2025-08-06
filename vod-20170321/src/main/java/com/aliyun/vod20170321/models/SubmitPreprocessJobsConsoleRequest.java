// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitPreprocessJobsConsoleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PreprocessType")
    public String preprocessType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitPreprocessJobsConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPreprocessJobsConsoleRequest self = new SubmitPreprocessJobsConsoleRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPreprocessJobsConsoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitPreprocessJobsConsoleRequest setPreprocessType(String preprocessType) {
        this.preprocessType = preprocessType;
        return this;
    }
    public String getPreprocessType() {
        return this.preprocessType;
    }

    public SubmitPreprocessJobsConsoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitPreprocessJobsConsoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitPreprocessJobsConsoleRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
