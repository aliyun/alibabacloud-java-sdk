// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudRecordStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <ul>
     * <li>0: The task has started and is waiting for users to join.</li>
     * <li>100: The task has not started.</li>
     * <li>101: Recording is in progress.</li>
     * <li>102: The recording file is being uploaded.</li>
     * <li>200: Recording is completed (channel ended).</li>
     * <li>201: Recording is completed (stopped by user).</li>
     * <li>400: Recording failed (internal server error).</li>
     * <li>401: Recording failed (failed to write to user storage).</li>
     * <li>402: Recording failed (failed to start user storage).</li>
     * <li>403: Recording failed (recording duration too short).</li>
     * <li>404: Recording failed (incorrect user storage key).</li>
     * <li>405: Recording failed (bucket does not exist).</li>
     * <li>406: Recording failed (access to user storage denied).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeCloudRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudRecordStatusResponseBody self = new DescribeCloudRecordStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudRecordStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudRecordStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
