// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppConfigResponseBody extends TeaModel {
    // 阈值配置对象
    @NameInMap("ThresholdConfig")
    public DescribeAppConfigResponseBodyThresholdConfig thresholdConfig;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppConfigResponseBody self = new DescribeAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppConfigResponseBody setThresholdConfig(DescribeAppConfigResponseBodyThresholdConfig thresholdConfig) {
        this.thresholdConfig = thresholdConfig;
        return this;
    }
    public DescribeAppConfigResponseBodyThresholdConfig getThresholdConfig() {
        return this.thresholdConfig;
    }

    public DescribeAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppConfigResponseBodyThresholdConfig extends TeaModel {
        // 入会慢时间阈值，单位毫秒
        @NameInMap("JoinSlowTime")
        public Long joinSlowTime;

        public static DescribeAppConfigResponseBodyThresholdConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppConfigResponseBodyThresholdConfig self = new DescribeAppConfigResponseBodyThresholdConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAppConfigResponseBodyThresholdConfig setJoinSlowTime(Long joinSlowTime) {
            this.joinSlowTime = joinSlowTime;
            return this;
        }
        public Long getJoinSlowTime() {
            return this.joinSlowTime;
        }

    }

}
