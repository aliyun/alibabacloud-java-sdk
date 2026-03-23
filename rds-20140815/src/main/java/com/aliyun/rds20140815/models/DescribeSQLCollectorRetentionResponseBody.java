// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorRetentionResponseBody extends TeaModel {
    @NameInMap("ConfigValue")
    public String configValue;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLCollectorRetentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorRetentionResponseBody self = new DescribeSQLCollectorRetentionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorRetentionResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeSQLCollectorRetentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
