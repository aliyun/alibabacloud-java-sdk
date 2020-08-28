// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterRequest extends TeaModel {
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DBType")
    @Validation(required = true)
    public String DBType;

    @NameInMap("DBVersion")
    @Validation(required = true)
    public String DBVersion;

    @NameInMap("DBNodeClass")
    @Validation(required = true)
    public String DBNodeClass;

    @NameInMap("ClusterNetworkType")
    public String clusterNetworkType;

    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("PayType")
    @Validation(required = true)
    public String payType;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("Period")
    public String period;

    @NameInMap("UsedTime")
    public String usedTime;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("CreationOption")
    public String creationOption;

    @NameInMap("SourceResourceId")
    public String sourceResourceId;

    @NameInMap("CloneDataPoint")
    public String cloneDataPoint;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("TDEStatus")
    public Boolean TDEStatus;

    @NameInMap("GDNId")
    public String GDNId;

    @NameInMap("CreationCategory")
    public String creationCategory;

    public static CreateDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterRequest self = new CreateDBClusterRequest();
        return TeaModel.build(map, self);
    }

}
