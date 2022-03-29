// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioGatewayRoutesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GatewayRoute")
    public UpdateIstioGatewayRoutesRequestGatewayRoute gatewayRoute;

    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Status")
    public Integer status;

    public static UpdateIstioGatewayRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioGatewayRoutesRequest self = new UpdateIstioGatewayRoutesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIstioGatewayRoutesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIstioGatewayRoutesRequest setGatewayRoute(UpdateIstioGatewayRoutesRequestGatewayRoute gatewayRoute) {
        this.gatewayRoute = gatewayRoute;
        return this;
    }
    public UpdateIstioGatewayRoutesRequestGatewayRoute getGatewayRoute() {
        return this.gatewayRoute;
    }

    public UpdateIstioGatewayRoutesRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public UpdateIstioGatewayRoutesRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateIstioGatewayRoutesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateIstioGatewayRoutesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort extends TeaModel {
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        @NameInMap("Percentage")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage percentage;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort setPercentage(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage percentage) {
            this.percentage = percentage;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbortPercentage getPercentage() {
            return this.percentage;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay extends TeaModel {
        @NameInMap("FixedDelay")
        public String fixedDelay;

        @NameInMap("Percentage")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage percentage;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay setFixedDelay(String fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public String getFixedDelay() {
            return this.fixedDelay;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay setPercentage(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage percentage) {
            this.percentage = percentage;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelayPercentage getPercentage() {
            return this.percentage;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault extends TeaModel {
        @NameInMap("Abort")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort abort;

        @NameInMap("Delay")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay delay;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault setAbort(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort abort) {
            this.abort = abort;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort getAbort() {
            return this.abort;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault setDelay(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay delay) {
            this.delay = delay;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultDelay getDelay() {
            return this.delay;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("RedirectCode")
        public Integer redirectCode;

        @NameInMap("Uri")
        public String uri;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect setRedirectCode(Integer redirectCode) {
            this.redirectCode = redirectCode;
            return this;
        }
        public Integer getRedirectCode() {
            return this.redirectCode;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Subset")
        public String subset;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror setSubset(String subset) {
            this.subset = subset;
            return this;
        }
        public String getSubset() {
            return this.subset;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities extends TeaModel {
        @NameInMap("Value")
        public Boolean value;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries extends TeaModel {
        @NameInMap("Attempts")
        public Integer attempts;

        @NameInMap("PerTryTimeout")
        public String perTryTimeout;

        @NameInMap("RetryOn")
        public String retryOn;

        @NameInMap("RetryRemoteLocalities")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities retryRemoteLocalities;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setPerTryTimeout(String perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        public String getPerTryTimeout() {
            return this.perTryTimeout;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setRetryOn(String retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public String getRetryOn() {
            return this.retryOn;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries setRetryRemoteLocalities(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities retryRemoteLocalities) {
            this.retryRemoteLocalities = retryRemoteLocalities;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetriesRetryRemoteLocalities getRetryRemoteLocalities() {
            return this.retryRemoteLocalities;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("Uri")
        public String uri;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions extends TeaModel {
        @NameInMap("Delegate")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate delegate;

        @NameInMap("Fault")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault fault;

        @NameInMap("HTTPRedirect")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect HTTPRedirect;

        @NameInMap("Mirror")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror mirror;

        @NameInMap("MirrorPercentage")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage mirrorPercentage;

        @NameInMap("Retries")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries retries;

        @NameInMap("Rewrite")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite rewrite;

        @NameInMap("Timeout")
        public String timeout;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions self = new UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setDelegate(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate delegate) {
            this.delegate = delegate;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate getDelegate() {
            return this.delegate;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setFault(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault fault) {
            this.fault = fault;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault getFault() {
            return this.fault;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setHTTPRedirect(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect HTTPRedirect) {
            this.HTTPRedirect = HTTPRedirect;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect getHTTPRedirect() {
            return this.HTTPRedirect;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setMirror(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror mirror) {
            this.mirror = mirror;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror getMirror() {
            return this.mirror;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setMirrorPercentage(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage mirrorPercentage) {
            this.mirrorPercentage = mirrorPercentage;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage getMirrorPercentage() {
            return this.mirrorPercentage;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setRetries(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries retries) {
            this.retries = retries;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries getRetries() {
            return this.retries;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setRewrite(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite getRewrite() {
            return this.rewrite;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders extends TeaModel {
        @NameInMap("MatchingContent")
        public String matchingContent;

        @NameInMap("MatchingMode")
        public String matchingMode;

        @NameInMap("Name")
        public String name;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders self = new UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders setMatchingContent(String matchingContent) {
            this.matchingContent = matchingContent;
            return this;
        }
        public String getMatchingContent() {
            return this.matchingContent;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders setMatchingMode(String matchingMode) {
            this.matchingMode = matchingMode;
            return this;
        }
        public String getMatchingMode() {
            return this.matchingMode;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes extends TeaModel {
        @NameInMap("SNIHosts")
        public java.util.List<String> SNIHosts;

        @NameInMap("TLSPort")
        public Integer TLSPort;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes self = new UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes setSNIHosts(java.util.List<String> SNIHosts) {
            this.SNIHosts = SNIHosts;
            return this;
        }
        public java.util.List<String> getSNIHosts() {
            return this.SNIHosts;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes setTLSPort(Integer TLSPort) {
            this.TLSPort = TLSPort;
            return this;
        }
        public Integer getTLSPort() {
            return this.TLSPort;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI extends TeaModel {
        @NameInMap("MatchingContent")
        public String matchingContent;

        @NameInMap("MatchingMode")
        public String matchingMode;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI self = new UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI setMatchingContent(String matchingContent) {
            this.matchingContent = matchingContent;
            return this;
        }
        public String getMatchingContent() {
            return this.matchingContent;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI setMatchingMode(String matchingMode) {
            this.matchingMode = matchingMode;
            return this;
        }
        public String getMatchingMode() {
            return this.matchingMode;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest extends TeaModel {
        @NameInMap("Headers")
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> headers;

        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("TLSMatchAttributes")
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> TLSMatchAttributes;

        @NameInMap("URI")
        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI URI;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest self = new UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest setHeaders(java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> getHeaders() {
            return this.headers;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest setTLSMatchAttributes(java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> TLSMatchAttributes) {
            this.TLSMatchAttributes = TLSMatchAttributes;
            return this;
        }
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> getTLSMatchAttributes() {
            return this.TLSMatchAttributes;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest setURI(UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI URI) {
            this.URI = URI;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestURI getURI() {
            return this.URI;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Subset")
        public String subset;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination self = new UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination setSubset(String subset) {
            this.subset = subset;
            return this;
        }
        public String getSubset() {
            return this.subset;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations extends TeaModel {
        @NameInMap("Destination")
        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination destination;

        @NameInMap("Weight")
        public Integer weight;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations self = new UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations setDestination(UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination destination) {
            this.destination = destination;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination getDestination() {
            return this.destination;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRoute extends TeaModel {
        @NameInMap("HTTPAdvancedOptions")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions HTTPAdvancedOptions;

        @NameInMap("MatchRequest")
        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest matchRequest;

        @NameInMap("RouteDestinations")
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> routeDestinations;

        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("RouteType")
        public String routeType;

        public static UpdateIstioGatewayRoutesRequestGatewayRoute build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRoute self = new UpdateIstioGatewayRoutesRequestGatewayRoute();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setHTTPAdvancedOptions(UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions HTTPAdvancedOptions) {
            this.HTTPAdvancedOptions = HTTPAdvancedOptions;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions getHTTPAdvancedOptions() {
            return this.HTTPAdvancedOptions;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setMatchRequest(UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest matchRequest) {
            this.matchRequest = matchRequest;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest getMatchRequest() {
            return this.matchRequest;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setRouteDestinations(java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> routeDestinations) {
            this.routeDestinations = routeDestinations;
            return this;
        }
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> getRouteDestinations() {
            return this.routeDestinations;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

    }

}
