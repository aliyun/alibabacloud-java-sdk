// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetJobDataUploadParamsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UploadParams")
    public GetJobDataUploadParamsResponseBodyUploadParams uploadParams;

    public static GetJobDataUploadParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobDataUploadParamsResponseBody self = new GetJobDataUploadParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobDataUploadParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobDataUploadParamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobDataUploadParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobDataUploadParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobDataUploadParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetJobDataUploadParamsResponseBody setUploadParams(GetJobDataUploadParamsResponseBodyUploadParams uploadParams) {
        this.uploadParams = uploadParams;
        return this;
    }
    public GetJobDataUploadParamsResponseBodyUploadParams getUploadParams() {
        return this.uploadParams;
    }

    public static class GetJobDataUploadParamsResponseBodyUploadParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LTAIvKWEr4DoFSqz</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>1741855527</p>
         */
        @NameInMap("Expire")
        public Integer expire;

        /**
         * <strong>example:</strong>
         * <p>UPLOADED/SCRIPT/136a055e-3d07-46c6-853a-731b3a2973de/18dc6d79-338f-413c-a5a8-dcce5f05b41a_9bd7916d-a340-4925-a911-92390cbe0f33.json</p>
         */
        @NameInMap("Folder")
        public String folder;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cloudagentbot-online.oss-cn-hangzhou.aliyuncs.com">https://cloudagentbot-online.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMy0xM1QwODo0NToyNy4zMzFaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTI0Mjg4MDBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiVVBMT0FERUQvU0NSSVBULzEzNmEwNTVlLTNkMDctNDZjNi04NTNhLTczMWIzYTI5NzNkZS8iXV19</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>MD4CHQCiECtjdsP+fstJDcqsPt+GbWxSWPzGQxeQiblzAh0AuidaKc5JY5AkHFIE+qiQI3izJQQbpUoG0paPTw==</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GetJobDataUploadParamsResponseBodyUploadParams build(java.util.Map<String, ?> map) throws Exception {
            GetJobDataUploadParamsResponseBodyUploadParams self = new GetJobDataUploadParamsResponseBodyUploadParams();
            return TeaModel.build(map, self);
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setFolder(String folder) {
            this.folder = folder;
            return this;
        }
        public String getFolder() {
            return this.folder;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetJobDataUploadParamsResponseBodyUploadParams setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
