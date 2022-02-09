// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyOmsEndpointResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOmsEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointResponseBody self = new ModifyOmsEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointResponseBody setData(ModifyOmsEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyOmsEndpointResponseBodyData getData() {
        return this.data;
    }

    public ModifyOmsEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyOmsEndpointResponseBodyData extends TeaModel {
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

        public static ModifyOmsEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyOmsEndpointResponseBodyData self = new ModifyOmsEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyOmsEndpointResponseBodyData setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ModifyOmsEndpointResponseBodyData setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public ModifyOmsEndpointResponseBodyData setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public ModifyOmsEndpointResponseBodyData setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public ModifyOmsEndpointResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ModifyOmsEndpointResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ModifyOmsEndpointResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ModifyOmsEndpointResponseBodyData setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public ModifyOmsEndpointResponseBodyData setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ModifyOmsEndpointResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyOmsEndpointResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyOmsEndpointResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyOmsEndpointResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ModifyOmsEndpointResponseBodyData setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ModifyOmsEndpointResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ModifyOmsEndpointResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyOmsEndpointResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyOmsEndpointResponseBodyData setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ModifyOmsEndpointResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ModifyOmsEndpointResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ModifyOmsEndpointResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ModifyOmsEndpointResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
