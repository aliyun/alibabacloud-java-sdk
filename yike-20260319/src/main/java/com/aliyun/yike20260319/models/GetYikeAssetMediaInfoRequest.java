// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAssetMediaInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static GetYikeAssetMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAssetMediaInfoRequest self = new GetYikeAssetMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeAssetMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
