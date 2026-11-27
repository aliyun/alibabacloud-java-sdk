// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeStreamingOutStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>For abnormal tasks, RTC proactively ends the tasks and notifies the user server through callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/2709168.html?spm=a2c4g.11186623.help-menu-61399.d_2_0_0_0.49be1761tge4EX#6211464494udk">Callbacks</a>.</p>
     * <ul>
     * <li>0: The task is started and waiting for users to join.</li>
     * <li>1: Streaming in progress.</li>
     * <li>2: Streaming exception, live streaming stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeStreamingOutStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingOutStatusResponseBody self = new DescribeStreamingOutStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingOutStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamingOutStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
