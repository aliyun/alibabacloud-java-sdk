// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketWormResponseBody extends TeaModel {
    @NameInMap("CreationDate")
    public String creationDate;

    @NameInMap("RetentionPeriodInDays")
    public Integer retentionPeriodInDays;

    @NameInMap("State")
    public String state;

    @NameInMap("WormId")
    public String wormId;

    public static GetBucketWormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketWormResponseBody self = new GetBucketWormResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketWormResponseBody setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    public String getCreationDate() {
        return this.creationDate;
    }

    public GetBucketWormResponseBody setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    public GetBucketWormResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetBucketWormResponseBody setWormId(String wormId) {
        this.wormId = wormId;
        return this;
    }
    public String getWormId() {
        return this.wormId;
    }

}
