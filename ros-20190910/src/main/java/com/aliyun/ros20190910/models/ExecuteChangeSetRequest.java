// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ExecuteChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeSetRequest self = new ExecuteChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
