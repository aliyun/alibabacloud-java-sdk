// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<ListTemplatesResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTemplatesResponseBody setItems(java.util.List<ListTemplatesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplatesResponseBodyItems extends TeaModel {
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

        public static ListTemplatesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyItems self = new ListTemplatesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyItems setCurrentRiskLevel(Integer currentRiskLevel) {
            this.currentRiskLevel = currentRiskLevel;
            return this;
        }
        public Integer getCurrentRiskLevel() {
            return this.currentRiskLevel;
        }

        public ListTemplatesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplatesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTemplatesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTemplatesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTemplatesResponseBodyItems setMaxCategoryLevel(Integer maxCategoryLevel) {
            this.maxCategoryLevel = maxCategoryLevel;
            return this;
        }
        public Integer getMaxCategoryLevel() {
            return this.maxCategoryLevel;
        }

        public ListTemplatesResponseBodyItems setMaxRiskLevel(Integer maxRiskLevel) {
            this.maxRiskLevel = maxRiskLevel;
            return this;
        }
        public Integer getMaxRiskLevel() {
            return this.maxRiskLevel;
        }

        public ListTemplatesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTemplatesResponseBodyItems setSupportEdit(Integer supportEdit) {
            this.supportEdit = supportEdit;
            return this;
        }
        public Integer getSupportEdit() {
            return this.supportEdit;
        }

        public ListTemplatesResponseBodyItems setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
