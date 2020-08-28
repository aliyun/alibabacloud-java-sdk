// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeStructureMonitorAuthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StructureNew")
    @Validation(required = true)
    public Boolean structureNew;

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

    public static DescribeStructureMonitorAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStructureMonitorAuthResponse self = new DescribeStructureMonitorAuthResponse();
        return TeaModel.build(map, self);
    }

}
