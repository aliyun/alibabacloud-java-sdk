// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetGraphSchemaRequest extends TeaModel {
    /**
     * <p>图谱名称，可先调用 listGraphs 获取</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetGraphSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGraphSchemaRequest self = new GetGraphSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetGraphSchemaRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public GetGraphSchemaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
