// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryApprovalInfoRequest extends TeaModel {
    /**
     * <p>Page number, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>Number of rows per page, default is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Approval status:</p>
     * <ul>
     * <li>0: Pending</li>
     * <li>1: Processed</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Current approver user ID, qbi user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12352fasdavsa</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryApprovalInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApprovalInfoRequest self = new QueryApprovalInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryApprovalInfoRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryApprovalInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryApprovalInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryApprovalInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
