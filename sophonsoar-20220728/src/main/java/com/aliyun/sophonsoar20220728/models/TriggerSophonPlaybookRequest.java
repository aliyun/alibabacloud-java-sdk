// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerSophonPlaybookRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the command that you want to trigger.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSophonCommands~~">DescribeSophonCommands</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>waf_process_command</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The input parameters for triggering the command or playbook.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;param1&quot;: &quot;xx.xx.xx.xx&quot;,
     *     &quot;param2&quot;: &quot;7d&quot;
     * }</p>
     */
    @NameInMap("InputParams")
    public String inputParams;

    /**
     * <p>The custom ID of the task. If you do not specify this parameter when triggering a playbook, a random ID is generated. This ID is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>f916b93e-e814-459f-9662-xxxxxxxxxx</p>
     */
    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li><strong>command</strong>: Triggers a command task.</li>
     * <li><strong>playbook</strong>: Triggers a playbook task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>playbook</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f916b93e-e814-459f-9662-xxxxxxxxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static TriggerSophonPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerSophonPlaybookRequest self = new TriggerSophonPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public TriggerSophonPlaybookRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
