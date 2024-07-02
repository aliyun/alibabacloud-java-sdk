// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListLogsResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>ListResult</p>
     */
    @NameInMap("result")
    public ListLogsResponseBodyResult result;

    public static ListLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogsResponseBody self = new ListLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogsResponseBody setResult(ListLogsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLogsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLogsResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public java.util.List<?> result;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListLogsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLogsResponseBodyResult self = new ListLogsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLogsResponseBodyResult setResult(java.util.List<?> result) {
            this.result = result;
            return this;
        }
        public java.util.List<?> getResult() {
            return this.result;
        }

        public ListLogsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
