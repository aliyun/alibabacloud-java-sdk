// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DatabasePort")
    public Integer databasePort;

    @NameInMap("DatabasePrivateAddress")
    public String databasePrivateAddress;

    @NameInMap("DatabasePublicAddress")
    public String databasePublicAddress;

    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("PolarDBEndpointType")
    public String polarDBEndpointType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("SourceInstanceRegionId")
    public String sourceInstanceRegionId;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public CreateDatabaseRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDatabaseRequest setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
        return this;
    }
    public Integer getDatabasePort() {
        return this.databasePort;
    }

    public CreateDatabaseRequest setDatabasePrivateAddress(String databasePrivateAddress) {
        this.databasePrivateAddress = databasePrivateAddress;
        return this;
    }
    public String getDatabasePrivateAddress() {
        return this.databasePrivateAddress;
    }

    public CreateDatabaseRequest setDatabasePublicAddress(String databasePublicAddress) {
        this.databasePublicAddress = databasePublicAddress;
        return this;
    }
    public String getDatabasePublicAddress() {
        return this.databasePublicAddress;
    }

    public CreateDatabaseRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDatabaseRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public CreateDatabaseRequest setPolarDBEndpointType(String polarDBEndpointType) {
        this.polarDBEndpointType = polarDBEndpointType;
        return this;
    }
    public String getPolarDBEndpointType() {
        return this.polarDBEndpointType;
    }

    public CreateDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDatabaseRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateDatabaseRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateDatabaseRequest setSourceInstanceRegionId(String sourceInstanceRegionId) {
        this.sourceInstanceRegionId = sourceInstanceRegionId;
        return this;
    }
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

}
