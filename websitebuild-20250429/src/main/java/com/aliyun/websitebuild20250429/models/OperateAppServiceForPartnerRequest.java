// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppServiceForPartnerRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS00001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Other extended information in JSON format for future parameter expansion.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;user_device_id\&quot;:\&quot;6bef45cb0c76de284d24de074c088b73\&quot;}\n</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The operation event. Valid values:
     * SERVICE_FINISH: the service is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>SERVICE_FINISH</p>
     */
    @NameInMap("OperateEvent")
    public String operateEvent;

    /**
     * <p>The service type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>private: deployment under the user account.</p>
     * </li>
     * <li><p>managed: hosted under the service provider account.</p>
     * </li>
     * <li><p>operation: Alibaba Cloud Managed Services.</p>
     * </li>
     * </ul>
     * 
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
