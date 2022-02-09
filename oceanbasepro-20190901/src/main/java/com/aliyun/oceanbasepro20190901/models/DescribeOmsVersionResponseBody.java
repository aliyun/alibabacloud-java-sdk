// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeOmsVersionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeOmsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsVersionResponseBody self = new DescribeOmsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsVersionResponseBody setData(DescribeOmsVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOmsVersionResponseBodyData getData() {
        return this.data;
    }

    public DescribeOmsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOmsVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOmsVersionResponseBodyData extends TeaModel {
        @NameInMap("CanaryStatus")
        public Boolean canaryStatus;

        @NameInMap("Version")
        public String version;

        public static DescribeOmsVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsVersionResponseBodyData self = new DescribeOmsVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsVersionResponseBodyData setCanaryStatus(Boolean canaryStatus) {
            this.canaryStatus = canaryStatus;
            return this;
        }
        public Boolean getCanaryStatus() {
            return this.canaryStatus;
        }

        public DescribeOmsVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
