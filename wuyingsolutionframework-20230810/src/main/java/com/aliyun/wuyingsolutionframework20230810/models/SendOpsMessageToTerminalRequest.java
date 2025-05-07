// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingsolutionframework20230810.models;

import com.aliyun.tea.*;

public class SendOpsMessageToTerminalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("MessageBody")
    public String messageBody;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("OfficeRegionId")
    public String officeRegionId;

    /**
     * <strong>example:</strong>
     * <p>reboot</p>
     */
    @NameInMap("OpsAction")
    public String opsAction;

    /**
     * <strong>example:</strong>
     * <p>AAAAAAAAAAAA</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WaitForAck")
    public Boolean waitForAck;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WaitForMsg")
    public Boolean waitForMsg;

    public static SendOpsMessageToTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        SendOpsMessageToTerminalRequest self = new SendOpsMessageToTerminalRequest();
        return TeaModel.build(map, self);
    }

    public SendOpsMessageToTerminalRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public SendOpsMessageToTerminalRequest setOfficeRegionId(String officeRegionId) {
        this.officeRegionId = officeRegionId;
        return this;
    }
    public String getOfficeRegionId() {
        return this.officeRegionId;
    }

    public SendOpsMessageToTerminalRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public SendOpsMessageToTerminalRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public SendOpsMessageToTerminalRequest setWaitForAck(Boolean waitForAck) {
        this.waitForAck = waitForAck;
        return this;
    }
    public Boolean getWaitForAck() {
        return this.waitForAck;
    }

    public SendOpsMessageToTerminalRequest setWaitForMsg(Boolean waitForMsg) {
        this.waitForMsg = waitForMsg;
        return this;
    }
    public Boolean getWaitForMsg() {
        return this.waitForMsg;
    }

}
