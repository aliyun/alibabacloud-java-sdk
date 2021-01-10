// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryStatusResponseBody extends TeaModel {
    @NameInMap("result")
    public DescribeSlowQueryStatusResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static DescribeSlowQueryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryStatusResponseBody self = new DescribeSlowQueryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryStatusResponseBody setResult(DescribeSlowQueryStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSlowQueryStatusResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeSlowQueryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSlowQueryStatusResponseBodyResult extends TeaModel {
        @NameInMap("region")
        public String region;

        @NameInMap("status")
        public String status;

        @NameInMap("appGroupId")
        public String appGroupId;

        public static DescribeSlowQueryStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowQueryStatusResponseBodyResult self = new DescribeSlowQueryStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSlowQueryStatusResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeSlowQueryStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSlowQueryStatusResponseBodyResult setAppGroupId(String appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public String getAppGroupId() {
            return this.appGroupId;
        }

    }

}
