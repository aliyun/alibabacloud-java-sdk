// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of rules.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCategoryTemplateRuleListResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of rules in the template.</p>
     */
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
        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IDs of sensitive data types. Multiple IDs are separated by commas (,).</p>
         */
        @NameInMap("IdentificationRuleIds")
        public String identificationRuleIds;

        /**
         * <p>The scan scope of the rule. The value is a JSON array of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:</p>
         * <br>
         * <p>*   **Asset**: the data asset type. Valid values: RDS, DRDS, PolarDB, OTS, ADB, and OceanBase. The value is of the STRING type.</p>
         * <br>
         * <p>*   **Content**: the scan scope. The value is of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:</p>
         * <br>
         * <p>    *   **Range**: the matching condition. Valid values: Instance, database, table, column, project, bucket, and object. The value project is valid only for data assets in MaxCompute. The values bucket and object are valid only for data assets in Object Storage Service (OSS). The value of this parameter is of the STRING type.</p>
         * <p>    *   **Operator**: the operator. Valid values: equals, regex, prefix, and suffix. The operator equals indicates a full match. The operator regex indicates a match by regular expression. The operator prefix indicates a match by prefix. The operator suffix indicates a match by suffix.</p>
         * <p>    *   **Value**: the matching content. The value is of the STRING type.</p>
         */
        @NameInMap("IdentificationScope")
        public String identificationScope;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sensitivity level of the data that is not compliant with the rule. Valid values: **1** to **11**.</p>
         * <br>
         * <p>*   **1**: No sensitive data is detected.</p>
         * <p>*   **2**: indicates the S1 sensitivity level.</p>
         * <p>*   **3**: indicates the S2 sensitivity level.</p>
         * <p>*   **4**: indicates the S3 sensitivity level.</p>
         * <p>*   **5**: indicates the S4 sensitivity level.</p>
         * <p>*   **6**: indicates the S5 sensitivity level.</p>
         * <p>*   **7**: indicates the S6 sensitivity level.</p>
         * <p>*   **8**: indicates the S7 sensitivity level.</p>
         * <p>*   **9**: indicates the S8 sensitivity level.</p>
         * <p>*   **10**: indicates the S9 sensitivity level.</p>
         * <p>*   **11**: indicates the S10 sensitivity level.</p>
         * <p>*   **null**: indicates all preceding sensitivity levels.</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled</p>
         * <p>*   **1**: enabled</p>
         * <p>*   **null**: all states</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeCategoryTemplateRuleListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCategoryTemplateRuleListResponseBodyItems self = new DescribeCategoryTemplateRuleListResponseBodyItems();
            return TeaModel.build(map, self);
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

    }

}
