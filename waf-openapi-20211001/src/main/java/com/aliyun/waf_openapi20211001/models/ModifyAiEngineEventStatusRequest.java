// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyAiEngineEventStatusRequest extends TeaModel {
    /**
     * <p>The comment. The value can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testComment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EVT-20261025109</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_des*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the WAF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-de***</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The target status of the event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>handling</p>
     */
    @NameInMap("TargetStatus")
    public String targetStatus;

    public static ModifyAiEngineEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiEngineEventStatusRequest self = new ModifyAiEngineEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAiEngineEventStatusRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyAiEngineEventStatusRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ModifyAiEngineEventStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAiEngineEventStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAiEngineEventStatusRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyAiEngineEventStatusRequest setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }
    public String getTargetStatus() {
        return this.targetStatus;
    }

}
