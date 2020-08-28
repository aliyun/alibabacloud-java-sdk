// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistVideoIds")
    @Validation(required = true)
    public java.util.List<String> nonExistVideoIds;

    @NameInMap("UnRemoveableVideoIds")
    @Validation(required = true)
    public java.util.List<String> unRemoveableVideoIds;

    public static DeleteMezzaninesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesResponse self = new DeleteMezzaninesResponse();
        return TeaModel.build(map, self);
    }

}
