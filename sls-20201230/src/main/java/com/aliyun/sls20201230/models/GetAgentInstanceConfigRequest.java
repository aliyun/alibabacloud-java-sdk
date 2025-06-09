// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAgentInstanceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("attributes")
    public String attributes;

    public static GetAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInstanceConfigRequest self = new GetAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentInstanceConfigRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

}
