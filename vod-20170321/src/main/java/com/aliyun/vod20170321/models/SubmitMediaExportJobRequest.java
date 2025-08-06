// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitMediaExportJobRequest extends TeaModel {
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Match")
    public String match;

    @NameInMap("MediaExportConfig")
    public String mediaExportConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SortBy")
    public String sortBy;

    public static SubmitMediaExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaExportJobRequest self = new SubmitMediaExportJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaExportJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SubmitMediaExportJobRequest setMatch(String match) {
        this.match = match;
        return this;
    }
    public String getMatch() {
        return this.match;
    }

    public SubmitMediaExportJobRequest setMediaExportConfig(String mediaExportConfig) {
        this.mediaExportConfig = mediaExportConfig;
        return this;
    }
    public String getMediaExportConfig() {
        return this.mediaExportConfig;
    }

    public SubmitMediaExportJobRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SubmitMediaExportJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitMediaExportJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitMediaExportJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitMediaExportJobRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
