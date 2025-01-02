// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Items")
    public java.util.List<DescribeSlowLogRecordsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowLogRecordsResponseBody setItems(java.util.List<DescribeSlowLogRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSlowLogRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSlowLogRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSlowLogRecordsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxc-i-xxxx</p>
         */
        @NameInMap("CNname")
        public String CNname;

        /**
         * <strong>example:</strong>
         * <p>dcdev</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>tddl:5.4.19-20240927</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Fail")
        public String fail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Frows")
        public String frows;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>[</strong></strong>] @ [1XX.XX.XX.XX]</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <strong>example:</strong>
         * <p>pxc-xdb-s-xxxx</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsBind")
        public String isBind;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockTimeMS")
        public String lockTimeMS;

        /**
         * <strong>example:</strong>
         * <p>[&quot;1&quot;]</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParseRowCounts")
        public String parseRowCounts;

        /**
         * <strong>example:</strong>
         * <p>2024-11-22T02:22:22.444Z</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <strong>example:</strong>
         * <p>3.000</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <strong>example:</strong>
         * <p>3000.000</p>
         */
        @NameInMap("QueryTimeMS")
        public String queryTimeMS;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ReturnRowCounts")
        public String returnRowCounts;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rows")
        public String rows;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SCNT")
        public String SCNT;

        /**
         * <strong>example:</strong>
         * <p>c8df07e5d45cd68da8b4771c2016e20b</p>
         */
        @NameInMap("SQLHash")
        public String SQLHash;

        /**
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TooLong")
        public String tooLong;

        /**
         * <strong>example:</strong>
         * <p>17a5c5c840006000</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <strong>example:</strong>
         * <p>XA</p>
         */
        @NameInMap("TransactionPolicy")
        public String transactionPolicy;

        /**
         * <strong>example:</strong>
         * <p>17a5c5c840006000</p>
         */
        @NameInMap("TrxId")
        public String trxId;

        /**
         * <strong>example:</strong>
         * <p>TP</p>
         */
        @NameInMap("WT")
        public String WT;

        public static DescribeSlowLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyItems self = new DescribeSlowLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyItems setCNname(String CNname) {
            this.CNname = CNname;
            return this;
        }
        public String getCNname() {
            return this.CNname;
        }

        public DescribeSlowLogRecordsResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyItems setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public DescribeSlowLogRecordsResponseBodyItems setFail(String fail) {
            this.fail = fail;
            return this;
        }
        public String getFail() {
            return this.fail;
        }

        public DescribeSlowLogRecordsResponseBodyItems setFrows(String frows) {
            this.frows = frows;
            return this;
        }
        public String getFrows() {
            return this.frows;
        }

        public DescribeSlowLogRecordsResponseBodyItems setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyItems setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeSlowLogRecordsResponseBodyItems setIsBind(String isBind) {
            this.isBind = isBind;
            return this;
        }
        public String getIsBind() {
            return this.isBind;
        }

        public DescribeSlowLogRecordsResponseBodyItems setLockTimeMS(String lockTimeMS) {
            this.lockTimeMS = lockTimeMS;
            return this;
        }
        public String getLockTimeMS() {
            return this.lockTimeMS;
        }

        public DescribeSlowLogRecordsResponseBodyItems setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeSlowLogRecordsResponseBodyItems setParseRowCounts(String parseRowCounts) {
            this.parseRowCounts = parseRowCounts;
            return this;
        }
        public String getParseRowCounts() {
            return this.parseRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItems setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyItems setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeSlowLogRecordsResponseBodyItems setQueryTimeMS(String queryTimeMS) {
            this.queryTimeMS = queryTimeMS;
            return this;
        }
        public String getQueryTimeMS() {
            return this.queryTimeMS;
        }

        public DescribeSlowLogRecordsResponseBodyItems setReturnRowCounts(String returnRowCounts) {
            this.returnRowCounts = returnRowCounts;
            return this;
        }
        public String getReturnRowCounts() {
            return this.returnRowCounts;
        }

        public DescribeSlowLogRecordsResponseBodyItems setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public DescribeSlowLogRecordsResponseBodyItems setSCNT(String SCNT) {
            this.SCNT = SCNT;
            return this;
        }
        public String getSCNT() {
            return this.SCNT;
        }

        public DescribeSlowLogRecordsResponseBodyItems setSQLHash(String SQLHash) {
            this.SQLHash = SQLHash;
            return this;
        }
        public String getSQLHash() {
            return this.SQLHash;
        }

        public DescribeSlowLogRecordsResponseBodyItems setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyItems setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSlowLogRecordsResponseBodyItems setTooLong(String tooLong) {
            this.tooLong = tooLong;
            return this;
        }
        public String getTooLong() {
            return this.tooLong;
        }

        public DescribeSlowLogRecordsResponseBodyItems setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeSlowLogRecordsResponseBodyItems setTransactionPolicy(String transactionPolicy) {
            this.transactionPolicy = transactionPolicy;
            return this;
        }
        public String getTransactionPolicy() {
            return this.transactionPolicy;
        }

        public DescribeSlowLogRecordsResponseBodyItems setTrxId(String trxId) {
            this.trxId = trxId;
            return this;
        }
        public String getTrxId() {
            return this.trxId;
        }

        public DescribeSlowLogRecordsResponseBodyItems setWT(String WT) {
            this.WT = WT;
            return this;
        }
        public String getWT() {
            return this.WT;
        }

    }

}
