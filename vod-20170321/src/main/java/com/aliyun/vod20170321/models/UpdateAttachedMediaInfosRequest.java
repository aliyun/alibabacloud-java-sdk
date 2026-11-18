// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosRequest extends TeaModel {
    /**
     * <p>The update content. You can update the information of up to 20 auxiliary media assets at a time. For the parameter structure, refer to the <strong>UpdateContent</strong> table below.</p>
     * <blockquote>
     * <ul>
     * <li>The update content for <code>Title</code>, <code>Description</code>, and <code>Tags</code> cannot contain emojis.</li>
     * <li>If a parameter is passed, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;MediaId&quot;:&quot;bbc65bba53f6ed90de118a7849****&quot;,&quot;Title&quot;:&quot;Title 1&quot;,&quot;Description&quot;:&quot;Description 1&quot;,&quot;Tags&quot;:&quot;Tag 1,Tag 2&quot;},{&quot;MediaId&quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title2&quot;:&quot;Title&quot;,&quot;Description2&quot;:&quot;Description&quot;,&quot;Tags&quot;:&quot;Tag 3,Tag 4&quot;}]</p>
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
