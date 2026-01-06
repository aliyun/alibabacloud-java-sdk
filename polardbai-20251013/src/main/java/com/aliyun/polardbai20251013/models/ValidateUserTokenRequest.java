// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ValidateUserTokenRequest extends TeaModel {
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

    public static ValidateUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateUserTokenRequest self = new ValidateUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public ValidateUserTokenRequest setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
        return this;
    }
    public String getAuthMessage() {
        return this.authMessage;
    }

    public ValidateUserTokenRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ValidateUserTokenRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
