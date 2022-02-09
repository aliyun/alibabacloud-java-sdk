// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByInfoV2ResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateOmsEndpointConnectionByInfoV2ResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateOmsEndpointConnectionByInfoV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByInfoV2ResponseBody self = new ValidateOmsEndpointConnectionByInfoV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByInfoV2ResponseBody setData(ValidateOmsEndpointConnectionByInfoV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateOmsEndpointConnectionByInfoV2ResponseBodyData getData() {
        return this.data;
    }

    public ValidateOmsEndpointConnectionByInfoV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("EndpointSource")
        public String endpointSource;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        public static ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint self = new ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster extends TeaModel {
        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("DiagnoseMessage")
        public String diagnoseMessage;

        @NameInMap("Endpoint")
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint endpoint;

        public static ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster self = new ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster setDiagnoseMessage(String diagnoseMessage) {
            this.diagnoseMessage = diagnoseMessage;
            return this;
        }
        public String getDiagnoseMessage() {
            return this.diagnoseMessage;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster setEndpoint(ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMasterEndpoint getEndpoint() {
            return this.endpoint;
        }

    }

    public static class ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("EndpointSource")
        public String endpointSource;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Name")
        public String name;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        public static ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint self = new ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave extends TeaModel {
        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("DiagnoseMessage")
        public String diagnoseMessage;

        @NameInMap("Endpoint")
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint endpoint;

        public static ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave self = new ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave setDiagnoseMessage(String diagnoseMessage) {
            this.diagnoseMessage = diagnoseMessage;
            return this;
        }
        public String getDiagnoseMessage() {
            return this.diagnoseMessage;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave setEndpoint(ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlaveEndpoint getEndpoint() {
            return this.endpoint;
        }

    }

    public static class ValidateOmsEndpointConnectionByInfoV2ResponseBodyData extends TeaModel {
        @NameInMap("Master")
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster master;

        @NameInMap("Slave")
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave slave;

        public static ValidateOmsEndpointConnectionByInfoV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoV2ResponseBodyData self = new ValidateOmsEndpointConnectionByInfoV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyData setMaster(ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster master) {
            this.master = master;
            return this;
        }
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataMaster getMaster() {
            return this.master;
        }

        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyData setSlave(ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave slave) {
            this.slave = slave;
            return this;
        }
        public ValidateOmsEndpointConnectionByInfoV2ResponseBodyDataSlave getSlave() {
            return this.slave;
        }

    }

}
