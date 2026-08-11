// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38b079f1-7846-4226-8c90-3e2644b5c52b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The model list. For more information, see Model.</p>
     */
    @NameInMap("result")
    public java.util.List<ListModelsResponseBodyResult> result;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponseBody self = new ListModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelsResponseBody setResult(java.util.List<ListModelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListModelsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelsResponseBodyResultContentRequestHeader extends TeaModel {
        /**
         * <p>The authentication information. Format: Bearer access_token.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer OS-v0********6vvs</p>
         */
        @NameInMap("Authorization")
        public String authorization;

        /**
         * <p>The HTTP request content type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("Content-Type")
        public String contentType;

        public static ListModelsResponseBodyResultContentRequestHeader build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentRequestHeader self = new ListModelsResponseBodyResultContentRequestHeader();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentRequestHeader setAuthorization(String authorization) {
            this.authorization = authorization;
            return this;
        }
        public String getAuthorization() {
            return this.authorization;
        }

        public ListModelsResponseBodyResultContentRequestHeader setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class ListModelsResponseBodyResultContentRequestParametersBuild extends TeaModel {
        /**
         * <p>The input type.</p>
         * 
         * <strong>example:</strong>
         * <p>query</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static ListModelsResponseBodyResultContentRequestParametersBuild build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentRequestParametersBuild self = new ListModelsResponseBodyResultContentRequestParametersBuild();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentRequestParametersBuild setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class ListModelsResponseBodyResultContentRequestParametersSearch extends TeaModel {
        /**
         * <p>The input type.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("input_type")
        public String inputType;

        public static ListModelsResponseBodyResultContentRequestParametersSearch build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentRequestParametersSearch self = new ListModelsResponseBodyResultContentRequestParametersSearch();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentRequestParametersSearch setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

    }

    public static class ListModelsResponseBodyResultContentRequestParameters extends TeaModel {
        /**
         * <p>The parameters for the index building phase.</p>
         */
        @NameInMap("build")
        public ListModelsResponseBodyResultContentRequestParametersBuild build;

        /**
         * <p>The parameters for the query phase.</p>
         */
        @NameInMap("search")
        public ListModelsResponseBodyResultContentRequestParametersSearch search;

        public static ListModelsResponseBodyResultContentRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentRequestParameters self = new ListModelsResponseBodyResultContentRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentRequestParameters setBuild(ListModelsResponseBodyResultContentRequestParametersBuild build) {
            this.build = build;
            return this;
        }
        public ListModelsResponseBodyResultContentRequestParametersBuild getBuild() {
            return this.build;
        }

        public ListModelsResponseBodyResultContentRequestParameters setSearch(ListModelsResponseBodyResultContentRequestParametersSearch search) {
            this.search = search;
            return this;
        }
        public ListModelsResponseBodyResultContentRequestParametersSearch getSearch() {
            return this.search;
        }

    }

    public static class ListModelsResponseBodyResultContentRequestUrlParams extends TeaModel {
        /**
         * <p>The parameters passed during index building.</p>
         * 
         * <strong>example:</strong>
         * <p>key: value</p>
         */
        @NameInMap("build")
        public java.util.Map<String, ?> build;

        /**
         * <p>The parameters passed during queries.</p>
         * 
         * <strong>example:</strong>
         * <p>key: value</p>
         */
        @NameInMap("search")
        public java.util.Map<String, ?> search;

        public static ListModelsResponseBodyResultContentRequestUrlParams build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentRequestUrlParams self = new ListModelsResponseBodyResultContentRequestUrlParams();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentRequestUrlParams setBuild(java.util.Map<String, ?> build) {
            this.build = build;
            return this;
        }
        public java.util.Map<String, ?> getBuild() {
            return this.build;
        }

        public ListModelsResponseBodyResultContentRequestUrlParams setSearch(java.util.Map<String, ?> search) {
            this.search = search;
            return this;
        }
        public java.util.Map<String, ?> getSearch() {
            return this.search;
        }

    }

    public static class ListModelsResponseBodyResultContentRequest extends TeaModel {
        /**
         * <p>The HTTP header for accessing the model service.</p>
         */
        @NameInMap("header")
        public ListModelsResponseBodyResultContentRequestHeader header;

        /**
         * <p>The parameters that need to be differentiated between the build and search phases in the body. Define them in this parameter.</p>
         */
        @NameInMap("parameters")
        public ListModelsResponseBodyResultContentRequestParameters parameters;

        /**
         * <p>The template string of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;input\&quot;: [\&quot;%{input}\&quot;], \&quot;input_type\&quot;: \&quot;%{input_type}\&quot;}</p>
         */
        @NameInMap("requestBody")
        public String requestBody;

        /**
         * <p>The parameters in the URL. Some model services require parameters to be passed through the URL.</p>
         */
        @NameInMap("urlParams")
        public ListModelsResponseBodyResultContentRequestUrlParams urlParams;

        public static ListModelsResponseBodyResultContentRequest build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentRequest self = new ListModelsResponseBodyResultContentRequest();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentRequest setHeader(ListModelsResponseBodyResultContentRequestHeader header) {
            this.header = header;
            return this;
        }
        public ListModelsResponseBodyResultContentRequestHeader getHeader() {
            return this.header;
        }

        public ListModelsResponseBodyResultContentRequest setParameters(ListModelsResponseBodyResultContentRequestParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public ListModelsResponseBodyResultContentRequestParameters getParameters() {
            return this.parameters;
        }

        public ListModelsResponseBodyResultContentRequest setRequestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public String getRequestBody() {
            return this.requestBody;
        }

        public ListModelsResponseBodyResultContentRequest setUrlParams(ListModelsResponseBodyResultContentRequestUrlParams urlParams) {
            this.urlParams = urlParams;
            return this;
        }
        public ListModelsResponseBodyResultContentRequestUrlParams getUrlParams() {
            return this.urlParams;
        }

    }

    public static class ListModelsResponseBodyResultContentResponse extends TeaModel {
        /**
         * <p>Specifies how to parse the result information, described in JSON path format.</p>
         * 
         * <strong>example:</strong>
         * <p>$.result.embeddings[*].embedding</p>
         */
        @NameInMap("embeddings")
        public String embeddings;

        public static ListModelsResponseBodyResultContentResponse build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContentResponse self = new ListModelsResponseBodyResultContentResponse();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContentResponse setEmbeddings(String embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public String getEmbeddings() {
            return this.embeddings;
        }

    }

    public static class ListModelsResponseBodyResultContent extends TeaModel {
        /**
         * <p>The HTTP method for accessing the model service. PUT and POST are supported.</p>
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
         * <li>a. Text embedding: text_embedding</li>
         * <li>b. Text sparse embedding: text_sparse_embedding</li>
         * <li>c. Image embedding: image_embedding</li>
         * <li>d. Image content analysis: image_analyze.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The request configuration information.</p>
         */
        @NameInMap("request")
        public ListModelsResponseBodyResultContentRequest request;

        /**
         * <p>Specifies how to parse the result information, described in JSON path format.</p>
         */
        @NameInMap("response")
        public ListModelsResponseBodyResultContentResponse response;

        /**
         * <p>The access URL of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.platform-cn-shanghai.opensearch.aliyuncs.com/v3/openapi/workspaces/default/text-embedding/ops-text-embedding-001</p>
         */
        @NameInMap("url")
        public String url;

        public static ListModelsResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResultContent self = new ListModelsResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResultContent setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListModelsResponseBodyResultContent setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelsResponseBodyResultContent setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListModelsResponseBodyResultContent setRequest(ListModelsResponseBodyResultContentRequest request) {
            this.request = request;
            return this;
        }
        public ListModelsResponseBodyResultContentRequest getRequest() {
            return this.request;
        }

        public ListModelsResponseBodyResultContent setResponse(ListModelsResponseBodyResultContentResponse response) {
            this.response = response;
            return this;
        }
        public ListModelsResponseBodyResultContentResponse getResponse() {
            return this.response;
        }

        public ListModelsResponseBodyResultContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListModelsResponseBodyResult extends TeaModel {
        /**
         * <p>The content information of the model.</p>
         */
        @NameInMap("content")
        public ListModelsResponseBodyResultContent content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The dimension of the model.</p>
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
         * <p>The model status. Valid values:</p>
         * <ul>
         * <li>ok: The model is available.</li>
         * <li>forbidden: The model is unavailable.</li>
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
         * <li>a. Text embedding: text_embedding</li>
         * <li>b. Text sparse embedding: text_sparse_embedding</li>
         * <li>c. Image embedding: image_embedding</li>
         * <li>d. Image content analysis: image_analyze.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The access URL of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.platform-cn-shanghai.opensearch.aliyuncs.com/v3/openapi/workspaces/default/text-embedding/ops-text-embedding-001</p>
         */
        @NameInMap("url")
        public String url;

        public static ListModelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyResult self = new ListModelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyResult setContent(ListModelsResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public ListModelsResponseBodyResultContent getContent() {
            return this.content;
        }

        public ListModelsResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModelsResponseBodyResult setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public ListModelsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListModelsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListModelsResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListModelsResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
