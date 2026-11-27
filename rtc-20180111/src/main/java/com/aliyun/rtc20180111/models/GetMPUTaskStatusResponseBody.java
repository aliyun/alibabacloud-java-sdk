// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class GetMPUTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b26be</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status ID of the bypass transcoding task. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Waiting for the channel to start.</p>
     * <blockquote>
     * <p>If the task is not started within 30 days, the task is automatically stopped.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>1</strong>: The task is running.</p>
     * </li>
     * <li><p><strong>2</strong>: The task is stopped.</p>
     * </li>
     * <li><p><strong>3</strong>: The task is stopped by the user.</p>
     * </li>
     * <li><p><strong>4</strong>: The channel is stopped.</p>
     * </li>
     * <li><p><strong>5</strong>: Live streaming is stopped due to CDN network issues.</p>
     * </li>
     * <li><p><strong>6</strong>: Live streaming is stopped due to live streaming URL issues.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static GetMPUTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMPUTaskStatusResponseBody self = new GetMPUTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMPUTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMPUTaskStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
