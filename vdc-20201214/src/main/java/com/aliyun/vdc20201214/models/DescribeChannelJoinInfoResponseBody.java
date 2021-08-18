// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelJoinInfoResponseBody extends TeaModel {
    // 入会慢时间阈值
    @NameInMap("JoinSlowThreshold")
    public Long joinSlowThreshold;

    // 在入会慢时间阈值内的入会成功率
    @NameInMap("JoinFastSuccessRate")
    public String joinFastSuccessRate;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelJoinInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelJoinInfoResponseBody self = new DescribeChannelJoinInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelJoinInfoResponseBody setJoinSlowThreshold(Long joinSlowThreshold) {
        this.joinSlowThreshold = joinSlowThreshold;
        return this;
    }
    public Long getJoinSlowThreshold() {
        return this.joinSlowThreshold;
    }

    public DescribeChannelJoinInfoResponseBody setJoinFastSuccessRate(String joinFastSuccessRate) {
        this.joinFastSuccessRate = joinFastSuccessRate;
        return this;
    }
    public String getJoinFastSuccessRate() {
        return this.joinFastSuccessRate;
    }

    public DescribeChannelJoinInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
