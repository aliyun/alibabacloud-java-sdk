// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetInstanceQuotaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetInstanceQuotaResponseBodyResult result;

    public static GetInstanceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceQuotaResponseBody self = new GetInstanceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceQuotaResponseBody setResult(GetInstanceQuotaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetInstanceQuotaResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetInstanceQuotaResponseBodyResult extends TeaModel {
        @NameInMap("totalDisk")
        public String totalDisk;

        @NameInMap("usedDisk")
        public String usedDisk;

        public static GetInstanceQuotaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceQuotaResponseBodyResult self = new GetInstanceQuotaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetInstanceQuotaResponseBodyResult setTotalDisk(String totalDisk) {
            this.totalDisk = totalDisk;
            return this;
        }
        public String getTotalDisk() {
            return this.totalDisk;
        }

        public GetInstanceQuotaResponseBodyResult setUsedDisk(String usedDisk) {
            this.usedDisk = usedDisk;
            return this;
        }
        public String getUsedDisk() {
            return this.usedDisk;
        }

    }

}
