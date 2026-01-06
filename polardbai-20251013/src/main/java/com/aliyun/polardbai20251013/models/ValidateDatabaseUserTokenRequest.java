// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ValidateDatabaseUserTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yEtNjzuM21NVLVJTuL9Trw****</p>
     */
    @NameInMap("AuthMessage")
    public String authMessage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ai_test</p>
     */
    @NameInMap("DBName")
    public String DBName;

    public static ValidateDatabaseUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateDatabaseUserTokenRequest self = new ValidateDatabaseUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public ValidateDatabaseUserTokenRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ValidateDatabaseUserTokenRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ValidateDatabaseUserTokenRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ValidateDatabaseUserTokenRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

}
