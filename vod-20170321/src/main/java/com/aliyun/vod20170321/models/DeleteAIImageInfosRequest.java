// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAIImageInfosRequest extends TeaModel {
    /**
     * <p>The IDs of AI image information. This parameter consists of one or more AIImageInfoId values. The AIImageInfoId is the value of the AIImageInfoId response parameter returned by the <a href="https://help.aliyun.com/document_detail/186924.html">ListAIImageInfo</a> operation.</p>
     * <ul>
     * <li>A maximum of 10 IDs are supported.</li>
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
