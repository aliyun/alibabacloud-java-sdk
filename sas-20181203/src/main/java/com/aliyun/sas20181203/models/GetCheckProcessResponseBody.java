// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckProcessResponseBody extends TeaModel {
    /**
     * <p>The total number of assets on which the task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("FinishCount")
    public Integer finishCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D18B5DAD-BA97-5552-AE48-83F59D5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusCode")
    public String statusCode;

    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The total number of assets on which the task is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>113</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetCheckProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckProcessResponseBody self = new GetCheckProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckProcessResponseBody setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
        return this;
    }
    public Integer getFinishCount() {
        return this.finishCount;
    }

    public GetCheckProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckProcessResponseBody setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public GetCheckProcessResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCheckProcessResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
