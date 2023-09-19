// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TriggerExecutionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The message body to be sent to the trigger task.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the event-, alert-, or timer-triggered execution.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <br>
     * <p>*   Event</p>
     * <p>*   Alarm</p>
     * <p>*   Timer</p>
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
