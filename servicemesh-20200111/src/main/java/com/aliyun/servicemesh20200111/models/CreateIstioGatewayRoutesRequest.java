// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateIstioGatewayRoutesRequest extends TeaModel {
    /**
     * <p>The description of the routing rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the routing rule to be created for the ASM gateway.</p>
     */
    @NameInMap("GatewayRoute")
    public CreateIstioGatewayRoutesRequestGatewayRoute gatewayRoute;

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
        /**
         * <p>The percentage of requests that are aborted with the specified error code, which is expressed as a decimal.</p>
         */
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
        /**
         * <p>The HTTP status code.</p>
         */
        @NameInMap("HttpStatus")
        public Integer httpStatus;

        /**
         * <p>The percentage of requests that are aborted with the specified error code.</p>
         */
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
        /**
         * <p>The percentage of requests to which the delay fault is injected, which is expressed as a decimal.</p>
         */
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
        /**
         * <p>The fixed duration for request delay.</p>
         */
        @NameInMap("FixedDelay")
        public String fixedDelay;

        /**
         * <p>The percentage of requests to which the delay fault is injected.</p>
         */
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
        /**
         * <p>The configurations for aborting requests with specified error codes.</p>
         */
        @NameInMap("Abort")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFaultAbort abort;

        /**
         * <p>The duration to delay a request.</p>
         */
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
        /**
         * <p>The value to be used to overwrite the value of the Authority or Host header during redirection.``</p>
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
        /**
         * <p>The percentage of requests that are mirrored to another destination except for the original destination, which is expressed as a decimal.</p>
         */
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
        /**
         * <p>The number of retries allowed for a request.</p>
         */
        @NameInMap("Attempts")
        public Integer attempts;

        /**
         * <p>The timeout period for each retry. Example: `5s`.</p>
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
        /**
         * <p>The virtual service that defines traffic routing.</p>
         */
        @NameInMap("Delegate")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsDelegate delegate;

        /**
         * <p>The configurations of fault injection.</p>
         */
        @NameInMap("Fault")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsFault fault;

        /**
         * <p>The HTTP redirect rule.</p>
         */
        @NameInMap("HTTPRedirect")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsHTTPRedirect HTTPRedirect;

        /**
         * <p>The configurations for mirroring HTTP traffic to another destination in addition to forwarding requests to the specified destination.</p>
         */
        @NameInMap("Mirror")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirror mirror;

        /**
         * <p>The percentage of requests that are mirrored to another destination except for the original destination.</p>
         */
        @NameInMap("MirrorPercentage")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsMirrorPercentage mirrorPercentage;

        /**
         * <p>The configurations of retries for failed requests.</p>
         */
        @NameInMap("Retries")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRetries retries;

        /**
         * <p>The configurations for rewriting the virtual service.</p>
         */
        @NameInMap("Rewrite")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptionsRewrite rewrite;

        /**
         * <p>The timeout period for requests.</p>
         */
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
        /**
         * <p>The request headers to be matched.</p>
         */
        @NameInMap("Headers")
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestHeaders> headers;

        /**
         * <p>The ports of destination services for Layer 4 weighted routing.</p>
         */
        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        /**
         * <p>The matching rule for Transport Layer Security (TLS) traffic.</p>
         */
        @NameInMap("TLSMatchAttributes")
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteMatchRequestTLSMatchAttributes> TLSMatchAttributes;

        /**
         * <p>The matching rule for URIs.</p>
         */
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

    public static class CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort extends TeaModel {
        @NameInMap("Number")
        public Integer number;

        public static CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort self = new CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

    }

    public static class CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination extends TeaModel {
        /**
         * <p>The name of the service defined in the service registry.</p>
         */
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort port;

        /**
         * <p>The name of the service subset.</p>
         */
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

        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination setPort(CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort port) {
            this.port = port;
            return this;
        }
        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestinationPort getPort() {
            return this.port;
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
        /**
         * <p>The unique endpoint of the destination service to which the specified requests are sent.</p>
         */
        @NameInMap("Destination")
        public CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinationsDestination destination;

        /**
         * <p>The weight of the service subset.</p>
         */
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
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The advanced settings for routing HTTP traffic.</p>
         */
        @NameInMap("HTTPAdvancedOptions")
        public CreateIstioGatewayRoutesRequestGatewayRouteHTTPAdvancedOptions HTTPAdvancedOptions;

        /**
         * <p>The matching rules for traffic routing.</p>
         */
        @NameInMap("MatchRequest")
        public CreateIstioGatewayRoutesRequestGatewayRouteMatchRequest matchRequest;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RawVSRoute")
        public Object rawVSRoute;

        /**
         * <p>The endpoints of destination services for Layer 4 weighted routing.</p>
         */
        @NameInMap("RouteDestinations")
        public java.util.List<CreateIstioGatewayRoutesRequestGatewayRouteRouteDestinations> routeDestinations;

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

        public static CreateIstioGatewayRoutesRequestGatewayRoute build(java.util.Map<String, ?> map) throws Exception {
            CreateIstioGatewayRoutesRequestGatewayRoute self = new CreateIstioGatewayRoutesRequestGatewayRoute();
            return TeaModel.build(map, self);
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
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

        public CreateIstioGatewayRoutesRequestGatewayRoute setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateIstioGatewayRoutesRequestGatewayRoute setRawVSRoute(Object rawVSRoute) {
            this.rawVSRoute = rawVSRoute;
            return this;
        }
        public Object getRawVSRoute() {
            return this.rawVSRoute;
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
