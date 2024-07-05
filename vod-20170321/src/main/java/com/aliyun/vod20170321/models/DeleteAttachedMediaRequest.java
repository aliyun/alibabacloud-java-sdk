// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaRequest extends TeaModel {
    /**
     * <p>The ID of the auxiliary media asset that you want to delete. You can obtain the ID of the auxiliary media asset from the MediaId parameter in the response to the <a href="https://help.aliyun.com/document_detail/98467.html">CreateUploadAttachedMedia</a> operation.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,).</li>
     * <li>You can specify a maximum of 20 IDs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8bc8e94fe4e55abde85718****,eb186180e989dd56****</p>
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
