// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteAgentInstanceConfigRequest extends TeaModel {
    @NameInMap("isGray")
    public Boolean isGray;

    public static DeleteAgentInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentInstanceConfigRequest self = new DeleteAgentInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentInstanceConfigRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

}
