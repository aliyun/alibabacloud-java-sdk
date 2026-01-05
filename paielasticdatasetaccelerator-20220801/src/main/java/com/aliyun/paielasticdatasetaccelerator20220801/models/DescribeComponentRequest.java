// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeComponentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderTemplate")
    public Boolean renderTemplate;

    @NameInMap("Values")
    public java.util.Map<String, ?> values;

    public static DescribeComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentRequest self = new DescribeComponentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComponentRequest setRenderTemplate(Boolean renderTemplate) {
        this.renderTemplate = renderTemplate;
        return this;
    }
    public Boolean getRenderTemplate() {
        return this.renderTemplate;
    }

    public DescribeComponentRequest setValues(java.util.Map<String, ?> values) {
        this.values = values;
        return this;
    }
    public java.util.Map<String, ?> getValues() {
        return this.values;
    }

}
