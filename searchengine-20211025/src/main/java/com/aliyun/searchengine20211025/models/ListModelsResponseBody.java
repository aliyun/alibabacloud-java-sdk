// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>38b079f1-7846-4226-8c90-3e2644b5c52b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListModelsResponseBodyResult> result;

    /**
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
        @NameInMap("build")
        public ListModelsResponseBodyResultContentRequestParametersBuild build;

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
        @NameInMap("header")
        public ListModelsResponseBodyResultContentRequestHeader header;

        @NameInMap("parameters")
        public ListModelsResponseBodyResultContentRequestParameters parameters;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;input\&quot;: [\&quot;%{input}\&quot;], \&quot;input_type\&quot;: \&quot;%{input_type}\&quot;}</p>
         */
        @NameInMap("requestBody")
        public String requestBody;

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
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("modelType")
        public String modelType;

        @NameInMap("request")
        public ListModelsResponseBodyResultContentRequest request;

        @NameInMap("response")
        public ListModelsResponseBodyResultContentResponse response;

        /**
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
        @NameInMap("content")
        public ListModelsResponseBodyResultContent content;

        /**
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("dimension")
        public Integer dimension;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>text_embedding</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2024-05-21 16:05:26</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
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
