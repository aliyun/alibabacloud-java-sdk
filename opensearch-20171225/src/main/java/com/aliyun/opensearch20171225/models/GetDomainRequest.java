// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetDomainRequest extends TeaModel {
    /**
     * <p>my_app_group_name</p>
     */
    @NameInMap("appGroupIdentity")
    public String appGroupIdentity;

    public static GetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainRequest self = new GetDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainRequest setAppGroupIdentity(String appGroupIdentity) {
        this.appGroupIdentity = appGroupIdentity;
        return this;
    }
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

}
