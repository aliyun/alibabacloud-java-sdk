// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateDatasourceRequest extends TeaModel {
    /**
     * <p>The configuration of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;address&quot;: &quot;&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The name of the datasource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The datasource type. Valid values are:</p>
     * <p>● Hologres</p>
     * <p>● GraphCompute</p>
     * <p>● Redis</p>
     * <p>● MaxCompute</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The URI of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>igraph_instance1</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The ID of the workspace. Call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceRequest self = new CreateDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatasourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDatasourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateDatasourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
