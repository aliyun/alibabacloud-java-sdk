// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BindAppDomainResponseBody extends TeaModel {
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
     * <p>or</p>
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
     * <p>The dynamic error message, which is used to replace the <strong>%s</strong> placeholder in the <strong>ErrMessage</strong> response element.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the value of the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
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
     * <p>The data table module. Valid values:</p>
     * <ul>
     * <li><p>ABTest: experiment data table</p>
     * </li>
     * <li><p>ExperimentTool: experiment tool table</p>
     * </li>
     * <li><p>DataDiagnosis: data modeling diagnostics</p>
     * </li>
     * </ul>
     */
    @NameInMap("Module")
    public BindAppDomainResponseBodyModule module;

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
     * <p>SYSTEM.EROR</p>
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

    public static BindAppDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAppDomainResponseBody self = new BindAppDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAppDomainResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAppDomainResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public BindAppDomainResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BindAppDomainResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public BindAppDomainResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public BindAppDomainResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public BindAppDomainResponseBody setModule(BindAppDomainResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BindAppDomainResponseBodyModule getModule() {
        return this.module;
    }

    public BindAppDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAppDomainResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public BindAppDomainResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public BindAppDomainResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class BindAppDomainResponseBodyModuleDnsConflictRecords extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("RecordType")
        public String recordType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public String value;

        public static BindAppDomainResponseBodyModuleDnsConflictRecords build(java.util.Map<String, ?> map) throws Exception {
            BindAppDomainResponseBodyModuleDnsConflictRecords self = new BindAppDomainResponseBodyModuleDnsConflictRecords();
            return TeaModel.build(map, self);
        }

        public BindAppDomainResponseBodyModuleDnsConflictRecords setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public BindAppDomainResponseBodyModuleDnsConflictRecords setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public BindAppDomainResponseBodyModuleDnsConflictRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BindAppDomainResponseBodyModuleDnsConflictRecords setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BindAppDomainResponseBodyModuleDnsConflict extends TeaModel {
        @NameInMap("CanAutoResolve")
        public Boolean canAutoResolve;

        @NameInMap("HasConflict")
        public Boolean hasConflict;

        @NameInMap("Message")
        public String message;

        @NameInMap("Records")
        public java.util.List<BindAppDomainResponseBodyModuleDnsConflictRecords> records;

        public static BindAppDomainResponseBodyModuleDnsConflict build(java.util.Map<String, ?> map) throws Exception {
            BindAppDomainResponseBodyModuleDnsConflict self = new BindAppDomainResponseBodyModuleDnsConflict();
            return TeaModel.build(map, self);
        }

        public BindAppDomainResponseBodyModuleDnsConflict setCanAutoResolve(Boolean canAutoResolve) {
            this.canAutoResolve = canAutoResolve;
            return this;
        }
        public Boolean getCanAutoResolve() {
            return this.canAutoResolve;
        }

        public BindAppDomainResponseBodyModuleDnsConflict setHasConflict(Boolean hasConflict) {
            this.hasConflict = hasConflict;
            return this;
        }
        public Boolean getHasConflict() {
            return this.hasConflict;
        }

        public BindAppDomainResponseBodyModuleDnsConflict setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BindAppDomainResponseBodyModuleDnsConflict setRecords(java.util.List<BindAppDomainResponseBodyModuleDnsConflictRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<BindAppDomainResponseBodyModuleDnsConflictRecords> getRecords() {
            return this.records;
        }

    }

    public static class BindAppDomainResponseBodyModule extends TeaModel {
        @NameInMap("DnsConflict")
        public BindAppDomainResponseBodyModuleDnsConflict dnsConflict;

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static BindAppDomainResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BindAppDomainResponseBodyModule self = new BindAppDomainResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BindAppDomainResponseBodyModule setDnsConflict(BindAppDomainResponseBodyModuleDnsConflict dnsConflict) {
            this.dnsConflict = dnsConflict;
            return this;
        }
        public BindAppDomainResponseBodyModuleDnsConflict getDnsConflict() {
            return this.dnsConflict;
        }

        public BindAppDomainResponseBodyModule setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
