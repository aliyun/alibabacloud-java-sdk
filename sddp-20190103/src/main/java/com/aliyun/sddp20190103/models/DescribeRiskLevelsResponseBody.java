// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeRiskLevelsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>136082B3-B21F-5E9D-B68E-991FFD205D24</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of risk levels.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<DescribeRiskLevelsResponseBodyRiskLevelList> riskLevelList;

    public static DescribeRiskLevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLevelsResponseBody self = new DescribeRiskLevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskLevelsResponseBody setRiskLevelList(java.util.List<DescribeRiskLevelsResponseBodyRiskLevelList> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<DescribeRiskLevelsResponseBodyRiskLevelList> getRiskLevelList() {
        return this.riskLevelList;
    }

    public static class DescribeRiskLevelsResponseBodyRiskLevelList extends TeaModel {
        /**
         * <p>The description of the risk level. You can customize the description.</p>
         * <p>The following list describes the mappings between risk level names and their default descriptions:</p>
         * <ul>
         * <li><p><strong>NA</strong>: No sensitive data is detected</p>
         * </li>
         * <li><p><strong>S1</strong>: Level-1 sensitive data</p>
         * </li>
         * <li><p><strong>S2</strong>: Level-2 sensitive data</p>
         * </li>
         * <li><p><strong>S3</strong>: Level-3 sensitive data</p>
         * </li>
         * <li><p><strong>S4</strong>: Level-4 sensitive data</p>
         * </li>
         * <li><p><strong>S5</strong>: Level-5 sensitive data</p>
         * </li>
         * <li><p><strong>S6</strong>: Level-6 sensitive data</p>
         * </li>
         * <li><p><strong>S7</strong>: Level-7 sensitive data</p>
         * </li>
         * <li><p><strong>S8</strong>: Level-8 sensitive data</p>
         * </li>
         * <li><p><strong>S9</strong>: Level-9 sensitive data</p>
         * </li>
         * <li><p><strong>S10</strong>: Level-10 sensitive data</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the risk level. Valid values: 1 to 11. Each risk level ID corresponds to a risk level name. For example, the risk level ID 2 corresponds to the risk level S1.</p>
         * <p>For more information about the mappings, see the description of the Name parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the risk level for the sensitive data. The maximum risk level is S10 and varies based on the data classification template. The maximum risk level is S4 for the <strong>built-in data security classification template for Alibaba and Ant Group</strong>, and S5 for the <strong>built-in data classification template for the finance industry (with reference to JR/T 0197-2020 Financial Data Security - Guidelines for Data Security Classification)</strong> and the <strong>built-in data classification standard for the energy industry</strong>. If you use a copied template, the maximum risk level is S10.
         * The following list describes the mappings between risk level names and IDs:</p>
         * <ul>
         * <li><p><strong>NA</strong>: 1</p>
         * </li>
         * <li><p><strong>S1</strong>: 2</p>
         * </li>
         * <li><p><strong>S2</strong>: 3</p>
         * </li>
         * <li><p><strong>S3</strong>: 4</p>
         * </li>
         * <li><p><strong>S4</strong>: 5</p>
         * </li>
         * <li><p><strong>S5</strong>: 6</p>
         * </li>
         * <li><p><strong>S6</strong>: 7</p>
         * </li>
         * <li><p><strong>S7</strong>: 8</p>
         * </li>
         * <li><p><strong>S8</strong>: 9</p>
         * </li>
         * <li><p><strong>S9</strong>: 10</p>
         * </li>
         * <li><p><strong>S10</strong>: 11</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of times the risk level is referenced in the template. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ReferenceNum")
        public Integer referenceNum;

        public static DescribeRiskLevelsResponseBodyRiskLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskLevelsResponseBodyRiskLevelList self = new DescribeRiskLevelsResponseBodyRiskLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRiskLevelsResponseBodyRiskLevelList setReferenceNum(Integer referenceNum) {
            this.referenceNum = referenceNum;
            return this;
        }
        public Integer getReferenceNum() {
            return this.referenceNum;
        }

    }

}
