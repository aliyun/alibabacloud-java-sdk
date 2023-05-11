// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyApiDatasourceParametersRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ModifyApiDatasourceParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiDatasourceParametersRequest self = new ModifyApiDatasourceParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiDatasourceParametersRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ModifyApiDatasourceParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyApiDatasourceParametersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
