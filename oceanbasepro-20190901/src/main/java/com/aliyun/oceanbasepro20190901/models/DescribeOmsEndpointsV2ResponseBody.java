// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointsV2ResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeOmsEndpointsV2ResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Long success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOmsEndpointsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointsV2ResponseBody self = new DescribeOmsEndpointsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointsV2ResponseBody setData(java.util.List<DescribeOmsEndpointsV2ResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsEndpointsV2ResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsEndpointsV2ResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsEndpointsV2ResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsEndpointsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOmsEndpointsV2ResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public DescribeOmsEndpointsV2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOmsEndpointsV2ResponseBodyDataMaster extends TeaModel {
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

        @NameInMap("DomainParams")
        public java.util.Map<String, ?> domainParams;

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

        public static DescribeOmsEndpointsV2ResponseBodyDataMaster build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsEndpointsV2ResponseBodyDataMaster self = new DescribeOmsEndpointsV2ResponseBodyDataMaster();
            return TeaModel.build(map, self);
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setDomainParams(java.util.Map<String, ?> domainParams) {
            this.domainParams = domainParams;
            return this;
        }
        public java.util.Map<String, ?> getDomainParams() {
            return this.domainParams;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataMaster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeOmsEndpointsV2ResponseBodyDataSlave extends TeaModel {
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

        @NameInMap("DomainParams")
        public java.util.Map<String, ?> domainParams;

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

        public static DescribeOmsEndpointsV2ResponseBodyDataSlave build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsEndpointsV2ResponseBodyDataSlave self = new DescribeOmsEndpointsV2ResponseBodyDataSlave();
            return TeaModel.build(map, self);
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setCloudInstanceRegionId(String cloudInstanceRegionId) {
            this.cloudInstanceRegionId = cloudInstanceRegionId;
            return this;
        }
        public String getCloudInstanceRegionId() {
            return this.cloudInstanceRegionId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setCloudInstanceTenantId(String cloudInstanceTenantId) {
            this.cloudInstanceTenantId = cloudInstanceTenantId;
            return this;
        }
        public String getCloudInstanceTenantId() {
            return this.cloudInstanceTenantId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setDgInstanceId(String dgInstanceId) {
            this.dgInstanceId = dgInstanceId;
            return this;
        }
        public String getDgInstanceId() {
            return this.dgInstanceId;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setDomainParams(java.util.Map<String, ?> domainParams) {
            this.domainParams = domainParams;
            return this;
        }
        public java.util.Map<String, ?> getDomainParams() {
            return this.domainParams;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setEndpointSource(String endpointSource) {
            this.endpointSource = endpointSource;
            return this;
        }
        public String getEndpointSource() {
            return this.endpointSource;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setNlsLengthSemantics(String nlsLengthSemantics) {
            this.nlsLengthSemantics = nlsLengthSemantics;
            return this;
        }
        public String getNlsLengthSemantics() {
            return this.nlsLengthSemantics;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeOmsEndpointsV2ResponseBodyDataSlave setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeOmsEndpointsV2ResponseBodyData extends TeaModel {
        @NameInMap("Master")
        public DescribeOmsEndpointsV2ResponseBodyDataMaster master;

        @NameInMap("Slave")
        public DescribeOmsEndpointsV2ResponseBodyDataSlave slave;

        public static DescribeOmsEndpointsV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsEndpointsV2ResponseBodyData self = new DescribeOmsEndpointsV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsEndpointsV2ResponseBodyData setMaster(DescribeOmsEndpointsV2ResponseBodyDataMaster master) {
            this.master = master;
            return this;
        }
        public DescribeOmsEndpointsV2ResponseBodyDataMaster getMaster() {
            return this.master;
        }

        public DescribeOmsEndpointsV2ResponseBodyData setSlave(DescribeOmsEndpointsV2ResponseBodyDataSlave slave) {
            this.slave = slave;
            return this;
        }
        public DescribeOmsEndpointsV2ResponseBodyDataSlave getSlave() {
            return this.slave;
        }

    }

}
