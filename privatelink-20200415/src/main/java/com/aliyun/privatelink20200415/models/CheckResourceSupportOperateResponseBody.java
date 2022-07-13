// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceSupportDowngrade")
    public Boolean resourceSupportDowngrade;

    @NameInMap("ResourceZoneSupportDeleted")
    public Boolean resourceZoneSupportDeleted;

    public static CheckResourceSupportOperateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceSupportOperateResponseBody self = new CheckResourceSupportOperateResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourceSupportOperateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResourceSupportOperateResponseBody setResourceSupportDowngrade(Boolean resourceSupportDowngrade) {
        this.resourceSupportDowngrade = resourceSupportDowngrade;
        return this;
    }
    public Boolean getResourceSupportDowngrade() {
        return this.resourceSupportDowngrade;
    }

    public CheckResourceSupportOperateResponseBody setResourceZoneSupportDeleted(Boolean resourceZoneSupportDeleted) {
        this.resourceZoneSupportDeleted = resourceZoneSupportDeleted;
        return this;
    }
    public Boolean getResourceZoneSupportDeleted() {
        return this.resourceZoneSupportDeleted;
    }

}
