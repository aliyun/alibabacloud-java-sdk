// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadFileResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponseBody self = new UploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadFileResponseBody setData(UploadFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadFileResponseBodyData getData() {
        return this.data;
    }

    public UploadFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UploadFileResponseBodyDataRecords extends TeaModel {
        @NameInMap("OssPath")
        public String ossPath;

        /**
         * <p>SourceId</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        public static UploadFileResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            UploadFileResponseBodyDataRecords self = new UploadFileResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public UploadFileResponseBodyDataRecords setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public UploadFileResponseBodyDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class UploadFileResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<UploadFileResponseBodyDataRecords> records;

        public static UploadFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadFileResponseBodyData self = new UploadFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadFileResponseBodyData setRecords(java.util.List<UploadFileResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<UploadFileResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
