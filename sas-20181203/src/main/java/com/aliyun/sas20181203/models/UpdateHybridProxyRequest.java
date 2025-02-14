// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHybridProxyRequest extends TeaModel {
    /**
     * <p>The UUID of the Security Center agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-proxy-14bbbb37-c4b9-4e86-83bd-137a940a6ec4</p>
     */
    @NameInMap("ProxyUuid")
    public String proxyUuid;

    public static UpdateHybridProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHybridProxyRequest self = new UpdateHybridProxyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHybridProxyRequest setProxyUuid(String proxyUuid) {
        this.proxyUuid = proxyUuid;
        return this;
    }
    public String getProxyUuid() {
        return this.proxyUuid;
    }

}
