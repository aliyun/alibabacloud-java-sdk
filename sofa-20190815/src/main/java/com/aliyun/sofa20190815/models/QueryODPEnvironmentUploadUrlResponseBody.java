// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentUploadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPEnvironmentUploadUrlResponseBodyData data;

    public static QueryODPEnvironmentUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentUploadUrlResponseBody self = new QueryODPEnvironmentUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPEnvironmentUploadUrlResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPEnvironmentUploadUrlResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPEnvironmentUploadUrlResponseBody setData(QueryODPEnvironmentUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPEnvironmentUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPEnvironmentUploadUrlResponseBodyData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("OssUrl")
        public String ossUrl;

        public static QueryODPEnvironmentUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPEnvironmentUploadUrlResponseBodyData self = new QueryODPEnvironmentUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPEnvironmentUploadUrlResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public QueryODPEnvironmentUploadUrlResponseBodyData setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

    }

}
