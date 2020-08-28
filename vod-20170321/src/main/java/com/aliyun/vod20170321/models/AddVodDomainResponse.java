// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVodDomainResponse self = new AddVodDomainResponse();
        return TeaModel.build(map, self);
    }

}
