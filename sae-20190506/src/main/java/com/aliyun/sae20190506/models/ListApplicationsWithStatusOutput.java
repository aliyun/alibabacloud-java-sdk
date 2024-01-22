// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsWithStatusOutput extends TeaModel {
    @NameInMap("applications")
    public java.util.List<ApplicationWithStatus> applications;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    public static ListApplicationsWithStatusOutput build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsWithStatusOutput self = new ListApplicationsWithStatusOutput();
        return TeaModel.build(map, self);
    }

    public ListApplicationsWithStatusOutput setApplications(java.util.List<ApplicationWithStatus> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ApplicationWithStatus> getApplications() {
        return this.applications;
    }

    public ListApplicationsWithStatusOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsWithStatusOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
