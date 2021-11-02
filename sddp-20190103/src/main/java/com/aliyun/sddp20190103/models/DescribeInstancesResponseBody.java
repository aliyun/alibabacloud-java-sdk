// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeInstancesResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstancesResponseBody setItems(java.util.List<DescribeInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyItems extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("DepartName")
        public String departName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("Labelsec")
        public Boolean labelsec;

        @NameInMap("LastFinishTime")
        public Long lastFinishTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("Protection")
        public Boolean protection;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyItems self = new DescribeInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyItems setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public DescribeInstancesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeInstancesResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeInstancesResponseBodyItems setLabelsec(Boolean labelsec) {
            this.labelsec = labelsec;
            return this;
        }
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        public DescribeInstancesResponseBodyItems setLastFinishTime(Long lastFinishTime) {
            this.lastFinishTime = lastFinishTime;
            return this;
        }
        public Long getLastFinishTime() {
            return this.lastFinishTime;
        }

        public DescribeInstancesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeInstancesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeInstancesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstancesResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeInstancesResponseBodyItems setProtection(Boolean protection) {
            this.protection = protection;
            return this;
        }
        public Boolean getProtection() {
            return this.protection;
        }

        public DescribeInstancesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeInstancesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeInstancesResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeInstancesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeInstancesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeInstancesResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeInstancesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
