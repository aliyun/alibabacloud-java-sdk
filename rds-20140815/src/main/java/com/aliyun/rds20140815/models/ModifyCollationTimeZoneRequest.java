// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneRequest extends TeaModel {
    /**
     * <p>The character set collation of the instance. Valid values:</p>
     * <br>
     * <p>*   **Latin1\_General_CI_AS**</p>
     * <p>*   **Latin1\_General_CS_AS**</p>
     * <p>*   **SQL_Latin1\_General_CP1\_CI_AS**</p>
     * <p>*   **SQL_Latin1\_General_CP1\_CS_AS**</p>
     * <p>*   **Chinese_PRC_CS_AS**</p>
     * <p>*   **Chinese_PRC_BIN**</p>
     * <p>*   **Chinese_PRC_CI_AS**</p>
     * <p>*   **Japanese_CI_AS**</p>
     * <p>*   **Japanese_CS_AS**</p>
     * <p>*   **Chinese_Taiwan_Stroke_CI_AS**</p>
     * <p>*   **Chinese_Taiwan_Stroke_CS_AS**</p>
     * <br>
     * <p>By default, the system does not modify the character set collation of the instance.</p>
     * <br>
     * <p>> You must specify one of the **Collation** and **Timezone** parameters.</p>
     */
    @NameInMap("Collation")
    public String collation;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time zone of the instance. By default, the system does not modify the time zone.</p>
     * <br>
     * <p>> You must specify one of the **Collation** and **Timezone** parameters.</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static ModifyCollationTimeZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollationTimeZoneRequest self = new ModifyCollationTimeZoneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCollationTimeZoneRequest setCollation(String collation) {
        this.collation = collation;
        return this;
    }
    public String getCollation() {
        return this.collation;
    }

    public ModifyCollationTimeZoneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyCollationTimeZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCollationTimeZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCollationTimeZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCollationTimeZoneRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
