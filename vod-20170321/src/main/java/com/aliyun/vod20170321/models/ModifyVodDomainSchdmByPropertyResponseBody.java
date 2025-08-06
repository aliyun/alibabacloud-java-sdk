// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyVodDomainSchdmByPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVodDomainSchdmByPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVodDomainSchdmByPropertyResponseBody self = new ModifyVodDomainSchdmByPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVodDomainSchdmByPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
