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
     * <p>An array that consists of sensitivity levels.</p>
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
         * <p>The description of the sensitivity level. You can enter a custom description.</p>
         * <p>The following list describes the sensitivity level names and the corresponding default description:</p>
         * <ul>
         * <li><strong>NA</strong>: which indicates that no sensitive data is detected.</li>
         * <li><strong>S1</strong>: which indicates the sensitive data at sensitivity level 1.</li>
         * <li><strong>S2</strong>: which indicates the sensitive data at sensitivity level 2.</li>
         * <li><strong>S3</strong>: which indicates the sensitive data at sensitivity level 3.</li>
         * <li><strong>S4</strong>: which indicates the sensitive data at sensitivity level 4.</li>
         * <li><strong>S5</strong>: which indicates the sensitive data at sensitivity level 5.</li>
         * <li><strong>S6</strong>: which indicates the sensitive data at sensitivity level 6.</li>
         * <li><strong>S7</strong>: which indicates the sensitive data at sensitivity level 7.</li>
         * <li><strong>S8</strong>: which indicates the sensitive data at sensitivity level 8.</li>
         * <li><strong>S9</strong>: which indicates the sensitive data at sensitivity level 9.</li>
         * <li><strong>S10</strong>: which indicates the sensitive data at sensitivity level 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sensitive data at sensitivity level 1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the sensitivity level. Valid values: 1 to 11. Each sensitivity level ID maps a sensitivity level. For example, the sensitivity level ID of 2 corresponds to the sensitivity level S1.</p>
         * <p>For more information, see the description of the Name parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the sensitivity level. The highest sensitivity level varies based on rule templates. The highest sensitivity level is S10. The highest sensitivity level of the <strong>Built-in data security classification templates for Alibaba and Ant Group</strong> is S4, and that of the <strong>built-in classification templates for financial data</strong> and <strong>built-in classification templates for assets</strong> is S5. For more information about the built-in classification templates for financial data, see Guidelines for Security Classification of Financial Data and Security Data - JRT 0197-2020. For a copied rule template, the highest sensitivity level is S10. The following list describes the sensitivity level names and the corresponding IDs:</p>
         * <ul>
         * <li><strong>NA</strong>: 1</li>
         * <li><strong>S1</strong>: 2</li>
         * <li><strong>S2</strong>: 3</li>
         * <li><strong>S3</strong>: 4</li>
         * <li><strong>S4</strong>: 5</li>
         * <li><strong>S5</strong>: 6</li>
         * <li><strong>S6</strong>: 7</li>
         * <li><strong>S7</strong>: 8</li>
         * <li><strong>S8</strong>: 9</li>
         * <li><strong>S9</strong>: 10</li>
         * <li><strong>S10</strong>: 11</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of times that each sensitivity level is referenced in the rule template. Default value: 0.</p>
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
