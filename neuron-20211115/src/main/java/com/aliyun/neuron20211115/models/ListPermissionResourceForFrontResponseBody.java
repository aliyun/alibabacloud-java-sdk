// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourceForFrontResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1D4A64A4-18AB-52CF-AB79-517AEC7DC63B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceList")
    public java.util.List<String> resourceList;

    public static ListPermissionResourceForFrontResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourceForFrontResponseBody self = new ListPermissionResourceForFrontResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourceForFrontResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionResourceForFrontResponseBody setResourceList(java.util.List<String> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<String> getResourceList() {
        return this.resourceList;
    }

}
