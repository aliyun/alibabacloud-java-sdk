// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class FilterUnavailableCodesShrinkRequest extends TeaModel {
    @NameInMap("Codes")
    public String codesShrink;

    public static FilterUnavailableCodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FilterUnavailableCodesShrinkRequest self = new FilterUnavailableCodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FilterUnavailableCodesShrinkRequest setCodesShrink(String codesShrink) {
        this.codesShrink = codesShrink;
        return this;
    }
    public String getCodesShrink() {
        return this.codesShrink;
    }

}
