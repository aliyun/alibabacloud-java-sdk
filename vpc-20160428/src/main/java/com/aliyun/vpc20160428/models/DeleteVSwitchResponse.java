// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVSwitchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchResponse self = new DeleteVSwitchResponse();
        return TeaModel.build(map, self);
    }

}
