// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioGatewayRoutesRequest extends TeaModel {
    /**
     * <p>The description of the routing rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the routing rule to be updated for the ASM gateway.</p>
     */
    @NameInMap("GatewayRoute")
    public UpdateIstioGatewayRoutesRequestGatewayRoute gatewayRoute;

    /**
     * <p>The name of the ASM gateway.</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The status of the routing rule. Valid values:</p>
     * <br>
     * <p>*   `0`: The routing rule is valid.</p>
     * <p>*   `1`: The routing rule is invalid.</p>
     * <p>*   `2`: An error occurs during the creation or update of the routing rule.</p>
     */
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
        /**
         * <p>The name of the virtual service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace to which the virtual service belongs.</p>
         */
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
        /**
         * <p>The percentage of requests that are aborted with the specified error code, which is expressed as a decimal.</p>
         */
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
        /**
         * <p>The HTTP status code.</p>
         */
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        /**
         * <p>The percentage of requests that are aborted with the specified error code.</p>
         */
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
        /**
         * <p>The percentage of requests to which the delay fault is injected, which is expressed as a decimal.</p>
         */
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
        /**
         * <p>The fixed duration for request delay.</p>
         */
        @NameInMap("FixedDelay")
        public String fixedDelay;

        /**
         * <p>The percentage of requests to which the delay fault is injected.</p>
         */
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
        /**
         * <p>The configurations for aborting requests with specified error codes.</p>
         */
        @NameInMap("Abort")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort abort;

        /**
         * <p>The duration to delay a request.</p>
         */
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
        /**
         * <p>The value to be used to overwrite the value of the Authority or Host header during redirection.</p>
         */
        @NameInMap("Authority")
        public String authority;

        /**
         * <p>The HTTP status code to be used to indicate URL redirection. Default value: 301.</p>
         */
        @NameInMap("RedirectCode")
        public Integer redirectCode;

        /**
         * <p>The value to be used to overwrite the URL path during redirection.</p>
         */
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
        /**
         * <p>The name of the service defined in the service registry.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The name of the service subset.</p>
         */
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
        /**
         * <p>The percentage of requests that are mirrored to another destination except for the original destination, which is expressed as a decimal.</p>
         */
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
        /**
         * <p>Specifies whether to allow retries to other localities. Valid values:</p>
         * <br>
         * <p>*   `true`</p>
         * <p>*   `false`</p>
         * <br>
         * <p>Default value: `false`.</p>
         */
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
        /**
         * <p>The number of retries that are allowed for a request.</p>
         */
        @NameInMap("Attempts")
        public Integer attempts;

        /**
         * <p>The timeout period for each retry.</p>
         */
        @NameInMap("PerTryTimeout")
        public String perTryTimeout;

        /**
         * <p>The condition for retries. Example: `connect-failure,refused-stream,503`.</p>
         */
        @NameInMap("RetryOn")
        public String retryOn;

        /**
         * <p>Specifies whether to allow retries to other localities.</p>
         */
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
        /**
         * <p>The value to be used to overwrite the value of the Authority or Host header.</p>
         */
        @NameInMap("Authority")
        public String authority;

        /**
         * <p>The value to be used to overwrite the path or prefix of the URI.</p>
         */
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
        /**
         * <p>The virtual service that defines traffic routing.</p>
         */
        @NameInMap("Delegate")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate delegate;

        /**
         * <p>The configurations of fault injection.</p>
         */
        @NameInMap("Fault")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault fault;

        /**
         * <p>The HTTP redirection rule.</p>
         */
        @NameInMap("HTTPRedirect")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect HTTPRedirect;

        /**
         * <p>The configurations for mirroring HTTP traffic to another destination in addition to forwarding requests to the specified destination.</p>
         */
        @NameInMap("Mirror")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror mirror;

        /**
         * <p>The percentage of requests that are mirrored to another destination except for the original destination.</p>
         */
        @NameInMap("MirrorPercentage")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage mirrorPercentage;

        /**
         * <p>The configurations of retries for failed requests.</p>
         */
        @NameInMap("Retries")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries retries;

        /**
         * <p>The configurations for rewriting the virtual service.</p>
         */
        @NameInMap("Rewrite")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite rewrite;

        /**
         * <p>The timeout period for requests.</p>
         */
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
        /**
         * <p>The header value to be matched.</p>
         */
        @NameInMap("MatchingContent")
        public String matchingContent;

        /**
         * <p>The matching mode for the header value. Valid values:</p>
         * <br>
         * <p>*   `exact`: exact match</p>
         * <p>*   `prefix`: match by prefix</p>
         * <p>*   `regex`: match by regular expression</p>
         */
        @NameInMap("MatchingMode")
        public String matchingMode;

        /**
         * <p>The header key to be matched.</p>
         */
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
        /**
         * <p>The Server Name Indication (SNI) values to be matched.</p>
         */
        @NameInMap("SNIHosts")
        public java.util.List<String> SNIHosts;

        /**
         * <p>The TLS port.</p>
         */
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
        /**
         * <p>The content to be matched.</p>
         */
        @NameInMap("MatchingContent")
        public String matchingContent;

        /**
         * <p>The matching mode for the routing rule. Valid values:</p>
         * <br>
         * <p>*   `exact`: exact match</p>
         * <p>*   `prefix`: match by prefix</p>
         * <p>*   `regex`: match by regular expression</p>
         */
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
        /**
         * <p>The request headers to be matched.</p>
         */
        @NameInMap("Headers")
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> headers;

        /**
         * <p>The ports.</p>
         */
        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        /**
         * <p>The matching rule for Transport Layer Security (TLS) traffic.</p>
         */
        @NameInMap("TLSMatchAttributes")
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> TLSMatchAttributes;

        /**
         * <p>The matching rule for URIs.</p>
         */
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

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort extends TeaModel {
        /**
         * <p>The port number.</p>
         */
        @NameInMap("Number")
        public Integer number;

        public static UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort self = new UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

    }

    public static class UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination extends TeaModel {
        /**
         * <p>The name of the service defined in the service registry.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port of the destination service.</p>
         * <br>
         * <p>>  If the destination service of the route has only one port, this field can be left empty. If the destination service has multiple ports, you must specify the port number.</p>
         */
        @NameInMap("Port")
        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort port;

        /**
         * <p>The name of the service subset.</p>
         */
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

        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination setPort(UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort port) {
            this.port = port;
            return this;
        }
        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort getPort() {
            return this.port;
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
        /**
         * <p>The unique endpoint of the destination service to which the specified requests are sent.</p>
         */
        @NameInMap("Destination")
        public UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination destination;

        /**
         * <p>The weight of the service subset.</p>
         */
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
        /**
         * <p>The list of requested domain names.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The advanced settings for routing HTTP traffic.</p>
         */
        @NameInMap("HTTPAdvancedOptions")
        public UpdateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions HTTPAdvancedOptions;

        /**
         * <p>The matching rules for traffic routing.</p>
         */
        @NameInMap("MatchRequest")
        public UpdateIstioGatewayRoutesRequestGatewayRouteMatchRequest matchRequest;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The original YAML file of the virtual service that is serialized in a JSON string.</p>
         */
        @NameInMap("RawVSRoute")
        public Object rawVSRoute;

        /**
         * <p>The endpoints of destination services for Layer 4 weighted routing.</p>
         */
        @NameInMap("RouteDestinations")
        public java.util.List<UpdateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> routeDestinations;

        /**
         * <p>The name of the routing rule.</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The type of the traffic to be routed. Valid values: `HTTP`, `TLS`, and `TCP`.</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        public static UpdateIstioGatewayRoutesRequestGatewayRoute build(java.util.Map<String, ?> map) throws Exception {
            UpdateIstioGatewayRoutesRequestGatewayRoute self = new UpdateIstioGatewayRoutesRequestGatewayRoute();
            return TeaModel.build(map, self);
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
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

        public UpdateIstioGatewayRoutesRequestGatewayRoute setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateIstioGatewayRoutesRequestGatewayRoute setRawVSRoute(Object rawVSRoute) {
            this.rawVSRoute = rawVSRoute;
            return this;
        }
        public Object getRawVSRoute() {
            return this.rawVSRoute;
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
