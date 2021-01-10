// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasRequestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Workspace")
    public String workspace;

    public static GetCasRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCasRequestRequest self = new GetCasRequestRequest();
        return TeaModel.build(map, self);
    }

    public GetCasRequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCasRequestRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
