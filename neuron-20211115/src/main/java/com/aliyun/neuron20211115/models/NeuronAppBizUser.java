// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppBizUser extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1235254534</p>
     */
    @NameInMap("accountId")
    public Long accountId;

    /**
     * <strong>example:</strong>
     * <p>233131</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>ADMIN</p>
     */
    @NameInMap("permission")
    public String permission;

    public static NeuronAppBizUser build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppBizUser self = new NeuronAppBizUser();
        return TeaModel.build(map, self);
    }

    public NeuronAppBizUser setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public NeuronAppBizUser setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public NeuronAppBizUser setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

}
