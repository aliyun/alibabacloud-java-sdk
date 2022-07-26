// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteSqlInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteSqlInstanceResponseBodyResult result;

    public static DeleteSqlInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSqlInstanceResponseBody self = new DeleteSqlInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSqlInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSqlInstanceResponseBody setResult(DeleteSqlInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteSqlInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteSqlInstanceResponseBodyResult extends TeaModel {
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("result")
        public java.util.Map<String, String> result;

        public static DeleteSqlInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteSqlInstanceResponseBodyResult self = new DeleteSqlInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteSqlInstanceResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteSqlInstanceResponseBodyResult setResult(java.util.Map<String, String> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, String> getResult() {
            return this.result;
        }

    }

}
