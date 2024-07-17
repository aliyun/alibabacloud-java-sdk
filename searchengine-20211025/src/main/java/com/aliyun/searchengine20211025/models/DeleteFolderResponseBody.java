// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteFolderResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Response&lt;Map&lt;String, String&gt;&gt;</p>
     */
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
        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The result</p>
         */
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
