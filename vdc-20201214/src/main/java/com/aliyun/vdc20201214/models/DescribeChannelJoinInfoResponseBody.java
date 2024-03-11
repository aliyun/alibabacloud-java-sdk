// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelJoinInfoResponseBody extends TeaModel {
    @NameInMap("JoinFastSuccessRate")
    public String joinFastSuccessRate;

    @NameInMap("JoinSlowThreshold")
    public Long joinSlowThreshold;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelJoinInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelJoinInfoResponseBody self = new DescribeChannelJoinInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelJoinInfoResponseBody setJoinFastSuccessRate(String joinFastSuccessRate) {
        this.joinFastSuccessRate = joinFastSuccessRate;
        return this;
    }
    public String getJoinFastSuccessRate() {
        return this.joinFastSuccessRate;
    }

    public DescribeChannelJoinInfoResponseBody setJoinSlowThreshold(Long joinSlowThreshold) {
        this.joinSlowThreshold = joinSlowThreshold;
        return this;
    }
    public Long getJoinSlowThreshold() {
        return this.joinSlowThreshold;
    }

    public DescribeChannelJoinInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
