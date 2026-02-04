// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DescribeAppDomainDnsRecordResponseBody extends TeaModel {
    /**
     * <p>Details of access denial; this field is returned only when RAM verification fails.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Whether retry is allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>应用名称，查询此名称的应用</p>
     * 
     * <strong>example:</strong>
     * <p>ish-intelligence-store-platform-admin-web</p>
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
     * <p>Dynamic message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>返回错误参数</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Application module</p>
     */
    @NameInMap("Module")
    public DescribeAppDomainDnsRecordResponseBodyModule module;

    /**
     * <p>ID of the request</p>
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
     * <p>Exception message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Backup parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static DescribeAppDomainDnsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDomainDnsRecordResponseBody self = new DescribeAppDomainDnsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppDomainDnsRecordResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAppDomainDnsRecordResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public DescribeAppDomainDnsRecordResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeAppDomainDnsRecordResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeAppDomainDnsRecordResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeAppDomainDnsRecordResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public DescribeAppDomainDnsRecordResponseBody setModule(DescribeAppDomainDnsRecordResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public DescribeAppDomainDnsRecordResponseBodyModule getModule() {
        return this.module;
    }

    public DescribeAppDomainDnsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppDomainDnsRecordResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public DescribeAppDomainDnsRecordResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public DescribeAppDomainDnsRecordResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class DescribeAppDomainDnsRecordResponseBodyModule extends TeaModel {
        /**
         * <p>Host record</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Record type</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>Record value</p>
         * 
         * <strong>example:</strong>
         * <p>Maintenance</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAppDomainDnsRecordResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDomainDnsRecordResponseBodyModule self = new DescribeAppDomainDnsRecordResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public DescribeAppDomainDnsRecordResponseBodyModule setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeAppDomainDnsRecordResponseBodyModule setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public DescribeAppDomainDnsRecordResponseBodyModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
