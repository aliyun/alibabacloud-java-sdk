// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceSettingsRequest extends TeaModel {
    /**
     * <p>The list of instance configuration names.</p>
     */
    @NameInMap("AttributeNames")
    public java.util.List<String> attributeNames;

    /**
     * <p>The ID of the Cloud Application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DescribeRenderingInstanceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceSettingsRequest self = new DescribeRenderingInstanceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceSettingsRequest setAttributeNames(java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
        return this;
    }
    public java.util.List<String> getAttributeNames() {
        return this.attributeNames;
    }

    public DescribeRenderingInstanceSettingsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

}
