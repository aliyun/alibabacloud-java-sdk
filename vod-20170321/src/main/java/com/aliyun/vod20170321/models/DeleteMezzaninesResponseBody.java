// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistVideoIds")
    public java.util.List<String> nonExistVideoIds;

    @NameInMap("UnRemoveableVideoIds")
    public java.util.List<String> unRemoveableVideoIds;

    public static DeleteMezzaninesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesResponseBody self = new DeleteMezzaninesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMezzaninesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMezzaninesResponseBody setNonExistVideoIds(java.util.List<String> nonExistVideoIds) {
        this.nonExistVideoIds = nonExistVideoIds;
        return this;
    }
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    public DeleteMezzaninesResponseBody setUnRemoveableVideoIds(java.util.List<String> unRemoveableVideoIds) {
        this.unRemoveableVideoIds = unRemoveableVideoIds;
        return this;
    }
    public java.util.List<String> getUnRemoveableVideoIds() {
        return this.unRemoveableVideoIds;
    }

}
