// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyCustomNameRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CustomName")
    public String customName;

    public static ModifyCustomNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomNameRequest self = new ModifyCustomNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomNameRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyCustomNameRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ModifyCustomNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCustomNameRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

}
