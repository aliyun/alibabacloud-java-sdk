// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class BatchKillProcessListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<BatchKillProcessListResponseBodyData> data;

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
