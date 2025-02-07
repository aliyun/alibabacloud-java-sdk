// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusRequest extends TeaModel {
    /**
     * <p>The ID of the listener of the NLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-bp1bpn0kn908w4nbw****@80</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetListenerHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusRequest self = new GetListenerHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerHealthStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
