// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListJobPlansRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasTemplate")
    public Boolean hasTemplate;

    @NameInMap("JobPlanName")
    public String jobPlanName;

    /**
     * <strong>example:</strong>
     * <p>Distillation</p>
     */
    @NameInMap("JobPlanType")
    public String jobPlanType;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
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

    @NameInMap("Tag")
    public java.util.List<ListJobPlansRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>advanced_cot_distill</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
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
        @NameInMap("Key")
        public String key;

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
