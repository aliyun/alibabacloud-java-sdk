// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetExampleQueryResponseBody extends TeaModel {
    /**
     * <p>The information about the sample query template.</p>
     */
    @NameInMap("ExampleQuery")
    public GetExampleQueryResponseBodyExampleQuery exampleQuery;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36A3D9BE-B607-5993-B546-7E19EF65DC00</p>
     */
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
        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The query statement in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT
         *   resource_id,
         *   resource_name,
         *   region_id,
         *   zone_id,
         *   resource_type,
         *   account_id,
         *   create_time,
         *   resource_group_id,
         *   tags,
         *   ip_addresses,
         *   vpc_id,
         *   v_switch_id
         * FROM
         *   resources
         * ORDER BY
         *   resource_type,
         *   resource_id
         * LIMIT
         *   1000 OFFSET 0;</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Query of All Alibaba Cloud Resources</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>sq-0PfKy****</p>
         */
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
