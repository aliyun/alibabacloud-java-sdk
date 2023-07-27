// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListAccessPointsResult extends TeaModel {
    @NameInMap("AccessPoints")
    public java.util.List<AccessPoint> accessPoints;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("IsTruncated")
    public String isTruncated;

    @NameInMap("NextContinuationToken")
    public String nextContinuationToken;

    public static ListAccessPointsResult build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPointsResult self = new ListAccessPointsResult();
        return TeaModel.build(map, self);
    }

    public ListAccessPointsResult setAccessPoints(java.util.List<AccessPoint> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }
    public java.util.List<AccessPoint> getAccessPoints() {
        return this.accessPoints;
    }

    public ListAccessPointsResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListAccessPointsResult setIsTruncated(String isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public String getIsTruncated() {
        return this.isTruncated;
    }

    public ListAccessPointsResult setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

}
