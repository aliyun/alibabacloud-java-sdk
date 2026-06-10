// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppCodeWorkspaceDetailResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed. Valid values:  </p>
     * <ul>
     * <li>false: Retry is not allowed.  </li>
     * <li>true: Retry is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
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
     * <p>Dynamic error message, used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Faulty parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Application module</p>
     */
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
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>Abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Reserved parameter.</p>
     * 
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
         * <p>SDK change log</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>Add Params.</li>
         * </ul>
         */
        @NameInMap("ChangeLog")
        public String changeLog;

        /**
         * <p>Creation UTC time in ISO8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-10T09:40:36.562Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Logical value</p>
         * 
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

        @NameInMap("CommitHash")
        public String commitHash;

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
         * <p>Site ID, which can be obtained by invoking the <a href="~~ListSites~~">ListSites</a> API.</p>
         * 
         * <strong>example:</strong>
         * <p>865181640657408</p>
         */
        @NameInMap("SiteId")
        public String siteId;

        /**
         * <p>API Guide information.</p>
         */
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

        public GetAppCodeWorkspaceDetailResponseBodyModule setCommitHash(String commitHash) {
            this.commitHash = commitHash;
            return this;
        }
        public String getCommitHash() {
            return this.commitHash;
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
