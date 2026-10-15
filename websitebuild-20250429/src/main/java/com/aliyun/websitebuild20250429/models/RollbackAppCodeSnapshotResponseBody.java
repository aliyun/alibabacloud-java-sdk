// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RollbackAppCodeSnapshotResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
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
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the <code>%s</code> in the <strong>ErrMessage</strong> return parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> that you specify is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public RollbackAppCodeSnapshotResponseBodyModule module;

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
     * <p>System exception.</p>
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

    public static RollbackAppCodeSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackAppCodeSnapshotResponseBody self = new RollbackAppCodeSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackAppCodeSnapshotResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RollbackAppCodeSnapshotResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public RollbackAppCodeSnapshotResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RollbackAppCodeSnapshotResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public RollbackAppCodeSnapshotResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public RollbackAppCodeSnapshotResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public RollbackAppCodeSnapshotResponseBody setModule(RollbackAppCodeSnapshotResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public RollbackAppCodeSnapshotResponseBodyModule getModule() {
        return this.module;
    }

    public RollbackAppCodeSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackAppCodeSnapshotResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public RollbackAppCodeSnapshotResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public RollbackAppCodeSnapshotResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class RollbackAppCodeSnapshotResponseBodyModule extends TeaModel {
        /**
         * <p>The SDK change log.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>Test ProduceCommand ops tool.</li>
         * </ul>
         */
        @NameInMap("ChangeLog")
        public String changeLog;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The logical number.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LogicalNumber")
        public Integer logicalNumber;

        public static RollbackAppCodeSnapshotResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            RollbackAppCodeSnapshotResponseBodyModule self = new RollbackAppCodeSnapshotResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public RollbackAppCodeSnapshotResponseBodyModule setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
        }

        public RollbackAppCodeSnapshotResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public RollbackAppCodeSnapshotResponseBodyModule setLogicalNumber(Integer logicalNumber) {
            this.logicalNumber = logicalNumber;
            return this;
        }
        public Integer getLogicalNumber() {
            return this.logicalNumber;
        }

    }

}
