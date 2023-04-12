// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTargetAttachmentsForControlPolicyRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the access control policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static ListTargetAttachmentsForControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTargetAttachmentsForControlPolicyRequest self = new ListTargetAttachmentsForControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListTargetAttachmentsForControlPolicyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTargetAttachmentsForControlPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTargetAttachmentsForControlPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
