// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateModelApiResponseBody extends TeaModel {
    /**
     * <p>The model category.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-09T06:43:33Z</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-09T06:43:33Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The invocation endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://model-api.example.com/v1/chat/completions">https://model-api.example.com/v1/chat/completions</a></p>
     */
    @NameInMap("InvokeEndpoint")
    public String invokeEndpoint;

    /**
     * <p>The model API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-xxxxxx</p>
     */
    @NameInMap("ModelApiId")
    public String modelApiId;

    /**
     * <p>The saved model name mappings, returned as a JSON array string. This parameter is empty if no mappings are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Source&quot;:&quot;client-model-a&quot;,&quot;Target&quot;:&quot;upstream-model-a&quot;}]</p>
     */
    @NameInMap("ModelMappings")
    public String modelMappings;

    /**
     * <p>The name of the model API.</p>
     * 
     * <strong>example:</strong>
     * <p>jev-chat-api</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The invocation path prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>/jev/v1</p>
     */
    @NameInMap("PathPrefix")
    public String pathPrefix;

    /**
     * <p>The access protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>openai-chat</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The saved routing rules, returned as a JSON string. A byte-by-byte exact echo is not guaranteed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RuleName&quot;:&quot;default&quot;,&quot;Providers&quot;:[{&quot;ModelServiceName&quot;:&quot;model-service-a&quot;,&quot;ModelList&quot;:&quot;[\&quot;deepseek-v4-pro\&quot;]&quot;,&quot;Weight&quot;:100}]}]</p>
     */
    @NameInMap("RouteRules")
    public String routeRules;

    /**
     * <p>The status of the model API.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateModelApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelApiResponseBody self = new CreateModelApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelApiResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateModelApiResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public CreateModelApiResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateModelApiResponseBody setInvokeEndpoint(String invokeEndpoint) {
        this.invokeEndpoint = invokeEndpoint;
        return this;
    }
    public String getInvokeEndpoint() {
        return this.invokeEndpoint;
    }

    public CreateModelApiResponseBody setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

    public CreateModelApiResponseBody setModelMappings(String modelMappings) {
        this.modelMappings = modelMappings;
        return this;
    }
    public String getModelMappings() {
        return this.modelMappings;
    }

    public CreateModelApiResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelApiResponseBody setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public CreateModelApiResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateModelApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelApiResponseBody setRouteRules(String routeRules) {
        this.routeRules = routeRules;
        return this;
    }
    public String getRouteRules() {
        return this.routeRules;
    }

    public CreateModelApiResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
