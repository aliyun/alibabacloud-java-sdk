// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsOutput extends TeaModel {
    @NameInMap("applications")
    public java.util.List<Application> applications;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    public static ListApplicationsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsOutput self = new ListApplicationsOutput();
        return TeaModel.build(map, self);
    }

    public ListApplicationsOutput setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public ListApplicationsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
