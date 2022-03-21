// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSqlAuditsResponseBodyData> data;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSqlAuditsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditsResponseBody self = new DescribeSqlAuditsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditsResponseBody setData(java.util.List<DescribeSqlAuditsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSqlAuditsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSqlAuditsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlAuditsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSqlAuditsResponseBodyData extends TeaModel {
        // 更新行数
        @NameInMap("AffectedRows")
        public Long affectedRows;

        // 客户端IP
        @NameInMap("ClientIp")
        public String clientIp;

        // 数据库
        @NameInMap("DataBaseName")
        public String dataBaseName;

        // 执行耗时 (返回的毫秒，无需转换)
        @NameInMap("ExecuteTime")
        public Double executeTime;

        @NameInMap("Key")
        public Long key;

        // 操作类型
        @NameInMap("OperatorType")
        public String operatorType;

        // 扫描行数
        @NameInMap("ScanRows")
        public Long scanRows;

        // SQLID
        @NameInMap("SqlId")
        public String sqlId;

        // SQL语句(数据已经过脱敏)
        @NameInMap("SqlText")
        public String sqlText;

        // 用户
        @NameInMap("UserName")
        public String userName;

        public static DescribeSqlAuditsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlAuditsResponseBodyData self = new DescribeSqlAuditsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlAuditsResponseBodyData setAffectedRows(Long affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        public DescribeSqlAuditsResponseBodyData setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSqlAuditsResponseBodyData setDataBaseName(String dataBaseName) {
            this.dataBaseName = dataBaseName;
            return this;
        }
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        public DescribeSqlAuditsResponseBodyData setExecuteTime(Double executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Double getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSqlAuditsResponseBodyData setKey(Long key) {
            this.key = key;
            return this;
        }
        public Long getKey() {
            return this.key;
        }

        public DescribeSqlAuditsResponseBodyData setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public DescribeSqlAuditsResponseBodyData setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSqlAuditsResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSqlAuditsResponseBodyData setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeSqlAuditsResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
