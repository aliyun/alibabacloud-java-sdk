// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAgentInstanceConfigRequest extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    public static GetAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInstanceConfigRequest self = new GetAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentInstanceConfigRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

}
