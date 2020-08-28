// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VodTemplateId")
    @Validation(required = true)
    public String vodTemplateId;

    public static DeleteVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodTemplateResponse self = new DeleteVodTemplateResponse();
        return TeaModel.build(map, self);
    }

}
