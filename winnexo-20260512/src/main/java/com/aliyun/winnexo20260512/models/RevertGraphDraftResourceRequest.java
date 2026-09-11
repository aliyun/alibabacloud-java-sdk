// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RevertGraphDraftResourceRequest extends TeaModel {
    /**
     * <p>The draft change ID (the draftChangeId returned by listGraphDraftResources).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>401001</p>
     */
    @NameInMap("draftChangeId")
    public Long draftChangeId;

    /**
     * <p>The knowledge graph name.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly by using --tenant-id in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RevertGraphDraftResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertGraphDraftResourceRequest self = new RevertGraphDraftResourceRequest();
        return TeaModel.build(map, self);
    }

    public RevertGraphDraftResourceRequest setDraftChangeId(Long draftChangeId) {
        this.draftChangeId = draftChangeId;
        return this;
    }
    public Long getDraftChangeId() {
        return this.draftChangeId;
    }

    public RevertGraphDraftResourceRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public RevertGraphDraftResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
