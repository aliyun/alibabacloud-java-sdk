// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyEventInfoRequest extends TeaModel {
    /**
     * <p>The parameters related to the action. You can add extensions based on your business requirements. When the taskAction parameter is set to modifySwitchTime, set the ActionParams parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
     * <p>The recoverMode parameter specifies the task recovery pattern. Valid values:</p>
     * <ul>
     * <li><strong>timePoint</strong>: Executes the task at a specified point in time.</li>
     * <li><strong>immediate</strong>: Executes the task immediately.</li>
     * </ul>
     * <p>The recoverTime parameter specifies the recovery time. The time must be in UTC+0 and in the yyyy-MM-ddTHH:mm:ssZ format. When the recoverMode parameter is set to timePoint, the recoverTime parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;recoverTime&quot;:&quot;2023-04-17T14:02:35Z&quot;,&quot;recoverMode&quot;:&quot;timePoint&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The action to process the event. Valid values:</p>
     * <ul>
     * <li><strong>archive</strong>: Archives the event.</li>
     * <li><strong>undo</strong>: Does not process the event.<blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>archive</p>
     */
    @NameInMap("EventAction")
    public String eventAction;

    /**
     * <p>The event IDs. You can call the DescribeEvents operation to query the event IDs. Separate multiple event IDs with commas (,). You can specify up to 20 event IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5422964</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyEventInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventInfoRequest self = new ModifyEventInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventInfoRequest setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public ModifyEventInfoRequest setEventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }
    public String getEventAction() {
        return this.eventAction;
    }

    public ModifyEventInfoRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ModifyEventInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEventInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
