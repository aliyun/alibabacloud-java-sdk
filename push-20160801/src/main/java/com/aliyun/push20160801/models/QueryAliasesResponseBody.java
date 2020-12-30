// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryAliasesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AliasInfos")
    public QueryAliasesResponseBodyAliasInfos aliasInfos;

    public static QueryAliasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAliasesResponseBody self = new QueryAliasesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAliasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAliasesResponseBody setAliasInfos(QueryAliasesResponseBodyAliasInfos aliasInfos) {
        this.aliasInfos = aliasInfos;
        return this;
    }
    public QueryAliasesResponseBodyAliasInfos getAliasInfos() {
        return this.aliasInfos;
    }

    public static class QueryAliasesResponseBodyAliasInfosAliasInfo extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        public static QueryAliasesResponseBodyAliasInfosAliasInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAliasesResponseBodyAliasInfosAliasInfo self = new QueryAliasesResponseBodyAliasInfosAliasInfo();
            return TeaModel.build(map, self);
        }

        public QueryAliasesResponseBodyAliasInfosAliasInfo setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

    }

    public static class QueryAliasesResponseBodyAliasInfos extends TeaModel {
        @NameInMap("AliasInfo")
        public java.util.List<QueryAliasesResponseBodyAliasInfosAliasInfo> aliasInfo;

        public static QueryAliasesResponseBodyAliasInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryAliasesResponseBodyAliasInfos self = new QueryAliasesResponseBodyAliasInfos();
            return TeaModel.build(map, self);
        }

        public QueryAliasesResponseBodyAliasInfos setAliasInfo(java.util.List<QueryAliasesResponseBodyAliasInfosAliasInfo> aliasInfo) {
            this.aliasInfo = aliasInfo;
            return this;
        }
        public java.util.List<QueryAliasesResponseBodyAliasInfosAliasInfo> getAliasInfo() {
            return this.aliasInfo;
        }

    }

}
