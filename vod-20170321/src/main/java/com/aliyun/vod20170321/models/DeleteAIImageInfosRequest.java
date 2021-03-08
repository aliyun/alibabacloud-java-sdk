// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosRequest extends TeaModel {
    @NameInMap("AIImageInfoIds")
    public String AIImageInfoIds;

    public static DeleteAIImageInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIImageInfosRequest self = new DeleteAIImageInfosRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIImageInfosRequest setAIImageInfoIds(String AIImageInfoIds) {
        this.AIImageInfoIds = AIImageInfoIds;
        return this;
    }
    public String getAIImageInfoIds() {
        return this.AIImageInfoIds;
    }

}
