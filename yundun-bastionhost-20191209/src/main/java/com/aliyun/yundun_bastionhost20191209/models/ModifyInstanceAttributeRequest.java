// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The description of the Bastionhost instance.</p>
     * <blockquote>
     * <p>The description can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). Maximum 30 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Bastionhost demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1gh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about regions and zones, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeRequest self = new ModifyInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
