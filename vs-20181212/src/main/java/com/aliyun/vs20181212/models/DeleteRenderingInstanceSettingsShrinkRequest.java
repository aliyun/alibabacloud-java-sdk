// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceSettingsShrinkRequest extends TeaModel {
    /**
     * <p>List of attribute names.</p>
     */
    @NameInMap("AttributeNames")
    public String attributeNamesShrink;

    /**
     * <p>ID of the cloud application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DeleteRenderingInstanceSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceSettingsShrinkRequest self = new DeleteRenderingInstanceSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceSettingsShrinkRequest setAttributeNamesShrink(String attributeNamesShrink) {
        this.attributeNamesShrink = attributeNamesShrink;
        return this;
    }
    public String getAttributeNamesShrink() {
        return this.attributeNamesShrink;
    }

    public DeleteRenderingInstanceSettingsShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
