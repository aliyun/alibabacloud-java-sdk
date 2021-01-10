// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXActionParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Params")
    public java.util.List<QueryDTXActionParamResponseBodyParams> params;

    public static QueryDTXActionParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXActionParamResponseBody self = new QueryDTXActionParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDTXActionParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDTXActionParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDTXActionParamResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDTXActionParamResponseBody setParams(java.util.List<QueryDTXActionParamResponseBodyParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<QueryDTXActionParamResponseBodyParams> getParams() {
        return this.params;
    }

    public static class QueryDTXActionParamResponseBodyParams extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryDTXActionParamResponseBodyParams build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXActionParamResponseBodyParams self = new QueryDTXActionParamResponseBodyParams();
            return TeaModel.build(map, self);
        }

        public QueryDTXActionParamResponseBodyParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDTXActionParamResponseBodyParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
