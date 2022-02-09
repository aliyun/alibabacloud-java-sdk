// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByIdV2ResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateOmsEndpointConnectionByIdV2ResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateOmsEndpointConnectionByIdV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByIdV2ResponseBody self = new ValidateOmsEndpointConnectionByIdV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByIdV2ResponseBody setData(ValidateOmsEndpointConnectionByIdV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateOmsEndpointConnectionByIdV2ResponseBodyData getData() {
        return this.data;
    }

    public ValidateOmsEndpointConnectionByIdV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint extends TeaModel {
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

        public static ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint self = new ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster extends TeaModel {
        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("DiagnoseMessage")
        public String diagnoseMessage;

        @NameInMap("Endpoint")
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint endpoint;

        public static ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster self = new ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster setDiagnoseMessage(String diagnoseMessage) {
            this.diagnoseMessage = diagnoseMessage;
            return this;
        }
        public String getDiagnoseMessage() {
            return this.diagnoseMessage;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster setEndpoint(ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMasterEndpoint getEndpoint() {
            return this.endpoint;
        }

    }

    public static class ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint extends TeaModel {
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

        public static ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint self = new ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave extends TeaModel {
        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("DiagnoseMessage")
        public String diagnoseMessage;

        @NameInMap("Endpoint")
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint endpoint;

        public static ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave self = new ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave setDiagnoseMessage(String diagnoseMessage) {
            this.diagnoseMessage = diagnoseMessage;
            return this;
        }
        public String getDiagnoseMessage() {
            return this.diagnoseMessage;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave setEndpoint(ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlaveEndpoint getEndpoint() {
            return this.endpoint;
        }

    }

    public static class ValidateOmsEndpointConnectionByIdV2ResponseBodyData extends TeaModel {
        @NameInMap("Master")
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster master;

        @NameInMap("Slave")
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave slave;

        public static ValidateOmsEndpointConnectionByIdV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdV2ResponseBodyData self = new ValidateOmsEndpointConnectionByIdV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyData setMaster(ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster master) {
            this.master = master;
            return this;
        }
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataMaster getMaster() {
            return this.master;
        }

        public ValidateOmsEndpointConnectionByIdV2ResponseBodyData setSlave(ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave slave) {
            this.slave = slave;
            return this;
        }
        public ValidateOmsEndpointConnectionByIdV2ResponseBodyDataSlave getSlave() {
            return this.slave;
        }

    }

}
