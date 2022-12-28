// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the service resource can be downgraded. Valid values:
    // 
    // *   **true**: The service resource can be downgraded.
    // *   **false**: The service resource cannot be downgraded.
    @NameInMap("ResourceCanBeDowngraded")
    public Boolean resourceCanBeDowngraded;

    // Indicates whether the zone to which the service resource belongs can be deleted. Valid values:
    // 
    // *   **true**: The zone can be deleted.
    // *   **false**: The zone cannot be deleted.
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
