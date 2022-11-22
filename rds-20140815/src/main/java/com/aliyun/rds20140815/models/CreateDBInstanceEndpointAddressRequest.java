// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointAddressRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDBInstanceEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointAddressRequest self = new CreateDBInstanceEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceEndpointAddressRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public CreateDBInstanceEndpointAddressRequest setDBInstanceEndpointId(String DBInstanceEndpointId) {
        this.DBInstanceEndpointId = DBInstanceEndpointId;
        return this;
    }
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    public CreateDBInstanceEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceEndpointAddressRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public CreateDBInstanceEndpointAddressRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
