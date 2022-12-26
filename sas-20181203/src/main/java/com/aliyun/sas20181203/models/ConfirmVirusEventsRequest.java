// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ConfirmVirusEventsRequest extends TeaModel {
    @NameInMap("OperationAll")
    public Integer operationAll;

    @NameInMap("OperationCode")
    public String operationCode;

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
