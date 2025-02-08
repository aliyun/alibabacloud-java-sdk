// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetOwnRequestLogResponseBody extends TeaModel {
    @NameInMap("logInfo")
    public GetOwnRequestLogResponseBodyLogInfo logInfo;

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
        @NameInMap("authenticationType")
        public String authenticationType;

        /**
         * <strong>example:</strong>
         * <p>HMAC-SHA256</p>
         */
        @NameInMap("signatureMethod")
        public String signatureMethod;

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
        @NameInMap("authAction")
        public String authAction;

        @NameInMap("authPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("authPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("authPrincipalType")
        public String authPrincipalType;

        @NameInMap("encodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("noPermissionType")
        public String noPermissionType;

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
        @NameInMap("alibabacloudSite")
        public String alibabacloudSite;

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
        @NameInMap("cnName")
        public String cnName;

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
        @NameInMap("accessDeniedDetail")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoAccessDeniedDetail accessDeniedDetail;

        @NameInMap("api")
        public String api;

        @NameInMap("apiDoc")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoApiDoc apiDoc;

        @NameInMap("apiStyle")
        public String apiStyle;

        @NameInMap("apiVersion")
        public String apiVersion;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("gatewayProcessTime")
        public String gatewayProcessTime;

        @NameInMap("httpMethod")
        public String httpMethod;

        @NameInMap("httpStatusCode")
        public String httpStatusCode;

        @NameInMap("logRequestId")
        public String logRequestId;

        @NameInMap("product")
        public String product;

        @NameInMap("productName")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfoProductName productName;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("requestDuration")
        public String requestDuration;

        @NameInMap("sdkRequestTime")
        public String sdkRequestTime;

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
        @NameInMap("callerAccountId")
        public String callerAccountId;

        @NameInMap("callerIp")
        public String callerIp;

        @NameInMap("callerType")
        public String callerType;

        @NameInMap("masterAccountId")
        public String masterAccountId;

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
        @NameInMap("name")
        public String name;

        @NameInMap("required")
        public Boolean required;

        @NameInMap("type")
        public String type;

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
        @NameInMap("responseBody")
        public String responseBody;

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
        @NameInMap("authenticationInfo")
        public GetOwnRequestLogResponseBodyLogInfoAuthenticationInfo authenticationInfo;

        @NameInMap("basicInfo")
        public GetOwnRequestLogResponseBodyLogInfoBasicInfo basicInfo;

        @NameInMap("callerInfo")
        public GetOwnRequestLogResponseBodyLogInfoCallerInfo callerInfo;

        @NameInMap("parameters")
        public java.util.List<GetOwnRequestLogResponseBodyLogInfoParameters> parameters;

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
