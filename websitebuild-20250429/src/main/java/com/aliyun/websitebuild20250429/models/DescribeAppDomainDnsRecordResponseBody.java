// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DescribeAppDomainDnsRecordResponseBody extends TeaModel {
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
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/vs1w2yd3p8264pz/vs1w2yd3p8264pz.diff.zip?Expires=1739592470&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=3DRuMtCeTinVYxo7XAOEIOEmZGE%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/vs1w2yd3p8264pz/vs1w2yd3p8264pz.diff.zip?Expires=1739592470&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=3DRuMtCeTinVYxo7XAOEIOEmZGE%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public DescribeAppDomainDnsRecordResponseBodyModule module;

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
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
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
