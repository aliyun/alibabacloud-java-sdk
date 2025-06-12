// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppInstanceForPartnerRequest extends TeaModel {
    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>SERVICE_DELIVERY_PROCESS</p>
     */
    @NameInMap("OperateEvent")
    public String operateEvent;

    public static OperateAppInstanceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAppInstanceForPartnerRequest self = new OperateAppInstanceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public OperateAppInstanceForPartnerRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public OperateAppInstanceForPartnerRequest setOperateEvent(String operateEvent) {
        this.operateEvent = operateEvent;
        return this;
    }
    public String getOperateEvent() {
        return this.operateEvent;
    }

}
