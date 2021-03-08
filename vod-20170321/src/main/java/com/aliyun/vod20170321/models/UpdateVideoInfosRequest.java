// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosRequest extends TeaModel {
    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateVideoInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosRequest self = new UpdateVideoInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
