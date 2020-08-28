// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpPeerAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BgpPeerId")
    @Validation(required = true)
    public String bgpPeerId;

    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    @NameInMap("PeerIpAddress")
    public String peerIpAddress;

    @NameInMap("EnableBfd")
    public Boolean enableBfd;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("BfdMultiHop")
    public Integer bfdMultiHop;

    public static ModifyBgpPeerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpPeerAttributeRequest self = new ModifyBgpPeerAttributeRequest();
        return TeaModel.build(map, self);
    }

}
