// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodDomainResponseBody extends TeaModel {
    /**
     * <p>The URL that is used for health checks.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddVodDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVodDomainResponseBody self = new AddVodDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVodDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
