// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneyPotUploadPolicyInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetHoneyPotUploadPolicyInfoResponseBodyData data;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C177095-A734-59B2-9409-7D4F26FF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHoneyPotUploadPolicyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneyPotUploadPolicyInfoResponseBody self = new GetHoneyPotUploadPolicyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setData(GetHoneyPotUploadPolicyInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoneyPotUploadPolicyInfoResponseBodyData getData() {
        return this.data;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneyPotUploadPolicyInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneyPotUploadPolicyInfoResponseBodyData extends TeaModel {
        /**
         * <p>The key ID that is required for the file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4G1mgPbjvGQuiV1X****</p>
         */
        @NameInMap("Accessid")
        public String accessid;

        /**
         * <p>The expiration time of the URL. The value is a timestamp. You can use the value to determine whether the URL expires. If the expiration time arrives, you can no longer use the URL to upload files.</p>
         * 
         * <strong>example:</strong>
         * <p>1661443200000</p>
         */
        @NameInMap("Expire")
        public String expire;

        /**
         * <p>The request URL during the upload.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com">https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The full path of the file in OSS. The file is uploaded by calling the OSS PostObject operation.</p>
         * 
         * <strong>example:</strong>
         * <p>HONEYPOT_FILE/1766185894104675_169********</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The limits that are imposed on the file upload. The limits include the file size.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyMy0wOS0wMVQwMzoyNTozNS44MzZaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwXSxbInN0YXJ0cy13aXRoIiwiJGtleSIsIkhPTkVZUE9UX0ZJTEUvMTc2NjE4NTg5NDEwNDY3NV8xNjkzNTM4NDM1N*****************</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The signature that is calculated based on <strong>AccessKeySecret</strong> and <strong>Policy</strong>. When you call an Object Storage Service (OSS) API operation, OSS uses the signature information to verify the POST request.</p>
         * 
         * <strong>example:</strong>
         * <p>wKPqlFneNTZPn52k2Rz9GTY*****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GetHoneyPotUploadPolicyInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneyPotUploadPolicyInfoResponseBodyData self = new GetHoneyPotUploadPolicyInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setExpire(String expire) {
            this.expire = expire;
            return this;
        }
        public String getExpire() {
            return this.expire;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetHoneyPotUploadPolicyInfoResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
