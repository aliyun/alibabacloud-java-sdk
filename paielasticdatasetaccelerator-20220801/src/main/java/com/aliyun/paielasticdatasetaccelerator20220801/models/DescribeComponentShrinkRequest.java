// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeComponentShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderTemplate")
    public Boolean renderTemplate;

    @NameInMap("Values")
    public String valuesShrink;

    public static DescribeComponentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentShrinkRequest self = new DescribeComponentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentShrinkRequest setRenderTemplate(Boolean renderTemplate) {
        this.renderTemplate = renderTemplate;
        return this;
    }
    public Boolean getRenderTemplate() {
        return this.renderTemplate;
    }

    public DescribeComponentShrinkRequest setValuesShrink(String valuesShrink) {
        this.valuesShrink = valuesShrink;
        return this;
    }
    public String getValuesShrink() {
        return this.valuesShrink;
    }

}
