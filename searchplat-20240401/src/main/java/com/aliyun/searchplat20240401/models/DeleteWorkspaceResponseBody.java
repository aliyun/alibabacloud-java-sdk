// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5950143C-B8F0-5758-A08A-66F302FD587F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public DeleteWorkspaceResponseBodyResult result;

    public static DeleteWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResponseBody self = new DeleteWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkspaceResponseBody setResult(DeleteWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteWorkspaceResponseBodyResult extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-cn-em93wcq0s001</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static DeleteWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceResponseBodyResult self = new DeleteWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
