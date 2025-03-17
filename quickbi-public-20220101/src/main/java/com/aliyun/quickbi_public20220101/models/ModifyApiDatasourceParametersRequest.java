// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyApiDatasourceParametersRequest extends TeaModel {
    /**
     * <p>The ID of the API data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b66a66de51f24d149116c17718138194</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The configuration of API data parameters in the JSONArray format. You can modify a maximum of 10 parameters.</p>
     * <ul>
     * <li>name: the name of a common parameter or a parameter in a query statement</li>
     * <li>value: the value of a common parameter or a parameter in a query statement.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;token&quot;,&quot;value&quot;:&quot;xxxxxxxxxxxx&quot;},{&quot;name&quot;:&quot;pageSize&quot;,&quot;value&quot;:100}]</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
     */
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
