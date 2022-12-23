// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosRequest extends TeaModel {
    // The IDs of the images that are submitted for AI processing. You can obtain the value of AIImageInfoId from the response to the [ListAIImageInfo](~~ListAIImageInfo~~) operation.
    // 
    // - You can specify a maximum of 10 IDs.
    // - Separate multiple IDs with commas (,).
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
