// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasInterceptorsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchqueryODPSchemasInterceptorsResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPSchemasInterceptorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasInterceptorsResponseBody self = new BatchqueryODPSchemasInterceptorsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasInterceptorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPSchemasInterceptorsResponseBody setData(java.util.List<BatchqueryODPSchemasInterceptorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryODPSchemasInterceptorsResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryODPSchemasInterceptorsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPSchemasInterceptorsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPSchemasInterceptorsResponseBodyData extends TeaModel {
        @NameInMap("InterceptSqls")
        public java.util.List<String> interceptSqls;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("InterceptorName")
        public String interceptorName;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InterceptRule")
        public String interceptRule;

        public static BatchqueryODPSchemasInterceptorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPSchemasInterceptorsResponseBodyData self = new BatchqueryODPSchemasInterceptorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPSchemasInterceptorsResponseBodyData setInterceptSqls(java.util.List<String> interceptSqls) {
            this.interceptSqls = interceptSqls;
            return this;
        }
        public java.util.List<String> getInterceptSqls() {
            return this.interceptSqls;
        }

        public BatchqueryODPSchemasInterceptorsResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPSchemasInterceptorsResponseBodyData setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public BatchqueryODPSchemasInterceptorsResponseBodyData setInterceptorName(String interceptorName) {
            this.interceptorName = interceptorName;
            return this;
        }
        public String getInterceptorName() {
            return this.interceptorName;
        }

        public BatchqueryODPSchemasInterceptorsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPSchemasInterceptorsResponseBodyData setInterceptRule(String interceptRule) {
            this.interceptRule = interceptRule;
            return this;
        }
        public String getInterceptRule() {
            return this.interceptRule;
        }

    }

}
