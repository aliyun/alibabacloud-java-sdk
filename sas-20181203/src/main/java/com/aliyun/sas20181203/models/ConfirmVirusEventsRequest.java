// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ConfirmVirusEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to handle all alerts. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Yes.</li>
     * <li><strong>0</strong>: No.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationAll")
    public Integer operationAll;

    /**
     * <p>The method to handle the alert event. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: deep scan and removal</li>
     * <li><strong>ignore</strong>: ignore</li>
     * <li><strong>advance_mark_mis_info</strong>: add to whitelist</li>
     * <li><strong>manual_handled</strong>: manually handled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The scope of the trojan scan alert handling. This parameter is required when OperationAll is set to 0. This parameter is ignored when OperationAll is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;type\&quot;:\&quot;machine\&quot;,\&quot;list\&quot;:[\&quot;3aedba3d-bd4d-4dfb-bb0d-xxxxxxxxxxxx\&quot;]}]</p>
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
