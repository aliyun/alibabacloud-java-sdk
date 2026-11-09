// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryWildcardByTopicResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The dataset of parent topic information.</p>
     */
    @NameInMap("Data")
    public QueryWildcardByTopicResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8CC04203-679B-4DED-89D9-E7C2E979****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryWildcardByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWildcardByTopicResponseBody self = new QueryWildcardByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWildcardByTopicResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryWildcardByTopicResponseBody setData(QueryWildcardByTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryWildcardByTopicResponseBodyData getData() {
        return this.data;
    }

    public QueryWildcardByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWildcardByTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWildcardByTopicResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Limit")
        public String limit;

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public String total;

        /**
         * <p>The wildcard list.</p>
         */
        @NameInMap("WildcardList")
        public java.util.List<String> wildcardList;

        public static QueryWildcardByTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWildcardByTopicResponseBodyData self = new QueryWildcardByTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWildcardByTopicResponseBodyData setLimit(String limit) {
            this.limit = limit;
            return this;
        }
        public String getLimit() {
            return this.limit;
        }

        public QueryWildcardByTopicResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

        public QueryWildcardByTopicResponseBodyData setWildcardList(java.util.List<String> wildcardList) {
            this.wildcardList = wildcardList;
            return this;
        }
        public java.util.List<String> getWildcardList() {
            return this.wildcardList;
        }

    }

}
