// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteAgentInstanceConfigShrinkRequest extends TeaModel {
    @NameInMap("attributes")
    public String attributesShrink;

    public static DeleteAgentInstanceConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentInstanceConfigShrinkRequest self = new DeleteAgentInstanceConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentInstanceConfigShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

}
