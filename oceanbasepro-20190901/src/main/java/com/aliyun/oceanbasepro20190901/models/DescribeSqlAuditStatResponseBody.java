// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditStatResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSqlAuditStatResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSqlAuditStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditStatResponseBody self = new DescribeSqlAuditStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditStatResponseBody setData(java.util.List<DescribeSqlAuditStatResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSqlAuditStatResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSqlAuditStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSqlAuditStatResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AffectRows")
        public Double affectRows;

        /**
         * <strong>example:</strong>
         * <p>test_database_1</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <strong>example:</strong>
         * <p>142</p>
         */
        @NameInMap("ExecuteTime")
        public Double executeTime;

        /**
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnRows")
        public Double returnRows;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScanRows")
        public Double scanRows;

        /**
         * <p>Sql ID</p>
         * 
         * <strong>example:</strong>
         * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <strong>example:</strong>
         * <p>UPDATE <code>oceanbase_test_table</code> SET <code>name</code> = ? WHERE <code>key</code> = ?</p>
         */
        @NameInMap("SqlStatement")
        public String sqlStatement;

        /**
         * <strong>example:</strong>
         * <p>t33h8y08k****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalAffectRows")
        public Long totalAffectRows;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalFailed")
        public Long totalFailed;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalReturnRows")
        public Long totalReturnRows;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalScanRows")
        public Long totalScanRows;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalSucceed")
        public Long totalSucceed;

        /**
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("UserClientIp")
        public String userClientIp;

        /**
         * <strong>example:</strong>
         * <p>test_mysql</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeSqlAuditStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlAuditStatResponseBodyData self = new DescribeSqlAuditStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlAuditStatResponseBodyData setAffectRows(Double affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Double getAffectRows() {
            return this.affectRows;
        }

        public DescribeSqlAuditStatResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeSqlAuditStatResponseBodyData setExecuteTime(Double executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Double getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSqlAuditStatResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSqlAuditStatResponseBodyData setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public DescribeSqlAuditStatResponseBodyData setReturnRows(Double returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Double getReturnRows() {
            return this.returnRows;
        }

        public DescribeSqlAuditStatResponseBodyData setScanRows(Double scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Double getScanRows() {
            return this.scanRows;
        }

        public DescribeSqlAuditStatResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSqlAuditStatResponseBodyData setSqlStatement(String sqlStatement) {
            this.sqlStatement = sqlStatement;
            return this;
        }
        public String getSqlStatement() {
            return this.sqlStatement;
        }

        public DescribeSqlAuditStatResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeSqlAuditStatResponseBodyData setTotalAffectRows(Long totalAffectRows) {
            this.totalAffectRows = totalAffectRows;
            return this;
        }
        public Long getTotalAffectRows() {
            return this.totalAffectRows;
        }

        public DescribeSqlAuditStatResponseBodyData setTotalFailed(Long totalFailed) {
            this.totalFailed = totalFailed;
            return this;
        }
        public Long getTotalFailed() {
            return this.totalFailed;
        }

        public DescribeSqlAuditStatResponseBodyData setTotalReturnRows(Long totalReturnRows) {
            this.totalReturnRows = totalReturnRows;
            return this;
        }
        public Long getTotalReturnRows() {
            return this.totalReturnRows;
        }

        public DescribeSqlAuditStatResponseBodyData setTotalScanRows(Long totalScanRows) {
            this.totalScanRows = totalScanRows;
            return this;
        }
        public Long getTotalScanRows() {
            return this.totalScanRows;
        }

        public DescribeSqlAuditStatResponseBodyData setTotalSucceed(Long totalSucceed) {
            this.totalSucceed = totalSucceed;
            return this;
        }
        public Long getTotalSucceed() {
            return this.totalSucceed;
        }

        public DescribeSqlAuditStatResponseBodyData setUserClientIp(String userClientIp) {
            this.userClientIp = userClientIp;
            return this;
        }
        public String getUserClientIp() {
            return this.userClientIp;
        }

        public DescribeSqlAuditStatResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
