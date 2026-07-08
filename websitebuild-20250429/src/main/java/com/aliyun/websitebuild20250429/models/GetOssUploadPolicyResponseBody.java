// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetOssUploadPolicyResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether a retry is allowed. Valid values:</p>
     * <ul>
     * <li>false: No retry is allowed.</li>
     * <li>true: A retry is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>ish-intelligence-store-platform-admin-web</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The task object.</p>
     */
    @NameInMap("Module")
    public GetOssUploadPolicyResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The exception message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is synchronously processed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetOssUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadPolicyResponseBody self = new GetOssUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssUploadPolicyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetOssUploadPolicyResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetOssUploadPolicyResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetOssUploadPolicyResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetOssUploadPolicyResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetOssUploadPolicyResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetOssUploadPolicyResponseBody setModule(GetOssUploadPolicyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetOssUploadPolicyResponseBodyModule getModule() {
        return this.module;
    }

    public GetOssUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssUploadPolicyResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetOssUploadPolicyResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetOssUploadPolicyResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetOssUploadPolicyResponseBodyModule extends TeaModel {
        /**
         * <p>The upload directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>pano_src/100070-2679478/images/</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The OSS bucket host address.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The Base64-encoded policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The Security Token Service (STS) token. This parameter is null in non-STS scenarios.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>The calculated signature.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The signature version, such as OSS4-HMAC-SHA256.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>x-oss-credential</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("XossCredential")
        public String xossCredential;

        /**
         * <p>x-oss-date</p>
         * 
         * <strong>example:</strong>
         * <p>20260101</p>
         */
        @NameInMap("XossDate")
        public String xossDate;

        public static GetOssUploadPolicyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetOssUploadPolicyResponseBodyModule self = new GetOssUploadPolicyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetOssUploadPolicyResponseBodyModule setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public GetOssUploadPolicyResponseBodyModule setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetOssUploadPolicyResponseBodyModule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetOssUploadPolicyResponseBodyModule setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public GetOssUploadPolicyResponseBodyModule setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetOssUploadPolicyResponseBodyModule setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetOssUploadPolicyResponseBodyModule setXossCredential(String xossCredential) {
            this.xossCredential = xossCredential;
            return this;
        }
        public String getXossCredential() {
            return this.xossCredential;
        }

        public GetOssUploadPolicyResponseBodyModule setXossDate(String xossDate) {
            this.xossDate = xossDate;
            return this;
        }
        public String getXossDate() {
            return this.xossDate;
        }

    }

}
