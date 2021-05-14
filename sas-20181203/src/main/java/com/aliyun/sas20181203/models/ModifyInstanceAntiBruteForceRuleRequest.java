// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("NewRuleId")
    public Long newRuleId;

    public static ModifyInstanceAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAntiBruteForceRuleRequest self = new ModifyInstanceAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAntiBruteForceRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyInstanceAntiBruteForceRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceAntiBruteForceRuleRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public ModifyInstanceAntiBruteForceRuleRequest setNewRuleId(Long newRuleId) {
        this.newRuleId = newRuleId;
        return this;
    }
    public Long getNewRuleId() {
        return this.newRuleId;
    }

}
