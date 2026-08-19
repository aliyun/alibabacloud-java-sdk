// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosRequest extends TeaModel {
    /**
     * <p>The update content. You can update the information of up to 20 auxiliary media assets at a time. For the parameter structure, see the <strong>UpdateContent</strong> table below.</p>
     * <blockquote>
     * <ul>
     * <li>The <code>Title</code>, <code>Description</code>, and <code>Tags</code> fields cannot contain emoticons.</li>
     * <li>If a parameter is specified, the corresponding field is updated. Otherwise, the corresponding field is not overwritten or updated.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;MediaId&quot;:&quot;bbc65bba53f6ed90de118a7849****&quot;,&quot;Title&quot;:&quot; title1&quot;,&quot;Description&quot;:&quot; description1&quot;,&quot;Tags&quot;:&quot; tag1, tag2&quot;},{&quot;MediaId&quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title2&quot;:&quot; title&quot;,&quot;Description2&quot;:&quot; description&quot;,&quot;Tags&quot;:&quot; tag3, tag4&quot;}]</p>
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
