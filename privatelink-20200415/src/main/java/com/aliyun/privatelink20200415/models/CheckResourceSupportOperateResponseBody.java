// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceCanBeDowngraded")
    public Boolean resourceCanBeDowngraded;

    @NameInMap("ResourceZoneCanBeDeleted")
    public Boolean resourceZoneCanBeDeleted;

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

    public CheckResourceSupportOperateResponseBody setResourceCanBeDowngraded(Boolean resourceCanBeDowngraded) {
        this.resourceCanBeDowngraded = resourceCanBeDowngraded;
        return this;
    }
    public Boolean getResourceCanBeDowngraded() {
        return this.resourceCanBeDowngraded;
    }

    public CheckResourceSupportOperateResponseBody setResourceZoneCanBeDeleted(Boolean resourceZoneCanBeDeleted) {
        this.resourceZoneCanBeDeleted = resourceZoneCanBeDeleted;
        return this;
    }
    public Boolean getResourceZoneCanBeDeleted() {
        return this.resourceZoneCanBeDeleted;
    }

}
