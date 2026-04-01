// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyEventInfoRequest extends TeaModel {
    /**
     * <p>The action-related parameters. You can add action-related parameters based on your business requirements. The parameter value varies with the value of the TaskAction parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;recoverTime\&quot;:\&quot;2023-04-17T14:02:35Z\&quot;,\&quot;recoverMode\&quot;:\&quot;timePoint\&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>The event handling action. Valid values:</p>
     * <ul>
     * <li><strong>archive</strong></li>
     * <li><strong>undo</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>archive</p>
     */
    @NameInMap("EventAction")
    public String eventAction;

    /**
     * <p>The event ID. You can call the DescribeEvents operation to obtain the IDs of the events. Separate multiple event IDs with commas (,). You can specify up to 20 event IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5422964</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
