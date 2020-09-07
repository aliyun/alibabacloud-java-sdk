// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    public String connectionStringPrefix;

    @NameInMap("Port")
    public String port;

    @NameInMap("ConnectionStringType")
    public String connectionStringType;

    public static SwitchDBInstanceNetTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeRequest self = new SwitchDBInstanceNetTypeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceNetTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SwitchDBInstanceNetTypeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchDBInstanceNetTypeRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public SwitchDBInstanceNetTypeRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public SwitchDBInstanceNetTypeRequest setConnectionStringType(String connectionStringType) {
        this.connectionStringType = connectionStringType;
        return this;
    }
    public String getConnectionStringType() {
        return this.connectionStringType;
    }

}
