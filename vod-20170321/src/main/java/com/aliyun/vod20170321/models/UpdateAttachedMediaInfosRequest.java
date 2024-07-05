// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosRequest extends TeaModel {
    /**
     * <p>The new information about auxiliary media assets. You can modify the information about up to 20 auxiliary media assets at a time. For more information, see the <strong>UpdateContent</strong> section of this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;MediaId &quot;:&quot;bbc65bba53f6ed90de118a7849****&quot;,&quot;Title&quot;:&quot; test title1&quot;,&quot;Description&quot;:&quot;test description1&quot;,&quot;Tags&quot;:&quot;tag1,tag2&quot;},{&quot;MediaId &quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title2&quot;:&quot;test title2&quot;,&quot;Description2&quot;:&quot;test description2&quot;,&quot;Tags&quot;:&quot;tag3,tag4&quot;}]</p>
     */
    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateAttachedMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosRequest self = new UpdateAttachedMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttachedMediaInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
