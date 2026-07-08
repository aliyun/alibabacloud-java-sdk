// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogDeliveryStatusResponseBody extends TeaModel {
    /**
     * <p>The name of the log delivery configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("DeliveryName")
    public String deliveryName;

    /**
     * <p>The type of log delivery destination for the protected object. Valid values:</p>
     * <ul>
     * <li><p><strong>syslog</strong>: logs are delivered to a syslog server.</p>
     * </li>
     * <li><p><strong>kafka</strong>: logs are delivered to a Kafka cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether log delivery is enabled for the protected object. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Log delivery is enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Log delivery is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyResourceLogDeliveryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogDeliveryStatusResponseBody self = new ModifyResourceLogDeliveryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogDeliveryStatusResponseBody setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
        return this;
    }
    public String getDeliveryName() {
        return this.deliveryName;
    }

    public ModifyResourceLogDeliveryStatusResponseBody setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public ModifyResourceLogDeliveryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyResourceLogDeliveryStatusResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
