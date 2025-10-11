// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBSecretRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-wz9fb5nn44u1d****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeEncryptionDBSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionDBSecretRequest self = new DescribeEncryptionDBSecretRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionDBSecretRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
