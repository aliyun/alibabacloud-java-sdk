// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListOnlineConfigsResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List</p>
     */
    @NameInMap("result")
    public java.util.List<ListOnlineConfigsResponseBodyResult> result;

    public static ListOnlineConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineConfigsResponseBody self = new ListOnlineConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnlineConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOnlineConfigsResponseBody setResult(java.util.List<ListOnlineConfigsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListOnlineConfigsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListOnlineConfigsResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration information</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;specItems\&quot;:[{\&quot;specKey\&quot;:\&quot;YQ_KEYWORD_NUMBER_PLUS\&quot;,\&quot;value\&quot;:\&quot;1\&quot;}]}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>The name of the index</p>
         * 
         * <strong>example:</strong>
         * <p>generation</p>
         */
        @NameInMap("indexName")
        public String indexName;

        public static ListOnlineConfigsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListOnlineConfigsResponseBodyResult self = new ListOnlineConfigsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListOnlineConfigsResponseBodyResult setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListOnlineConfigsResponseBodyResult setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

    }

}
