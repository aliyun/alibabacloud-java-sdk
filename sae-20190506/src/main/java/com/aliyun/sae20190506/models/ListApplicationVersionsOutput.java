// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationVersionsOutput extends TeaModel {
    @NameInMap("direction")
    public String direction;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("versions")
    public java.util.List<Version> versions;

    public static ListApplicationVersionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationVersionsOutput self = new ListApplicationVersionsOutput();
        return TeaModel.build(map, self);
    }

    public ListApplicationVersionsOutput setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListApplicationVersionsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationVersionsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationVersionsOutput setVersions(java.util.List<Version> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<Version> getVersions() {
        return this.versions;
    }

}
