// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySemanticKnowledgeRequest extends TeaModel {
    /**
     * <p>The digital human name. Call listAuthorizedAgents first to retrieve the list of USE permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleDigitalHuman</p>
     */
    @NameInMap("agentName")
    public String agentName;

    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The knowledge graph name. Call listGraphs first to retrieve available graphs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The natural language query question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21577</p>
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

    public QuerySemanticKnowledgeRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public QuerySemanticKnowledgeRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public QuerySemanticKnowledgeRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public QuerySemanticKnowledgeRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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
