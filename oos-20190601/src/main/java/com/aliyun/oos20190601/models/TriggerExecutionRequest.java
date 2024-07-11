// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TriggerExecutionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>dswe2-3i0-029</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The message body to be sent to the trigger task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;eventTime&quot;: &quot;20181226T220114.058+0800&quot;, &quot;id&quot;: &quot;9435EAD6-3CF6-4494-8F7A-3A<strong><strong><strong><strong>77&quot;,&quot;level&quot;: &quot;INFO&quot;,&quot;name&quot;: &quot;Instance:StateChange&quot;,&quot;product&quot;: &quot;ECS&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;resourceId&quot;: &quot;acs:ecs:cn-hangzhou:169070</strong></strong></strong></strong>30:instance/i-bp1ecr<strong><strong><strong><strong>5go2go&quot;,&quot;userId&quot;: &quot;169070</strong></strong></strong></strong>30&quot;,&quot;ver&quot;: &quot;1.0&quot;,&quot;content&quot;: {&quot;resourceId&quot;: &quot;i-bp1ecr********5go2go&quot;, &quot;resourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;,&quot;state&quot;: &quot;Stopping&quot;} }</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the event-, alert-, or timer-triggered execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-sadw3f23rsad</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <ul>
     * <li>Event</li>
     * <li>Alarm</li>
     * <li>Timer</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Event</p>
     */
    @NameInMap("Type")
    public String type;

    public static TriggerExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerExecutionRequest self = new TriggerExecutionRequest();
        return TeaModel.build(map, self);
    }

    public TriggerExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TriggerExecutionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public TriggerExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public TriggerExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TriggerExecutionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
