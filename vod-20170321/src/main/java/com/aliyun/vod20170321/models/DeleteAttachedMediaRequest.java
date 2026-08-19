// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaRequest extends TeaModel {
    /**
     * <p>The auxiliary media asset IDs.</p>
     * <ul>
     * <li>Separate multiple IDs with commas (,). A maximum of 20 IDs are supported.</li>
     * <li>The IDs are returned after you call the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation to obtain the upload URL and credential for auxiliary media assets.</li>
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
