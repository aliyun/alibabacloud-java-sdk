// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsRequest extends TeaModel {
    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("MediaType")
    public String mediaType;

    public static GetUploadDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDetailsRequest self = new GetUploadDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadDetailsRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public GetUploadDetailsRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public GetUploadDetailsRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

}
