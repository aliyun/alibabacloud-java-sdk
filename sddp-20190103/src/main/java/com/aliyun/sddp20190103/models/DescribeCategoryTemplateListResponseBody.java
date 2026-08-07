// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateListResponseBody extends TeaModel {
    /**
     * <p>The page number in a paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of industry templates.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCategoryTemplateListResponseBodyItems> items;

    /**
     * <p>The number of entries per page in a paging query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID that Alibaba Cloud generates for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8491DBFD-48C0-4E11-B6FC-6F38921244A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
        /**
         * <p>The ID of the current risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CurrentRiskLevel")
        public Integer currentRiskLevel;

        /**
         * <p>The description of the industry template.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the industry template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the industry template was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1545277010000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The unique ID of the industry template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The maximum category level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxCategoryLevel")
        public Integer maxCategoryLevel;

        /**
         * <p>The ID of the maximum risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxRiskLevel")
        public Integer maxRiskLevel;

        /**
         * <p>The name of the industry template.</p>
         * 
         * <strong>example:</strong>
         * <p>built-in template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the industry template. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled. The template is the current primary template of the user.</li>
         * <li><strong>2</strong>: Active. Both enabled and active templates can be applied to detection tasks.</li>
         * <li><strong>3</strong>: General detection model template.</li>
         * </ul>
         * <blockquote>
         * <p>Templates in the enabled or active state can be used as the industry template ID parameter for <a href="https://help.aliyun.com/document_detail/2399253.html">DescribeDataObjects</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the industry template supports editing. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SupportEdit")
        public Integer supportEdit;

        /**
         * <p>The type of the industry template.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
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
