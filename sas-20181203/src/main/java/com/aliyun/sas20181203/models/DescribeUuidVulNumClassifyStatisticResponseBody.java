// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidVulNumClassifyStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, DataValue> data;

    /**
     * <strong>example:</strong>
     * <p>FDF7B8D9-8493-4B90-8D13-E0C1FFCE5F97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUuidVulNumClassifyStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidVulNumClassifyStatisticResponseBody self = new DescribeUuidVulNumClassifyStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUuidVulNumClassifyStatisticResponseBody setData(java.util.Map<String, DataValue> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, DataValue> getData() {
        return this.data;
    }

    public DescribeUuidVulNumClassifyStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
