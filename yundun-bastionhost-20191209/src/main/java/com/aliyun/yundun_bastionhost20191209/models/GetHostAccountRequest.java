// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostAccountRequest extends TeaModel {
    /**
     * <p>The ID of the host account that you want to query.</p>
     * <br>
     * <p>> You can call the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>The ID of the bastion host in which you want to query the details of the host account.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host in which you want to query the details of the host account.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHostAccountRequest self = new GetHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetHostAccountRequest setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public GetHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
