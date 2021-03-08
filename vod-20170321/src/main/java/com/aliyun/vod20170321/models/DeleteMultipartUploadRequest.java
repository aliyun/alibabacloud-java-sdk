// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMultipartUploadRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaType")
    public String mediaType;

    public static DeleteMultipartUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultipartUploadRequest self = new DeleteMultipartUploadRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultipartUploadRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteMultipartUploadRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public DeleteMultipartUploadRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMultipartUploadRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

}
