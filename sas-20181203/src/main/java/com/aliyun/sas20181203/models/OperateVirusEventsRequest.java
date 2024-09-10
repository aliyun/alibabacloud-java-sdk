// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVirusEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to handle all alert events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationAll")
    public Integer operationAll;

    /**
     * <p>The operation that you want to perform on the alert events. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: performs in-depth detection and removal</li>
     * <li><strong>ignore</strong>: ignores the alert event</li>
     * <li><strong>advance_mark_mis_info</strong>: adds the alert events to the whitelist</li>
     * <li><strong>manual_handled</strong>: marks the alert events as manually handled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The handling scope.</p>
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
