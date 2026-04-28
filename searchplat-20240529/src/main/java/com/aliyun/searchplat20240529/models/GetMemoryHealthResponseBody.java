// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMemoryHealthResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetMemoryHealthResponseBodyResult result;

    @NameInMap("status")
    public String status;

    public static GetMemoryHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryHealthResponseBody self = new GetMemoryHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryHealthResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetMemoryHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryHealthResponseBody setResult(GetMemoryHealthResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMemoryHealthResponseBodyResult getResult() {
        return this.result;
    }

    public GetMemoryHealthResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetMemoryHealthResponseBodyResult extends TeaModel {
        @NameInMap("status")
        public String status;

        public static GetMemoryHealthResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryHealthResponseBodyResult self = new GetMemoryHealthResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMemoryHealthResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
