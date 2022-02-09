// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateOmsEndpointConnectionByIdResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateOmsEndpointConnectionByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByIdResponseBody self = new ValidateOmsEndpointConnectionByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByIdResponseBody setData(ValidateOmsEndpointConnectionByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateOmsEndpointConnectionByIdResponseBodyData getData() {
        return this.data;
    }

    public ValidateOmsEndpointConnectionByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        @NameInMap("CloudInstanceRegionId")
        public String cloudInstanceRegionId;

        @NameInMap("CloudInstanceTenantId")
        public String cloudInstanceTenantId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("DgInstanceId")
        public String dgInstanceId;

        @NameInMap("EndpointSource")
        public String endpointSource;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("NlsLengthSemantics")
        public String nlsLengthSemantics;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Password")
        public String password;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

        public static ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint self = new ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ValidateOmsEndpointConnectionByIdResponseBodyData extends TeaModel {
        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("DiagnoseMessage")
        public String diagnoseMessage;

        @NameInMap("OmsEndpoint")
        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint omsEndpoint;

        public static ValidateOmsEndpointConnectionByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByIdResponseBodyData self = new ValidateOmsEndpointConnectionByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyData setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyData setDiagnoseMessage(String diagnoseMessage) {
            this.diagnoseMessage = diagnoseMessage;
            return this;
        }
        public String getDiagnoseMessage() {
            return this.diagnoseMessage;
        }

        public ValidateOmsEndpointConnectionByIdResponseBodyData setOmsEndpoint(ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint omsEndpoint) {
            this.omsEndpoint = omsEndpoint;
            return this;
        }
        public ValidateOmsEndpointConnectionByIdResponseBodyDataOmsEndpoint getOmsEndpoint() {
            return this.omsEndpoint;
        }

    }

}
