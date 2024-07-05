// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeletePublicKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>appKey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    public static DeletePublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicKeyRequest self = new DeletePublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePublicKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
