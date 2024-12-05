// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class HttpApiRoute extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>intranet/internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <strong>example:</strong>
     * <p>Deploying/NotDeployed/Undeploying/Deployed</p>
     */
    @NameInMap("DeployStatus")
    public String deployStatus;

    /**
     * <strong>example:</strong>
     * <p>Single/Multiple/VersionOriented</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("Domains")
    public java.util.List<HttpApiRouteDomains> domains;

    @NameInMap("EnvironmentId")
    public String environmentId;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("HttpApiId")
    public String httpApiId;

    /**
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("HttpApiName")
    public String httpApiName;

    /**
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("HttpApiType")
    public String httpApiType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IngressId")
    public Long ingressId;

    @NameInMap("NacosInstanceId")
    public String nacosInstanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NacosNamespaceId")
    public String nacosNamespaceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("Policies")
    public HttpApiRoutePolicies policies;

    @NameInMap("Predicates")
    public HttpApiRoutePredicates predicates;

    @NameInMap("RouteId")
    public String routeId;

    @NameInMap("Services")
    public java.util.List<HttpApiRouteServices> services;

    /**
     * <strong>example:</strong>
     * <p>SAE_NACOS/SAE_K8S_SERVICE/MSE_NACOS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static HttpApiRoute build(java.util.Map<String, ?> map) throws Exception {
        HttpApiRoute self = new HttpApiRoute();
        return TeaModel.build(map, self);
    }

    public HttpApiRoute setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public HttpApiRoute setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public HttpApiRoute setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public HttpApiRoute setDomains(java.util.List<HttpApiRouteDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<HttpApiRouteDomains> getDomains() {
        return this.domains;
    }

    public HttpApiRoute setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public HttpApiRoute setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public HttpApiRoute setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public HttpApiRoute setHttpApiName(String httpApiName) {
        this.httpApiName = httpApiName;
        return this;
    }
    public String getHttpApiName() {
        return this.httpApiName;
    }

    public HttpApiRoute setHttpApiType(String httpApiType) {
        this.httpApiType = httpApiType;
        return this;
    }
    public String getHttpApiType() {
        return this.httpApiType;
    }

    public HttpApiRoute setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

    public HttpApiRoute setNacosInstanceId(String nacosInstanceId) {
        this.nacosInstanceId = nacosInstanceId;
        return this;
    }
    public String getNacosInstanceId() {
        return this.nacosInstanceId;
    }

    public HttpApiRoute setNacosNamespaceId(String nacosNamespaceId) {
        this.nacosNamespaceId = nacosNamespaceId;
        return this;
    }
    public String getNacosNamespaceId() {
        return this.nacosNamespaceId;
    }

    public HttpApiRoute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiRoute setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public HttpApiRoute setPolicies(HttpApiRoutePolicies policies) {
        this.policies = policies;
        return this;
    }
    public HttpApiRoutePolicies getPolicies() {
        return this.policies;
    }

    public HttpApiRoute setPredicates(HttpApiRoutePredicates predicates) {
        this.predicates = predicates;
        return this;
    }
    public HttpApiRoutePredicates getPredicates() {
        return this.predicates;
    }

    public HttpApiRoute setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public HttpApiRoute setServices(java.util.List<HttpApiRouteServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<HttpApiRouteServices> getServices() {
        return this.services;
    }

    public HttpApiRoute setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class HttpApiRouteDomains extends TeaModel {
        @NameInMap("DomainId")
        public String domainId;

        @NameInMap("DomainName")
        public String domainName;

        public static HttpApiRouteDomains build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRouteDomains self = new HttpApiRouteDomains();
            return TeaModel.build(map, self);
        }

        public HttpApiRouteDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpApiRouteDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class HttpApiRoutePoliciesFallbackDestinations extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServicePort")
        public Long servicePort;

        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        public static HttpApiRoutePoliciesFallbackDestinations build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePoliciesFallbackDestinations self = new HttpApiRoutePoliciesFallbackDestinations();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePoliciesFallbackDestinations setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public HttpApiRoutePoliciesFallbackDestinations setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public HttpApiRoutePoliciesFallbackDestinations setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiRoutePoliciesFallbackDestinations setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public HttpApiRoutePoliciesFallbackDestinations setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public HttpApiRoutePoliciesFallbackDestinations setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

    }

    public static class HttpApiRoutePoliciesFallback extends TeaModel {
        @NameInMap("Destinations")
        public java.util.List<HttpApiRoutePoliciesFallbackDestinations> destinations;

        @NameInMap("Enable")
        public Boolean enable;

        public static HttpApiRoutePoliciesFallback build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePoliciesFallback self = new HttpApiRoutePoliciesFallback();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePoliciesFallback setDestinations(java.util.List<HttpApiRoutePoliciesFallbackDestinations> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<HttpApiRoutePoliciesFallbackDestinations> getDestinations() {
            return this.destinations;
        }

        public HttpApiRoutePoliciesFallback setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class HttpApiRoutePoliciesRetry extends TeaModel {
        @NameInMap("Attempts")
        public Long attempts;

        /**
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("HttpCodes")
        public java.util.List<String> httpCodes;

        @NameInMap("RetryOn")
        public java.util.List<String> retryOn;

        public static HttpApiRoutePoliciesRetry build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePoliciesRetry self = new HttpApiRoutePoliciesRetry();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePoliciesRetry setAttempts(Long attempts) {
            this.attempts = attempts;
            return this;
        }
        public Long getAttempts() {
            return this.attempts;
        }

        public HttpApiRoutePoliciesRetry setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public HttpApiRoutePoliciesRetry setHttpCodes(java.util.List<String> httpCodes) {
            this.httpCodes = httpCodes;
            return this;
        }
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        public HttpApiRoutePoliciesRetry setRetryOn(java.util.List<String> retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public java.util.List<String> getRetryOn() {
            return this.retryOn;
        }

    }

    public static class HttpApiRoutePoliciesTimeout extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        @NameInMap("UnitNum")
        public Long unitNum;

        public static HttpApiRoutePoliciesTimeout build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePoliciesTimeout self = new HttpApiRoutePoliciesTimeout();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePoliciesTimeout setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public HttpApiRoutePoliciesTimeout setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public HttpApiRoutePoliciesTimeout setUnitNum(Long unitNum) {
            this.unitNum = unitNum;
            return this;
        }
        public Long getUnitNum() {
            return this.unitNum;
        }

    }

    public static class HttpApiRoutePolicies extends TeaModel {
        @NameInMap("Fallback")
        public HttpApiRoutePoliciesFallback fallback;

        @NameInMap("Retry")
        public HttpApiRoutePoliciesRetry retry;

        @NameInMap("Timeout")
        public HttpApiRoutePoliciesTimeout timeout;

        public static HttpApiRoutePolicies build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePolicies self = new HttpApiRoutePolicies();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePolicies setFallback(HttpApiRoutePoliciesFallback fallback) {
            this.fallback = fallback;
            return this;
        }
        public HttpApiRoutePoliciesFallback getFallback() {
            return this.fallback;
        }

        public HttpApiRoutePolicies setRetry(HttpApiRoutePoliciesRetry retry) {
            this.retry = retry;
            return this;
        }
        public HttpApiRoutePoliciesRetry getRetry() {
            return this.retry;
        }

        public HttpApiRoutePolicies setTimeout(HttpApiRoutePoliciesTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public HttpApiRoutePoliciesTimeout getTimeout() {
            return this.timeout;
        }

    }

    public static class HttpApiRoutePredicatesHeaderPredicates extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Prefix/Exact/Regex</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static HttpApiRoutePredicatesHeaderPredicates build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePredicatesHeaderPredicates self = new HttpApiRoutePredicatesHeaderPredicates();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePredicatesHeaderPredicates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiRoutePredicatesHeaderPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HttpApiRoutePredicatesHeaderPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HttpApiRoutePredicatesPathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>Prefix/Exact/Regex</p>
         */
        @NameInMap("Type")
        public String type;

        public static HttpApiRoutePredicatesPathPredicates build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePredicatesPathPredicates self = new HttpApiRoutePredicatesPathPredicates();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePredicatesPathPredicates setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public HttpApiRoutePredicatesPathPredicates setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public HttpApiRoutePredicatesPathPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiRoutePredicatesQueryPredicates extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Prefix/Exact/Regex</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static HttpApiRoutePredicatesQueryPredicates build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePredicatesQueryPredicates self = new HttpApiRoutePredicatesQueryPredicates();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePredicatesQueryPredicates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiRoutePredicatesQueryPredicates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HttpApiRoutePredicatesQueryPredicates setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class HttpApiRoutePredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        public java.util.List<HttpApiRoutePredicatesHeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        public java.util.List<String> methodPredicates;

        @NameInMap("PathPredicates")
        public HttpApiRoutePredicatesPathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        public java.util.List<HttpApiRoutePredicatesQueryPredicates> queryPredicates;

        public static HttpApiRoutePredicates build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRoutePredicates self = new HttpApiRoutePredicates();
            return TeaModel.build(map, self);
        }

        public HttpApiRoutePredicates setHeaderPredicates(java.util.List<HttpApiRoutePredicatesHeaderPredicates> headerPredicates) {
            this.headerPredicates = headerPredicates;
            return this;
        }
        public java.util.List<HttpApiRoutePredicatesHeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        public HttpApiRoutePredicates setMethodPredicates(java.util.List<String> methodPredicates) {
            this.methodPredicates = methodPredicates;
            return this;
        }
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        public HttpApiRoutePredicates setPathPredicates(HttpApiRoutePredicatesPathPredicates pathPredicates) {
            this.pathPredicates = pathPredicates;
            return this;
        }
        public HttpApiRoutePredicatesPathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        public HttpApiRoutePredicates setQueryPredicates(java.util.List<HttpApiRoutePredicatesQueryPredicates> queryPredicates) {
            this.queryPredicates = queryPredicates;
            return this;
        }
        public java.util.List<HttpApiRoutePredicatesQueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

    }

    public static class HttpApiRouteServices extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServicePort")
        public Long servicePort;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ServiceWeight")
        public Long serviceWeight;

        public static HttpApiRouteServices build(java.util.Map<String, ?> map) throws Exception {
            HttpApiRouteServices self = new HttpApiRouteServices();
            return TeaModel.build(map, self);
        }

        public HttpApiRouteServices setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public HttpApiRouteServices setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public HttpApiRouteServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiRouteServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public HttpApiRouteServices setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public HttpApiRouteServices setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public HttpApiRouteServices setServiceWeight(Long serviceWeight) {
            this.serviceWeight = serviceWeight;
            return this;
        }
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

    }

}
