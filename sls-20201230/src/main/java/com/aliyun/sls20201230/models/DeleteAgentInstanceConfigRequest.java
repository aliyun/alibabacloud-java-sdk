// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteAgentInstanceConfigRequest extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    public static DeleteAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentInstanceConfigRequest self = new DeleteAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentInstanceConfigRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

}
