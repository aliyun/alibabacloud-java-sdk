// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerSophonPlaybookRequest extends TeaModel {
    @NameInMap("CommandName")
    public String commandName;

    @NameInMap("InputParams")
    public String inputParams;

    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    @NameInMap("TriggerType")
    public String triggerType;

    @NameInMap("Uuid")
    public String uuid;

    public static TriggerSophonPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerSophonPlaybookRequest self = new TriggerSophonPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public TriggerSophonPlaybookRequest setCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }
    public String getCommandName() {
        return this.commandName;
    }

    public TriggerSophonPlaybookRequest setInputParams(String inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public String getInputParams() {
        return this.inputParams;
    }

    public TriggerSophonPlaybookRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    public TriggerSophonPlaybookRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public TriggerSophonPlaybookRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
