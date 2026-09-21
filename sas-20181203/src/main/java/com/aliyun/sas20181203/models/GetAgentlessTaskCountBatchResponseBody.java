// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAgentlessTaskCountBatchResponseBody extends TeaModel {
    /**
     * <p>The statistics grouped by resource UUID. The key of the map is the resource UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;:{&quot;RiskMachine&quot;:1,&quot;ScanMachine&quot;:1}}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, DataValue> data;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentlessTaskCountBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentlessTaskCountBatchResponseBody self = new GetAgentlessTaskCountBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentlessTaskCountBatchResponseBody setData(java.util.Map<String, DataValue> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, DataValue> getData() {
        return this.data;
    }

    public GetAgentlessTaskCountBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
