// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddTerminalsRequest extends TeaModel {
    @NameInMap("AddTerminalParams")
    public java.util.List<AddTerminalsRequestAddTerminalParams> addTerminalParams;

    public static AddTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTerminalsRequest self = new AddTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public AddTerminalsRequest setAddTerminalParams(java.util.List<AddTerminalsRequestAddTerminalParams> addTerminalParams) {
        this.addTerminalParams = addTerminalParams;
        return this;
    }
    public java.util.List<AddTerminalsRequestAddTerminalParams> getAddTerminalParams() {
        return this.addTerminalParams;
    }

    public static class AddTerminalsRequestAddTerminalParams extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("ClientType")
        public Integer clientType;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("TerminalGroupId")
        public String terminalGroupId;

        @NameInMap("Uuid")
        public String uuid;

        public static AddTerminalsRequestAddTerminalParams build(java.util.Map<String, ?> map) throws Exception {
            AddTerminalsRequestAddTerminalParams self = new AddTerminalsRequestAddTerminalParams();
            return TeaModel.build(map, self);
        }

        public AddTerminalsRequestAddTerminalParams setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public AddTerminalsRequestAddTerminalParams setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public AddTerminalsRequestAddTerminalParams setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public AddTerminalsRequestAddTerminalParams setTerminalGroupId(String terminalGroupId) {
            this.terminalGroupId = terminalGroupId;
            return this;
        }
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        public AddTerminalsRequestAddTerminalParams setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
