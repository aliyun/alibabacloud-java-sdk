// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Items")
    public java.util.List<DescribeColumnsResponseBodyItems> items;

    public static DescribeColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsResponseBody self = new DescribeColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColumnsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeColumnsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeColumnsResponseBody setItems(java.util.List<DescribeColumnsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeColumnsResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeColumnsResponseBodyItems extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("OdpsRiskLevelValue")
        public Integer odpsRiskLevelValue;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        @NameInMap("SensLevelName")
        public String sensLevelName;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("RiskLevelName")
        public String riskLevelName;

        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        @NameInMap("Name")
        public String name;

        @NameInMap("TableId")
        public Long tableId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("RevisionStatus")
        public Long revisionStatus;

        @NameInMap("RevisionId")
        public Long revisionId;

        public static DescribeColumnsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnsResponseBodyItems self = new DescribeColumnsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeColumnsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeColumnsResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeColumnsResponseBodyItems setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeColumnsResponseBodyItems setOdpsRiskLevelValue(Integer odpsRiskLevelValue) {
            this.odpsRiskLevelValue = odpsRiskLevelValue;
            return this;
        }
        public Integer getOdpsRiskLevelValue() {
            return this.odpsRiskLevelValue;
        }

        public DescribeColumnsResponseBodyItems setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeColumnsResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeColumnsResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeColumnsResponseBodyItems setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeColumnsResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeColumnsResponseBodyItems setSensLevelName(String sensLevelName) {
            this.sensLevelName = sensLevelName;
            return this;
        }
        public String getSensLevelName() {
            return this.sensLevelName;
        }

        public DescribeColumnsResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeColumnsResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeColumnsResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeColumnsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeColumnsResponseBodyItems setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public DescribeColumnsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeColumnsResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeColumnsResponseBodyItems setRevisionStatus(Long revisionStatus) {
            this.revisionStatus = revisionStatus;
            return this;
        }
        public Long getRevisionStatus() {
            return this.revisionStatus;
        }

        public DescribeColumnsResponseBodyItems setRevisionId(Long revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Long getRevisionId() {
            return this.revisionId;
        }

    }

}
