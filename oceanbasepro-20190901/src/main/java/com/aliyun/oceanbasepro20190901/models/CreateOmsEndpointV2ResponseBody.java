// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsEndpointV2ResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateOmsEndpointV2ResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOmsEndpointV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsEndpointV2ResponseBody self = new CreateOmsEndpointV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOmsEndpointV2ResponseBody setData(CreateOmsEndpointV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOmsEndpointV2ResponseBodyData getData() {
        return this.data;
    }

    public CreateOmsEndpointV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOmsEndpointV2ResponseBodyDataMaster extends TeaModel {
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

        @NameInMap("Name")
        public String name;

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

        public static CreateOmsEndpointV2ResponseBodyDataMaster build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsEndpointV2ResponseBodyDataMaster self = new CreateOmsEndpointV2ResponseBodyDataMaster();
            return TeaModel.build(map, self);
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateOmsEndpointV2ResponseBodyDataMaster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateOmsEndpointV2ResponseBodyDataSlave extends TeaModel {
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

        @NameInMap("Name")
        public String name;

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

        public static CreateOmsEndpointV2ResponseBodyDataSlave build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsEndpointV2ResponseBodyDataSlave self = new CreateOmsEndpointV2ResponseBodyDataSlave();
            return TeaModel.build(map, self);
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateOmsEndpointV2ResponseBodyDataSlave setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateOmsEndpointV2ResponseBodyData extends TeaModel {
        @NameInMap("Master")
        public CreateOmsEndpointV2ResponseBodyDataMaster master;

        @NameInMap("Slave")
        public CreateOmsEndpointV2ResponseBodyDataSlave slave;

        public static CreateOmsEndpointV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsEndpointV2ResponseBodyData self = new CreateOmsEndpointV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOmsEndpointV2ResponseBodyData setMaster(CreateOmsEndpointV2ResponseBodyDataMaster master) {
            this.master = master;
            return this;
        }
        public CreateOmsEndpointV2ResponseBodyDataMaster getMaster() {
            return this.master;
        }

        public CreateOmsEndpointV2ResponseBodyData setSlave(CreateOmsEndpointV2ResponseBodyDataSlave slave) {
            this.slave = slave;
            return this;
        }
        public CreateOmsEndpointV2ResponseBodyDataSlave getSlave() {
            return this.slave;
        }

    }

}
