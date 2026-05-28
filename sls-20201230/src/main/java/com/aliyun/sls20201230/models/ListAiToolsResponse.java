// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAiToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<ListAiToolsResponseBody> body;

    public static ListAiToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiToolsResponse self = new ListAiToolsResponse();
        return TeaModel.build(map, self);
    }

    public ListAiToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiToolsResponse setBody(java.util.List<ListAiToolsResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ListAiToolsResponseBody> getBody() {
        return this.body;
    }

    public static class ListAiToolsResponseBodyFields extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("option")
        public java.util.List<String> option;

        @NameInMap("required")
        public Boolean required;

        @NameInMap("type")
        public String type;

        @NameInMap("example")
        public String example;

        @NameInMap("description")
        public String description;

        public static ListAiToolsResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            ListAiToolsResponseBodyFields self = new ListAiToolsResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public ListAiToolsResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAiToolsResponseBodyFields setOption(java.util.List<String> option) {
            this.option = option;
            return this;
        }
        public java.util.List<String> getOption() {
            return this.option;
        }

        public ListAiToolsResponseBodyFields setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListAiToolsResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAiToolsResponseBodyFields setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public ListAiToolsResponseBodyFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListAiToolsResponseBody extends TeaModel {
        @NameInMap("fields")
        public java.util.List<ListAiToolsResponseBodyFields> fields;

        @NameInMap("name")
        public String name;

        @NameInMap("description")
        public String description;

        public static ListAiToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
            ListAiToolsResponseBody self = new ListAiToolsResponseBody();
            return TeaModel.build(map, self);
        }

        public ListAiToolsResponseBody setFields(java.util.List<ListAiToolsResponseBodyFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<ListAiToolsResponseBodyFields> getFields() {
            return this.fields;
        }

        public ListAiToolsResponseBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAiToolsResponseBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
