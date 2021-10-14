// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribePackagesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribePackagesResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackagesResponseBody self = new DescribePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackagesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePackagesResponseBody setItems(java.util.List<DescribePackagesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribePackagesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribePackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePackagesResponseBodyItems extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("Id")
        public Long id;

        public static DescribePackagesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePackagesResponseBodyItems self = new DescribePackagesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePackagesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribePackagesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribePackagesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribePackagesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribePackagesResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribePackagesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribePackagesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePackagesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribePackagesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribePackagesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
