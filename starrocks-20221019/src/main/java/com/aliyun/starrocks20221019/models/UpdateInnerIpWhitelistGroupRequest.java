// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateInnerIpWhitelistGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrIpList")
    public java.util.List<String> cidrIpList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-28sjsi12bs1</p>
     */
    @NameInMap("InnerIpWhitelistGroupId")
    public String innerIpWhitelistGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-0104730e9de40215</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateInnerIpWhitelistGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerIpWhitelistGroupRequest self = new UpdateInnerIpWhitelistGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerIpWhitelistGroupRequest setCidrIpList(java.util.List<String> cidrIpList) {
        this.cidrIpList = cidrIpList;
        return this;
    }
    public java.util.List<String> getCidrIpList() {
        return this.cidrIpList;
    }

    public UpdateInnerIpWhitelistGroupRequest setInnerIpWhitelistGroupId(String innerIpWhitelistGroupId) {
        this.innerIpWhitelistGroupId = innerIpWhitelistGroupId;
        return this;
    }
    public String getInnerIpWhitelistGroupId() {
        return this.innerIpWhitelistGroupId;
    }

    public UpdateInnerIpWhitelistGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
