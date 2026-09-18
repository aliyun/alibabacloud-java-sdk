// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListJobPlansRequest extends TeaModel {
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
    public java.util.List<ListJobPlansRequestTag> tag;

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

    public static ListJobPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobPlansRequest self = new ListJobPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListJobPlansRequest setHasTemplate(Boolean hasTemplate) {
        this.hasTemplate = hasTemplate;
        return this;
    }
    public Boolean getHasTemplate() {
        return this.hasTemplate;
    }

    public ListJobPlansRequest setJobPlanName(String jobPlanName) {
        this.jobPlanName = jobPlanName;
        return this;
    }
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    public ListJobPlansRequest setJobPlanType(String jobPlanType) {
        this.jobPlanType = jobPlanType;
        return this;
    }
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    public ListJobPlansRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobPlansRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobPlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobPlansRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobPlansRequest setTag(java.util.List<ListJobPlansRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListJobPlansRequestTag> getTag() {
        return this.tag;
    }

    public ListJobPlansRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListJobPlansRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListJobPlansRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListJobPlansRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListJobPlansRequestTag self = new ListJobPlansRequestTag();
            return TeaModel.build(map, self);
        }

        public ListJobPlansRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobPlansRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
