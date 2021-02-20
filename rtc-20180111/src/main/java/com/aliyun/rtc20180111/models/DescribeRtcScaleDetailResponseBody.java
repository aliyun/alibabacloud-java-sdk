// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcScaleDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scale")
    public java.util.List<DescribeRtcScaleDetailResponseBodyScale> scale;

    public static DescribeRtcScaleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcScaleDetailResponseBody self = new DescribeRtcScaleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcScaleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcScaleDetailResponseBody setScale(java.util.List<DescribeRtcScaleDetailResponseBodyScale> scale) {
        this.scale = scale;
        return this;
    }
    public java.util.List<DescribeRtcScaleDetailResponseBodyScale> getScale() {
        return this.scale;
    }

    public static class DescribeRtcScaleDetailResponseBodyScale extends TeaModel {
        @NameInMap("CC")
        public Long CC;

        @NameInMap("TS")
        public String TS;

        @NameInMap("UC")
        public Long UC;

        public static DescribeRtcScaleDetailResponseBodyScale build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcScaleDetailResponseBodyScale self = new DescribeRtcScaleDetailResponseBodyScale();
            return TeaModel.build(map, self);
        }

        public DescribeRtcScaleDetailResponseBodyScale setCC(Long CC) {
            this.CC = CC;
            return this;
        }
        public Long getCC() {
            return this.CC;
        }

        public DescribeRtcScaleDetailResponseBodyScale setTS(String TS) {
            this.TS = TS;
            return this;
        }
        public String getTS() {
            return this.TS;
        }

        public DescribeRtcScaleDetailResponseBodyScale setUC(Long UC) {
            this.UC = UC;
            return this;
        }
        public Long getUC() {
            return this.UC;
        }

    }

}
