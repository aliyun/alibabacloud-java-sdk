// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>按模板 ID 精确筛选。</p>
     * 
     * <strong>example:</strong>
     * <p>tpl1****6jcq2q</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>按模板名称模糊筛选。</p>
     * 
     * <strong>example:</strong>
     * <p>job-template-example-1778047****</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>按创建者用户 ID 筛选。</p>
     * 
     * <strong>example:</strong>
     * <p>20**************02</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>工作空间 ID。如何获取工作空间 ID，请参见 ListWorkspaces。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4***9</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListJobTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobTemplatesRequest self = new ListJobTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListJobTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobTemplatesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListJobTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListJobTemplatesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListJobTemplatesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
