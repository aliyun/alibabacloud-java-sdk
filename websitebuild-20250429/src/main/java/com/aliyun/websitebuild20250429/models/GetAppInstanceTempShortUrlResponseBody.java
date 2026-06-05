// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceTempShortUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public GetAppInstanceTempShortUrlResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetAppInstanceTempShortUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceTempShortUrlResponseBody self = new GetAppInstanceTempShortUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceTempShortUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppInstanceTempShortUrlResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppInstanceTempShortUrlResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppInstanceTempShortUrlResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppInstanceTempShortUrlResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppInstanceTempShortUrlResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppInstanceTempShortUrlResponseBody setModule(GetAppInstanceTempShortUrlResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppInstanceTempShortUrlResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppInstanceTempShortUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppInstanceTempShortUrlResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppInstanceTempShortUrlResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppInstanceTempShortUrlResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppInstanceTempShortUrlResponseBodyModule extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ExpireAtTime")
        public String expireAtTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        @NameInMap("TempShortUrl")
        public String tempShortUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://bj.download.cycore.cn/zhkt-student-cystore-https/2025/9/31/10/12/9b48342f-e595-4c60-8032-dccd355e7552.jpg">https://bj.download.cycore.cn/zhkt-student-cystore-https/2025/9/31/10/12/9b48342f-e595-4c60-8032-dccd355e7552.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetAppInstanceTempShortUrlResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstanceTempShortUrlResponseBodyModule self = new GetAppInstanceTempShortUrlResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppInstanceTempShortUrlResponseBodyModule setExpireAtTime(String expireAtTime) {
            this.expireAtTime = expireAtTime;
            return this;
        }
        public String getExpireAtTime() {
            return this.expireAtTime;
        }

        public GetAppInstanceTempShortUrlResponseBodyModule setTempShortUrl(String tempShortUrl) {
            this.tempShortUrl = tempShortUrl;
            return this;
        }
        public String getTempShortUrl() {
            return this.tempShortUrl;
        }

        public GetAppInstanceTempShortUrlResponseBodyModule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
