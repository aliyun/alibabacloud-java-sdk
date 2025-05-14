// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalDataNetworkRequest extends TeaModel {
    /**
     * <p>GDN ID</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-xxx</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    public static DeleteGlobalDataNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalDataNetworkRequest self = new DeleteGlobalDataNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalDataNetworkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
