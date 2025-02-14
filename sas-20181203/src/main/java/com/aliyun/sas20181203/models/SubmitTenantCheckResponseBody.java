// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitTenantCheckResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public SubmitTenantCheckResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1162D670-E633-5676-AE87-8359B066****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitTenantCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTenantCheckResponseBody self = new SubmitTenantCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTenantCheckResponseBody setData(SubmitTenantCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTenantCheckResponseBodyData getData() {
        return this.data;
    }

    public SubmitTenantCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitTenantCheckResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>fc98d58eb56f699d49bf7ebbd6d7****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitTenantCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTenantCheckResponseBodyData self = new SubmitTenantCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTenantCheckResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
