// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array of data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataAssetsResponseBodyItems> items;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>71064826-726F-4ADA-B879-05D8055476FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data assets that contain sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAssetsResponseBody self = new DescribeDataAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataAssetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataAssetsResponseBody setItems(java.util.List<DescribeDataAssetsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataAssetsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataAssetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataAssetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataAssetsResponseBodyItems extends TeaModel {
        /**
         * <p>The access control list (ACL) of the OSS bucket.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>RangeId</strong> is <strong>21&#x20;</strong>(OSS buckets).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("Acl")
        public String acl;

        /**
         * <p>The time when the data asset was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The type of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS_BUCKET</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The ID of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>268</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The sensitivity level of the data. This is a static field and is returned only when <strong>RangeId</strong> is <strong>1</strong> (MaxCompute projects).</p>
         * <ul>
         * <li><p><strong>0</strong>: Unclassified</p>
         * </li>
         * <li><p><strong>1</strong>: Confidential</p>
         * </li>
         * <li><p><strong>2</strong>: Sensitive</p>
         * </li>
         * <li><p><strong>3</strong>: Highly sensitive</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Labelsec")
        public Boolean labelsec;

        /**
         * <p>The name of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>gxdata</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The key of the OSS object.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>RangeId</strong> is <strong>22</strong> (OSS objects).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The name of the risk level for the MaxCompute data asset. Valid values:</p>
         * <ul>
         * <li><p><strong>S1</strong>: Low</p>
         * </li>
         * <li><p><strong>S2</strong>: Medium</p>
         * </li>
         * <li><p><strong>S3</strong>: High</p>
         * </li>
         * <li><p><strong>S4</strong>: Highest</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when \<code>RangeId\\</code> is \<code>1\\</code> (MaxCompute projects).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>S4</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The owner of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>dtdep-239-******</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The code of the service to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: MaxCompute</p>
         * </li>
         * <li><p><strong>2</strong>: OSS</p>
         * </li>
         * <li><p><strong>3</strong>: AnalyticDB for MySQL</p>
         * </li>
         * <li><p><strong>4</strong>: Tablestore</p>
         * </li>
         * <li><p><strong>5</strong>: RDS</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>Indicates whether data protection is enabled. This is a static field and is returned only when <strong>RangeId</strong> is <strong>1</strong> (MaxCompute projects).</p>
         * <ul>
         * <li><p><strong>false</strong>: Data protection is disabled.</p>
         * </li>
         * <li><p><strong>true</strong>: Data protection is enabled. Data can only flow into the project, not out of it.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Protection")
        public Boolean protection;

        /**
         * <p>The ID of the risk level. A larger value indicates a higher risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: No sensitive data detected</p>
         * </li>
         * <li><p><strong>2</strong>: Level 1</p>
         * </li>
         * <li><p><strong>3</strong>: Level 2</p>
         * </li>
         * <li><p><strong>4</strong>: Level 3</p>
         * </li>
         * <li><p><strong>5</strong>: Level 4</p>
         * </li>
         * <li><p><strong>6</strong>: Level 5</p>
         * </li>
         * <li><p><strong>7</strong>: Level 6</p>
         * </li>
         * <li><p><strong>8</strong>: Level 7</p>
         * </li>
         * <li><p><strong>9</strong>: Level 8</p>
         * </li>
         * <li><p><strong>10</strong>: Level 9</p>
         * </li>
         * <li><p><strong>11</strong>: Level 10</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>High risk</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the sensitive data detection rule that the data asset matches.</p>
         * 
         * <strong>example:</strong>
         * <p>***Rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the data asset contains sensitive data. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes</p>
         * </li>
         * <li><p><strong>false</strong>: No</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total number of sensitive items in the data asset. For example, the total number of sensitive projects, packages, or tables in MaxCompute, the total number of sensitive databases or tables in RDS, or the total number of sensitive buckets or objects in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The percentage of sensitive data in the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>45%</p>
         */
        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        /**
         * <p>The total number of items in the data asset. For example, the total number of projects, packages, or tables in MaxCompute, the total number of databases or tables in RDS, or the total number of buckets or objects in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>432</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDataAssetsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataAssetsResponseBodyItems self = new DescribeDataAssetsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataAssetsResponseBodyItems setAcl(String acl) {
            this.acl = acl;
            return this;
        }
        public String getAcl() {
            return this.acl;
        }

        public DescribeDataAssetsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeDataAssetsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeDataAssetsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataAssetsResponseBodyItems setLabelsec(Boolean labelsec) {
            this.labelsec = labelsec;
            return this;
        }
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        public DescribeDataAssetsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataAssetsResponseBodyItems setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeDataAssetsResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeDataAssetsResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDataAssetsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDataAssetsResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeDataAssetsResponseBodyItems setProtection(Boolean protection) {
            this.protection = protection;
            return this;
        }
        public Boolean getProtection() {
            return this.protection;
        }

        public DescribeDataAssetsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeDataAssetsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataAssetsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeDataAssetsResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeDataAssetsResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeDataAssetsResponseBodyItems setSensitiveRatio(String sensitiveRatio) {
            this.sensitiveRatio = sensitiveRatio;
            return this;
        }
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        public DescribeDataAssetsResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
