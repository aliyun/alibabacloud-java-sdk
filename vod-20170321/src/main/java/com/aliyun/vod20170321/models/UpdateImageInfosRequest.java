// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosRequest extends TeaModel {
    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateImageInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfosRequest self = new UpdateImageInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageInfosRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public UpdateImageInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
