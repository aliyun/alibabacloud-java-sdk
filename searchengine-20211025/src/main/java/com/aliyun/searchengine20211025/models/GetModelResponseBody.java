// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetModelResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38b079f1-7846-4226-8c90-3e2644b5c52b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The model configuration.</p>
     */
    @NameInMap("result")
    public GetModelResponseBodyResult result;

    public static GetModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelResponseBody self = new GetModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelResponseBody setResult(GetModelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetModelResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetModelResponseBodyResultContentRequestHeader extends TeaModel {
        /**
         * <p>Authentication information. The format is Bearer access_token.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer OS-v0********6vvs</p>
         */
        @NameInMap("Authorization")
        public String authorization;

        /**
         * <p>The HTTP request\&quot;s content type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("Content-Type")
        public String contentType;

        public static GetModelResponseBodyResultContentRequestHeader build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentRequestHeader self = new GetModelResponseBodyResultContentRequestHeader();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentRequestHeader setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public GetModelResponseBodyResultContentRequestHeader setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class GetModelResponseBodyResultContentRequestParametersBuild extends TeaModel {
        /**
         * <p>The input type.</p>
         * 
         * <strong>example:</strong>
         * <p>query</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static GetModelResponseBodyResultContentRequestParametersBuild build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentRequestParametersBuild self = new GetModelResponseBodyResultContentRequestParametersBuild();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentRequestParametersBuild setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class GetModelResponseBodyResultContentRequestParametersSearch extends TeaModel {
        /**
         * <p>The input type.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static GetModelResponseBodyResultContentRequestParametersSearch build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentRequestParametersSearch self = new GetModelResponseBodyResultContentRequestParametersSearch();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentRequestParametersSearch setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class GetModelResponseBodyResultContentRequestParameters extends TeaModel {
        /**
         * <p>Parameters for the index building phase.</p>
         */
        @NameInMap("build")
        public GetModelResponseBodyResultContentRequestParametersBuild build;

        /**
         * <p>Parameters for the query phase.</p>
         */
        @NameInMap("search")
        public GetModelResponseBodyResultContentRequestParametersSearch search;

        public static GetModelResponseBodyResultContentRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentRequestParameters self = new GetModelResponseBodyResultContentRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentRequestParameters setBuild(GetModelResponseBodyResultContentRequestParametersBuild build) {
            this.build = build;
            return this;
        }
        public GetModelResponseBodyResultContentRequestParametersBuild getBuild() {
            return this.build;
        }

        public GetModelResponseBodyResultContentRequestParameters setSearch(GetModelResponseBodyResultContentRequestParametersSearch search) {
            this.search = search;
            return this;
        }
        public GetModelResponseBodyResultContentRequestParametersSearch getSearch() {
            return this.search;
        }

    }

    public static class GetModelResponseBodyResultContentRequestUrlParams extends TeaModel {
        /**
         * <p>Parameters passed during index building.</p>
         * 
         * <strong>example:</strong>
         * <p>key: value</p>
         */
        @NameInMap("build")
        public java.util.Map<String, ?> build;

        /**
         * <p>Parameters passed during a query.</p>
         * 
         * <strong>example:</strong>
         * <p>key: value</p>
         */
        @NameInMap("search")
        public java.util.Map<String, ?> search;

        public static GetModelResponseBodyResultContentRequestUrlParams build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentRequestUrlParams self = new GetModelResponseBodyResultContentRequestUrlParams();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentRequestUrlParams setBuild(java.util.Map<String, ?> build) {
            this.build = build;
            return this;
        }
        public java.util.Map<String, ?> getBuild() {
            return this.build;
        }

        public GetModelResponseBodyResultContentRequestUrlParams setSearch(java.util.Map<String, ?> search) {
            this.search = search;
            return this;
        }
        public java.util.Map<String, ?> getSearch() {
            return this.search;
        }

    }

    public static class GetModelResponseBodyResultContentRequest extends TeaModel {
        /**
         * <p>The HTTP request header.</p>
         */
        @NameInMap("header")
        public GetModelResponseBodyResultContentRequestHeader header;

        /**
         * <p>Define parameters here if they differ between the build and search phases.</p>
         */
        @NameInMap("parameters")
        public GetModelResponseBodyResultContentRequestParameters parameters;

        /**
         * <p>The request body\&quot;s template string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;input\&quot;: [\&quot;%{input}\&quot;], \&quot;input_type\&quot;: \&quot;%{input_type}\&quot;}</p>
         */
        @NameInMap("requestBody")
        public String requestBody;

        /**
         * <p>URL parameters. Some model services require you to pass parameters in the URL.</p>
         */
        @NameInMap("urlParams")
        public GetModelResponseBodyResultContentRequestUrlParams urlParams;

        public static GetModelResponseBodyResultContentRequest build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentRequest self = new GetModelResponseBodyResultContentRequest();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentRequest setHeader(GetModelResponseBodyResultContentRequestHeader header) {
            this.header = header;
            return this;
        }
        public GetModelResponseBodyResultContentRequestHeader getHeader() {
            return this.header;
        }

        public GetModelResponseBodyResultContentRequest setParameters(GetModelResponseBodyResultContentRequestParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public GetModelResponseBodyResultContentRequestParameters getParameters() {
            return this.parameters;
        }

        public GetModelResponseBodyResultContentRequest setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public GetModelResponseBodyResultContentRequest setUrlParams(GetModelResponseBodyResultContentRequestUrlParams urlParams) {
            this.urlParams = urlParams;
            return this;
        }
        public GetModelResponseBodyResultContentRequestUrlParams getUrlParams() {
            return this.urlParams;
        }

    }

    public static class GetModelResponseBodyResultContentResponse extends TeaModel {
        /**
         * <p>The method to parse the result. This is described in JSONPath format.</p>
         * 
         * <strong>example:</strong>
         * <p>$.result.embeddings[*].embedding</p>
         */
        @NameInMap("embeddings")
        public String embeddings;

        public static GetModelResponseBodyResultContentResponse build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContentResponse self = new GetModelResponseBodyResultContentResponse();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContentResponse setEmbeddings(String embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public String getEmbeddings() {
            return this.embeddings;
        }

    }

    public static class GetModelResponseBodyResultContent extends TeaModel {
        /**
         * <p>The HTTP method to access the model service. PUT and POST are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model type.</p>
         * <ul>
         * <li><p>a. Text embedding: text_embedding</p>
         * </li>
         * <li><p>b. Text sparse embedding: text_sparse_embedding</p>
         * </li>
         * <li><p>c. Image embedding: image_embedding</p>
         * </li>
         * <li><p>d. Image content analysis: image_analyze</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The request configuration.</p>
         */
        @NameInMap("request")
        public GetModelResponseBodyResultContentRequest request;

        /**
         * <p>The method to parse the result. This is described in JSONPath format.</p>
         */
        @NameInMap("response")
        public GetModelResponseBodyResultContentResponse response;

        /**
         * <p>The model service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.platform-cn-shanghai.opensearch.aliyuncs.com/v3/openapi/workspaces/default/text-embedding/ops-text-embedding-001</p>
         */
        @NameInMap("url")
        public String url;

        public static GetModelResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResultContent self = new GetModelResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResultContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetModelResponseBodyResultContent setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetModelResponseBodyResultContent setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetModelResponseBodyResultContent setRequest(GetModelResponseBodyResultContentRequest request) {
            this.request = request;
            return this;
        }
        public GetModelResponseBodyResultContentRequest getRequest() {
            return this.request;
        }

        public GetModelResponseBodyResultContent setResponse(GetModelResponseBodyResultContentResponse response) {
            this.response = response;
            return this;
        }
        public GetModelResponseBodyResultContentResponse getResponse() {
            return this.response;
        }

        public GetModelResponseBodyResultContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetModelResponseBodyResult extends TeaModel {
        /**
         * <p>The model configuration.</p>
         */
        @NameInMap("content")
        public GetModelResponseBodyResultContent content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The model dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("dimension")
        public Integer dimension;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The model status.</p>
         * <ul>
         * <li><p>ok: Normal</p>
         * </li>
         * <li><p>error: Abnormal</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The model type.</p>
         * <ul>
         * <li><p>a. Text embedding: text_embedding</p>
         * </li>
         * <li><p>b. Text sparse embedding: text_sparse_embedding</p>
         * </li>
         * <li><p>c. Image embedding: image_embedding</p>
         * </li>
         * <li><p>d. Image content analysis: image_analyze</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The model\&quot;s access URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.platform-cn-shanghai.opensearch.aliyuncs.com/v3/openapi/workspaces/default/text-embedding/ops-text-embedding-001</p>
         */
        @NameInMap("url")
        public String url;

        public static GetModelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetModelResponseBodyResult self = new GetModelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetModelResponseBodyResult setContent(GetModelResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public GetModelResponseBodyResultContent getContent() {
            return this.content;
        }

        public GetModelResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModelResponseBodyResult setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public GetModelResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModelResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetModelResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetModelResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetModelResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
