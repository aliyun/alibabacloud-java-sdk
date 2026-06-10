// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialDirectoryTreeResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>Application name. Query the application with this name.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamic message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>parameters that caused the error</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Error code. The ErrorCode field is not returned if the request succeeds. If the request fails, the ErrorCode field is returned. For more information, see the error code list in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>error message.</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public QueryMaterialDirectoryTreeResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether the processing is synchronous.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static QueryMaterialDirectoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialDirectoryTreeResponseBody self = new QueryMaterialDirectoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMaterialDirectoryTreeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryMaterialDirectoryTreeResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryMaterialDirectoryTreeResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMaterialDirectoryTreeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryMaterialDirectoryTreeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryMaterialDirectoryTreeResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryMaterialDirectoryTreeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMaterialDirectoryTreeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryMaterialDirectoryTreeResponseBody setModule(QueryMaterialDirectoryTreeResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryMaterialDirectoryTreeResponseBodyModule getModule() {
        return this.module;
    }

    public QueryMaterialDirectoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMaterialDirectoryTreeResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryMaterialDirectoryTreeResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryMaterialDirectoryTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMaterialDirectoryTreeResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryMaterialDirectoryTreeResponseBodyModule extends TeaModel {
        /**
         * <p>Top-level folder</p>
         */
        @NameInMap("DirectoryList")
        public java.util.List<AppMaterialDirectory> directoryList;

        public static QueryMaterialDirectoryTreeResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryMaterialDirectoryTreeResponseBodyModule self = new QueryMaterialDirectoryTreeResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryMaterialDirectoryTreeResponseBodyModule setDirectoryList(java.util.List<AppMaterialDirectory> directoryList) {
            this.directoryList = directoryList;
            return this;
        }
        public java.util.List<AppMaterialDirectory> getDirectoryList() {
            return this.directoryList;
        }

    }

}
