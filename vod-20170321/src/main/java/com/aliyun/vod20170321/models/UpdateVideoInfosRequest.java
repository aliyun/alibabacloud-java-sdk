// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosRequest extends TeaModel {
    /**
     * <p>The new information about audios or videos. You can modify the information about up to 20 audios or videos at a time. Separate multiple audios or videos with commas (,). When you modify the information exceed 20 audios or videos at a time, the update will fail with an error code **CountExceededMax**.</p>
     * <br>
     * <p>The value is a JSON string. For more information, see the **UpdateContent** section of this topic.</p>
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
