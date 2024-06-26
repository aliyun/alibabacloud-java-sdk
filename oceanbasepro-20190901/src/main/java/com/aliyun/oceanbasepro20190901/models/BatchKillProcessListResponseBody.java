// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillProcessListResponseBody extends TeaModel {
    /**
     * <p>The array of the return result.</p>
     */
    @NameInMap("Data")
    public java.util.List<BatchKillProcessListResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchKillProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchKillProcessListResponseBody self = new BatchKillProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchKillProcessListResponseBody setData(java.util.List<BatchKillProcessListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchKillProcessListResponseBodyData> getData() {
        return this.data;
    }

    public BatchKillProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchKillProcessListResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the calling is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static BatchKillProcessListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchKillProcessListResponseBodyData self = new BatchKillProcessListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchKillProcessListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
