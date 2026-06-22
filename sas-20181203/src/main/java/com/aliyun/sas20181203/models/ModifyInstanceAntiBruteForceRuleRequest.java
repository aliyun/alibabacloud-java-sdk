// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleRequest extends TeaModel {
    /**
     * <p>The ID of the anti-brute-force attacks rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>65767</p>
     */
    @NameInMap("NewRuleId")
    public Long newRuleId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server for which you want to modify the anti-brute-force attacks rule.
     * You can invoke the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7cc91747-2845-40d4-bb69-c077597f****</p>
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
