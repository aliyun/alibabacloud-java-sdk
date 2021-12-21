// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallListTestRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeCallListTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallListTestRequest self = new DescribeCallListTestRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCallListTestRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCallListTestRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeCallListTestRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
