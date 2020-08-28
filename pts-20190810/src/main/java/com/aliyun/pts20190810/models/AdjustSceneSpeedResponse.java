// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class AdjustSceneSpeedResponse extends TeaModel {
    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    public static AdjustSceneSpeedResponse build(java.util.Map<String, ?> map) throws Exception {
        AdjustSceneSpeedResponse self = new AdjustSceneSpeedResponse();
        return TeaModel.build(map, self);
    }

}
