// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class DialogToVideoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ExtendParams")
    public String extendParams;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SystemCommand")
    public String systemCommand;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("VirtualHumanCode")
    public String virtualHumanCode;

    public static DialogToVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        DialogToVideoRequest self = new DialogToVideoRequest();
        return TeaModel.build(map, self);
    }

    public DialogToVideoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DialogToVideoRequest setExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }
    public String getExtendParams() {
        return this.extendParams;
    }

    public DialogToVideoRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DialogToVideoRequest setSystemCommand(String systemCommand) {
        this.systemCommand = systemCommand;
        return this;
    }
    public String getSystemCommand() {
        return this.systemCommand;
    }

    public DialogToVideoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DialogToVideoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DialogToVideoRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public DialogToVideoRequest setVirtualHumanCode(String virtualHumanCode) {
        this.virtualHumanCode = virtualHumanCode;
        return this;
    }
    public String getVirtualHumanCode() {
        return this.virtualHumanCode;
    }

}
