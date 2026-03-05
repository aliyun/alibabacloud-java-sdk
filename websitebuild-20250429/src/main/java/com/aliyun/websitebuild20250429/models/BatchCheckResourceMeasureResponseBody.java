// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BatchCheckResourceMeasureResponseBody extends TeaModel {
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
     * <p>watermark</p>
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
    public BatchCheckResourceMeasureResponseBodyModule module;

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

    public static BatchCheckResourceMeasureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckResourceMeasureResponseBody self = new BatchCheckResourceMeasureResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCheckResourceMeasureResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BatchCheckResourceMeasureResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public BatchCheckResourceMeasureResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchCheckResourceMeasureResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public BatchCheckResourceMeasureResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public BatchCheckResourceMeasureResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public BatchCheckResourceMeasureResponseBody setModule(BatchCheckResourceMeasureResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BatchCheckResourceMeasureResponseBodyModule getModule() {
        return this.module;
    }

    public BatchCheckResourceMeasureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCheckResourceMeasureResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public BatchCheckResourceMeasureResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public BatchCheckResourceMeasureResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class BatchCheckResourceMeasureResponseBodyModule extends TeaModel {
        @NameInMap("AllPassed")
        public Boolean allPassed;

        @NameInMap("Results")
        public java.util.Map<String, ModuleResultsValue> results;

        public static BatchCheckResourceMeasureResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckResourceMeasureResponseBodyModule self = new BatchCheckResourceMeasureResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BatchCheckResourceMeasureResponseBodyModule setAllPassed(Boolean allPassed) {
            this.allPassed = allPassed;
            return this;
        }
        public Boolean getAllPassed() {
            return this.allPassed;
        }

        public BatchCheckResourceMeasureResponseBodyModule setResults(java.util.Map<String, ModuleResultsValue> results) {
            this.results = results;
            return this;
        }
        public java.util.Map<String, ModuleResultsValue> getResults() {
            return this.results;
        }

    }

}
