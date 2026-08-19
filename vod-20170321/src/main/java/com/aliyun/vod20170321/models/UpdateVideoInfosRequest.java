// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosRequest extends TeaModel {
    /**
     * <p>The update content. You can modify the information about up to 20 audio and video files at a time. Separate multiple audio and video object information entries with commas (,). If you specify more than 20 objects, the update is failed and the <code>CountExceededMax</code> error is returned.
     * The value is a JSON character string. For more details about the parameters, see the <strong>UpdateContent</strong> table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;VideoId&quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title&quot;:&quot;Alibaba Cloud VOD Video Title1&quot;},{&quot;VideoId&quot;:&quot;f45cf4eba5c84233389558c36****&quot;,&quot;Title&quot;:&quot;Alibaba Cloud VOD Video Title2&quot;}]</p>
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
