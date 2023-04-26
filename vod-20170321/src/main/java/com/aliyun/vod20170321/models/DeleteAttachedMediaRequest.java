// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaRequest extends TeaModel {
    /**
     * <p>Deletes one or more auxiliary media assets at a time.</p>
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
