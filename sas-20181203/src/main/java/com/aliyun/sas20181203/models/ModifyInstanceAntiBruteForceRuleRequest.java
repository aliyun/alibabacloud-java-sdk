// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleRequest extends TeaModel {
    /**
     * <p>The ID of the defense rule.</p>
     */
    @NameInMap("NewRuleId")
    public Long newRuleId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server for which you want to modify the defense rule. You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyInstanceAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAntiBruteForceRuleRequest self = new ModifyInstanceAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAntiBruteForceRuleRequest setNewRuleId(Long newRuleId) {
        this.newRuleId = newRuleId;
        return this;
    }
    public Long getNewRuleId() {
        return this.newRuleId;
    }

    public ModifyInstanceAntiBruteForceRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceAntiBruteForceRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyInstanceAntiBruteForceRuleRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
