// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetRequestLogResponseBody extends TeaModel {
    @NameInMap("logInfo")
    public GetRequestLogResponseBodyLogInfo logInfo;

    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRequestLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRequestLogResponseBody self = new GetRequestLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRequestLogResponseBody setLogInfo(GetRequestLogResponseBodyLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }
    public GetRequestLogResponseBodyLogInfo getLogInfo() {
        return this.logInfo;
    }

    public GetRequestLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRequestLogResponseBodyLogInfoAuthenticationInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AK</p>
         */
        @NameInMap("authenticationType")
        public String authenticationType;

        /**
         * <strong>example:</strong>
         * <p>HMAC-SHA256</p>
         */
        @NameInMap("signatureMethod")
        public String signatureMethod;

        /**
         * <strong>example:</strong>
         * <p>unknown</p>
         */
        @NameInMap("signatureVersion")
        public String signatureVersion;

        public static GetRequestLogResponseBodyLogInfoAuthenticationInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoAuthenticationInfo self = new GetRequestLogResponseBodyLogInfoAuthenticationInfo();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoAuthenticationInfo setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public GetRequestLogResponseBodyLogInfoAuthenticationInfo setSignatureMethod(String signatureMethod) {
            this.signatureMethod = signatureMethod;
            return this;
        }
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        public GetRequestLogResponseBodyLogInfoAuthenticationInfo setSignatureVersion(String signatureVersion) {
            this.signatureVersion = signatureVersion;
            return this;
        }
        public String getSignatureVersion() {
            return this.signatureVersion;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>openapiexplorer:GetRequestLog</p>
         */
        @NameInMap("authAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>205618123456123456</p>
         */
        @NameInMap("authPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>1001234561234567</p>
         */
        @NameInMap("authPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("authPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("encodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("noPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("policyType")
        public String policyType;

        public static GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail self = new GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoBasicInfoApiDoc extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://api.alibabacloud.com/document/Ecs/2014-05-26/RunInstances">https://api.alibabacloud.com/document/Ecs/2014-05-26/RunInstances</a></p>
         */
        @NameInMap("alibabacloudSite")
        public String alibabacloudSite;

        /**
         * <strong>example:</strong>
         * <p><a href="https://api.aliyun.com/document/Ecs/2014-05-26/RunInstances">https://api.aliyun.com/document/Ecs/2014-05-26/RunInstances</a></p>
         */
        @NameInMap("aliyunSite")
        public String aliyunSite;

        public static GetRequestLogResponseBodyLogInfoBasicInfoApiDoc build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoBasicInfoApiDoc self = new GetRequestLogResponseBodyLogInfoBasicInfoApiDoc();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoApiDoc setAlibabacloudSite(String alibabacloudSite) {
            this.alibabacloudSite = alibabacloudSite;
            return this;
        }
        public String getAlibabacloudSite() {
            return this.alibabacloudSite;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoApiDoc setAliyunSite(String aliyunSite) {
            this.aliyunSite = aliyunSite;
            return this;
        }
        public String getAliyunSite() {
            return this.aliyunSite;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoBasicInfoProductName extends TeaModel {
        @NameInMap("cnName")
        public String cnName;

        /**
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
        @NameInMap("enName")
        public String enName;

        public static GetRequestLogResponseBodyLogInfoBasicInfoProductName build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoBasicInfoProductName self = new GetRequestLogResponseBodyLogInfoBasicInfoProductName();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoProductName setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfoProductName setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoBasicInfo extends TeaModel {
        @NameInMap("accessDeniedDetail")
        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail accessDeniedDetail;

        /**
         * <strong>example:</strong>
         * <p>RunInstances</p>
         */
        @NameInMap("api")
        public String api;

        @NameInMap("apiDoc")
        public GetRequestLogResponseBodyLogInfoBasicInfoApiDoc apiDoc;

        /**
         * <strong>example:</strong>
         * <p>roa</p>
         */
        @NameInMap("apiStyle")
        public String apiStyle;

        /**
         * <strong>example:</strong>
         * <p>2024-11-30</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <strong>example:</strong>
         * <p>ecs.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>IncorrectStatus.TransitRouter</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>The resource is not in a valid state for the operation.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>2025-01-21T07:43:06Z</p>
         */
        @NameInMap("gatewayProcessTime")
        public String gatewayProcessTime;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("httpMethod")
        public String httpMethod;

        /**
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("httpStatusCode")
        public String httpStatusCode;

        /**
         * <strong>example:</strong>
         * <p>123E4567-E89B-12D3-A456-426614174000</p>
         */
        @NameInMap("logRequestId")
        public String logRequestId;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        @NameInMap("productName")
        public GetRequestLogResponseBodyLogInfoBasicInfoProductName productName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>188</p>
         */
        @NameInMap("requestDuration")
        public String requestDuration;

        /**
         * <strong>example:</strong>
         * <p>2025-01-21T07:43:06Z</p>
         */
        @NameInMap("sdkRequestTime")
        public String sdkRequestTime;

        /**
         * <strong>example:</strong>
         * <p>FC.PASS</p>
         */
        @NameInMap("throttlingResult")
        public String throttlingResult;

        public static GetRequestLogResponseBodyLogInfoBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoBasicInfo self = new GetRequestLogResponseBodyLogInfoBasicInfo();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setAccessDeniedDetail(GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail getAccessDeniedDetail() {
            return this.accessDeniedDetail;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setApiDoc(GetRequestLogResponseBodyLogInfoBasicInfoApiDoc apiDoc) {
            this.apiDoc = apiDoc;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoBasicInfoApiDoc getApiDoc() {
            return this.apiDoc;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setApiStyle(String apiStyle) {
            this.apiStyle = apiStyle;
            return this;
        }
        public String getApiStyle() {
            return this.apiStyle;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setGatewayProcessTime(String gatewayProcessTime) {
            this.gatewayProcessTime = gatewayProcessTime;
            return this;
        }
        public String getGatewayProcessTime() {
            return this.gatewayProcessTime;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setHttpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public String getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setLogRequestId(String logRequestId) {
            this.logRequestId = logRequestId;
            return this;
        }
        public String getLogRequestId() {
            return this.logRequestId;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setProductName(GetRequestLogResponseBodyLogInfoBasicInfoProductName productName) {
            this.productName = productName;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoBasicInfoProductName getProductName() {
            return this.productName;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setRequestDuration(String requestDuration) {
            this.requestDuration = requestDuration;
            return this;
        }
        public String getRequestDuration() {
            return this.requestDuration;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setSdkRequestTime(String sdkRequestTime) {
            this.sdkRequestTime = sdkRequestTime;
            return this;
        }
        public String getSdkRequestTime() {
            return this.sdkRequestTime;
        }

        public GetRequestLogResponseBodyLogInfoBasicInfo setThrottlingResult(String throttlingResult) {
            this.throttlingResult = throttlingResult;
            return this;
        }
        public String getThrottlingResult() {
            return this.throttlingResult;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoCallerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>241009849925897811</p>
         */
        @NameInMap("callerAccountId")
        public String callerAccountId;

        /**
         * <strong>example:</strong>
         * <p>100.68.xxx.xxx</p>
         */
        @NameInMap("callerIp")
        public String callerIp;

        /**
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("callerType")
        public String callerType;

        /**
         * <strong>example:</strong>
         * <p>1973374733454118</p>
         */
        @NameInMap("masterAccountId")
        public String masterAccountId;

        /**
         * <strong>example:</strong>
         * <p>AlibabaCloud API Workbench</p>
         */
        @NameInMap("userAgent")
        public String userAgent;

        public static GetRequestLogResponseBodyLogInfoCallerInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoCallerInfo self = new GetRequestLogResponseBodyLogInfoCallerInfo();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoCallerInfo setCallerAccountId(String callerAccountId) {
            this.callerAccountId = callerAccountId;
            return this;
        }
        public String getCallerAccountId() {
            return this.callerAccountId;
        }

        public GetRequestLogResponseBodyLogInfoCallerInfo setCallerIp(String callerIp) {
            this.callerIp = callerIp;
            return this;
        }
        public String getCallerIp() {
            return this.callerIp;
        }

        public GetRequestLogResponseBodyLogInfoCallerInfo setCallerType(String callerType) {
            this.callerType = callerType;
            return this;
        }
        public String getCallerType() {
            return this.callerType;
        }

        public GetRequestLogResponseBodyLogInfoCallerInfo setMasterAccountId(String masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        public GetRequestLogResponseBodyLogInfoCallerInfo setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }
        public String getUserAgent() {
            return this.userAgent;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InstanceType</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("value")
        public Object value;

        public static GetRequestLogResponseBodyLogInfoParameters build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoParameters self = new GetRequestLogResponseBodyLogInfoParameters();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRequestLogResponseBodyLogInfoParameters setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetRequestLogResponseBodyLogInfoParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRequestLogResponseBodyLogInfoParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetRequestLogResponseBodyLogInfoResponses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("responseBody")
        public String responseBody;

        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("responseBodyFormat")
        public String responseBodyFormat;

        public static GetRequestLogResponseBodyLogInfoResponses build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfoResponses self = new GetRequestLogResponseBodyLogInfoResponses();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfoResponses setResponseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public String getResponseBody() {
            return this.responseBody;
        }

        public GetRequestLogResponseBodyLogInfoResponses setResponseBodyFormat(String responseBodyFormat) {
            this.responseBodyFormat = responseBodyFormat;
            return this;
        }
        public String getResponseBodyFormat() {
            return this.responseBodyFormat;
        }

    }

    public static class GetRequestLogResponseBodyLogInfo extends TeaModel {
        @NameInMap("authenticationInfo")
        public GetRequestLogResponseBodyLogInfoAuthenticationInfo authenticationInfo;

        @NameInMap("basicInfo")
        public GetRequestLogResponseBodyLogInfoBasicInfo basicInfo;

        @NameInMap("callerInfo")
        public GetRequestLogResponseBodyLogInfoCallerInfo callerInfo;

        @NameInMap("parameters")
        public java.util.List<GetRequestLogResponseBodyLogInfoParameters> parameters;

        @NameInMap("responses")
        public GetRequestLogResponseBodyLogInfoResponses responses;

        public static GetRequestLogResponseBodyLogInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRequestLogResponseBodyLogInfo self = new GetRequestLogResponseBodyLogInfo();
            return TeaModel.build(map, self);
        }

        public GetRequestLogResponseBodyLogInfo setAuthenticationInfo(GetRequestLogResponseBodyLogInfoAuthenticationInfo authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoAuthenticationInfo getAuthenticationInfo() {
            return this.authenticationInfo;
        }

        public GetRequestLogResponseBodyLogInfo setBasicInfo(GetRequestLogResponseBodyLogInfoBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public GetRequestLogResponseBodyLogInfo setCallerInfo(GetRequestLogResponseBodyLogInfoCallerInfo callerInfo) {
            this.callerInfo = callerInfo;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoCallerInfo getCallerInfo() {
            return this.callerInfo;
        }

        public GetRequestLogResponseBodyLogInfo setParameters(java.util.List<GetRequestLogResponseBodyLogInfoParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetRequestLogResponseBodyLogInfoParameters> getParameters() {
            return this.parameters;
        }

        public GetRequestLogResponseBodyLogInfo setResponses(GetRequestLogResponseBodyLogInfoResponses responses) {
            this.responses = responses;
            return this;
        }
        public GetRequestLogResponseBodyLogInfoResponses getResponses() {
            return this.responses;
        }

    }

}
