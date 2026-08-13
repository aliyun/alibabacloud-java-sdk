// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySemanticKnowledgeRequest extends TeaModel {
    /**
     * <p>数字员工名称，可先调用 listAuthorizedAgents 获取 USE 权限列表</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例数字员工</p>
     */
    @NameInMap("agentName")
    public String agentName;

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
     * <p>自然语言查询问题</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static QuerySemanticKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySemanticKnowledgeRequest self = new QuerySemanticKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public QuerySemanticKnowledgeRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public QuerySemanticKnowledgeRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public QuerySemanticKnowledgeRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QuerySemanticKnowledgeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
