// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosRequest extends TeaModel {
    /**
     * <p>The IDs of the images that are submitted for AI processing. You can obtain the value of AIImageInfoId from the response to the <a href="~~ListAIImageInfo~~">ListAIImageInfo</a> operation.</p>
     * <ul>
     * <li>You can specify a maximum of 10 IDs.</li>
     * <li>Separate multiple IDs with commas (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b89a6aabf144*****6197ebd6fe6cf29</p>
     */
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
