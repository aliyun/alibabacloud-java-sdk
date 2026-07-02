// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyEventInfoRequest extends TeaModel {
    /**
     * <p>The parameters for the action, in JSON format. For example: <code>{&quot;recoverMode&quot;: &quot;xxx&quot;, &quot;recoverTime&quot;: &quot;xxx&quot;}</code>.</p>
     * <ul>
     * <li><p><strong>recoverMode</strong>: The recovery mode. Valid values:</p>
     * <ul>
     * <li><p><strong>timePoint</strong>: Executes the task at the time specified by <code>recoverTime</code>.</p>
     * </li>
     * <li><p><strong>immediate</strong>: Executes the task immediately.</p>
     * </li>
     * <li><p><strong>maintainTime</strong>: Executes the task during the maintenance window.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>recoverTime</strong>: The time to execute the task. This parameter is required when <strong>recoverMode</strong> is set to <strong>timePoint</strong>. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;recoverTime&quot;:&quot;2023-04-17T14:02:35Z&quot;,&quot;recoverMode&quot;:&quot;timePoint&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The action to perform on the event. Valid values:</p>
     * <ul>
     * <li><p><strong>archive</strong>: Archives the event.</p>
     * </li>
     * <li><p><strong>undo</strong>: Cancels processing for the event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>archive</p>
     */
    @NameInMap("EventAction")
    public String eventAction;

    /**
     * <p>The ID of the event. You can specify up to 20 event IDs. Separate multiple IDs with commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5422964</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The ID of the region.</p>
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
