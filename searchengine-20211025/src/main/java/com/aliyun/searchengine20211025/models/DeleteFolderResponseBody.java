// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteFolderResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteFolderResponseBodyResult result;

    public static DeleteFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFolderResponseBody self = new DeleteFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFolderResponseBody setResult(DeleteFolderResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteFolderResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteFolderResponseBodyResult extends TeaModel {
        @NameInMap("requestId")
        public String requestId;

        @NameInMap("result")
        public java.util.Map<String, String> result;

        public static DeleteFolderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteFolderResponseBodyResult self = new DeleteFolderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteFolderResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteFolderResponseBodyResult setResult(java.util.Map<String, String> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, String> getResult() {
            return this.result;
        }

    }

}
