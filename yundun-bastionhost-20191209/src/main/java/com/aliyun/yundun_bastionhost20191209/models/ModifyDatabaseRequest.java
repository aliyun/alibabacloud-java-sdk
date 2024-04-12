// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseRequest extends TeaModel {
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("DatabaseId")
    public String databaseId;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DatabasePort")
    public String databasePort;

    @NameInMap("DatabasePrivateAddress")
    public String databasePrivateAddress;

    @NameInMap("DatabasePublicAddress")
    public String databasePublicAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    public static ModifyDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseRequest self = new ModifyDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public ModifyDatabaseRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyDatabaseRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public ModifyDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ModifyDatabaseRequest setDatabasePort(String databasePort) {
        this.databasePort = databasePort;
        return this;
    }
    public String getDatabasePort() {
        return this.databasePort;
    }

    public ModifyDatabaseRequest setDatabasePrivateAddress(String databasePrivateAddress) {
        this.databasePrivateAddress = databasePrivateAddress;
        return this;
    }
    public String getDatabasePrivateAddress() {
        return this.databasePrivateAddress;
    }

    public ModifyDatabaseRequest setDatabasePublicAddress(String databasePublicAddress) {
        this.databasePublicAddress = databasePublicAddress;
        return this;
    }
    public String getDatabasePublicAddress() {
        return this.databasePublicAddress;
    }

    public ModifyDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDatabaseRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public ModifyDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDatabaseRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

}
