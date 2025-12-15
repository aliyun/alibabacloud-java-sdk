// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyEventInfoRequest extends TeaModel {
    /**
     * <p>The JSON-formatted parameters related to the action. Set this parameter to <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code> if the <strong>TaskAction</strong> parameter is set to <strong>modifySwitchTime</strong>.</p>
     * <ul>
     * <li><p><strong>recoverMode</strong>: specifies the restoration mode for the task. Valid values:</p>
     * <ul>
     * <li><strong>timePoint</strong>: performs the task at the specified point in time.</li>
     * <li><strong>immediate</strong>: performs the task immediately.</li>
     * <li><strong>maintainTime</strong>: performs the task within the maintenance window.</li>
     * </ul>
     * </li>
     * <li><p><strong>recoverTime</strong>: specifies the point in time for restoration. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. This parameter is required if the <strong>recoverMode</strong> parameter is set to <strong>timePoint</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;recoverTime&quot;:&quot;2023-04-17T14:02:35Z&quot;,&quot;recoverMode&quot;:&quot;timePoint&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The event handling action. Valid values:</p>
     * <ul>
     * <li><strong>archive</strong></li>
     * <li><strong>undo</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>archive</p>
     */
    @NameInMap("EventAction")
    public String eventAction;

    /**
     * <p>The event IDs. Separate multiple event IDs with commas (,). You can specify up to 20 event IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5422964</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The region ID.</p>
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
