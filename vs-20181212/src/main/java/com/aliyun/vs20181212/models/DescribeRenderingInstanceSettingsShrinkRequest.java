// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceSettingsShrinkRequest extends TeaModel {
    @NameInMap("AttributeNames")
    public String attributeNamesShrink;

    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DescribeRenderingInstanceSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceSettingsShrinkRequest self = new DescribeRenderingInstanceSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceSettingsShrinkRequest setAttributeNamesShrink(String attributeNamesShrink) {
        this.attributeNamesShrink = attributeNamesShrink;
        return this;
    }
    public String getAttributeNamesShrink() {
        return this.attributeNamesShrink;
    }

    public DescribeRenderingInstanceSettingsShrinkRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
