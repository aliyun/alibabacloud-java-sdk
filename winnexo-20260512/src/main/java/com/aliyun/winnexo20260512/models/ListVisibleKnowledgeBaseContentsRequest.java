// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBaseContentsRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The directory ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The name of the digital employee (operating object name).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

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
     * <p>The page number of the results to return. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The page size. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li>event_time: event creation time</li>
     * <li>event_execute_start_time: event execution time</li>
     * <li>event_execute_finish_time: event completion time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("sortField")
    public String sortField;

    /**
     * <p>The sort order. This parameter takes effect only when sortBy is specified. Valid values: ASC, DESC (case-insensitive).</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sortOrder")
    public String sortOrder;

    /**
     * <p>The list of service source types.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceTypes")
    public java.util.List<String> sourceTypes;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListVisibleKnowledgeBaseContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBaseContentsRequest self = new ListVisibleKnowledgeBaseContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBaseContentsRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListVisibleKnowledgeBaseContentsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListVisibleKnowledgeBaseContentsRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListVisibleKnowledgeBaseContentsRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListVisibleKnowledgeBaseContentsRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListVisibleKnowledgeBaseContentsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListVisibleKnowledgeBaseContentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVisibleKnowledgeBaseContentsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListVisibleKnowledgeBaseContentsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListVisibleKnowledgeBaseContentsRequest setSourceTypes(java.util.List<String> sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public java.util.List<String> getSourceTypes() {
        return this.sourceTypes;
    }

    public ListVisibleKnowledgeBaseContentsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
