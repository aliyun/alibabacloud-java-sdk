// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListTemplatesForSqlRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public java.util.List<ListTemplatesForSqlRuleResponseBodyServerData> serverData;

    public static ListTemplatesForSqlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesForSqlRuleResponseBody self = new ListTemplatesForSqlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesForSqlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesForSqlRuleResponseBody setServerData(java.util.List<ListTemplatesForSqlRuleResponseBodyServerData> serverData) {
        this.serverData = serverData;
        return this;
    }
    public java.util.List<ListTemplatesForSqlRuleResponseBodyServerData> getServerData() {
        return this.serverData;
    }

    public static class ListTemplatesForSqlRuleResponseBodyServerData extends TeaModel {
        @NameInMap("CountTimely")
        public String countTimely;

        @NameInMap("BlackOrWhite")
        public Integer blackOrWhite;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Sqltype1")
        public String sqltype1;

        @NameInMap("SqlId")
        public String sqlId;

        public static ListTemplatesForSqlRuleResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesForSqlRuleResponseBodyServerData self = new ListTemplatesForSqlRuleResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public ListTemplatesForSqlRuleResponseBodyServerData setCountTimely(String countTimely) {
            this.countTimely = countTimely;
            return this;
        }
        public String getCountTimely() {
            return this.countTimely;
        }

        public ListTemplatesForSqlRuleResponseBodyServerData setBlackOrWhite(Integer blackOrWhite) {
            this.blackOrWhite = blackOrWhite;
            return this;
        }
        public Integer getBlackOrWhite() {
            return this.blackOrWhite;
        }

        public ListTemplatesForSqlRuleResponseBodyServerData setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public ListTemplatesForSqlRuleResponseBodyServerData setSqltype1(String sqltype1) {
            this.sqltype1 = sqltype1;
            return this;
        }
        public String getSqltype1() {
            return this.sqltype1;
        }

        public ListTemplatesForSqlRuleResponseBodyServerData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

    }

}
