// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckResourceSupportOperateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the service resource can be downgraded. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ResourceCanBeDowngraded")
    public Boolean resourceCanBeDowngraded;

    /**
     * <p>Indicates whether the zone where the service resource is deployed can be deleted. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
