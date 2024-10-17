// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeIdentifyTaskStatusResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeIdentifyTaskStatusResponseBodyContent content;

    /**
     * <strong>example:</strong>
     * <p>71064826-726F-4ADA-B879-05D8055476FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIdentifyTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdentifyTaskStatusResponseBody self = new DescribeIdentifyTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIdentifyTaskStatusResponseBody setContent(DescribeIdentifyTaskStatusResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeIdentifyTaskStatusResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeIdentifyTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIdentifyTaskStatusResponseBodyContent extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        public static DescribeIdentifyTaskStatusResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeIdentifyTaskStatusResponseBodyContent self = new DescribeIdentifyTaskStatusResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeIdentifyTaskStatusResponseBodyContent setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
