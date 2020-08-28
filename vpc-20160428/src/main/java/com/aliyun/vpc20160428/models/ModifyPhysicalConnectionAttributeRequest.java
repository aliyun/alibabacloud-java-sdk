// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyPhysicalConnectionAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("LineOperator")
    public String lineOperator;

    @NameInMap("bandwidth")
    public Integer bandwidth;

    @NameInMap("PeerLocation")
    public String peerLocation;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CircuitCode")
    public String circuitCode;

    public static ModifyPhysicalConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhysicalConnectionAttributeRequest self = new ModifyPhysicalConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

}
