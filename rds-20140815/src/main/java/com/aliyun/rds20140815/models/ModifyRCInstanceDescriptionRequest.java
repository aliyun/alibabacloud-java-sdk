// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceDescriptionRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * <blockquote>
     * <p> The name must be 2 to 255 characters in length and can contain letters, digits, <code>underscores (_)</code>, and <code>hyphens (-)</code>. It must start with a letter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testInstance</p>
     */
    @NameInMap("InstanceDescription")
    public String instanceDescription;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-m5ei7b1w38w2l91x****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceDescriptionRequest self = new ModifyRCInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceDescriptionRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyRCInstanceDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
