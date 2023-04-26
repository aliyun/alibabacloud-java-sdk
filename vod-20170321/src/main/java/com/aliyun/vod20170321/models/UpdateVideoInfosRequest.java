// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosRequest extends TeaModel {
    /**
     * <p>## UpdateContent</p>
     * <br>
     * <p>>  You must convert the UpdateContent[] parameter to a string before you pass it in.</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| VideoId | String | Yes | The ID of the video. |</p>
     * <p>| Title | String | No | The title of the video. |</p>
     * <p>| Description | String | No | The description of the video. |</p>
     * <p>| Tags | String | No | The tag of the video. |</p>
     * <p>| CoverURL | String | No | The URL of the video thumbnail. |</p>
     * <p>| CateId | Long | No | The ID of the category. |</p>
     */
    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateVideoInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosRequest self = new UpdateVideoInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
