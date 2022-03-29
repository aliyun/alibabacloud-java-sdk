// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayRoutesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GatewayRoute")
    public CreateIstioGatewayRoutesRequestGatewayRoute gatewayRoute;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Status")
    public Integer status;

    public static CreateIstioGatewayRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIstioGatewayRoutesRequest self = new CreateIstioGatewayRoutesRequest();
        return TeaModel.build(map, self);
    }

    public CreateIstioGatewayRoutesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIstioGatewayRoutesRequest setGatewayRoute(CreateIstioGatewayRoutesRequestGatewayRoute gatewayRoute) {
        this.gatewayRoute = gatewayRoute;
        return this;
    }
    public CreateIstioGatewayRoutesRequestGatewayRoute getGatewayRoute() {
        return this.gatewayRoute;
    }

    public CreateIstioGatewayRoutesRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public CreateIstioGatewayRoutesRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateIstioGatewayRoutesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public CreateIstioGatewayRoutesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort extends TeaModel {
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        @NameInMap("Percentage")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage percentage;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort setPercentage(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage percentage) {
            this.percentage = percentage;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage getPercentage() {
            return this.percentage;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay extends TeaModel {
        @NameInMap("FixedDelay")
        public String fixedDelay;

        @NameInMap("Percentage")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage percentage;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay setFixedDelay(String fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public String getFixedDelay() {
            return this.fixedDelay;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay setPercentage(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage percentage) {
            this.percentage = percentage;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage getPercentage() {
            return this.percentage;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault extends TeaModel {
        @NameInMap("Abort")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort abort;

        @NameInMap("Delay")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay delay;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault setAbort(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort abort) {
            this.abort = abort;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort getAbort() {
            return this.abort;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault setDelay(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay delay) {
            this.delay = delay;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay getDelay() {
            return this.delay;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("RedirectCode")
        public Integer redirectCode;

        @NameInMap("Uri")
        public String uri;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect setRedirectCode(Integer redirectCode) {
            this.redirectCode = redirectCode;
            return this;
        }
        public Integer getRedirectCode() {
            return this.redirectCode;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Subset")
        public String subset;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror setSubset(String subset) {
            this.subset = subset;
            return this;
        }
        public String getSubset() {
            return this.subset;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities extends TeaModel {
        @NameInMap("Value")
        public Boolean value;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries extends TeaModel {
        @NameInMap("Attempts")
        public Integer attempts;

        @NameInMap("PerTryTimeout")
        public String perTryTimeout;

        @NameInMap("RetryOn")
        public String retryOn;

        @NameInMap("RetryRemoteLocalities")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities retryRemoteLocalities;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setPerTryTimeout(String perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        public String getPerTryTimeout() {
            return this.perTryTimeout;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setRetryOn(String retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public String getRetryOn() {
            return this.retryOn;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setRetryRemoteLocalities(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities retryRemoteLocalities) {
            this.retryRemoteLocalities = retryRemoteLocalities;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities getRetryRemoteLocalities() {
            return this.retryRemoteLocalities;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("Uri")
        public String uri;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions extends TeaModel {
        @NameInMap("Delegate")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate delegate;

        @NameInMap("Fault")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault fault;

        @NameInMap("HTTPRedirect")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect HTTPRedirect;

        @NameInMap("Mirror")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror mirror;

        @NameInMap("MirrorPercentage")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage mirrorPercentage;

        @NameInMap("Retries")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries retries;

        @NameInMap("Rewrite")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite rewrite;

        @NameInMap("Timeout")
        public String timeout;

        public static CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions self = new CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setDelegate(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate delegate) {
            this.delegate = delegate;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate getDelegate() {
            return this.delegate;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setFault(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault fault) {
            this.fault = fault;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault getFault() {
            return this.fault;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setHTTPRedirect(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect HTTPRedirect) {
            this.HTTPRedirect = HTTPRedirect;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect getHTTPRedirect() {
            return this.HTTPRedirect;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setMirror(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror mirror) {
            this.mirror = mirror;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror getMirror() {
            return this.mirror;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setMirrorPercentage(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage mirrorPercentage) {
            this.mirrorPercentage = mirrorPercentage;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage getMirrorPercentage() {
            return this.mirrorPercentage;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setRetries(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries retries) {
            this.retries = retries;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries getRetries() {
            return this.retries;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setRewrite(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite getRewrite() {
            return this.rewrite;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders extends TeaModel {
        @NameInMap("MatchingContent")
        public String matchingContent;

        @NameInMap("MatchingMode")
        public String matchingMode;

        @NameInMap("Name")
        public String name;

        public static CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders self = new CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders setMatchingContent(String matchingContent) {
            this.matchingContent = matchingContent;
            return this;
        }
        public String getMatchingContent() {
            return this.matchingContent;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders setMatchingMode(String matchingMode) {
            this.matchingMode = matchingMode;
            return this;
        }
        public String getMatchingMode() {
            return this.matchingMode;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes extends TeaModel {
        @NameInMap("SNIHosts")
        public java.util.List<String> SNIHosts;

        @NameInMap("TLSPort")
        public Integer TLSPort;

        public static CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes self = new CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes setSNIHosts(java.util.List<String> SNIHosts) {
            this.SNIHosts = SNIHosts;
            return this;
        }
        public java.util.List<String> getSNIHosts() {
            return this.SNIHosts;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes setTLSPort(Integer TLSPort) {
            this.TLSPort = TLSPort;
            return this;
        }
        public Integer getTLSPort() {
            return this.TLSPort;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI extends TeaModel {
        @NameInMap("MatchingContent")
        public String matchingContent;

        @NameInMap("MatchingMode")
        public String matchingMode;

        public static CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI self = new CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI setMatchingContent(String matchingContent) {
            this.matchingContent = matchingContent;
            return this;
        }
        public String getMatchingContent() {
            return this.matchingContent;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI setMatchingMode(String matchingMode) {
            this.matchingMode = matchingMode;
            return this;
        }
        public String getMatchingMode() {
            return this.matchingMode;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest extends TeaModel {
        @NameInMap("Headers")
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> headers;

        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("TLSMatchAttributes")
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> TLSMatchAttributes;

        @NameInMap("URI")
        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI URI;

        public static CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest self = new CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest setHeaders(java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> getHeaders() {
            return this.headers;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest setTLSMatchAttributes(java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> TLSMatchAttributes) {
            this.TLSMatchAttributes = TLSMatchAttributes;
            return this;
        }
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> getTLSMatchAttributes() {
            return this.TLSMatchAttributes;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest setURI(CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI URI) {
            this.URI = URI;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI getURI() {
            return this.URI;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Subset")
        public String subset;

        public static CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination self = new CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination setSubset(String subset) {
            this.subset = subset;
            return this;
        }
        public String getSubset() {
            return this.subset;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations extends TeaModel {
        @NameInMap("Destination")
        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination destination;

        @NameInMap("Weight")
        public Integer weight;

        public static CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations self = new CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations setDestination(CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination destination) {
            this.destination = destination;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination getDestination() {
            return this.destination;
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRoute extends TeaModel {
        @NameInMap("HTTPAdvancedOptions")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions HTTPAdvancedOptions;

        @NameInMap("MatchRequest")
        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest matchRequest;

        @NameInMap("RouteDestinations")
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> routeDestinations;

        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("RouteType")
        public String routeType;

        public static CreateIstioGatewayRoutesRequestGatewayRoute build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRoute self = new CreateIstioGatewayRoutesRequestGatewayRoute();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setHTTPAdvancedOptions(CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions HTTPAdvancedOptions) {
            this.HTTPAdvancedOptions = HTTPAdvancedOptions;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions getHTTPAdvancedOptions() {
            return this.HTTPAdvancedOptions;
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setMatchRequest(CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest matchRequest) {
            this.matchRequest = matchRequest;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest getMatchRequest() {
            return this.matchRequest;
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setRouteDestinations(java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> routeDestinations) {
            this.routeDestinations = routeDestinations;
            return this;
        }
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> getRouteDestinations() {
            return this.routeDestinations;
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

    }

}
