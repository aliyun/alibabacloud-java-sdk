// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListBucPermissionResourcePopResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceList")
    public java.util.List<String> resourceList;

    public static ListBucPermissionResourcePopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucPermissionResourcePopResponseBody self = new ListBucPermissionResourcePopResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucPermissionResourcePopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBucPermissionResourcePopResponseBody setResourceList(java.util.List<String> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<String> getResourceList() {
        return this.resourceList;
    }

}
