// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsTransparentProxyAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("List")
    public java.util.List<QueryMsTransparentProxyAppResponseBodyList> list;

    public static QueryMsTransparentProxyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsTransparentProxyAppResponseBody self = new QueryMsTransparentProxyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsTransparentProxyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsTransparentProxyAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsTransparentProxyAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsTransparentProxyAppResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsTransparentProxyAppResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsTransparentProxyAppResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsTransparentProxyAppResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsTransparentProxyAppResponseBody setList(java.util.List<QueryMsTransparentProxyAppResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryMsTransparentProxyAppResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryMsTransparentProxyAppResponseBodyListSupportProtocols extends TeaModel {
        @NameInMap("MaxReq")
        public Long maxReq;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Protocol")
        public String protocol;

        public static QueryMsTransparentProxyAppResponseBodyListSupportProtocols build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListSupportProtocols self = new QueryMsTransparentProxyAppResponseBodyListSupportProtocols();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListSupportProtocols setMaxReq(Long maxReq) {
            this.maxReq = maxReq;
            return this;
        }
        public Long getMaxReq() {
            return this.maxReq;
        }

        public QueryMsTransparentProxyAppResponseBodyListSupportProtocols setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryMsTransparentProxyAppResponseBodyListSupportProtocols setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange extends TeaModel {
        @NameInMap("DefaultValue")
        public Long defaultValue;

        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("StartIp")
        public String startIp;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange extends TeaModel {
        @NameInMap("DefaultValue")
        public Long defaultValue;

        @NameInMap("EndPort")
        public Long endPort;

        @NameInMap("StartPort")
        public Long startPort;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange setEndPort(Long endPort) {
            this.endPort = endPort;
            return this;
        }
        public Long getEndPort() {
            return this.endPort;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange setStartPort(Long startPort) {
            this.startPort = startPort;
            return this;
        }
        public Long getStartPort() {
            return this.startPort;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound extends TeaModel {
        @NameInMap("IpRange")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange> ipRange;

        @NameInMap("PortRange")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange> portRange;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound setIpRange(java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange> ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundIpRange> getIpRange() {
            return this.ipRange;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound setPortRange(java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange> portRange) {
            this.portRange = portRange;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBoundPortRange> getPortRange() {
            return this.portRange;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange extends TeaModel {
        @NameInMap("DefaultValue")
        public Long defaultValue;

        @NameInMap("EndIp")
        public String endIp;

        @NameInMap("StartIp")
        public String startIp;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange extends TeaModel {
        @NameInMap("DefaultValue")
        public Long defaultValue;

        @NameInMap("EndPort")
        public Long endPort;

        @NameInMap("StartPort")
        public Long startPort;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange setDefaultValue(Long defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Long getDefaultValue() {
            return this.defaultValue;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange setEndPort(Long endPort) {
            this.endPort = endPort;
            return this;
        }
        public Long getEndPort() {
            return this.endPort;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange setStartPort(Long startPort) {
            this.startPort = startPort;
            return this;
        }
        public Long getStartPort() {
            return this.startPort;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound extends TeaModel {
        @NameInMap("IpRange")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange> ipRange;

        @NameInMap("PortRange")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange> portRange;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound setIpRange(java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange> ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundIpRange> getIpRange() {
            return this.ipRange;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound setPortRange(java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange> portRange) {
            this.portRange = portRange;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBoundPortRange> getPortRange() {
            return this.portRange;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist extends TeaModel {
        @NameInMap("InBound")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound> inBound;

        @NameInMap("OutBound")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound> outBound;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist self = new QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist setInBound(java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound> inBound) {
            this.inBound = inBound;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistInBound> getInBound() {
            return this.inBound;
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist setOutBound(java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound> outBound) {
            this.outBound = outBound;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklistOutBound> getOutBound() {
            return this.outBound;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyListAppConfig extends TeaModel {
        @NameInMap("Blacklist")
        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist blacklist;

        public static QueryMsTransparentProxyAppResponseBodyListAppConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyListAppConfig self = new QueryMsTransparentProxyAppResponseBodyListAppConfig();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyListAppConfig setBlacklist(QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist blacklist) {
            this.blacklist = blacklist;
            return this;
        }
        public QueryMsTransparentProxyAppResponseBodyListAppConfigBlacklist getBlacklist() {
            return this.blacklist;
        }

    }

    public static class QueryMsTransparentProxyAppResponseBodyList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NodeNum")
        public Long nodeNum;

        @NameInMap("OpenNum")
        public Long openNum;

        @NameInMap("RunNum")
        public Long runNum;

        @NameInMap("SupportProtocols")
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListSupportProtocols> supportProtocols;

        @NameInMap("AppConfig")
        public QueryMsTransparentProxyAppResponseBodyListAppConfig appConfig;

        public static QueryMsTransparentProxyAppResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMsTransparentProxyAppResponseBodyList self = new QueryMsTransparentProxyAppResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryMsTransparentProxyAppResponseBodyList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsTransparentProxyAppResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsTransparentProxyAppResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsTransparentProxyAppResponseBodyList setNodeNum(Long nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Long getNodeNum() {
            return this.nodeNum;
        }

        public QueryMsTransparentProxyAppResponseBodyList setOpenNum(Long openNum) {
            this.openNum = openNum;
            return this;
        }
        public Long getOpenNum() {
            return this.openNum;
        }

        public QueryMsTransparentProxyAppResponseBodyList setRunNum(Long runNum) {
            this.runNum = runNum;
            return this;
        }
        public Long getRunNum() {
            return this.runNum;
        }

        public QueryMsTransparentProxyAppResponseBodyList setSupportProtocols(java.util.List<QueryMsTransparentProxyAppResponseBodyListSupportProtocols> supportProtocols) {
            this.supportProtocols = supportProtocols;
            return this;
        }
        public java.util.List<QueryMsTransparentProxyAppResponseBodyListSupportProtocols> getSupportProtocols() {
            return this.supportProtocols;
        }

        public QueryMsTransparentProxyAppResponseBodyList setAppConfig(QueryMsTransparentProxyAppResponseBodyListAppConfig appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public QueryMsTransparentProxyAppResponseBodyListAppConfig getAppConfig() {
            return this.appConfig;
        }

    }

}
