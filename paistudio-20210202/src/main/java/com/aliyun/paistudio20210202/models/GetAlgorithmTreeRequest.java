// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmTreeRequest extends TeaModel {
    @NameInMap("Source")
    public String source;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAlgorithmTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmTreeRequest self = new GetAlgorithmTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmTreeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetAlgorithmTreeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
