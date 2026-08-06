// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListOutboundCallRestrictionsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The policy. Valid values:
     * 0: blacklist.
     * 1: whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Policy")
    public Integer policy;

    public static ListOutboundCallRestrictionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundCallRestrictionsRequest self = new ListOutboundCallRestrictionsRequest();
        return TeaModel.build(map, self);
    }

    public ListOutboundCallRestrictionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOutboundCallRestrictionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOutboundCallRestrictionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOutboundCallRestrictionsRequest setPolicy(Integer policy) {
        this.policy = policy;
        return this;
    }
    public Integer getPolicy() {
        return this.policy;
    }

}
