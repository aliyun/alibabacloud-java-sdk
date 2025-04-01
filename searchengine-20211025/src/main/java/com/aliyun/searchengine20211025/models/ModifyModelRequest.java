// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyModelRequest extends TeaModel {
    @NameInMap("content")
    public ModifyModelRequestContent content;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public String dryRun;

    public static ModifyModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelRequest self = new ModifyModelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyModelRequest setContent(ModifyModelRequestContent content) {
        this.content = content;
        return this;
    }
    public ModifyModelRequestContent getContent() {
        return this.content;
    }

    public ModifyModelRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyModelRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public static class ModifyModelRequestContentRequestHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Bearer OS-v0********6vvs</p>
         */
        @NameInMap("Authorization")
        public String authorization;

        /**
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("Content-Type")
        public String contentType;

        public static ModifyModelRequestContentRequestHeader build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentRequestHeader self = new ModifyModelRequestContentRequestHeader();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentRequestHeader setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public ModifyModelRequestContentRequestHeader setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class ModifyModelRequestContentRequestParametersBuild extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>query</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static ModifyModelRequestContentRequestParametersBuild build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentRequestParametersBuild self = new ModifyModelRequestContentRequestParametersBuild();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentRequestParametersBuild setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class ModifyModelRequestContentRequestParametersSearch extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static ModifyModelRequestContentRequestParametersSearch build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentRequestParametersSearch self = new ModifyModelRequestContentRequestParametersSearch();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentRequestParametersSearch setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class ModifyModelRequestContentRequestParameters extends TeaModel {
        @NameInMap("build")
        public ModifyModelRequestContentRequestParametersBuild build;

        @NameInMap("search")
        public ModifyModelRequestContentRequestParametersSearch search;

        public static ModifyModelRequestContentRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentRequestParameters self = new ModifyModelRequestContentRequestParameters();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentRequestParameters setBuild(ModifyModelRequestContentRequestParametersBuild build) {
            this.build = build;
            return this;
        }
        public ModifyModelRequestContentRequestParametersBuild getBuild() {
            return this.build;
        }

        public ModifyModelRequestContentRequestParameters setSearch(ModifyModelRequestContentRequestParametersSearch search) {
            this.search = search;
            return this;
        }
        public ModifyModelRequestContentRequestParametersSearch getSearch() {
            return this.search;
        }

    }

    public static class ModifyModelRequestContentRequestUrlParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key: value</p>
         */
        @NameInMap("build")
        public java.util.Map<String, ?> build;

        /**
         * <strong>example:</strong>
         * <p>key: value</p>
         */
        @NameInMap("search")
        public java.util.Map<String, ?> search;

        public static ModifyModelRequestContentRequestUrlParams build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentRequestUrlParams self = new ModifyModelRequestContentRequestUrlParams();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentRequestUrlParams setBuild(java.util.Map<String, ?> build) {
            this.build = build;
            return this;
        }
        public java.util.Map<String, ?> getBuild() {
            return this.build;
        }

        public ModifyModelRequestContentRequestUrlParams setSearch(java.util.Map<String, ?> search) {
            this.search = search;
            return this;
        }
        public java.util.Map<String, ?> getSearch() {
            return this.search;
        }

    }

    public static class ModifyModelRequestContentRequest extends TeaModel {
        @NameInMap("header")
        public ModifyModelRequestContentRequestHeader header;

        @NameInMap("parameters")
        public ModifyModelRequestContentRequestParameters parameters;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;input\&quot;: [\&quot;%{input}\&quot;], \&quot;input_type\&quot;: \&quot;%{input_type}\&quot;}</p>
         */
        @NameInMap("requestBody")
        public String requestBody;

        @NameInMap("urlParams")
        public ModifyModelRequestContentRequestUrlParams urlParams;

        public static ModifyModelRequestContentRequest build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentRequest self = new ModifyModelRequestContentRequest();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentRequest setHeader(ModifyModelRequestContentRequestHeader header) {
            this.header = header;
            return this;
        }
        public ModifyModelRequestContentRequestHeader getHeader() {
            return this.header;
        }

        public ModifyModelRequestContentRequest setParameters(ModifyModelRequestContentRequestParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public ModifyModelRequestContentRequestParameters getParameters() {
            return this.parameters;
        }

        public ModifyModelRequestContentRequest setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public ModifyModelRequestContentRequest setUrlParams(ModifyModelRequestContentRequestUrlParams urlParams) {
            this.urlParams = urlParams;
            return this;
        }
        public ModifyModelRequestContentRequestUrlParams getUrlParams() {
            return this.urlParams;
        }

    }

    public static class ModifyModelRequestContentResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>$.result.embeddings[*].embedding</p>
         */
        @NameInMap("embeddings")
        public String embeddings;

        public static ModifyModelRequestContentResponse build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContentResponse self = new ModifyModelRequestContentResponse();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContentResponse setEmbeddings(String embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public String getEmbeddings() {
            return this.embeddings;
        }

    }

    public static class ModifyModelRequestContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("dimension")
        public Integer dimension;

        /**
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("modelType")
        public String modelType;

        @NameInMap("request")
        public ModifyModelRequestContentRequest request;

        @NameInMap("response")
        public ModifyModelRequestContentResponse response;

        /**
         * <strong>example:</strong>
         * <p>http://***.platform-cn-shanghai.opensearch.aliyuncs.com/v3/openapi/workspaces/default/text-embedding/ops-text-embedding-001</p>
         */
        @NameInMap("url")
        public String url;

        public static ModifyModelRequestContent build(java.util.Map<String, ?> map) throws Exception {
            ModifyModelRequestContent self = new ModifyModelRequestContent();
            return TeaModel.build(map, self);
        }

        public ModifyModelRequestContent setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public ModifyModelRequestContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ModifyModelRequestContent setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ModifyModelRequestContent setRequest(ModifyModelRequestContentRequest request) {
            this.request = request;
            return this;
        }
        public ModifyModelRequestContentRequest getRequest() {
            return this.request;
        }

        public ModifyModelRequestContent setResponse(ModifyModelRequestContentResponse response) {
            this.response = response;
            return this;
        }
        public ModifyModelRequestContentResponse getResponse() {
            return this.response;
        }

        public ModifyModelRequestContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
