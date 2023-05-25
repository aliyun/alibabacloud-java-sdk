// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The encoding standard of the database.</p>
     * <p>For more information, see the Charset field returned by the DescribeCharset operation.</p>
     */
    @NameInMap("Collation")
    public String collation;

    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **CreateDatabase**.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("Encoding")
    public String encoding;

    /**
     * <p>The collation.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the database.   </p>
     * <p>You cannot use reserved keywords, such as test and mysql.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDatabaseRequest setCollation(String collation) {
        this.collation = collation;
        return this;
    }
    public String getCollation() {
        return this.collation;
    }

    public CreateDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateDatabaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatabaseRequest setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public CreateDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDatabaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
