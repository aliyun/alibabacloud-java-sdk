// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppInstanceDomainsResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
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
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the <code>%s</code> in the <strong>ErrMessage</strong> return parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
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
     * <p>The maximum number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListAppInstanceDomainsResponseBodyModule module;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>dw+qdTi1EjVSWX/INJdYNw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>A reserved parameter.</p>
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
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>The status of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <p>The type of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>self-signed</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The expiration date of the certificate.</p>
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

    public static class ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("RecordType")
        public String recordType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public String value;

        public static ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords self = new ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataDnsConflict extends TeaModel {
        @NameInMap("CanAutoResolve")
        public Boolean canAutoResolve;

        @NameInMap("HasConflict")
        public Boolean hasConflict;

        @NameInMap("Message")
        public String message;

        @NameInMap("Records")
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords> records;

        public static ListAppInstanceDomainsResponseBodyModuleDataDnsConflict build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataDnsConflict self = new ListAppInstanceDomainsResponseBodyModuleDataDnsConflict();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflict setCanAutoResolve(Boolean canAutoResolve) {
            this.canAutoResolve = canAutoResolve;
            return this;
        }
        public Boolean getCanAutoResolve() {
            return this.canAutoResolve;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflict setHasConflict(Boolean hasConflict) {
            this.hasConflict = hasConflict;
            return this;
        }
        public Boolean getHasConflict() {
            return this.hasConflict;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflict setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflict setRecords(java.util.List<ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleDataDnsConflictRecords> getRecords() {
            return this.records;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataMigration extends TeaModel {
        @NameInMap("MigrationStatus")
        public String migrationStatus;

        @NameInMap("PreviousDomain")
        public Object previousDomain;

        public static ListAppInstanceDomainsResponseBodyModuleDataMigration build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataMigration self = new ListAppInstanceDomainsResponseBodyModuleDataMigration();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataMigration setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataMigration setPreviousDomain(Object previousDomain) {
            this.previousDomain = previousDomain;
            return this;
        }
        public Object getPreviousDomain() {
            return this.previousDomain;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataOwnership extends TeaModel {
        /**
         * <p>The account owner type. Valid values: CURRENT and OTHER.</p>
         * 
         * <strong>example:</strong>
         * <p>1813244684017878</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The registrar type. Valid values: ALIYUN and OTHER.</p>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The root domain name corresponding to the domain name.</p>
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

    public static class ListAppInstanceDomainsResponseBodyModuleDataQualification extends TeaModel {
        /**
         * <p>The ICP entity filing number.</p>
         */
        @NameInMap("IcpRecordNumber")
        public String icpRecordNumber;

        /**
         * <p>The ICP website filing number.</p>
         */
        @NameInMap("IcpSiteRecordNumber")
        public String icpSiteRecordNumber;

        /**
         * <p>The public security filing number.</p>
         */
        @NameInMap("PoliceRecordNumber")
        public String policeRecordNumber;

        public static ListAppInstanceDomainsResponseBodyModuleDataQualification build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleDataQualification self = new ListAppInstanceDomainsResponseBodyModuleDataQualification();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleDataQualification setIcpRecordNumber(String icpRecordNumber) {
            this.icpRecordNumber = icpRecordNumber;
            return this;
        }
        public String getIcpRecordNumber() {
            return this.icpRecordNumber;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataQualification setIcpSiteRecordNumber(String icpSiteRecordNumber) {
            this.icpSiteRecordNumber = icpSiteRecordNumber;
            return this;
        }
        public String getIcpSiteRecordNumber() {
            return this.icpSiteRecordNumber;
        }

        public ListAppInstanceDomainsResponseBodyModuleDataQualification setPoliceRecordNumber(String policeRecordNumber) {
            this.policeRecordNumber = policeRecordNumber;
            return this;
        }
        public String getPoliceRecordNumber() {
            return this.policeRecordNumber;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord extends TeaModel {
        /**
         * <p>The host record.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-dev.bambulab.net</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The record type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The record value.</p>
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
         * <p>The DNS record information.</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleDataResolutionDnsRecord dnsRecord;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>code: 400, invalid unionId request id: 09CC0F8B-49C2-7EFB-81E8-9AEF49068D02</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The domain name resolution status.</p>
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
         * <p>The host record.</p>
         * 
         * <strong>example:</strong>
         * <p>${host}</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The record type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The record value.</p>
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
         * <p>The DNS record that the user needs to configure.</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleDataVerificationDnsRecord dnsRecord;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>code: 400, invalid unionId request id: 2270AB0B-6FD0-7F72-9DC5-7A02B67CBB3B</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ownership verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        /**
         * <p>The ownership verification status code.</p>
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
         * <p>The domain name SSL certificate information.</p>
         */
        @NameInMap("Certificate")
        public ListAppInstanceDomainsResponseBodyModuleDataCertificate certificate;

        /**
         * <p>The instance creation time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>1683256054000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DnsConflict")
        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflict dnsConflict;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>kaibaidu.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Migration")
        public ListAppInstanceDomainsResponseBodyModuleDataMigration migration;

        /**
         * <p>The overall binding status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("OverallStatus")
        public String overallStatus;

        /**
         * <p>The domain name ownership information.</p>
         */
        @NameInMap("Ownership")
        public ListAppInstanceDomainsResponseBodyModuleDataOwnership ownership;

        /**
         * <p>The domain name qualification information.</p>
         */
        @NameInMap("Qualification")
        public ListAppInstanceDomainsResponseBodyModuleDataQualification qualification;

        /**
         * <p>The domain name resolution information.</p>
         */
        @NameInMap("Resolution")
        public ListAppInstanceDomainsResponseBodyModuleDataResolution resolution;

        /**
         * <p>The domain name verification information.</p>
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

        public ListAppInstanceDomainsResponseBodyModuleData setDnsConflict(ListAppInstanceDomainsResponseBodyModuleDataDnsConflict dnsConflict) {
            this.dnsConflict = dnsConflict;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataDnsConflict getDnsConflict() {
            return this.dnsConflict;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListAppInstanceDomainsResponseBodyModuleData setMigration(ListAppInstanceDomainsResponseBodyModuleDataMigration migration) {
            this.migration = migration;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataMigration getMigration() {
            return this.migration;
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

        public ListAppInstanceDomainsResponseBodyModuleData setQualification(ListAppInstanceDomainsResponseBodyModuleDataQualification qualification) {
            this.qualification = qualification;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleDataQualification getQualification() {
            return this.qualification;
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
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>jfztkg202502</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>The status of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <p>The type of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        @NameInMap("CertificateType")
        public String certificateType;

        /**
         * <p>The expiration date of the certificate.</p>
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

    public static class ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("RecordType")
        public String recordType;

        @NameInMap("Value")
        public String value;

        public static ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords self = new ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextDnsConflict extends TeaModel {
        @NameInMap("CanAutoResolve")
        public Boolean canAutoResolve;

        @NameInMap("HasConflict")
        public Boolean hasConflict;

        @NameInMap("Message")
        public String message;

        @NameInMap("Records")
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords> records;

        public static ListAppInstanceDomainsResponseBodyModuleNextDnsConflict build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextDnsConflict self = new ListAppInstanceDomainsResponseBodyModuleNextDnsConflict();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflict setCanAutoResolve(Boolean canAutoResolve) {
            this.canAutoResolve = canAutoResolve;
            return this;
        }
        public Boolean getCanAutoResolve() {
            return this.canAutoResolve;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflict setHasConflict(Boolean hasConflict) {
            this.hasConflict = hasConflict;
            return this;
        }
        public Boolean getHasConflict() {
            return this.hasConflict;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflict setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflict setRecords(java.util.List<ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleNextDnsConflictRecords> getRecords() {
            return this.records;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextMigration extends TeaModel {
        @NameInMap("MigrationStatus")
        public String migrationStatus;

        @NameInMap("PreviousDomain")
        public Object previousDomain;

        public static ListAppInstanceDomainsResponseBodyModuleNextMigration build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextMigration self = new ListAppInstanceDomainsResponseBodyModuleNextMigration();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextMigration setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextMigration setPreviousDomain(Object previousDomain) {
            this.previousDomain = previousDomain;
            return this;
        }
        public Object getPreviousDomain() {
            return this.previousDomain;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextOwnership extends TeaModel {
        /**
         * <p>The account owner type. Valid values: CURRENT and OTHER.</p>
         * 
         * <strong>example:</strong>
         * <p>拾肆gavin</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The registrar type. Valid values: ALIYUN and OTHER.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        @NameInMap("Provider")
        public String provider;

        @NameInMap("RootDomain")
        public String rootDomain;

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

        public ListAppInstanceDomainsResponseBodyModuleNextOwnership setRootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }
        public String getRootDomain() {
            return this.rootDomain;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextQualification extends TeaModel {
        /**
         * <p>The ICP entity filing number.</p>
         */
        @NameInMap("IcpRecordNumber")
        public String icpRecordNumber;

        /**
         * <p>The ICP website filing number.</p>
         */
        @NameInMap("IcpSiteRecordNumber")
        public String icpSiteRecordNumber;

        /**
         * <p>The public security filing number.</p>
         */
        @NameInMap("PoliceRecordNumber")
        public String policeRecordNumber;

        public static ListAppInstanceDomainsResponseBodyModuleNextQualification build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceDomainsResponseBodyModuleNextQualification self = new ListAppInstanceDomainsResponseBodyModuleNextQualification();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceDomainsResponseBodyModuleNextQualification setIcpRecordNumber(String icpRecordNumber) {
            this.icpRecordNumber = icpRecordNumber;
            return this;
        }
        public String getIcpRecordNumber() {
            return this.icpRecordNumber;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextQualification setIcpSiteRecordNumber(String icpSiteRecordNumber) {
            this.icpSiteRecordNumber = icpSiteRecordNumber;
            return this;
        }
        public String getIcpSiteRecordNumber() {
            return this.icpSiteRecordNumber;
        }

        public ListAppInstanceDomainsResponseBodyModuleNextQualification setPoliceRecordNumber(String policeRecordNumber) {
            this.policeRecordNumber = policeRecordNumber;
            return this;
        }
        public String getPoliceRecordNumber() {
            return this.policeRecordNumber;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord extends TeaModel {
        /**
         * <p>The host record.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.6.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The record type.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The record value.</p>
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
         * <p>The DNS record information.</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleNextResolutionDnsRecord dnsRecord;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1133664521498319 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The domain name resolution status.</p>
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
         * <p>The host record.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.abc.com">www.abc.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The record type.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The record value.</p>
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
         * <p>The DNS record that the user needs to configure.</p>
         */
        @NameInMap("DnsRecord")
        public ListAppInstanceDomainsResponseBodyModuleNextVerificationDnsRecord dnsRecord;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1133664521498319 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ownership verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        @NameInMap("VerificationStatusCode")
        public String verificationStatusCode;

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

        public ListAppInstanceDomainsResponseBodyModuleNextVerification setVerificationStatusCode(String verificationStatusCode) {
            this.verificationStatusCode = verificationStatusCode;
            return this;
        }
        public String getVerificationStatusCode() {
            return this.verificationStatusCode;
        }

    }

    public static class ListAppInstanceDomainsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The domain name SSL certificate information.</p>
         */
        @NameInMap("Certificate")
        public ListAppInstanceDomainsResponseBodyModuleNextCertificate certificate;

        /**
         * <p>The instance creation time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>1741572465000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DnsConflict")
        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflict dnsConflict;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>usdcoin.xin</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Migration")
        public ListAppInstanceDomainsResponseBodyModuleNextMigration migration;

        /**
         * <p>The overall binding status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("OverallStatus")
        public String overallStatus;

        /**
         * <p>The domain name ownership information.</p>
         */
        @NameInMap("Ownership")
        public ListAppInstanceDomainsResponseBodyModuleNextOwnership ownership;

        /**
         * <p>The domain name qualification information.</p>
         */
        @NameInMap("Qualification")
        public ListAppInstanceDomainsResponseBodyModuleNextQualification qualification;

        /**
         * <p>The domain name resolution information.</p>
         */
        @NameInMap("Resolution")
        public ListAppInstanceDomainsResponseBodyModuleNextResolution resolution;

        /**
         * <p>The domain name verification information.</p>
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

        public ListAppInstanceDomainsResponseBodyModuleNext setDnsConflict(ListAppInstanceDomainsResponseBodyModuleNextDnsConflict dnsConflict) {
            this.dnsConflict = dnsConflict;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextDnsConflict getDnsConflict() {
            return this.dnsConflict;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListAppInstanceDomainsResponseBodyModuleNext setMigration(ListAppInstanceDomainsResponseBodyModuleNextMigration migration) {
            this.migration = migration;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextMigration getMigration() {
            return this.migration;
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

        public ListAppInstanceDomainsResponseBodyModuleNext setQualification(ListAppInstanceDomainsResponseBodyModuleNextQualification qualification) {
            this.qualification = qualification;
            return this;
        }
        public ListAppInstanceDomainsResponseBodyModuleNextQualification getQualification() {
            return this.qualification;
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The request results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAppInstanceDomainsResponseBodyModuleData> data;

        /**
         * <p>The decision weight.</p>
         */
        @NameInMap("Next")
        public ListAppInstanceDomainsResponseBodyModuleNext next;

        /**
         * <p>Indicates whether a next page exists.</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Indicates whether a previous page exists.</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <p>The server processes up to 1000 recent records beyond the pagination limit. If the results exceed 1000 entries, <strong>ResultLimit</strong> is <strong>true</strong>, and you must narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <p>The total number of pages.</p>
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
