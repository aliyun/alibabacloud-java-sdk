// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyVodServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVodServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVodServiceResponseBody self = new ModifyVodServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVodServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
