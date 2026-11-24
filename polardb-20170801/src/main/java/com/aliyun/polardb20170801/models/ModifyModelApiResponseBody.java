// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyModelApiResponseBody extends TeaModel {
    /**
     * <p>The category of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The time when the model API was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-09T06:43:33Z</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The time when the model API was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-09T06:43:33Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The ID of the model API.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-xxxxx</p>
     */
    @NameInMap("ModelApiId")
    public String modelApiId;

    /**
     * <p>The current model name mappings, returned as a JSON array string. This parameter is empty if no mappings are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Source&quot;:&quot;client-model-a&quot;,&quot;Target&quot;:&quot;upstream-model-a&quot;}]</p>
     */
    @NameInMap("ModelMappings")
    public String modelMappings;

    /**
     * <p>The current intelligent routing candidate list, returned as a JSON object string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AllowedModels&quot;:[&quot;deepseek-v4-pro&quot;,&quot;glm-5.3&quot;,&quot;glm-5.3-flash&quot;]}</p>
     */
    @NameInMap("ModelRouting")
    public String modelRouting;

    /**
     * <p>The updated name of the model API.</p>
     * 
     * <strong>example:</strong>
     * <p>jev-chat-api</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The API path prefix.</p>
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
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current routing rules, returned as a JSON string. A byte-for-byte exact match of the input is not guaranteed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RuleName&quot;:&quot;default&quot;,&quot;Providers&quot;:[{&quot;ModelServiceName&quot;:&quot;model-service-a&quot;,&quot;ModelList&quot;:&quot;[\\&quot;deepseek-v4-pro\\&quot;]&quot;,&quot;Weight&quot;:100}]}]</p>
     */
    @NameInMap("RouteRules")
    public String routeRules;

    /**
     * <p>The status of the model API.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyModelApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelApiResponseBody self = new ModifyModelApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyModelApiResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyModelApiResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public ModifyModelApiResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ModifyModelApiResponseBody setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

    public ModifyModelApiResponseBody setModelMappings(String modelMappings) {
        this.modelMappings = modelMappings;
        return this;
    }
    public String getModelMappings() {
        return this.modelMappings;
    }

    public ModifyModelApiResponseBody setModelRouting(String modelRouting) {
        this.modelRouting = modelRouting;
        return this;
    }
    public String getModelRouting() {
        return this.modelRouting;
    }

    public ModifyModelApiResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyModelApiResponseBody setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public ModifyModelApiResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ModifyModelApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyModelApiResponseBody setRouteRules(String routeRules) {
        this.routeRules = routeRules;
        return this;
    }
    public String getRouteRules() {
        return this.routeRules;
    }

    public ModifyModelApiResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
