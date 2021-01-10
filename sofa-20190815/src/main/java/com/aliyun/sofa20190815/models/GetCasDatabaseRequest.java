// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCasDatabaseRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Workspace")
    public String workspace;

    public static GetCasDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCasDatabaseRequest self = new GetCasDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetCasDatabaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCasDatabaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
