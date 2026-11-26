// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAdminKnowledgeBasesRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If this parameter is passed, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The keyword for fuzzy search of component data in the form.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample keyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The field by which to sort the returned results. Valid values:</p>
     * <ul>
     * <li>event_time: the event creation time</li>
     * <li>event_execute_start_time: the event execution start time</li>
     * <li>event_execute_finish_time: the event execution finish time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>The sort order. This parameter takes effect only when the sort field is specified. Valid values: ASC and DESC. The values are case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The list of service source types.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;K8S,SAE_K8S_SERVICE,FC3,VIP,DNS,AI,AGENT,CloudFlow,MSE_NACOS&quot;]</p>
     */
    @NameInMap("sourceTypes")
    public java.util.List<String> sourceTypes;

    /**
     * <p>The ID of the tenant to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAdminKnowledgeBasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdminKnowledgeBasesRequest self = new ListAdminKnowledgeBasesRequest();
        return TeaModel.build(map, self);
    }

    public ListAdminKnowledgeBasesRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListAdminKnowledgeBasesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListAdminKnowledgeBasesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAdminKnowledgeBasesRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListAdminKnowledgeBasesRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListAdminKnowledgeBasesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAdminKnowledgeBasesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAdminKnowledgeBasesRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListAdminKnowledgeBasesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListAdminKnowledgeBasesRequest setSourceTypes(java.util.List<String> sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public java.util.List<String> getSourceTypes() {
        return this.sourceTypes;
    }

    public ListAdminKnowledgeBasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
