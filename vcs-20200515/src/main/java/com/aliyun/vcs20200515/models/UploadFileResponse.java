// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadFileResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public UploadFileResponseData data;

    public static UploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponse self = new UploadFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadFileResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFileResponse setData(UploadFileResponseData data) {
        this.data = data;
        return this;
    }
    public UploadFileResponseData getData() {
        return this.data;
    }

    public static class UploadFileResponseDataRecords extends TeaModel {
        @NameInMap("OssPath")
        @Validation(required = true)
        public String ossPath;

        @NameInMap("SourceId")
        @Validation(required = true)
        public String sourceId;

        public static UploadFileResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            UploadFileResponseDataRecords self = new UploadFileResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public UploadFileResponseDataRecords setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public UploadFileResponseDataRecords setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class UploadFileResponseData extends TeaModel {
        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<UploadFileResponseDataRecords> records;

        public static UploadFileResponseData build(java.util.Map<String, ?> map) throws Exception {
            UploadFileResponseData self = new UploadFileResponseData();
            return TeaModel.build(map, self);
        }

        public UploadFileResponseData setRecords(java.util.List<UploadFileResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<UploadFileResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
