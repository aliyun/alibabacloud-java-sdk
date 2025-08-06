// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelMediaExportJobsResponseBody extends TeaModel {
    @NameInMap("FailedJobIds")
    public java.util.List<String> failedJobIds;

    @NameInMap("NonExistJobIds")
    public java.util.List<String> nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static CancelMediaExportJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMediaExportJobsResponseBody self = new CancelMediaExportJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMediaExportJobsResponseBody setFailedJobIds(java.util.List<String> failedJobIds) {
        this.failedJobIds = failedJobIds;
        return this;
    }
    public java.util.List<String> getFailedJobIds() {
        return this.failedJobIds;
    }

    public CancelMediaExportJobsResponseBody setNonExistJobIds(java.util.List<String> nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public java.util.List<String> getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public CancelMediaExportJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
