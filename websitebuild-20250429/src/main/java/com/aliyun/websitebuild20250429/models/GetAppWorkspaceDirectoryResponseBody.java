// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppWorkspaceDirectoryResponseBody extends TeaModel {
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
     * <p>ish-intelligence-store-platform-admin-web</p>
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
    public GetAppWorkspaceDirectoryResponseBodyModule module;

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

    public static GetAppWorkspaceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppWorkspaceDirectoryResponseBody self = new GetAppWorkspaceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppWorkspaceDirectoryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppWorkspaceDirectoryResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppWorkspaceDirectoryResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppWorkspaceDirectoryResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppWorkspaceDirectoryResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppWorkspaceDirectoryResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppWorkspaceDirectoryResponseBody setModule(GetAppWorkspaceDirectoryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppWorkspaceDirectoryResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppWorkspaceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppWorkspaceDirectoryResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppWorkspaceDirectoryResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppWorkspaceDirectoryResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList extends TeaModel {
        @NameInMap("Children")
        public java.util.List<?> children;

        /**
         * <strong>example:</strong>
         * <p>PolarDBInnoDBRedoLogWrites</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>Evaluable=true</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList build(java.util.Map<String, ?> map) throws Exception {
            GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList self = new GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList();
            return TeaModel.build(map, self);
        }

        public GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetAppWorkspaceDirectoryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026</p>
         */
        @NameInMap("CurrentTime")
        public String currentTime;

        @NameInMap("DirectoryList")
        public java.util.List<GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList> directoryList;

        public static GetAppWorkspaceDirectoryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppWorkspaceDirectoryResponseBodyModule self = new GetAppWorkspaceDirectoryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppWorkspaceDirectoryResponseBodyModule setCurrentTime(String currentTime) {
            this.currentTime = currentTime;
            return this;
        }
        public String getCurrentTime() {
            return this.currentTime;
        }

        public GetAppWorkspaceDirectoryResponseBodyModule setDirectoryList(java.util.List<GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList> directoryList) {
            this.directoryList = directoryList;
            return this;
        }
        public java.util.List<GetAppWorkspaceDirectoryResponseBodyModuleDirectoryList> getDirectoryList() {
            return this.directoryList;
        }

    }

}
