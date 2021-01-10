// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceSecurityipResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryCasLoadbalanceSecurityipResponseBodyData data;

    public static QueryCasLoadbalanceSecurityipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceSecurityipResponseBody self = new QueryCasLoadbalanceSecurityipResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceSecurityipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasLoadbalanceSecurityipResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasLoadbalanceSecurityipResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasLoadbalanceSecurityipResponseBody setData(QueryCasLoadbalanceSecurityipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCasLoadbalanceSecurityipResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCasLoadbalanceSecurityipResponseBodyData extends TeaModel {
        @NameInMap("AccessControl")
        public Boolean accessControl;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static QueryCasLoadbalanceSecurityipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasLoadbalanceSecurityipResponseBodyData self = new QueryCasLoadbalanceSecurityipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasLoadbalanceSecurityipResponseBodyData setAccessControl(Boolean accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public Boolean getAccessControl() {
            return this.accessControl;
        }

        public QueryCasLoadbalanceSecurityipResponseBodyData setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

}
