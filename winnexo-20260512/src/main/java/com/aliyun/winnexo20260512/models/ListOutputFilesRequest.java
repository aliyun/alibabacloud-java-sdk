// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOutputFilesRequest extends TeaModel {
    /**
     * <p>精确业务编号，来自文件登记或工作流实例关联</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-20261012-001</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>可选协作空间 ID；未传保持当前用户个人产出范围</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123e4567-e89b-42d3-a456-426614174001</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The type of the output item. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>ppt</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The keyword for searching. Matches the output title or item name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The name of the digital employee (operating object). Used to filter results by name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of items per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>精确会话 ID，覆盖普通会话、技能会话与任务 executionId</p>
     * 
     * <strong>example:</strong>
     * <p>session_123e4567-e89b-42d3-a456-426614174008</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to display only outputs and output items with sharing enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("sharedOnly")
    public Boolean sharedOnly;

    /**
     * <p>全部匹配的标签列表，来自文件登记或实例 variables.tags</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListOutputFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutputFilesRequest self = new ListOutputFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListOutputFilesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListOutputFilesRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListOutputFilesRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public ListOutputFilesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListOutputFilesRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListOutputFilesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListOutputFilesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOutputFilesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListOutputFilesRequest setSharedOnly(Boolean sharedOnly) {
        this.sharedOnly = sharedOnly;
        return this;
    }
    public Boolean getSharedOnly() {
        return this.sharedOnly;
    }

    public ListOutputFilesRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public ListOutputFilesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
