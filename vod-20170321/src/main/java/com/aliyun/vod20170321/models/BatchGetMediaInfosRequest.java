// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosRequest extends TeaModel {
    /**
     * <p>The ID of the media asset. The ID can be the video ID or audio ID. Separate IDs with commas (,). You can specify a maximum of 20 IDs. You can use one of the following methods to obtain the ID of the media asset:</p>
     * <ul>
     * <li>Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose Media Files &gt; Audio/Video. On the Video and Audio page, view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the CreateUploadVideo operation that you call to upload media assets.</li>
     * <li>Obtain the value of VideoId from the response to the SearchMedia operation that you call to query the media ID after the media asset is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61ccbdb06fa83012be4d8083f6****,7d2fbc380b0e08e55f****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static BatchGetMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediaInfosRequest self = new BatchGetMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
