// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of template rules.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCategoryTemplateRuleListResponseBodyItems> items;

    /**
     * <p>The number of template rules returned on each page.</p>
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
         * <p>Template rule for identifying ID card numbers</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the template rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>A comma-separated list of IDs of the associated atomic models.</p>
         * 
         * <strong>example:</strong>
         * <p>1001,1002</p>
         */
        @NameInMap("IdentificationRuleIds")
        public String identificationRuleIds;

        /**
         * <p>The scope of data that the template rule scans. This parameter is a string converted from a JSON array. Each element in the JSON array represents a data scanning scope and contains the following fields:</p>
         * <ul>
         * <li><p><strong>Asset</strong>: A string that indicates the asset type. Valid values include RDS, DRDS, PolarDB, OTS, ADB, OceanBase, and ODPS.</p>
         * </li>
         * <li><p><strong>Content</strong>: The specific scope of the asset to scan. This is an array of objects, where each object contains the following fields:</p>
         * <ul>
         * <li><p><strong>Range</strong>: A string that indicates the matching range. Valid values include instance, database, table, column, project (for MaxCompute assets only), bucket (for OSS assets only), and object (for OSS assets only).</p>
         * </li>
         * <li><p><strong>Operator</strong>: A string that indicates the matching condition. Valid values include equals, regex (regular expression), prefix, and suffix.</p>
         * </li>
         * <li><p><strong>Value</strong>: A string that indicates the content to match.</p>
         * </li>
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
         * <p>The name of the template rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ID card</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The risk level of the template rule. The value ranges from <strong>1</strong> to <strong>11</strong>. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: No risk.</p>
         * </li>
         * <li><p><strong>2</strong>: S1.</p>
         * </li>
         * <li><p><strong>3</strong>: S2.</p>
         * </li>
         * <li><p><strong>4</strong>: S3.</p>
         * </li>
         * <li><p><strong>5</strong>: S4.</p>
         * </li>
         * <li><p><strong>6</strong>: S5.</p>
         * </li>
         * <li><p><strong>7</strong>: S6.</p>
         * </li>
         * <li><p><strong>8</strong>: S7.</p>
         * </li>
         * <li><p><strong>9</strong>: S8.</p>
         * </li>
         * <li><p><strong>10</strong>: S9.</p>
         * </li>
         * <li><p><strong>11</strong>: S10.</p>
         * </li>
         * <li><p><strong>null</strong>: Indicates all risk levels, including No risk, S1, S2, S3, S4, S5, S6, S7, S8, S9, and S10.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The status of the template rule. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>null</strong>: Represents all statuses, including enabled and disabled.</p>
         * </li>
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
