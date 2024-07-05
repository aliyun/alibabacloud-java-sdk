// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-****-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVodDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodDomainResponseBody self = new DeleteVodDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
