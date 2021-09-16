// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistResourceIds")
    public java.util.List<String> nonExistResourceIds;

    @NameInMap("FailedResourceIds")
    public java.util.List<String> failedResourceIds;

    public static MoveAppResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveAppResourceResponseBody self = new MoveAppResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveAppResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveAppResourceResponseBody setNonExistResourceIds(java.util.List<String> nonExistResourceIds) {
        this.nonExistResourceIds = nonExistResourceIds;
        return this;
    }
    public java.util.List<String> getNonExistResourceIds() {
        return this.nonExistResourceIds;
    }

    public MoveAppResourceResponseBody setFailedResourceIds(java.util.List<String> failedResourceIds) {
        this.failedResourceIds = failedResourceIds;
        return this;
    }
    public java.util.List<String> getFailedResourceIds() {
        return this.failedResourceIds;
    }

}
