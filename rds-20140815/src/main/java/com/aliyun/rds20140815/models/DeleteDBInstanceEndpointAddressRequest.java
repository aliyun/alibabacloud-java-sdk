// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceEndpointAddressRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionString")
    public String connectionString;

    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDBInstanceEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceEndpointAddressRequest self = new DeleteDBInstanceEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceEndpointAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteDBInstanceEndpointAddressRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DeleteDBInstanceEndpointAddressRequest setDBInstanceEndpointId(String DBInstanceEndpointId) {
        this.DBInstanceEndpointId = DBInstanceEndpointId;
        return this;
    }
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    public DeleteDBInstanceEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBInstanceEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
