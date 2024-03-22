// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerSophonPlaybookRequest extends TeaModel {
    /**
     * <p>The name of the command that you want to trigger.</p>
     * <br>
     * <p>>  You can call the [DescribeSophonCommands](~~DescribeSophonCommands~~) operation to query the command name.</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The input parameters of the command or playbook that you want to trigger.</p>
     */
    @NameInMap("InputParams")
    public String inputParams;

    /**
     * <p>The custom ID. If you do not specify this parameter when the playbook is triggered, a random ID is generated for fault locating and troubleshooting.</p>
     */
    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    /**
     * <p>The task type. Valid values:</p>
     * <br>
     * <p>*   **command**</p>
     * <p>*   **playbook**</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.</p>
     */
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
