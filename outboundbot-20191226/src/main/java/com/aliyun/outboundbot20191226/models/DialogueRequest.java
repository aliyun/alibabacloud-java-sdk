// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DialogueRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>broadcast</p>
     */
    @NameInMap("ActionKey")
    public String actionKey;

    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1528189846043</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Outbound</p>
     */
    @NameInMap("CallType")
    public String callType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>135****4353</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***6</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>6cea9bed-63e6-439e-ae4c-b3333efff53d</p>
     */
    @NameInMap("ScenarioId")
    public String scenarioId;

    /**
     * <p>场景id</p>
     * 
     * <strong>example:</strong>
     * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <strong>example:</strong>
     * <p>ff44709e-39a6-43ba-959b-20fcabe3e496</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    public static DialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        DialogueRequest self = new DialogueRequest();
        return TeaModel.build(map, self);
    }

    public DialogueRequest setActionKey(String actionKey) {
        this.actionKey = actionKey;
        return this;
    }
    public String getActionKey() {
        return this.actionKey;
    }

    public DialogueRequest setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DialogueRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public DialogueRequest setCallType(String callType) {
        this.callType = callType;
        return this;
    }
    public String getCallType() {
        return this.callType;
    }

    public DialogueRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public DialogueRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public DialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DialogueRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public DialogueRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DialogueRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DialogueRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
