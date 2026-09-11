// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGraphSchemaDetailRequest extends TeaModel {
    /**
     * <p>The name of the graph.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The tenant ID. This is a common parameter. You can pass this parameter explicitly by using <code>--tenant-id</code> in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetGraphSchemaDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaDetailRequest self = new GetGraphSchemaDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaDetailRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public GetGraphSchemaDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
