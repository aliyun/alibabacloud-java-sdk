// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseSourcesByObjectRequest extends TeaModel {
    /**
     * <p>token</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The graph name. You can call listGraphs to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The ID of the associated variable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2676</p>
     */
    @NameInMap("objectId")
    public String objectId;

    /**
     * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>contract</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The code of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, it is explicitly passed by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListKnowledgeBaseSourcesByObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseSourcesByObjectRequest self = new ListKnowledgeBaseSourcesByObjectRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseSourcesByObjectRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListKnowledgeBaseSourcesByObjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
