// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class QueryAppInfoBySchemeResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryAppInfoBySchemeResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryAppInfoBySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoBySchemeResponseBody self = new QueryAppInfoBySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoBySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppInfoBySchemeResponseBody setData(QueryAppInfoBySchemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppInfoBySchemeResponseBodyData getData() {
        return this.data;
    }

    public QueryAppInfoBySchemeResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryAppInfoBySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppInfoBySchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppInfoBySchemeResponseBodyData extends TeaModel {
        @NameInMap("cmAppId")
        public String cmAppId;

        @NameInMap("cmAppKey")
        public String cmAppKey;

        @NameInMap("ctAppId")
        public String ctAppId;

        @NameInMap("ctAppKey")
        public String ctAppKey;

        @NameInMap("cuAppId")
        public String cuAppId;

        @NameInMap("cuAppKey")
        public String cuAppKey;

        @NameInMap("cuRsaPublickKey")
        public String cuRsaPublickKey;

        public static QueryAppInfoBySchemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppInfoBySchemeResponseBodyData self = new QueryAppInfoBySchemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppInfoBySchemeResponseBodyData setCmAppId(String cmAppId) {
            this.cmAppId = cmAppId;
            return this;
        }
        public String getCmAppId() {
            return this.cmAppId;
        }

        public QueryAppInfoBySchemeResponseBodyData setCmAppKey(String cmAppKey) {
            this.cmAppKey = cmAppKey;
            return this;
        }
        public String getCmAppKey() {
            return this.cmAppKey;
        }

        public QueryAppInfoBySchemeResponseBodyData setCtAppId(String ctAppId) {
            this.ctAppId = ctAppId;
            return this;
        }
        public String getCtAppId() {
            return this.ctAppId;
        }

        public QueryAppInfoBySchemeResponseBodyData setCtAppKey(String ctAppKey) {
            this.ctAppKey = ctAppKey;
            return this;
        }
        public String getCtAppKey() {
            return this.ctAppKey;
        }

        public QueryAppInfoBySchemeResponseBodyData setCuAppId(String cuAppId) {
            this.cuAppId = cuAppId;
            return this;
        }
        public String getCuAppId() {
            return this.cuAppId;
        }

        public QueryAppInfoBySchemeResponseBodyData setCuAppKey(String cuAppKey) {
            this.cuAppKey = cuAppKey;
            return this;
        }
        public String getCuAppKey() {
            return this.cuAppKey;
        }

        public QueryAppInfoBySchemeResponseBodyData setCuRsaPublickKey(String cuRsaPublickKey) {
            this.cuRsaPublickKey = cuRsaPublickKey;
            return this;
        }
        public String getCuRsaPublickKey() {
            return this.cuRsaPublickKey;
        }

    }

}
