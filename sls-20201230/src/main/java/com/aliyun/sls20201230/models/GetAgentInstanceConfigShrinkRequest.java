// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAgentInstanceConfigShrinkRequest extends TeaModel {
    /**
     * <p>The owner of the process-level configuration.</p>
     */
    @NameInMap("attributes")
    public String attributesShrink;

    public static GetAgentInstanceConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInstanceConfigShrinkRequest self = new GetAgentInstanceConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentInstanceConfigShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

}
