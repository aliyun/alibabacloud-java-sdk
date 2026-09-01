// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCancelIgnoreSuspEventRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark text</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The IDs of alert events.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityEventIds")
    public java.util.List<Long> securityEventIds;

    public static OperationCancelIgnoreSuspEventRequest build(java.util.Map<String, ?> map) throws Exception {
        OperationCancelIgnoreSuspEventRequest self = new OperationCancelIgnoreSuspEventRequest();
        return TeaModel.build(map, self);
    }

    public OperationCancelIgnoreSuspEventRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OperationCancelIgnoreSuspEventRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public OperationCancelIgnoreSuspEventRequest setSecurityEventIds(java.util.List<Long> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<Long> getSecurityEventIds() {
        return this.securityEventIds;
    }

}
