// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeCategoryTemplateRuleListResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCategoryTemplateRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryTemplateRuleListResponseBody self = new DescribeCategoryTemplateRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryTemplateRuleListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCategoryTemplateRuleListResponseBody setItems(java.util.List<DescribeCategoryTemplateRuleListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCategoryTemplateRuleListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCategoryTemplateRuleListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCategoryTemplateRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCategoryTemplateRuleListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCategoryTemplateRuleListResponseBodyItems extends TeaModel {
        @NameInMap("CustomType")
        public Integer customType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdentificationRuleIds")
        public String identificationRuleIds;

        @NameInMap("IdentificationScope")
        public String identificationScope;

        @NameInMap("Name")
        public String name;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateId")
        public Long templateId;

        public static DescribeCategoryTemplateRuleListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoryTemplateRuleListResponseBodyItems self = new DescribeCategoryTemplateRuleListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setCustomType(Integer customType) {
            this.customType = customType;
            return this;
        }
        public Integer getCustomType() {
            return this.customType;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setIdentificationRuleIds(String identificationRuleIds) {
            this.identificationRuleIds = identificationRuleIds;
            return this;
        }
        public String getIdentificationRuleIds() {
            return this.identificationRuleIds;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setIdentificationScope(String identificationScope) {
            this.identificationScope = identificationScope;
            return this;
        }
        public String getIdentificationScope() {
            return this.identificationScope;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCategoryTemplateRuleListResponseBodyItems setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
