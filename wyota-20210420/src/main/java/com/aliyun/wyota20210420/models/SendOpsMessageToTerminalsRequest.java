// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SendOpsMessageToTerminalsRequest extends TeaModel {
    @NameInMap("Delay")
    public Boolean delay;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("OpsAction")
    public String opsAction;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    @NameInMap("WaitForAck")
    public Boolean waitForAck;

    public static SendOpsMessageToTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendOpsMessageToTerminalsRequest self = new SendOpsMessageToTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public SendOpsMessageToTerminalsRequest setDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }
    public Boolean getDelay() {
        return this.delay;
    }

    public SendOpsMessageToTerminalsRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SendOpsMessageToTerminalsRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public SendOpsMessageToTerminalsRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public SendOpsMessageToTerminalsRequest setWaitForAck(Boolean waitForAck) {
        this.waitForAck = waitForAck;
        return this;
    }
    public Boolean getWaitForAck() {
        return this.waitForAck;
    }

}
