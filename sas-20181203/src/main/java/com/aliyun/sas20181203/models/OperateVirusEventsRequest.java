// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVirusEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to handle all alert events. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationAll")
    public Integer operationAll;

    /**
     * <p>The operation that you want to perform on the alert events. Valid values:</p>
     * <br>
     * <p>*   **default**: performs in-depth detection and removal</p>
     * <p>*   **ignore**: ignores the alert event</p>
     * <p>*   **advance_mark_mis_info**: adds the alert events to the whitelist</p>
     * <p>*   **manual_handled**: marks the alert events as manually handled</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The handling scope.</p>
     */
    @NameInMap("OperationRange")
    public String operationRange;

    public static OperateVirusEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateVirusEventsRequest self = new OperateVirusEventsRequest();
        return TeaModel.build(map, self);
    }

    public OperateVirusEventsRequest setOperationAll(Integer operationAll) {
        this.operationAll = operationAll;
        return this;
    }
    public Integer getOperationAll() {
        return this.operationAll;
    }

    public OperateVirusEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public OperateVirusEventsRequest setOperationRange(String operationRange) {
        this.operationRange = operationRange;
        return this;
    }
    public String getOperationRange() {
        return this.operationRange;
    }

}
