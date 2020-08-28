// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodDomainResponse self = new DeleteVodDomainResponse();
        return TeaModel.build(map, self);
    }

}
