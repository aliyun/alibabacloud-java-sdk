// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppInstanceDomainsResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
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
     * <p>App name.</p>
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
     * <p>Dynamic error message, used to replace <code>%s</code> in the error message of the returned parameter <strong>ErrMessage</strong>.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong>, and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it means that the input request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Number of results per query.</p>
     * <p>Range: 10~100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public ListAppInstanceDomainsResponseBodyModule module;

    /**
     * <p>下一个查询开始的Token。没有下一个查询时为空。</p>
     * 
     * <strong>example:</strong>
     * <p>dw+qdTi1EjVSWX/INJdYNw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppInstanceDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceDomainsResponseBody self = new ListAppInstanceDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceDomainsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppInstanceDomainsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppInstanceDomainsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppInstanceDomainsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppInstanceDomainsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppInstanceDomainsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppInstanceDomainsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppInstanceDomainsResponseBody setModule(ListAppInstanceDomainsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppInstanceDomainsResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppInstanceDomainsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppInstanceDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInstanceDomainsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppInstanceDomainsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppInstanceDomainsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataCertificate extends TeaModel {
        /**
         * <p>Certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>Certificate status</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <p>Certificate type</p>
         * 
         * <strong>example:</strong>
         * <p>self-signed</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>Certificate expiration date</p>
         * 
         * <strong>example:</strong>
         * <p>4885718400000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        public static ListAppInstanceDomainsResponseBodyModuleDataCertificate build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataCertificate self = new ListAppInstanceDomainsResponseBodyModuleDataCertificate();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataCertificate setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataCertificate setCertificateStatus(String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataCertificate setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataCertificate setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataOwnership extends TeaModel {
        /**
         * <p>Account owner type: CURRENT OTHER</p>
         * 
         * <strong>example:</strong>
         * <p>1813244684017878</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>Registrar type: ALIYUN OTHER</p>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The root domain name of the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>tjouya.cn</p>
         */
        @NameInMap("RootDomain")
        public String rootDomain;

        public static ListAppInstanceDomainsResponseBodyModuleDataOwnership build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataOwnership self = new ListAppInstanceDomainsResponseBodyModuleDataOwnership();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataOwnership setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataOwnership setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataOwnership setRootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }
        public String getRootDomain() {
            return this.rootDomain;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord extends TeaModel {
        /**
         * <p>Host record</p>
         * 
         * <strong>example:</strong>
         * <p>portal-dev.bambulab.net</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Record type</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public static ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord self = new ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataResolution extends TeaModel {
        /**
         * <p>DNS record information</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord dnsRecord;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>code: 400, invalid unionId request id: 09CC0F8B-49C2-7EFB-81E8-9AEF49068D02</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Domain resolution status</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("ResolutionStatus")
        public String resolutionStatus;

        public static ListAppInstanceDomainsResponseBodyModuleDataResolution build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataResolution self = new ListAppInstanceDomainsResponseBodyModuleDataResolution();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataResolution setDnsRecord(ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataResolution setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataResolution setResolutionStatus(String resolutionStatus) {
            this.resolutionStatus = resolutionStatus;
            return this;
        }
        public String getResolutionStatus() {
            return this.resolutionStatus;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord extends TeaModel {
        /**
         * <p>Host record</p>
         * 
         * <strong>example:</strong>
         * <p>${host}</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Record type</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>Record value</p>
         * 
         * <strong>example:</strong>
         * <p>159.138.94.138</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord self = new ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataVerification extends TeaModel {
        /**
         * <p>DNS record guide that the user needs to configure.</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord dnsRecord;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>code: 400, invalid unionId request id: 2270AB0B-6FD0-7F72-9DC5-7A02B67CBB3B</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Ownership verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        /**
         * <p>Ownership verification status</p>
         * 
         * <strong>example:</strong>
         * <p>NoAliyunServiceRoleForWebsiteBuildPublishAuth</p>
         */
        @NameInMap("VerificationStatusCode")
        public String verificationStatusCode;

        public static ListAppInstanceDomainsResponseBodyModuleDataVerification build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataVerification self = new ListAppInstanceDomainsResponseBodyModuleDataVerification();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerification setDnsRecord(ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerification setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerification setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataVerification setVerificationStatusCode(String verificationStatusCode) {
            this.verificationStatusCode = verificationStatusCode;
            return this;
        }
        public String getVerificationStatusCode() {
            return this.verificationStatusCode;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleData extends TeaModel {
        /**
         * <p>Domain SSL certificate information</p>
         */
        @NameInMap("Certificate")
        public ListAppInstanceDomainsResponseBodyModuleDataCertificate certificate;

        /**
         * <p>Instance creation time (required, format: yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>1683256054000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Domain name</p>
         * 
         * <strong>example:</strong>
         * <p>kaibaidu.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Binding overall status</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("OverallStatus")
        public String overallStatus;

        /**
         * <p>Domain ownership information</p>
         */
        @NameInMap("Ownership")
        public ListAppInstanceDomainsResponseBodyModuleDataOwnership ownership;

        /**
         * <p>Domain resolution information</p>
         */
        @NameInMap("Resolution")
        public ListAppInstanceDomainsResponseBodyModuleDataResolution resolution;

        /**
         * <p>Domain verification information</p>
         */
        @NameInMap("Verification")
        public ListAppInstanceDomainsResponseBodyModuleDataVerification verification;

        public static ListAppInstanceDomainsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleData self = new ListAppInstanceDomainsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleData setCertificate(ListAppInstanceDomainsResponseBodyModuleDataCertificate certificate) {
            this.certificate = certificate;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataCertificate getCertificate() {
            return this.certificate;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setOverallStatus(String overallStatus) {
            this.overallStatus = overallStatus;
            return this;
        }
        public String getOverallStatus() {
            return this.overallStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setOwnership(ListAppInstanceDomainsResponseBodyModuleDataOwnership ownership) {
            this.ownership = ownership;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataOwnership getOwnership() {
            return this.ownership;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setResolution(ListAppInstanceDomainsResponseBodyModuleDataResolution resolution) {
            this.resolution = resolution;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataResolution getResolution() {
            return this.resolution;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setVerification(ListAppInstanceDomainsResponseBodyModuleDataVerification verification) {
            this.verification = verification;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataVerification getVerification() {
            return this.verification;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextCertificate extends TeaModel {
        /**
         * <p>Certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>jfztkg202502</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>Certificate status</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <p>Certificate type</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>证书的到期日期</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15T02:04:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        public static ListAppInstanceDomainsResponseBodyModuleNextCertificate build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextCertificate self = new ListAppInstanceDomainsResponseBodyModuleNextCertificate();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextCertificate setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextCertificate setCertificateStatus(String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextCertificate setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextCertificate setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextOwnership extends TeaModel {
        /**
         * <p>Account owner type: CURRENT OTHER</p>
         * 
         * <strong>example:</strong>
         * <p>拾肆gavin</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>Registrar type: ALIYUN OTHER</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        @NameInMap("Provider")
        public String provider;

        public static ListAppInstanceDomainsResponseBodyModuleNextOwnership build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextOwnership self = new ListAppInstanceDomainsResponseBodyModuleNextOwnership();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextOwnership setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextOwnership setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord extends TeaModel {
        /**
         * <p>Host record</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.6.1</p>
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
         * <p>2025032000000054nuba0r0b0a79y70c1c983tsz09xw9hg3p04kqxmbt4g2p65h</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord self = new ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextResolution extends TeaModel {
        /**
         * <p>DNS record information</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord dnsRecord;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1133664521498319 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Domain resolution status</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("ResolutionStatus")
        public String resolutionStatus;

        public static ListAppInstanceDomainsResponseBodyModuleNextResolution build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextResolution self = new ListAppInstanceDomainsResponseBodyModuleNextResolution();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextResolution setDnsRecord(ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextResolution setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextResolution setResolutionStatus(String resolutionStatus) {
            this.resolutionStatus = resolutionStatus;
            return this;
        }
        public String getResolutionStatus() {
            return this.resolutionStatus;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord extends TeaModel {
        /**
         * <p>Host record</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.abc.com">www.abc.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Record type</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>Record value</p>
         * 
         * <strong>example:</strong>
         * <p>faHuBlyPcodSjBvBJYpm3-9W_cCSowLLQ4zAUyguEGM</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord self = new ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextVerification extends TeaModel {
        /**
         * <p>Guide for DNS records that the user needs to configure.</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord dnsRecord;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1133664521498319 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Ownership verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static ListAppInstanceDomainsResponseBodyModuleNextVerification build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextVerification self = new ListAppInstanceDomainsResponseBodyModuleNextVerification();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextVerification setDnsRecord(ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextVerification setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextVerification setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>Domain SSL certificate information</p>
         */
        @NameInMap("Certificate")
        public ListAppInstanceDomainsResponseBodyModuleNextCertificate certificate;

        /**
         * <p>Instance creation time (required, format: yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>1741572465000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Domain name</p>
         * 
         * <strong>example:</strong>
         * <p>usdcoin.xin</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Binding overall status</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("OverallStatus")
        public String overallStatus;

        /**
         * <p>Domain ownership information</p>
         */
        @NameInMap("Ownership")
        public ListAppInstanceDomainsResponseBodyModuleNextOwnership ownership;

        /**
         * <p>Domain resolution information</p>
         */
        @NameInMap("Resolution")
        public ListAppInstanceDomainsResponseBodyModuleNextResolution resolution;

        /**
         * <p>Domain verification information</p>
         */
        @NameInMap("Verification")
        public ListAppInstanceDomainsResponseBodyModuleNextVerification verification;

        public static ListAppInstanceDomainsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNext self = new ListAppInstanceDomainsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setCertificate(ListAppInstanceDomainsResponseBodyModuleNextCertificate certificate) {
            this.certificate = certificate;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextCertificate getCertificate() {
            return this.certificate;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setOverallStatus(String overallStatus) {
            this.overallStatus = overallStatus;
            return this;
        }
        public String getOverallStatus() {
            return this.overallStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setOwnership(ListAppInstanceDomainsResponseBodyModuleNextOwnership ownership) {
            this.ownership = ownership;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextOwnership getOwnership() {
            return this.ownership;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setResolution(ListAppInstanceDomainsResponseBodyModuleNextResolution resolution) {
            this.resolution = resolution;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextResolution getResolution() {
            return this.resolution;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setVerification(ListAppInstanceDomainsResponseBodyModuleNextVerification verification) {
            this.verification = verification;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextVerification getVerification() {
            return this.verification;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModule extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>Query result.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleData> data;

        /**
         * <p>Decision weight</p>
         */
        @NameInMap("Next")
        public ListAppInstanceDomainsResponseBodyModuleNext next;

        /**
         * <p>Whether there is a next page.</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Whether there is a previous page</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <p>Apart from pagination limits, the server can process up to the most recent 1000 records. If the result exceeds 1000 records, <strong>ResultLimit</strong> will be <strong>true</strong>, please narrow down the time range and search again; otherwise, <strong>ResultLimit</strong> will be <strong>false</strong>.</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static ListAppInstanceDomainsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModule self = new ListAppInstanceDomainsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListAppInstanceDomainsResponseBodyModule setData(java.util.List<ListAppInstanceDomainsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListAppInstanceDomainsResponseBodyModule setNext(ListAppInstanceDomainsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListAppInstanceDomainsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListAppInstanceDomainsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppInstanceDomainsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListAppInstanceDomainsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListAppInstanceDomainsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListAppInstanceDomainsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
