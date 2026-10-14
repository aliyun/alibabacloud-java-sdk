// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of records returned by the current query.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListTemplatesResponseBodyItems> items;

    /**
     * <p>The number of records per page for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which can be used to locate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that match the current query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The current sensitivity level of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentRiskLevel")
        public Integer currentRiskLevel;

        /**
         * <p>The description of the classification and grading template.</p>
         * 
         * <strong>example:</strong>
         * <p>Used to detect common sensitive data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the template was created. This value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1788566400000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the template was last modified. This value is a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1788566400000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the classification and grading template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The maximum category level supported by the template.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxCategoryLevel")
        public Integer maxCategoryLevel;

        /**
         * <p>The maximum sensitivity level supported by the template.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxRiskLevel")
        public Integer maxRiskLevel;

        /**
         * <p>The name of the classification and grading template.</p>
         * 
         * <strong>example:</strong>
         * <p>General classification and grading template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the template. Valid values:</p>
         * <ul>
         * <li>0: disabled.</li>
         * <li>1: enabled as the primary template.</li>
         * <li>2: active template.</li>
         * <li>3: general-purpose detection model.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the template can be edited. Valid values:</p>
         * <ul>
         * <li>0: not supported.</li>
         * <li>1: supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportEdit")
        public Integer supportEdit;

        /**
         * <p>The category of the template. Valid values:</p>
         * <ul>
         * <li>1: Alibaba template.</li>
         * <li>2: finance template.</li>
         * <li>3: energy template.</li>
         * <li>4: personal information security template.</li>
         * <li>5: travel template.</li>
         * <li>65: general-purpose template.</li>
         * <li>66: custom template.</li>
         * <li>67: template from another cloud service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
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
