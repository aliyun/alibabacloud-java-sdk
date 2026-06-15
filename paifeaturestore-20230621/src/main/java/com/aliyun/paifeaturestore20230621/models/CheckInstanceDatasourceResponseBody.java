// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CheckInstanceDatasourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C03B2680-AC9C-59CD-93C5-8142B92537FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource check status.</p>
     * <ul>
     * <li><p>Success: succeeded</p>
     * </li>
     * <li><p>Failure: failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckInstanceDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceDatasourceResponseBody self = new CheckInstanceDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckInstanceDatasourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
