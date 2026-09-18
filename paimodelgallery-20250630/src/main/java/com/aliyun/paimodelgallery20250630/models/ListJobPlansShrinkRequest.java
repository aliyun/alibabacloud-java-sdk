// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListJobPlansShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter by template association. Valid values:</p>
     * <ul>
     * <li>true: Returns only scenario-specific job plans that have a template.</li>
     * <li>false: Returns only general-purpose job plans that do not have a template.</li>
     * </ul>
     * <p>If this parameter is not specified, no filtering is applied. If both this parameter and TemplateId are specified, the value of TemplateId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasTemplate")
    public Boolean hasTemplate;

    /**
     * <p>The name of the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>JobPlan1</p>
     */
    @NameInMap("JobPlanName")
    public String jobPlanName;

    /**
     * <p>The type of the job plan.</p>
     * 
     * <strong>example:</strong>
     * <p>Distillation</p>
     */
    @NameInMap("JobPlanType")
    public String jobPlanType;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The distillation template ID. Filters results to return only scenario-specific tasks that use the specified template.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32495</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListJobPlansShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobPlansShrinkRequest self = new ListJobPlansShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListJobPlansShrinkRequest setHasTemplate(Boolean hasTemplate) {
        this.hasTemplate = hasTemplate;
        return this;
    }
    public Boolean getHasTemplate() {
        return this.hasTemplate;
    }

    public ListJobPlansShrinkRequest setJobPlanName(String jobPlanName) {
        this.jobPlanName = jobPlanName;
        return this;
    }
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    public ListJobPlansShrinkRequest setJobPlanType(String jobPlanType) {
        this.jobPlanType = jobPlanType;
        return this;
    }
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    public ListJobPlansShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobPlansShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobPlansShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobPlansShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobPlansShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListJobPlansShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListJobPlansShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
