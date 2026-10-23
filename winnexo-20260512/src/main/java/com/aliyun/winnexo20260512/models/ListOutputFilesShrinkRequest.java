// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOutputFilesShrinkRequest extends TeaModel {
    /**
     * <p>The business ID used for exact filtering. The length is 1 to 128 characters. This value is derived from the businessId of the file registration or associated workflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>REQ-20261012-001</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>The ID of the collaboration workspace. The length is 1 to 64 characters. This parameter is optional. If not specified, the personal outputs of the current user are queried. If specified, the real-time permissions of the workspace members and source resources are verified.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123e4567-e89b-42d3-a456-426614174001</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The output item type. Valid values: ppt, html, document, picture, slides, video, audio, email, and others.</p>
     * 
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("itemType")
    public String itemType;

    /**
     * <p>The keyword used to match the output title or detail name.</p>
     * 
     * <strong>example:</strong>
     * <p>Quarterly operations</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The name of the digital employee (operating object). Filters outputs by name.</p>
     * 
     * <strong>example:</strong>
     * <p>Business Analysis Assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of items per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The session ID used for exact filtering. The length is 1 to 128 characters. This parameter applies to regular sessions, skill sessions, and the executionId of task executions.</p>
     * 
     * <strong>example:</strong>
     * <p>session_123e4567-e89b-42d3-a456-426614174008</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to display only shared outputs and output details.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("sharedOnly")
    public Boolean sharedOnly;

    /**
     * <p>The tags used for exact filtering. All specified tags must be matched simultaneously. You can specify up to 20 tags. Each tag must be a non-empty string of 1 to 128 characters. Tags are derived from file registrations or the variables.tags of associated instances.</p>
     */
    @NameInMap("tags")
    public String tagsShrink;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used. The identity and tenant permissions are determined by the gateway and backend authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListOutputFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutputFilesShrinkRequest self = new ListOutputFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOutputFilesShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListOutputFilesShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListOutputFilesShrinkRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public ListOutputFilesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListOutputFilesShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListOutputFilesShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListOutputFilesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOutputFilesShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListOutputFilesShrinkRequest setSharedOnly(Boolean sharedOnly) {
        this.sharedOnly = sharedOnly;
        return this;
    }
    public Boolean getSharedOnly() {
        return this.sharedOnly;
    }

    public ListOutputFilesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListOutputFilesShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
