// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssueTaskRequest extends TeaModel {
    @NameInMap("IssueId")
    public Long issueId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListClriskIssueTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssueTaskRequest self = new ListClriskIssueTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskIssueTaskRequest setIssueId(Long issueId) {
        this.issueId = issueId;
        return this;
    }
    public Long getIssueId() {
        return this.issueId;
    }

    public ListClriskIssueTaskRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskIssueTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
