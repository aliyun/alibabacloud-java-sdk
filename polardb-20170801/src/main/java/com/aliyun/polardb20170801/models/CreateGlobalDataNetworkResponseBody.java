// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDataNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>gdc-xxx</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The ID of the global database network (GDN).</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-xxx</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalDataNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDataNetworkResponseBody self = new CreateGlobalDataNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDataNetworkResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateGlobalDataNetworkResponseBody setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateGlobalDataNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
