// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BeginTransactionRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    public static BeginTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        BeginTransactionRequest self = new BeginTransactionRequest();
        return TeaModel.build(map, self);
    }

    public BeginTransactionRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public BeginTransactionRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public BeginTransactionRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

}
