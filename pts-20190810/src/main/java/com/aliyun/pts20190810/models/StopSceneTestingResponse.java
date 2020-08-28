// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StopSceneTestingResponse extends TeaModel {
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

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static StopSceneTestingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSceneTestingResponse self = new StopSceneTestingResponse();
        return TeaModel.build(map, self);
    }

}
