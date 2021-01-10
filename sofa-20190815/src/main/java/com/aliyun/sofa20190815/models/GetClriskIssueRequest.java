// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskIssueRequest extends TeaModel {
    @NameInMap("IssueId")
    public Long issueId;

    public static GetClriskIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskIssueRequest self = new GetClriskIssueRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskIssueRequest setIssueId(Long issueId) {
        this.issueId = issueId;
        return this;
    }
    public Long getIssueId() {
        return this.issueId;
    }

}
