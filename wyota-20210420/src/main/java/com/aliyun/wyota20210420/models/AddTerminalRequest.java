// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddTerminalRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

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

}
