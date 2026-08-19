// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosRequest extends TeaModel {
    /**
     * <p>The update content. You can modify the information of up to 20 images at a time. For the parameter structure, see the <strong>UpdateContent</strong> table below.</p>
     * <blockquote>
     * <ul>
     * <li>The Title, Description, and Tags fields cannot contain emoticons.</li>
     * <li>If a parameter is specified, the corresponding field is updated. Otherwise, the corresponding field is not overwritten or updated.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ImageId&quot;:&quot;ff8fe57e3461416c6a267a4e09****&quot;,&quot;Title&quot;:&quot; title&quot;,&quot;Description&quot;:&quot; description&quot;,&quot;Tags&quot;:&quot; tag1, tag2&quot;}]</p>
     */
    @NameInMap("UpdateContent")
    public String updateContent;

    public static UpdateImageInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageInfosRequest self = new UpdateImageInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageInfosRequest setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
        return this;
    }
    public String getUpdateContent() {
        return this.updateContent;
    }

}
