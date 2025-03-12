// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceSettingsRequest extends TeaModel {
    @NameInMap("AttributeNames")
    public java.util.List<String> attributeNames;

    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DeleteRenderingInstanceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceSettingsRequest self = new DeleteRenderingInstanceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceSettingsRequest setAttributeNames(java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        return this;
    }
    public java.util.List<String> getAttributeNames() {
        return this.attributeNames;
    }

    public DeleteRenderingInstanceSettingsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
