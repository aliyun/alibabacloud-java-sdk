// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    @NameInMap("content")
    public CreateModelRequestContent content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public String dryRun;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setContent(CreateModelRequestContent content) {
        this.content = content;
        return this;
    }
    public CreateModelRequestContent getContent() {
        return this.content;
    }

    public CreateModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public static class CreateModelRequestContentRequestHeader extends TeaModel {
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

        public static CreateModelRequestContentRequestHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentRequestHeader self = new CreateModelRequestContentRequestHeader();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentRequestHeader setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public CreateModelRequestContentRequestHeader setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class CreateModelRequestContentRequestParametersBuild extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>query</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static CreateModelRequestContentRequestParametersBuild build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentRequestParametersBuild self = new CreateModelRequestContentRequestParametersBuild();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentRequestParametersBuild setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class CreateModelRequestContentRequestParametersSearch extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static CreateModelRequestContentRequestParametersSearch build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentRequestParametersSearch self = new CreateModelRequestContentRequestParametersSearch();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentRequestParametersSearch setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class CreateModelRequestContentRequestParameters extends TeaModel {
        @NameInMap("build")
        public CreateModelRequestContentRequestParametersBuild build;

        @NameInMap("search")
        public CreateModelRequestContentRequestParametersSearch search;

        public static CreateModelRequestContentRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentRequestParameters self = new CreateModelRequestContentRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentRequestParameters setBuild(CreateModelRequestContentRequestParametersBuild build) {
            this.build = build;
            return this;
        }
        public CreateModelRequestContentRequestParametersBuild getBuild() {
            return this.build;
        }

        public CreateModelRequestContentRequestParameters setSearch(CreateModelRequestContentRequestParametersSearch search) {
            this.search = search;
            return this;
        }
        public CreateModelRequestContentRequestParametersSearch getSearch() {
            return this.search;
        }

    }

    public static class CreateModelRequestContentRequestUrlParams extends TeaModel {
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

        public static CreateModelRequestContentRequestUrlParams build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentRequestUrlParams self = new CreateModelRequestContentRequestUrlParams();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentRequestUrlParams setBuild(java.util.Map<String, ?> build) {
            this.build = build;
            return this;
        }
        public java.util.Map<String, ?> getBuild() {
            return this.build;
        }

        public CreateModelRequestContentRequestUrlParams setSearch(java.util.Map<String, ?> search) {
            this.search = search;
            return this;
        }
        public java.util.Map<String, ?> getSearch() {
            return this.search;
        }

    }

    public static class CreateModelRequestContentRequest extends TeaModel {
        @NameInMap("header")
        public CreateModelRequestContentRequestHeader header;

        @NameInMap("parameters")
        public CreateModelRequestContentRequestParameters parameters;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;input\&quot;: [\&quot;%{input}\&quot;], \&quot;input_type\&quot;: \&quot;%{input_type}\&quot;}</p>
         */
        @NameInMap("requestBody")
        public String requestBody;

        @NameInMap("urlParams")
        public CreateModelRequestContentRequestUrlParams urlParams;

        public static CreateModelRequestContentRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentRequest self = new CreateModelRequestContentRequest();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentRequest setHeader(CreateModelRequestContentRequestHeader header) {
            this.header = header;
            return this;
        }
        public CreateModelRequestContentRequestHeader getHeader() {
            return this.header;
        }

        public CreateModelRequestContentRequest setParameters(CreateModelRequestContentRequestParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public CreateModelRequestContentRequestParameters getParameters() {
            return this.parameters;
        }

        public CreateModelRequestContentRequest setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public CreateModelRequestContentRequest setUrlParams(CreateModelRequestContentRequestUrlParams urlParams) {
            this.urlParams = urlParams;
            return this;
        }
        public CreateModelRequestContentRequestUrlParams getUrlParams() {
            return this.urlParams;
        }

    }

    public static class CreateModelRequestContentResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>$.result.embeddings[*].embedding</p>
         */
        @NameInMap("embeddings")
        public String embeddings;

        public static CreateModelRequestContentResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContentResponse self = new CreateModelRequestContentResponse();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContentResponse setEmbeddings(String embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public String getEmbeddings() {
            return this.embeddings;
        }

    }

    public static class CreateModelRequestContent extends TeaModel {
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
        public CreateModelRequestContentRequest request;

        @NameInMap("response")
        public CreateModelRequestContentResponse response;

        /**
         * <strong>example:</strong>
         * <p>http://***.platform-cn-shanghai.opensearch.aliyuncs.com/v3/openapi/workspaces/default/text-embedding/ops-text-embedding-001</p>
         */
        @NameInMap("url")
        public String url;

        public static CreateModelRequestContent build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestContent self = new CreateModelRequestContent();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestContent setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public CreateModelRequestContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateModelRequestContent setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public CreateModelRequestContent setRequest(CreateModelRequestContentRequest request) {
            this.request = request;
            return this;
        }
        public CreateModelRequestContentRequest getRequest() {
            return this.request;
        }

        public CreateModelRequestContent setResponse(CreateModelRequestContentResponse response) {
            this.response = response;
            return this;
        }
        public CreateModelRequestContentResponse getResponse() {
            return this.response;
        }

        public CreateModelRequestContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
