// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ModifySecureNetworkTypeRequest extends TeaModel {
    @NameInMap("SecureNetworkType")
    public String secureNetworkType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    public static ModifySecureNetworkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecureNetworkTypeRequest self = new ModifySecureNetworkTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecureNetworkTypeRequest setSecureNetworkType(String secureNetworkType) {
        this.secureNetworkType = secureNetworkType;
        return this;
    }
    public String getSecureNetworkType() {
        return this.secureNetworkType;
    }

    public ModifySecureNetworkTypeRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
