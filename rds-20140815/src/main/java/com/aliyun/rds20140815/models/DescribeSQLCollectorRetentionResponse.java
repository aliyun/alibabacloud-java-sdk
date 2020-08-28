// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorRetentionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConfigValue")
    @Validation(required = true)
    public String configValue;

    public static DescribeSQLCollectorRetentionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorRetentionResponse self = new DescribeSQLCollectorRetentionResponse();
        return TeaModel.build(map, self);
    }

}
