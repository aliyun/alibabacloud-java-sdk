// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointV2ResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyOmsEndpointV2ResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOmsEndpointV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointV2ResponseBody self = new ModifyOmsEndpointV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointV2ResponseBody setData(ModifyOmsEndpointV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyOmsEndpointV2ResponseBodyData getData() {
        return this.data;
    }

    public ModifyOmsEndpointV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyOmsEndpointV2ResponseBodyDataMaster extends TeaModel {
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

        public static ModifyOmsEndpointV2ResponseBodyDataMaster build(java.util.Map<String, ?> map) throws Exception {
            ModifyOmsEndpointV2ResponseBodyDataMaster self = new ModifyOmsEndpointV2ResponseBodyDataMaster();
            return TeaModel.build(map, self);
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ModifyOmsEndpointV2ResponseBodyDataMaster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ModifyOmsEndpointV2ResponseBodyDataSlave extends TeaModel {
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

        public static ModifyOmsEndpointV2ResponseBodyDataSlave build(java.util.Map<String, ?> map) throws Exception {
            ModifyOmsEndpointV2ResponseBodyDataSlave self = new ModifyOmsEndpointV2ResponseBodyDataSlave();
            return TeaModel.build(map, self);
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ModifyOmsEndpointV2ResponseBodyDataSlave setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ModifyOmsEndpointV2ResponseBodyData extends TeaModel {
        @NameInMap("Master")
        public ModifyOmsEndpointV2ResponseBodyDataMaster master;

        @NameInMap("Slave")
        public ModifyOmsEndpointV2ResponseBodyDataSlave slave;

        public static ModifyOmsEndpointV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyOmsEndpointV2ResponseBodyData self = new ModifyOmsEndpointV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyOmsEndpointV2ResponseBodyData setMaster(ModifyOmsEndpointV2ResponseBodyDataMaster master) {
            this.master = master;
            return this;
        }
        public ModifyOmsEndpointV2ResponseBodyDataMaster getMaster() {
            return this.master;
        }

        public ModifyOmsEndpointV2ResponseBodyData setSlave(ModifyOmsEndpointV2ResponseBodyDataSlave slave) {
            this.slave = slave;
            return this;
        }
        public ModifyOmsEndpointV2ResponseBodyDataSlave getSlave() {
            return this.slave;
        }

    }

}
