// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class SubmitTestingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("SubmitResult")
    @Validation(required = true)
    public String submitResult;

    public static SubmitTestingResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTestingResponse self = new SubmitTestingResponse();
        return TeaModel.build(map, self);
    }

}
