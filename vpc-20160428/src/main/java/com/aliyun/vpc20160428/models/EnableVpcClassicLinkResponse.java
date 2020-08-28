// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcClassicLinkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnableVpcClassicLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcClassicLinkResponse self = new EnableVpcClassicLinkResponse();
        return TeaModel.build(map, self);
    }

}
