// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateOmsEndpointConnectionByInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateOmsEndpointConnectionByInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByInfoResponseBody self = new ValidateOmsEndpointConnectionByInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByInfoResponseBody setData(ValidateOmsEndpointConnectionByInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateOmsEndpointConnectionByInfoResponseBodyData getData() {
        return this.data;
    }

    public ValidateOmsEndpointConnectionByInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        @NameInMap("CloudInstanceRegionId")
        public String cloudInstanceRegionId;

        @NameInMap("CloudInstanceTenantId")
        public String cloudInstanceTenantId;

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

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("Username")
        public String username;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

        public static ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint self = new ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ValidateOmsEndpointConnectionByInfoResponseBodyData extends TeaModel {
        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("DiagnoseMessage")
        public String diagnoseMessage;

        @NameInMap("Endpoint")
        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint endpoint;

        public static ValidateOmsEndpointConnectionByInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsEndpointConnectionByInfoResponseBodyData self = new ValidateOmsEndpointConnectionByInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyData setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyData setDiagnoseMessage(String diagnoseMessage) {
            this.diagnoseMessage = diagnoseMessage;
            return this;
        }
        public String getDiagnoseMessage() {
            return this.diagnoseMessage;
        }

        public ValidateOmsEndpointConnectionByInfoResponseBodyData setEndpoint(ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public ValidateOmsEndpointConnectionByInfoResponseBodyDataEndpoint getEndpoint() {
            return this.endpoint;
        }

    }

}
