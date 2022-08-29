// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BatchRequest extends TeaModel {
    @NameInMap("requests")
    public java.util.List<BatchRequestRequests> requests;

    @NameInMap("resource")
    public String resource;

    public static BatchRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRequest self = new BatchRequest();
        return TeaModel.build(map, self);
    }

    public BatchRequest setRequests(java.util.List<BatchRequestRequests> requests) {
        this.requests = requests;
        return this;
    }
    public java.util.List<BatchRequestRequests> getRequests() {
        return this.requests;
    }

    public BatchRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public static class BatchRequestRequests extends TeaModel {
        @NameInMap("body")
        public java.util.Map<String, String> body;

        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        @NameInMap("id")
        public String id;

        @NameInMap("method")
        public String method;

        @NameInMap("url")
        public String url;

        public static BatchRequestRequests build(java.util.Map<String, ?> map) throws Exception {
            BatchRequestRequests self = new BatchRequestRequests();
            return TeaModel.build(map, self);
        }

        public BatchRequestRequests setBody(java.util.Map<String, String> body) {
            this.body = body;
            return this;
        }
        public java.util.Map<String, String> getBody() {
            return this.body;
        }

        public BatchRequestRequests setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public BatchRequestRequests setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchRequestRequests setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public BatchRequestRequests setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
