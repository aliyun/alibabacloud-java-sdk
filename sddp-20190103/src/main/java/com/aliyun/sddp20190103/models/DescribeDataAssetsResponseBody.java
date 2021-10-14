// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeDataAssetsResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Acl")
        public String acl;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SensitiveRatio")
        public String sensitiveRatio;

        @NameInMap("Protection")
        public Boolean protection;

        @NameInMap("Labelsec")
        public Boolean labelsec;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        @NameInMap("Id")
        public String id;

        @NameInMap("ProductCode")
        public String productCode;

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

        public DescribeDataAssetsResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDataAssetsResponseBodyItems setSensitiveRatio(String sensitiveRatio) {
            this.sensitiveRatio = sensitiveRatio;
            return this;
        }
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        public DescribeDataAssetsResponseBodyItems setProtection(Boolean protection) {
            this.protection = protection;
            return this;
        }
        public Boolean getProtection() {
            return this.protection;
        }

        public DescribeDataAssetsResponseBodyItems setLabelsec(Boolean labelsec) {
            this.labelsec = labelsec;
            return this;
        }
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        public DescribeDataAssetsResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeDataAssetsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
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

        public DescribeDataAssetsResponseBodyItems setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeDataAssetsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeDataAssetsResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeDataAssetsResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeDataAssetsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataAssetsResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeDataAssetsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDataAssetsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
