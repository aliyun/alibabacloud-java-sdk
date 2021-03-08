// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosRequest extends TeaModel {
    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateAttachedMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosRequest self = new UpdateAttachedMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttachedMediaInfosRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public UpdateAttachedMediaInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
