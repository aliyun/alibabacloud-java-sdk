// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ConfirmVirusEventsRequest extends TeaModel {
    /**
     * <p>Confirms the alert events that you want to handle.</p>
     */
    @NameInMap("OperationAll")
    public Integer operationAll;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The server on which you want to perform the alert events.</p>
     */
    @NameInMap("OperationRange")
    public String operationRange;

    public static ConfirmVirusEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmVirusEventsRequest self = new ConfirmVirusEventsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmVirusEventsRequest setOperationAll(Integer operationAll) {
        this.operationAll = operationAll;
        return this;
    }
    public Integer getOperationAll() {
        return this.operationAll;
    }

    public ConfirmVirusEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public ConfirmVirusEventsRequest setOperationRange(String operationRange) {
        this.operationRange = operationRange;
        return this;
    }
    public String getOperationRange() {
        return this.operationRange;
    }

}
