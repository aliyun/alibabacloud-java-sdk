// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateImageInfosRequest extends TeaModel {
    /**
     * <p>The new information about the one or more images. You can modify the information about up to 20 images at a time. For more information, see the <strong>UpdateContent</strong> section of this topic.</p>
     * <blockquote>
     * <p>The values of the nested parameters Title, Description, and Tags under the UpdateContent parameter cannot contain emoticons.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ImageId&quot;:&quot;ff8fe57e3461416c6a267a4e09****&quot;,&quot;Title&quot;:&quot;test title&quot;,&quot;Description&quot;:&quot;test description&quot;,&quot;Tags&quot;:&quot;tag1,tag2&quot;}]</p>
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
