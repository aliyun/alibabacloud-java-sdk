// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppServiceForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS00001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;user_device_id\&quot;:\&quot;6bef45cb0c76de284d24de074c088b73\&quot;}\n</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>SERVICE_FINISH</p>
     */
    @NameInMap("OperateEvent")
    public String operateEvent;

    /**
     * <strong>example:</strong>
     * <p>WEBSITE_DESIGN</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static OperateAppServiceForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAppServiceForPartnerRequest self = new OperateAppServiceForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public OperateAppServiceForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OperateAppServiceForPartnerRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public OperateAppServiceForPartnerRequest setOperateEvent(String operateEvent) {
        this.operateEvent = operateEvent;
        return this;
    }
    public String getOperateEvent() {
        return this.operateEvent;
    }

    public OperateAppServiceForPartnerRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
