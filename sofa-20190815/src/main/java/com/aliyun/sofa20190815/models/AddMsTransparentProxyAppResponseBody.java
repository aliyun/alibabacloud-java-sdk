// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsTransparentProxyAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddMsTransparentProxyAppResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddMsTransparentProxyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMsTransparentProxyAppResponseBody self = new AddMsTransparentProxyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMsTransparentProxyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMsTransparentProxyAppResponseBody setData(AddMsTransparentProxyAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddMsTransparentProxyAppResponseBodyData getData() {
        return this.data;
    }

    public AddMsTransparentProxyAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddMsTransparentProxyAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange extends TeaModel {
        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("StartIp")
        public String startIp;

        @NameInMap("DefaultValue")
        public Long defaultValue;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange extends TeaModel {
        @NameInMap("EndPort")
        public Long endPort;

        @NameInMap("StartPort")
        public Long startPort;

        @NameInMap("DefaultValue")
        public Long defaultValue;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange setEndPort(Long endPort) {
            this.endPort = endPort;
            return this;
        }
        public Long getEndPort() {
            return this.endPort;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange setStartPort(Long startPort) {
            this.startPort = startPort;
            return this;
        }
        public Long getStartPort() {
            return this.startPort;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound extends TeaModel {
        @NameInMap("IpRange")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange> ipRange;

        @NameInMap("PortRange")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange> portRange;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound setIpRange(java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange> ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundIpRange> getIpRange() {
            return this.ipRange;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound setPortRange(java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange> portRange) {
            this.portRange = portRange;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBoundPortRange> getPortRange() {
            return this.portRange;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange extends TeaModel {
        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("StartIp")
        public String startIp;

        @NameInMap("DefaultValue")
        public Long defaultValue;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange extends TeaModel {
        @NameInMap("EndPort")
        public Long endPort;

        @NameInMap("StartPort")
        public Long startPort;

        @NameInMap("DefaultValue")
        public Long defaultValue;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange setEndPort(Long endPort) {
            this.endPort = endPort;
            return this;
        }
        public Long getEndPort() {
            return this.endPort;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange setStartPort(Long startPort) {
            this.startPort = startPort;
            return this;
        }
        public Long getStartPort() {
            return this.startPort;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound extends TeaModel {
        @NameInMap("IpRange")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange> ipRange;

        @NameInMap("PortRange")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange> portRange;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound setIpRange(java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange> ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundIpRange> getIpRange() {
            return this.ipRange;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound setPortRange(java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange> portRange) {
            this.portRange = portRange;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBoundPortRange> getPortRange() {
            return this.portRange;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist extends TeaModel {
        @NameInMap("InBound")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound> inBound;

        @NameInMap("OutBound")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound> outBound;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist self = new AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist setInBound(java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound> inBound) {
            this.inBound = inBound;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistInBound> getInBound() {
            return this.inBound;
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist setOutBound(java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound> outBound) {
            this.outBound = outBound;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklistOutBound> getOutBound() {
            return this.outBound;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataAppConfig extends TeaModel {
        @NameInMap("Blacklist")
        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist blacklist;

        public static AddMsTransparentProxyAppResponseBodyDataAppConfig build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataAppConfig self = new AddMsTransparentProxyAppResponseBodyDataAppConfig();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataAppConfig setBlacklist(AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist blacklist) {
            this.blacklist = blacklist;
            return this;
        }
        public AddMsTransparentProxyAppResponseBodyDataAppConfigBlacklist getBlacklist() {
            return this.blacklist;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyDataSupportProtocols extends TeaModel {
        @NameInMap("MaxReq")
        public Long maxReq;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Long port;

        public static AddMsTransparentProxyAppResponseBodyDataSupportProtocols build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyDataSupportProtocols self = new AddMsTransparentProxyAppResponseBodyDataSupportProtocols();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyDataSupportProtocols setMaxReq(Long maxReq) {
            this.maxReq = maxReq;
            return this;
        }
        public Long getMaxReq() {
            return this.maxReq;
        }

        public AddMsTransparentProxyAppResponseBodyDataSupportProtocols setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public AddMsTransparentProxyAppResponseBodyDataSupportProtocols setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

    }

    public static class AddMsTransparentProxyAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("RunNum")
        public Long runNum;

        @NameInMap("AppConfig")
        public AddMsTransparentProxyAppResponseBodyDataAppConfig appConfig;

        @NameInMap("SupportProtocols")
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataSupportProtocols> supportProtocols;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OpenNum")
        public Long openNum;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NodeNum")
        public Long nodeNum;

        public static AddMsTransparentProxyAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddMsTransparentProxyAppResponseBodyData self = new AddMsTransparentProxyAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddMsTransparentProxyAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public AddMsTransparentProxyAppResponseBodyData setRunNum(Long runNum) {
            this.runNum = runNum;
            return this;
        }
        public Long getRunNum() {
            return this.runNum;
        }

        public AddMsTransparentProxyAppResponseBodyData setAppConfig(AddMsTransparentProxyAppResponseBodyDataAppConfig appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public AddMsTransparentProxyAppResponseBodyDataAppConfig getAppConfig() {
            return this.appConfig;
        }

        public AddMsTransparentProxyAppResponseBodyData setSupportProtocols(java.util.List<AddMsTransparentProxyAppResponseBodyDataSupportProtocols> supportProtocols) {
            this.supportProtocols = supportProtocols;
            return this;
        }
        public java.util.List<AddMsTransparentProxyAppResponseBodyDataSupportProtocols> getSupportProtocols() {
            return this.supportProtocols;
        }

        public AddMsTransparentProxyAppResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMsTransparentProxyAppResponseBodyData setOpenNum(Long openNum) {
            this.openNum = openNum;
            return this;
        }
        public Long getOpenNum() {
            return this.openNum;
        }

        public AddMsTransparentProxyAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddMsTransparentProxyAppResponseBodyData setNodeNum(Long nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Long getNodeNum() {
            return this.nodeNum;
        }

    }

}
