// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeAgentLoadInfoResponse extends TeaModel {
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

    @NameInMap("LoadInfo")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> loadInfo;

    public static DescribeAgentLoadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentLoadInfoResponse self = new DescribeAgentLoadInfoResponse();
        return TeaModel.build(map, self);
    }

}
