// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListTablesResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List</p>
     */
    @NameInMap("result")
    public java.util.List<ListTablesResponseBodyResult> result;

    public static ListTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponseBody self = new ListTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTablesResponseBody setResult(java.util.List<ListTablesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListTablesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListTablesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>IN_USE</p>
         */
        @NameInMap("indexStatus")
        public String indexStatus;

        /**
         * <strong>example:</strong>
         * <p>es_test_1b</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        public static ListTablesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListTablesResponseBodyResult self = new ListTablesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListTablesResponseBodyResult setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public ListTablesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTablesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
