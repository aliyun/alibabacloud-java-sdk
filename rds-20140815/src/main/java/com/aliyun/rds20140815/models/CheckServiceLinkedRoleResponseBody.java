// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether an SLR is created.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasServiceLinkedRole")
    public String hasServiceLinkedRole;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AB44DC0A-7E77-442A-97A9-C6418694CB22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the service-linked role is required. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequireServiceLinkedRole")
    public String requireServiceLinkedRole;

    public static CheckServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponseBody self = new CheckServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponseBody setHasServiceLinkedRole(String hasServiceLinkedRole) {
        this.hasServiceLinkedRole = hasServiceLinkedRole;
        return this;
    }
    public String getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    public CheckServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleResponseBody setRequireServiceLinkedRole(String requireServiceLinkedRole) {
        this.requireServiceLinkedRole = requireServiceLinkedRole;
        return this;
    }
    public String getRequireServiceLinkedRole() {
        return this.requireServiceLinkedRole;
    }

}
