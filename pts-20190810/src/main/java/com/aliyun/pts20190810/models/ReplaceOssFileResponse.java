// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ReplaceOssFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Finished")
    @Validation(required = true)
    public Boolean finished;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    @NameInMap("Timeout")
    @Validation(required = true)
    public Integer timeout;

    public static ReplaceOssFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceOssFileResponse self = new ReplaceOssFileResponse();
        return TeaModel.build(map, self);
    }

}
