// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class UploadDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadDeviceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceResponseBody self = new UploadDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDeviceResponseBody setData(UploadDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadDeviceResponseBodyData getData() {
        return this.data;
    }

    public UploadDeviceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadDeviceResponseBodyData extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        public static UploadDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadDeviceResponseBodyData self = new UploadDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadDeviceResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
