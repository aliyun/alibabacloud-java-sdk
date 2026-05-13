// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTaskDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-05-12T07:18:57Z</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <strong>example:</strong>
     * <p>561AFBF1-BE20-44DB-9BD1-6988B53E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskDetailResponseBody self = new DescribeTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskDetailResponseBody setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public DescribeTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
