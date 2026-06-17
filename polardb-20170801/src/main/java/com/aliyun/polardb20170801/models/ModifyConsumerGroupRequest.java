// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-xxxxxx</p>
     */
    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    /**
     * <p>The ID of the gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>Indicates whether the consumer group is the default group. Valid values: <code>0</code> (false) and <code>1</code> (true).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsDefault")
    public String isDefault;

    /**
     * <p>The nickname of the consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>yonghu</p>
     */
    @NameInMap("NickName")
    public String nickName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupRequest self = new ModifyConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public ModifyConsumerGroupRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyConsumerGroupRequest setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public String getIsDefault() {
        return this.isDefault;
    }

    public ModifyConsumerGroupRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public ModifyConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
