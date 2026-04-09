// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetOwnRequestLogResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the log of the API call.</p>
     */
    @NameInMap("logInfo")
    public GetOwnRequestLogResponseBodyLogInfo logInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetOwnRequestLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOwnRequestLogResponseBody self = new GetOwnRequestLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOwnRequestLogResponseBody setLogInfo(GetOwnRequestLogResponseBodyLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }
    public GetOwnRequestLogResponseBodyLogInfo getLogInfo() {
        return this.logInfo;
    }

    public GetOwnRequestLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo extends TeaModel {
        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li>AK: includes a permanent AccessKey pair, a temporary AccessKey pair, and a STS token.</li>
         * <li>PRIVATEKEY: an AccessKey pair for an asymmetric cryptography algorithm.</li>
         * <li>BEARETOKEN: an authentication mechanism that is widely used in the OAuth 2.0 framework and cloud services.</li>
         * <li>CUSTOM_SPI: an efficient and secure authentication method that is suitable for the delivery and management of Software as a Service (SaaS) services in Alibaba Cloud Marketplace.</li>
         * <li>Anonymous: anonymous access.</li>
         * <li>DPS: an authentication method that is similar to AK. Its signature algorithm is different from that of Alibaba Cloud services and is exclusive to specific products.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AK</p>
         */
        @NameInMap("authenticationType")
        public String authenticationType;

        /**
         * <p>The signature algorithm. Valid values:</p>
         * <ul>
         * <li>HMAC-SHA1</li>
         * <li>HMAC-SHA256</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HMAC-SHA256</p>
         */
        @NameInMap("signatureMethod")
        public String signatureMethod;

        /**
         * <p>The signature version.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown</p>
         */
        @NameInMap("signatureVersion")
        public String signatureVersion;

        public static GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo self = new GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo setSignatureMethod(String signatureMethod) {
            this.signatureMethod = signatureMethod;
            return this;
        }
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        public GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo setSignatureVersion(String signatureVersion) {
            this.signatureVersion = signatureVersion;
            return this;
        }
        public String getSignatureVersion() {
            return this.signatureVersion;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail extends TeaModel {
        /**
         * <p>The operation that the operator does not have permissions to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>openapiexplorer:GetRequestLog</p>
         */
        @NameInMap("authAction")
        public String authAction;

        /**
         * <p>The identity.</p>
         * 
         * <strong>example:</strong>
         * <p>205618123456123456</p>
         */
        @NameInMap("authPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the current identity belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1001234561234567</p>
         */
        @NameInMap("authPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("authPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The information after encoding, which can be used for troubleshooting. You can call the DecodeDiagnosticMessage operation of Resource Access Management (RAM) for further diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("encodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The cause of the permission-related error.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("noPermissionType")
        public String noPermissionType;

        /**
         * <p>The type of the policy that causes the permission-related error.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("policyType")
        public String policyType;

        public static GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail self = new GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc extends TeaModel {
        /**
         * <p>The documentation URL on the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.alibabacloud.com/document/Ecs/2014-05-26/RunInstances">https://api.alibabacloud.com/document/Ecs/2014-05-26/RunInstances</a></p>
         */
        @NameInMap("alibabacloudSite")
        public String alibabacloudSite;

        /**
         * <p>The documentation URL on the China site (aliyun.com).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.aliyun.com/document/Ecs/2014-05-26/RunInstances">https://api.aliyun.com/document/Ecs/2014-05-26/RunInstances</a></p>
         */
        @NameInMap("aliyunSite")
        public String aliyunSite;

        public static GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc self = new GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc setAlibabacloudSite(String alibabacloudSite) {
            this.alibabacloudSite = alibabacloudSite;
            return this;
        }
        public String getAlibabacloudSite() {
            return this.alibabacloudSite;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc setAliyunSite(String aliyunSite) {
            this.aliyunSite = aliyunSite;
            return this;
        }
        public String getAliyunSite() {
            return this.aliyunSite;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName extends TeaModel {
        /**
         * <p>The product name in Chinese.</p>
         */
        @NameInMap("cnName")
        public String cnName;

        /**
         * <p>The product name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
        @NameInMap("enName")
        public String enName;

        public static GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName self = new GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoBasicInfo extends TeaModel {
        /**
         * <p>The error message returned if the operator does not have the required permissions.</p>
         */
        @NameInMap("accessDeniedDetail")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail accessDeniedDetail;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>RunInstances</p>
         */
        @NameInMap("api")
        public String api;

        /**
         * <p>The information about the API documentation.</p>
         */
        @NameInMap("apiDoc")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc apiDoc;

        /**
         * <p>The API style. Valid values: roa and rpc.</p>
         * 
         * <strong>example:</strong>
         * <p>rpc</p>
         */
        @NameInMap("apiStyle")
        public String apiStyle;

        /**
         * <p>The version of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The endpoint of the service region.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The error code in the log. This parameter is left empty if no error is reported in the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>IncorrectStatus.TransitRouter</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message in the log. This parameter is left empty if no error is reported in the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource is not in a valid state for the operation.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The time when the gateway receives the request. Indicate the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-21T07:43:06Z</p>
         */
        @NameInMap("gatewayProcessTime")
        public String gatewayProcessTime;

        /**
         * <p>The HTTP request method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("httpMethod")
        public String httpMethod;

        /**
         * <p>The HTTP status code in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("httpStatusCode")
        public String httpStatusCode;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123E4567-E89B-12D3-A456-426614174000</p>
         */
        @NameInMap("logRequestId")
        public String logRequestId;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The product name, which includes the Chinese name and English name.</p>
         */
        @NameInMap("productName")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName productName;

        /**
         * <p>The service region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The duration from when the gateway receives the request to when the client receives a response. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>188</p>
         */
        @NameInMap("requestDuration")
        public String requestDuration;

        /**
         * <p>The time when the request is initiated. Indicate the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-21T07:43:06Z</p>
         */
        @NameInMap("sdkRequestTime")
        public String sdkRequestTime;

        /**
         * <p>The throttling result. Valid values: FC.PASS: The task is not blocked by throttling. FC.DENY: The task is blocked by throttling.</p>
         * 
         * <strong>example:</strong>
         * <p>FC.PASS</p>
         */
        @NameInMap("throttlingResult")
        public String throttlingResult;

        public static GetOwnRequestLogResponseBodyLogInfoBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoBasicInfo self = new GetOwnRequestLogResponseBodyLogInfoBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setAccessDeniedDetail(GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail getAccessDeniedDetail() {
            return this.accessDeniedDetail;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setApiDoc(GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc apiDoc) {
            this.apiDoc = apiDoc;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc getApiDoc() {
            return this.apiDoc;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setApiStyle(String apiStyle) {
            this.apiStyle = apiStyle;
            return this;
        }
        public String getApiStyle() {
            return this.apiStyle;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setGatewayProcessTime(String gatewayProcessTime) {
            this.gatewayProcessTime = gatewayProcessTime;
            return this;
        }
        public String getGatewayProcessTime() {
            return this.gatewayProcessTime;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setHttpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public String getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setLogRequestId(String logRequestId) {
            this.logRequestId = logRequestId;
            return this;
        }
        public String getLogRequestId() {
            return this.logRequestId;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setProductName(GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName productName) {
            this.productName = productName;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName getProductName() {
            return this.productName;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setRequestDuration(String requestDuration) {
            this.requestDuration = requestDuration;
            return this;
        }
        public String getRequestDuration() {
            return this.requestDuration;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setSdkRequestTime(String sdkRequestTime) {
            this.sdkRequestTime = sdkRequestTime;
            return this;
        }
        public String getSdkRequestTime() {
            return this.sdkRequestTime;
        }

        public GetOwnRequestLogResponseBodyLogInfoBasicInfo setThrottlingResult(String throttlingResult) {
            this.throttlingResult = throttlingResult;
            return this;
        }
        public String getThrottlingResult() {
            return this.throttlingResult;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoCallerInfo extends TeaModel {
        /**
         * <p>The account ID of the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>241009849925897811</p>
         */
        @NameInMap("callerAccountId")
        public String callerAccountId;

        /**
         * <p>The IP address of the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>100.68.xxx.xxx</p>
         */
        @NameInMap("callerIp")
        public String callerIp;

        /**
         * <p>The type of the caller. Valid values:</p>
         * <ol>
         * <li>customer: an Alibaba Cloud account</li>
         * <li>sub: a RAM user</li>
         * <li>AssumedRoleUser: a user that uses a temporary Security Token Service (STS) token</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("callerType")
        public String callerType;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1973374733454118</p>
         */
        @NameInMap("masterAccountId")
        public String masterAccountId;

        /**
         * <p>The information about the user agent.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloud API Workbench</p>
         */
        @NameInMap("userAgent")
        public String userAgent;

        public static GetOwnRequestLogResponseBodyLogInfoCallerInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoCallerInfo self = new GetOwnRequestLogResponseBodyLogInfoCallerInfo();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoCallerInfo setCallerAccountId(String callerAccountId) {
            this.callerAccountId = callerAccountId;
            return this;
        }
        public String getCallerAccountId() {
            return this.callerAccountId;
        }

        public GetOwnRequestLogResponseBodyLogInfoCallerInfo setCallerIp(String callerIp) {
            this.callerIp = callerIp;
            return this;
        }
        public String getCallerIp() {
            return this.callerIp;
        }

        public GetOwnRequestLogResponseBodyLogInfoCallerInfo setCallerType(String callerType) {
            this.callerType = callerType;
            return this;
        }
        public String getCallerType() {
            return this.callerType;
        }

        public GetOwnRequestLogResponseBodyLogInfoCallerInfo setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public GetOwnRequestLogResponseBodyLogInfoCallerInfo setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }
        public String getUserAgent() {
            return this.userAgent;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoParameters extends TeaModel {
        /**
         * <p>The name of the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the request parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <p>The type of the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("value")
        public Object value;

        public static GetOwnRequestLogResponseBodyLogInfoParameters build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoParameters self = new GetOwnRequestLogResponseBodyLogInfoParameters();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOwnRequestLogResponseBodyLogInfoParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetOwnRequestLogResponseBodyLogInfoParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetOwnRequestLogResponseBodyLogInfoParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfoResponses extends TeaModel {
        /**
         * <p>The response body.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("responseBody")
        public String responseBody;

        /**
         * <p>The type of the response body. Valid values: JSON, XML, and HTML.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("responseBodyFormat")
        public String responseBodyFormat;

        public static GetOwnRequestLogResponseBodyLogInfoResponses build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfoResponses self = new GetOwnRequestLogResponseBodyLogInfoResponses();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfoResponses setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public String getResponseBody() {
            return this.responseBody;
        }

        public GetOwnRequestLogResponseBodyLogInfoResponses setResponseBodyFormat(String responseBodyFormat) {
            this.responseBodyFormat = responseBodyFormat;
            return this;
        }
        public String getResponseBodyFormat() {
            return this.responseBodyFormat;
        }

    }

    public static class GetOwnRequestLogResponseBodyLogInfo extends TeaModel {
        /**
         * <p>The authentication information.</p>
         */
        @NameInMap("authenticationInfo")
        public GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo authenticationInfo;

        /**
         * <p>The basic information about the log of the API call.</p>
         */
        @NameInMap("basicInfo")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfo basicInfo;

        /**
         * <p>The information about the caller.</p>
         */
        @NameInMap("callerInfo")
        public GetOwnRequestLogResponseBodyLogInfoCallerInfo callerInfo;

        /**
         * <p>The information about the request parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.List<GetOwnRequestLogResponseBodyLogInfoParameters> parameters;

        /**
         * <p>The information that is returned for the request.</p>
         */
        @NameInMap("responses")
        public GetOwnRequestLogResponseBodyLogInfoResponses responses;

        public static GetOwnRequestLogResponseBodyLogInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOwnRequestLogResponseBodyLogInfo self = new GetOwnRequestLogResponseBodyLogInfo();
            return TeaModel.build(map, self);
        }

        public GetOwnRequestLogResponseBodyLogInfo setAuthenticationInfo(GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo getAuthenticationInfo() {
            return this.authenticationInfo;
        }

        public GetOwnRequestLogResponseBodyLogInfo setBasicInfo(GetOwnRequestLogResponseBodyLogInfoBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public GetOwnRequestLogResponseBodyLogInfo setCallerInfo(GetOwnRequestLogResponseBodyLogInfoCallerInfo callerInfo) {
            this.callerInfo = callerInfo;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoCallerInfo getCallerInfo() {
            return this.callerInfo;
        }

        public GetOwnRequestLogResponseBodyLogInfo setParameters(java.util.List<GetOwnRequestLogResponseBodyLogInfoParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetOwnRequestLogResponseBodyLogInfoParameters> getParameters() {
            return this.parameters;
        }

        public GetOwnRequestLogResponseBodyLogInfo setResponses(GetOwnRequestLogResponseBodyLogInfoResponses responses) {
            this.responses = responses;
            return this;
        }
        public GetOwnRequestLogResponseBodyLogInfoResponses getResponses() {
            return this.responses;
        }

    }

}
