// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class DeleteYikeAssetMediaInfosRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogicDelete")
    public Boolean logicDelete;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong>,<strong><strong>15d4a4b0448391508f2cb486</strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static DeleteYikeAssetMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteYikeAssetMediaInfosRequest self = new DeleteYikeAssetMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public DeleteYikeAssetMediaInfosRequest setLogicDelete(Boolean logicDelete) {
        this.logicDelete = logicDelete;
        return this;
    }
    public Boolean getLogicDelete() {
        return this.logicDelete;
    }

    public DeleteYikeAssetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
