// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodSpecificConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVodSpecificConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodSpecificConfigResponse self = new DeleteVodSpecificConfigResponse();
        return TeaModel.build(map, self);
    }

}
