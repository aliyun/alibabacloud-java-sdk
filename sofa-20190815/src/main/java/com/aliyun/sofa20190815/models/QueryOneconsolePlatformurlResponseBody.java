// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryOneconsolePlatformurlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryOneconsolePlatformurlResponseBodyData> data;

    public static QueryOneconsolePlatformurlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOneconsolePlatformurlResponseBody self = new QueryOneconsolePlatformurlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOneconsolePlatformurlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOneconsolePlatformurlResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOneconsolePlatformurlResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryOneconsolePlatformurlResponseBody setData(java.util.List<QueryOneconsolePlatformurlResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOneconsolePlatformurlResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryOneconsolePlatformurlResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        public static QueryOneconsolePlatformurlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOneconsolePlatformurlResponseBodyData self = new QueryOneconsolePlatformurlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOneconsolePlatformurlResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryOneconsolePlatformurlResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryOneconsolePlatformurlResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
