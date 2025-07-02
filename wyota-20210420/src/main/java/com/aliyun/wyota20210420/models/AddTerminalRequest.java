// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddTerminalRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("MainBizType")
    public String mainBizType;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    @NameInMap("Uuid")
    public String uuid;

    public static AddTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTerminalRequest self = new AddTerminalRequest();
        return TeaModel.build(map, self);
    }

    public AddTerminalRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public AddTerminalRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public AddTerminalRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
    }

    public AddTerminalRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public AddTerminalRequest setTerminalGroupId(String terminalGroupId) {
        this.terminalGroupId = terminalGroupId;
        return this;
    }
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public AddTerminalRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
