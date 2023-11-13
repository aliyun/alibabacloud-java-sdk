// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetExampleQueryResponseBody extends TeaModel {
    @NameInMap("ExampleQuery")
    public GetExampleQueryResponseBodyExampleQuery exampleQuery;

    @NameInMap("RequestId")
    public String requestId;

    public static GetExampleQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExampleQueryResponseBody self = new GetExampleQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExampleQueryResponseBody setExampleQuery(GetExampleQueryResponseBodyExampleQuery exampleQuery) {
        this.exampleQuery = exampleQuery;
        return this;
    }
    public GetExampleQueryResponseBodyExampleQuery getExampleQuery() {
        return this.exampleQuery;
    }

    public GetExampleQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExampleQueryResponseBodyExampleQuery extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Name")
        public String name;

        @NameInMap("QueryId")
        public String queryId;

        public static GetExampleQueryResponseBodyExampleQuery build(java.util.Map<String, ?> map) throws Exception {
            GetExampleQueryResponseBodyExampleQuery self = new GetExampleQueryResponseBodyExampleQuery();
            return TeaModel.build(map, self);
        }

        public GetExampleQueryResponseBodyExampleQuery setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetExampleQueryResponseBodyExampleQuery setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetExampleQueryResponseBodyExampleQuery setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExampleQueryResponseBodyExampleQuery setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

    }

}
