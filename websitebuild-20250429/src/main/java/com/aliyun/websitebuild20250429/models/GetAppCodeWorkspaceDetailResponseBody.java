// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppCodeWorkspaceDetailResponseBody extends TeaModel {
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
     * <p>spring-cloud-b</p>
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
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public GetAppCodeWorkspaceDetailResponseBodyModule module;

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

    public static GetAppCodeWorkspaceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppCodeWorkspaceDetailResponseBody self = new GetAppCodeWorkspaceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppCodeWorkspaceDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppCodeWorkspaceDetailResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppCodeWorkspaceDetailResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppCodeWorkspaceDetailResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppCodeWorkspaceDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppCodeWorkspaceDetailResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppCodeWorkspaceDetailResponseBody setModule(GetAppCodeWorkspaceDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppCodeWorkspaceDetailResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppCodeWorkspaceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppCodeWorkspaceDetailResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppCodeWorkspaceDetailResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppCodeWorkspaceDetailResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li>Add Params.</li>
         * </ul>
         */
        @NameInMap("ChangeLog")
        public String changeLog;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10T09:40:36.562Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("LogicalNumber")
        public Integer logicalNumber;

        public static GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots self = new GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots();
            return TeaModel.build(map, self);
        }

        public GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
        }

        public GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots setLogicalNumber(Integer logicalNumber) {
            this.logicalNumber = logicalNumber;
            return this;
        }
        public Integer getLogicalNumber() {
            return this.logicalNumber;
        }

    }

    public static class GetAppCodeWorkspaceDetailResponseBodyModule extends TeaModel {
        /**
         * <p>11111</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("ActiveLogicalNumber")
        public Integer activeLogicalNumber;

        /**
         * <p>true</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDirty")
        public Boolean isDirty;

        /**
         * <p>1111</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("MaxLogicalNumber")
        public Integer maxLogicalNumber;

        /**
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("Snapshots")
        public java.util.List<GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots> snapshots;

        public static GetAppCodeWorkspaceDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppCodeWorkspaceDetailResponseBodyModule self = new GetAppCodeWorkspaceDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppCodeWorkspaceDetailResponseBodyModule setActiveLogicalNumber(Integer activeLogicalNumber) {
            this.activeLogicalNumber = activeLogicalNumber;
            return this;
        }
        public Integer getActiveLogicalNumber() {
            return this.activeLogicalNumber;
        }

        public GetAppCodeWorkspaceDetailResponseBodyModule setIsDirty(Boolean isDirty) {
            this.isDirty = isDirty;
            return this;
        }
        public Boolean getIsDirty() {
            return this.isDirty;
        }

        public GetAppCodeWorkspaceDetailResponseBodyModule setMaxLogicalNumber(Integer maxLogicalNumber) {
            this.maxLogicalNumber = maxLogicalNumber;
            return this;
        }
        public Integer getMaxLogicalNumber() {
            return this.maxLogicalNumber;
        }

        public GetAppCodeWorkspaceDetailResponseBodyModule setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public GetAppCodeWorkspaceDetailResponseBodyModule setSnapshots(java.util.List<GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<GetAppCodeWorkspaceDetailResponseBodyModuleSnapshots> getSnapshots() {
            return this.snapshots;
        }

    }

}
