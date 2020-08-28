// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeAgentCpuInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("CpuInfo")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> cpuInfo;

    public static DescribeAgentCpuInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentCpuInfoResponse self = new DescribeAgentCpuInfoResponse();
        return TeaModel.build(map, self);
    }

}
