// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSmartAccessGatewayDnsForwardRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

    public static DeleteSmartAccessGatewayDnsForwardRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartAccessGatewayDnsForwardRequest self = new DeleteSmartAccessGatewayDnsForwardRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmartAccessGatewayDnsForwardRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSmartAccessGatewayDnsForwardRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSmartAccessGatewayDnsForwardRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public DeleteSmartAccessGatewayDnsForwardRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
