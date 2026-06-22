// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVirusEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to handle all alerts. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no.</li>
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
     * <li><strong>manual_handled</strong>: manually handled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The scope of the handling operation.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;type\&quot;:\&quot;machine\&quot;,\&quot;list\&quot;:[\&quot;xxxxxxxxx-4cbf-4ca6-a1b7-8a09d1f86ab0\&quot;]}]</p>
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
