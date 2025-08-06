// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultUploadStorageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultUploadStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultUploadStorageResponseBody self = new SetDefaultUploadStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultUploadStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
