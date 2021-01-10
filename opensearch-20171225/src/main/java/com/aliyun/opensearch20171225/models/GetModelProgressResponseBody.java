// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetModelProgressResponseBody extends TeaModel {
    @NameInMap("result")
    public GetModelProgressResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static GetModelProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelProgressResponseBody self = new GetModelProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelProgressResponseBody setResult(GetModelProgressResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetModelProgressResponseBodyResult getResult() {
        return this.result;
    }

    public GetModelProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModelProgressResponseBodyResult extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("progress")
        public Integer progress;

        public static GetModelProgressResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetModelProgressResponseBodyResult self = new GetModelProgressResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetModelProgressResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetModelProgressResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

}
