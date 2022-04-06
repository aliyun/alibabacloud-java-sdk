// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRouteDetailResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteDetail")
    public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail routeDetail;

    @NameInMap("Status")
    public Integer status;

    public static DescribeIstioGatewayRouteDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayRouteDetailResponseBody self = new DescribeIstioGatewayRouteDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayRouteDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeIstioGatewayRouteDetailResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeIstioGatewayRouteDetailResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public DescribeIstioGatewayRouteDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIstioGatewayRouteDetailResponseBody setRouteDetail(DescribeIstioGatewayRouteDetailResponseBodyRouteDetail routeDetail) {
        this.routeDetail = routeDetail;
        return this;
    }
    public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail getRouteDetail() {
        return this.routeDetail;
    }

    public DescribeIstioGatewayRouteDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort extends TeaModel {
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        @NameInMap("Percentage")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage percentage;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort setHttpStatus(Integer httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort setPercentage(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage percentage) {
            this.percentage = percentage;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbortPercentage getPercentage() {
            return this.percentage;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay extends TeaModel {
        @NameInMap("ExponentialDelay")
        public String exponentialDelay;

        @NameInMap("FixedDelay")
        public String fixedDelay;

        @NameInMap("Percentage")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage percentage;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay setExponentialDelay(String exponentialDelay) {
            this.exponentialDelay = exponentialDelay;
            return this;
        }
        public String getExponentialDelay() {
            return this.exponentialDelay;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay setFixedDelay(String fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public String getFixedDelay() {
            return this.fixedDelay;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay setPercentage(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage percentage) {
            this.percentage = percentage;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelayPercentage getPercentage() {
            return this.percentage;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault extends TeaModel {
        @NameInMap("Abort")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort abort;

        @NameInMap("Delay")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay delay;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault setAbort(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort abort) {
            this.abort = abort;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultAbort getAbort() {
            return this.abort;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault setDelay(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay delay) {
            this.delay = delay;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFaultDelay getDelay() {
            return this.delay;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("RedirectCode")
        public Integer redirectCode;

        @NameInMap("Uri")
        public String uri;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect setRedirectCode(Integer redirectCode) {
            this.redirectCode = redirectCode;
            return this;
        }
        public Integer getRedirectCode() {
            return this.redirectCode;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Subset")
        public String subset;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror setSubset(String subset) {
            this.subset = subset;
            return this;
        }
        public String getSubset() {
            return this.subset;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage extends TeaModel {
        @NameInMap("Value")
        public Float value;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities extends TeaModel {
        @NameInMap("Value")
        public Boolean value;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries extends TeaModel {
        @NameInMap("Attempts")
        public Integer attempts;

        @NameInMap("PerTryTimeout")
        public String perTryTimeout;

        @NameInMap("RetryOn")
        public String retryOn;

        @NameInMap("RetryRemoteLocalities")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities retryRemoteLocalities;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries setAttempts(Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public Integer getAttempts() {
            return this.attempts;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries setPerTryTimeout(String perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        public String getPerTryTimeout() {
            return this.perTryTimeout;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries setRetryOn(String retryOn) {
            this.retryOn = retryOn;
            return this;
        }
        public String getRetryOn() {
            return this.retryOn;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries setRetryRemoteLocalities(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities retryRemoteLocalities) {
            this.retryRemoteLocalities = retryRemoteLocalities;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetriesRetryRemoteLocalities getRetryRemoteLocalities() {
            return this.retryRemoteLocalities;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite extends TeaModel {
        @NameInMap("Authority")
        public String authority;

        @NameInMap("Uri")
        public String uri;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions extends TeaModel {
        @NameInMap("Delegate")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate delegate;

        @NameInMap("Fault")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault fault;

        @NameInMap("HTTPRedirect")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect HTTPRedirect;

        @NameInMap("Mirror")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror mirror;

        @NameInMap("MirrorPercentage")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage mirrorPercentage;

        @NameInMap("Retries")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries retries;

        @NameInMap("Rewrite")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite rewrite;

        @NameInMap("Timeout")
        public String timeout;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setDelegate(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate delegate) {
            this.delegate = delegate;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsDelegate getDelegate() {
            return this.delegate;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setFault(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault fault) {
            this.fault = fault;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsFault getFault() {
            return this.fault;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setHTTPRedirect(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect HTTPRedirect) {
            this.HTTPRedirect = HTTPRedirect;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsHTTPRedirect getHTTPRedirect() {
            return this.HTTPRedirect;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setMirror(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror mirror) {
            this.mirror = mirror;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirror getMirror() {
            return this.mirror;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setMirrorPercentage(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage mirrorPercentage) {
            this.mirrorPercentage = mirrorPercentage;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsMirrorPercentage getMirrorPercentage() {
            return this.mirrorPercentage;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setRetries(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries retries) {
            this.retries = retries;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRetries getRetries() {
            return this.retries;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setRewrite(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptionsRewrite getRewrite() {
            return this.rewrite;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders extends TeaModel {
        @NameInMap("MatchingContent")
        public String matchingContent;

        @NameInMap("MatchingMode")
        public String matchingMode;

        @NameInMap("Name")
        public String name;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders setMatchingContent(String matchingContent) {
            this.matchingContent = matchingContent;
            return this;
        }
        public String getMatchingContent() {
            return this.matchingContent;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders setMatchingMode(String matchingMode) {
            this.matchingMode = matchingMode;
            return this;
        }
        public String getMatchingMode() {
            return this.matchingMode;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes extends TeaModel {
        @NameInMap("SNIHosts")
        public java.util.List<String> SNIHosts;

        @NameInMap("TLSPort")
        public Integer TLSPort;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes setSNIHosts(java.util.List<String> SNIHosts) {
            this.SNIHosts = SNIHosts;
            return this;
        }
        public java.util.List<String> getSNIHosts() {
            return this.SNIHosts;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes setTLSPort(Integer TLSPort) {
            this.TLSPort = TLSPort;
            return this;
        }
        public Integer getTLSPort() {
            return this.TLSPort;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI extends TeaModel {
        @NameInMap("MatchingContent")
        public String matchingContent;

        @NameInMap("MatchingMode")
        public String matchingMode;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI setMatchingContent(String matchingContent) {
            this.matchingContent = matchingContent;
            return this;
        }
        public String getMatchingContent() {
            return this.matchingContent;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI setMatchingMode(String matchingMode) {
            this.matchingMode = matchingMode;
            return this;
        }
        public String getMatchingMode() {
            return this.matchingMode;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest extends TeaModel {
        @NameInMap("Headers")
        public java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders> headers;

        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("TLSMatchAttributes")
        public java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes> TLSMatchAttributes;

        @NameInMap("URI")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI URI;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest setHeaders(java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestHeaders> getHeaders() {
            return this.headers;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest setTLSMatchAttributes(java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes> TLSMatchAttributes) {
            this.TLSMatchAttributes = TLSMatchAttributes;
            return this;
        }
        public java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestTLSMatchAttributes> getTLSMatchAttributes() {
            return this.TLSMatchAttributes;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest setURI(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI URI) {
            this.URI = URI;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequestURI getURI() {
            return this.URI;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort extends TeaModel {
        @NameInMap("Number")
        public Integer number;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort port;

        @NameInMap("Subset")
        public String subset;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination setPort(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort port) {
            this.port = port;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestinationPort getPort() {
            return this.port;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination setSubset(String subset) {
            this.subset = subset;
            return this;
        }
        public String getSubset() {
            return this.subset;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest extends TeaModel {
        @NameInMap("Add")
        public java.util.Map<String, ?> add;

        @NameInMap("Remove")
        public java.util.List<String> remove;

        @NameInMap("Set")
        public java.util.Map<String, String> set;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest setAdd(java.util.Map<String, ?> add) {
            this.add = add;
            return this;
        }
        public java.util.Map<String, ?> getAdd() {
            return this.add;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest setRemove(java.util.List<String> remove) {
            this.remove = remove;
            return this;
        }
        public java.util.List<String> getRemove() {
            return this.remove;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest setSet(java.util.Map<String, String> set) {
            this.set = set;
            return this;
        }
        public java.util.Map<String, String> getSet() {
            return this.set;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse extends TeaModel {
        @NameInMap("Add")
        public java.util.Map<String, ?> add;

        @NameInMap("Remove")
        public java.util.List<String> remove;

        @NameInMap("Set")
        public java.util.Map<String, ?> set;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse setAdd(java.util.Map<String, ?> add) {
            this.add = add;
            return this;
        }
        public java.util.Map<String, ?> getAdd() {
            return this.add;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse setRemove(java.util.List<String> remove) {
            this.remove = remove;
            return this;
        }
        public java.util.List<String> getRemove() {
            return this.remove;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse setSet(java.util.Map<String, ?> set) {
            this.set = set;
            return this;
        }
        public java.util.Map<String, ?> getSet() {
            return this.set;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders extends TeaModel {
        @NameInMap("Request")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest request;

        @NameInMap("Response")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse response;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders setRequest(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest request) {
            this.request = request;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersRequest getRequest() {
            return this.request;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders setResponse(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse response) {
            this.response = response;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeadersResponse getResponse() {
            return this.response;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations extends TeaModel {
        @NameInMap("Destination")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination destination;

        @NameInMap("Headers")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders headers;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations setDestination(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination destination) {
            this.destination = destination;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsDestination getDestination() {
            return this.destination;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations setHeaders(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders headers) {
            this.headers = headers;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinationsHeaders getHeaders() {
            return this.headers;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeIstioGatewayRouteDetailResponseBodyRouteDetail extends TeaModel {
        @NameInMap("HTTPAdvancedOptions")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions HTTPAdvancedOptions;

        @NameInMap("MatchRequest")
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest matchRequest;

        @NameInMap("RouteDestinations")
        public java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations> routeDestinations;

        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("RouteType")
        public String routeType;

        public static DescribeIstioGatewayRouteDetailResponseBodyRouteDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRouteDetailResponseBodyRouteDetail self = new DescribeIstioGatewayRouteDetailResponseBodyRouteDetail();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail setHTTPAdvancedOptions(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions HTTPAdvancedOptions) {
            this.HTTPAdvancedOptions = HTTPAdvancedOptions;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailHTTPAdvancedOptions getHTTPAdvancedOptions() {
            return this.HTTPAdvancedOptions;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail setMatchRequest(DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest matchRequest) {
            this.matchRequest = matchRequest;
            return this;
        }
        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetailMatchRequest getMatchRequest() {
            return this.matchRequest;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail setRouteDestinations(java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations> routeDestinations) {
            this.routeDestinations = routeDestinations;
            return this;
        }
        public java.util.List<DescribeIstioGatewayRouteDetailResponseBodyRouteDetailRouteDestinations> getRouteDestinations() {
            return this.routeDestinations;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public DescribeIstioGatewayRouteDetailResponseBodyRouteDetail setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

    }

}
