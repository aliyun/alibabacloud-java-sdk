// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetRequest extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ExecuteChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeSetRequest self = new ExecuteChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeSetRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public ExecuteChangeSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
