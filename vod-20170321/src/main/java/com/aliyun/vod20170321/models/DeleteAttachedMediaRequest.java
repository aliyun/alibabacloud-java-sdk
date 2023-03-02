// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaRequest extends TeaModel {
    /**
     * <p>The list of auxiliary media asset IDs.</p>
     * <br>
     * <p>*   Separate multiple IDs with commas (,).</p>
     * <p>*   A maximum of 20 IDs can be specified.</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static DeleteAttachedMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttachedMediaRequest self = new DeleteAttachedMediaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAttachedMediaRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
