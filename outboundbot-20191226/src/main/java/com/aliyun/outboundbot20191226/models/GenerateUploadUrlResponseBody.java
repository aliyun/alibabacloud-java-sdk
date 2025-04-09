// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GenerateUploadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateUploadUrlResponseBodyData data;

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
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadUrlResponseBody self = new GenerateUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateUploadUrlResponseBody setData(GenerateUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GenerateUploadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateUploadUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LTAIvKWEr4DoFSqz</p>
         */
        @NameInMap("AccessId")
        public String accessId;

        /**
         * <strong>example:</strong>
         * <p>1742960933</p>
         */
        @NameInMap("Expire")
        public Integer expire;

        /**
         * <strong>example:</strong>
         * <p>pload/file/874d7371-791b-4281-935c-637630a37785/874d7371-791b-4281-935c-637630a37785_9bd7916d-a340-4925-a911-92390cbe0f33.json</p>
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
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wMy0yNlQwMzo0ODo1My4wMzVaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTI0Mjg4MF0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCJ1cGxvYWQvZmlsZS84NzRkNzM3MS03OTFiLTQyODEtOTM1Yy02Mzc2MzBhMzc3ODUvIl1dfQ==&quot;,</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>I6d1ONWVuTj5i0Kz4Vn+V0lC6v4=</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GenerateUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateUploadUrlResponseBodyData self = new GenerateUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateUploadUrlResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public GenerateUploadUrlResponseBodyData setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

        public GenerateUploadUrlResponseBodyData setFolder(String folder) {
            this.folder = folder;
            return this;
        }
        public String getFolder() {
            return this.folder;
        }

        public GenerateUploadUrlResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GenerateUploadUrlResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GenerateUploadUrlResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GenerateUploadUrlResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GenerateUploadUrlResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
