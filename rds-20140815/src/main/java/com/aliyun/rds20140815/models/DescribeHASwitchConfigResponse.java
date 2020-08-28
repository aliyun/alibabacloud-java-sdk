// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHASwitchConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HAConfig")
    @Validation(required = true)
    public String HAConfig;

    @NameInMap("ManualHATime")
    @Validation(required = true)
    public String manualHATime;

    public static DescribeHASwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHASwitchConfigResponse self = new DescribeHASwitchConfigResponse();
        return TeaModel.build(map, self);
    }

}
