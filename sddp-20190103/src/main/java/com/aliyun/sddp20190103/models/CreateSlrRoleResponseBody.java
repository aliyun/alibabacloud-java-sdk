// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateSlrRoleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the service-linked role was created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasPermission")
    public Boolean hasPermission;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>208B016D-4CB9-4A85-96A5-0B8ED1EBF271</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSlrRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleResponseBody self = new CreateSlrRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleResponseBody setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
        return this;
    }
    public Boolean getHasPermission() {
        return this.hasPermission;
    }

    public CreateSlrRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
