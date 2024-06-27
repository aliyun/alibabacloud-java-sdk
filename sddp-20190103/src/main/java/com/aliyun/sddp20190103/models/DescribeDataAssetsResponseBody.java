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
     * <p>An array that consists of data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataAssetsResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
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
     * <p>The total number of queried data assets that contain sensitive data.</p>
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
         * <p>The access control list (ACL) that controls the access permissions on the OSS bucket.</p>
         * <blockquote>
         * <p>This parameter is returned only when you set the parameter <strong>RangeId</strong> to <strong>21</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("Acl")
        public String acl;

        /**
         * <p>The time when the data asset was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1536751124000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The data type of the data asset.</p>
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
         * <p>The sensitivity tag of the data. The value is fixed as <strong>0</strong>. <strong>0</strong>, <strong>1</strong>, <strong>2</strong>, or <strong>3</strong> is returned for this parameter only when you set the parameter <strong>RangeId</strong> to <strong>1</strong>.</p>
         * <ul>
         * <li><strong>0</strong>: unclassified</li>
         * <li><strong>1</strong>: confidential</li>
         * <li><strong>2</strong>: sensitive</li>
         * <li><strong>3</strong>: highly sensitive</li>
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
         * <p>The key value of the OSS object.</p>
         * <blockquote>
         * <p>This parameter is returned only when you set the parameter <strong>RangeId</strong> to <strong>22</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Internal</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The sensitivity level of the MaxCompute data asset. Valid values:</p>
         * <ul>
         * <li><strong>S1</strong>: low sensitivity level</li>
         * <li><strong>S2</strong>: medium sensitivity level</li>
         * <li><strong>S3</strong>: high sensitivity level</li>
         * <li><strong>S4</strong>: highest sensitivity level</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when you set the parameter <strong>RangeId</strong> to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>S4</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The account that owns the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>dtdep-239-******</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the service to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: AnalyticDB for MySQL</li>
         * <li><strong>4</strong>: Tablestore</li>
         * <li><strong>5</strong>: ApsaraDB RDS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>Indicates whether the data protection mechanism is enabled for the data asset. The value is fixed as <strong>false</strong>. <strong>true</strong> or <strong>false</strong> is returned for this parameter only when you set the parameter <strong>RangeId</strong> to <strong>1</strong>.</p>
         * <ul>
         * <li><strong>false</strong>: The data protection mechanism is disabled.</li>
         * <li><strong>true</strong>: The data protection mechanism is enabled. Only data inbound is supported. Data outbound is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Protection")
        public Boolean protection;

        /**
         * <p>The sensitivity level of the data asset. A higher sensitivity level indicates that the identified data is more sensitive. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: No sensitive data is identified.</li>
         * <li><strong>2</strong>: sensitive data at level 1.</li>
         * <li><strong>3</strong>: sensitive data at level 2.</li>
         * <li><strong>3</strong>: sensitive data at level 3.</li>
         * <li><strong>5</strong>: sensitive data at level 4.</li>
         * <li><strong>6</strong>: sensitive data at level 5.</li>
         * <li><strong>7</strong>: sensitive data at level 6.</li>
         * <li><strong>8</strong>: sensitive data at level 7.</li>
         * <li><strong>9</strong>: sensitive data at level 8.</li>
         * <li><strong>10</strong>: sensitive data at level 9.</li>
         * <li><strong>11</strong>: sensitive data at level 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Medium sensitivity level</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the sensitive data detection rule that the data asset hits.</p>
         * 
         * <strong>example:</strong>
         * <p>\<em>\</em>\* rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the data asset contains sensitive data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total number of sensitive data assets. For example, the value can be the total number of sensitive MaxCompute projects, packages, or tables, the total number of sensitive ApsaraDB RDS databases or tables, or the total number of sensitive OSS buckets or objects.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The percentage of sensitive data in all data assets.</p>
         * 
         * <strong>example:</strong>
         * <p>45%</p>
         */
        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        /**
         * <p>The total number of data assets. For example, the value can be the total number of MaxCompute projects, packages, or tables, the total number of ApsaraDB RDS databases or tables, or the total number of OSS buckets or objects.</p>
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
