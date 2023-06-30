// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateListResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeCategoryTemplateListResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCategoryTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryTemplateListResponseBody self = new DescribeCategoryTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryTemplateListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCategoryTemplateListResponseBody setItems(java.util.List<DescribeCategoryTemplateListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCategoryTemplateListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCategoryTemplateListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCategoryTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCategoryTemplateListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCategoryTemplateListResponseBodyItems extends TeaModel {
        @NameInMap("CurrentRiskLevel")
        public Integer currentRiskLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxCategoryLevel")
        public Integer maxCategoryLevel;

        @NameInMap("MaxRiskLevel")
        public Integer maxRiskLevel;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SupportEdit")
        public Integer supportEdit;

        @NameInMap("Type")
        public Integer type;

        public static DescribeCategoryTemplateListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoryTemplateListResponseBodyItems self = new DescribeCategoryTemplateListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCategoryTemplateListResponseBodyItems setCurrentRiskLevel(Integer currentRiskLevel) {
            this.currentRiskLevel = currentRiskLevel;
            return this;
        }
        public Integer getCurrentRiskLevel() {
            return this.currentRiskLevel;
        }

        public DescribeCategoryTemplateListResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCategoryTemplateListResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCategoryTemplateListResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCategoryTemplateListResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCategoryTemplateListResponseBodyItems setMaxCategoryLevel(Integer maxCategoryLevel) {
            this.maxCategoryLevel = maxCategoryLevel;
            return this;
        }
        public Integer getMaxCategoryLevel() {
            return this.maxCategoryLevel;
        }

        public DescribeCategoryTemplateListResponseBodyItems setMaxRiskLevel(Integer maxRiskLevel) {
            this.maxRiskLevel = maxRiskLevel;
            return this;
        }
        public Integer getMaxRiskLevel() {
            return this.maxRiskLevel;
        }

        public DescribeCategoryTemplateListResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCategoryTemplateListResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCategoryTemplateListResponseBodyItems setSupportEdit(Integer supportEdit) {
            this.supportEdit = supportEdit;
            return this;
        }
        public Integer getSupportEdit() {
            return this.supportEdit;
        }

        public DescribeCategoryTemplateListResponseBodyItems setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
