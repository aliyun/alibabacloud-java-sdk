// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>136082B3-B21F-5E9D-B68E-991FFD205D24</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of rules in the template.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>Rule for identifying ID card numbers</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IDs of sensitive data types. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1001,1002</p>
         */
        @NameInMap("IdentificationRuleIds")
        public String identificationRuleIds;

        /**
         * <p>The scan scope of the rule. The value is a JSON array of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Asset</strong>: the data asset type. Valid values: RDS, DRDS, PolarDB, OTS, ADB, and OceanBase. The value is of the STRING type.</p>
         * </li>
         * <li><p><strong>Content</strong>: the scan scope. The value is of the STRING type. Each element in a JSON array indicates a scan scope that contains the following fields:</p>
         * <ul>
         * <li><strong>Range</strong>: the matching condition. Valid values: Instance, database, table, column, project, bucket, and object. The value project is valid only for data assets in MaxCompute. The values bucket and object are valid only for data assets in Object Storage Service (OSS). The value of this parameter is of the STRING type.</li>
         * <li><strong>Operator</strong>: the operator. Valid values: equals, regex, prefix, and suffix. The operator equals indicates a full match. The operator regex indicates a match by regular expression. The operator prefix indicates a match by prefix. The operator suffix indicates a match by suffix.</li>
         * <li><strong>Value</strong>: the matching content. The value is of the STRING type.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Asset&quot;:&quot;RDS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;database&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;RDS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;table&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;RDS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;column&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;ODPS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;project&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;ODPS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;table&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]},{&quot;Asset&quot;:&quot;ODPS&quot;,&quot;Content&quot;:[{&quot;Range&quot;:&quot;column&quot;,&quot;Operator&quot;:&quot;regex&quot;,&quot;Value&quot;:&quot;register&quot;}]}]</p>
         */
        @NameInMap("IdentificationScope")
        public String identificationScope;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ID card number</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sensitivity level of the data that is not compliant with the rule. Valid values: <strong>1</strong> to <strong>11</strong>.</p>
         * <ul>
         * <li><strong>1</strong>: No sensitive data is detected.</li>
         * <li><strong>2</strong>: indicates the S1 sensitivity level.</li>
         * <li><strong>3</strong>: indicates the S2 sensitivity level.</li>
         * <li><strong>4</strong>: indicates the S3 sensitivity level.</li>
         * <li><strong>5</strong>: indicates the S4 sensitivity level.</li>
         * <li><strong>6</strong>: indicates the S5 sensitivity level.</li>
         * <li><strong>7</strong>: indicates the S6 sensitivity level.</li>
         * <li><strong>8</strong>: indicates the S7 sensitivity level.</li>
         * <li><strong>9</strong>: indicates the S8 sensitivity level.</li>
         * <li><strong>10</strong>: indicates the S9 sensitivity level.</li>
         * <li><strong>11</strong>: indicates the S10 sensitivity level.</li>
         * <li><strong>null</strong>: indicates all preceding sensitivity levels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>null</strong>: all states</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
