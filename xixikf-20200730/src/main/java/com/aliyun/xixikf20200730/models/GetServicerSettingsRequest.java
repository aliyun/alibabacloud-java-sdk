// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetServicerSettingsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PropertyCode")
    public String propertyCode;

    @NameInMap("ServicerId")
    public Long servicerId;

    public static GetServicerSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServicerSettingsRequest self = new GetServicerSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetServicerSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServicerSettingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetServicerSettingsRequest setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
        return this;
    }
    public String getPropertyCode() {
        return this.propertyCode;
    }

    public GetServicerSettingsRequest setServicerId(Long servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public Long getServicerId() {
        return this.servicerId;
    }

}
