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

    public DescribeSQLCollectorRetentionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLCollectorRetentionResponse setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

}
