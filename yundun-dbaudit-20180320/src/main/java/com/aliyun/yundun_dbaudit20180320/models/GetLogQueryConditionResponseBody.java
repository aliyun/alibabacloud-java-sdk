// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogQueryConditionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbUserList")
    public java.util.List<String> dbUserList;

    @NameInMap("ClientIpList")
    public java.util.List<String> clientIpList;

    @NameInMap("ClientProgramList")
    public java.util.List<String> clientProgramList;

    @NameInMap("DbServerList")
    public java.util.List<String> dbServerList;

    @NameInMap("SqlTypeList")
    public java.util.List<GetLogQueryConditionResponseBodySqlTypeList> sqlTypeList;

    public static GetLogQueryConditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogQueryConditionResponseBody self = new GetLogQueryConditionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogQueryConditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogQueryConditionResponseBody setDbUserList(java.util.List<String> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    public GetLogQueryConditionResponseBody setClientIpList(java.util.List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    public GetLogQueryConditionResponseBody setClientProgramList(java.util.List<String> clientProgramList) {
        this.clientProgramList = clientProgramList;
        return this;
    }
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

    public GetLogQueryConditionResponseBody setDbServerList(java.util.List<String> dbServerList) {
        this.dbServerList = dbServerList;
        return this;
    }
    public java.util.List<String> getDbServerList() {
        return this.dbServerList;
    }

    public GetLogQueryConditionResponseBody setSqlTypeList(java.util.List<GetLogQueryConditionResponseBodySqlTypeList> sqlTypeList) {
        this.sqlTypeList = sqlTypeList;
        return this;
    }
    public java.util.List<GetLogQueryConditionResponseBodySqlTypeList> getSqlTypeList() {
        return this.sqlTypeList;
    }

    public static class GetLogQueryConditionResponseBodySqlTypeList extends TeaModel {
        @NameInMap("SqlKeyword")
        public String sqlKeyword;

        @NameInMap("SqlType")
        public String sqlType;

        public static GetLogQueryConditionResponseBodySqlTypeList build(java.util.Map<String, ?> map) throws Exception {
            GetLogQueryConditionResponseBodySqlTypeList self = new GetLogQueryConditionResponseBodySqlTypeList();
            return TeaModel.build(map, self);
        }

        public GetLogQueryConditionResponseBodySqlTypeList setSqlKeyword(String sqlKeyword) {
            this.sqlKeyword = sqlKeyword;
            return this;
        }
        public String getSqlKeyword() {
            return this.sqlKeyword;
        }

        public GetLogQueryConditionResponseBodySqlTypeList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
