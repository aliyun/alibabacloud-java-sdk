// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixCycleConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeImageFixCycleConfigResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageFixCycleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFixCycleConfigResponseBody self = new DescribeImageFixCycleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageFixCycleConfigResponseBody setData(DescribeImageFixCycleConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageFixCycleConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageFixCycleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageFixCycleConfigResponseBodyData extends TeaModel {
        @NameInMap("ImageFixCycle")
        public Integer imageFixCycle;

        @NameInMap("ImageFixSwitch")
        public String imageFixSwitch;

        @NameInMap("ImageFixTarget")
        public String imageFixTarget;

        @NameInMap("ImageTimeRange")
        public Integer imageTimeRange;

        public static DescribeImageFixCycleConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageFixCycleConfigResponseBodyData self = new DescribeImageFixCycleConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageFixCycleConfigResponseBodyData setImageFixCycle(Integer imageFixCycle) {
            this.imageFixCycle = imageFixCycle;
            return this;
        }
        public Integer getImageFixCycle() {
            return this.imageFixCycle;
        }

        public DescribeImageFixCycleConfigResponseBodyData setImageFixSwitch(String imageFixSwitch) {
            this.imageFixSwitch = imageFixSwitch;
            return this;
        }
        public String getImageFixSwitch() {
            return this.imageFixSwitch;
        }

        public DescribeImageFixCycleConfigResponseBodyData setImageFixTarget(String imageFixTarget) {
            this.imageFixTarget = imageFixTarget;
            return this;
        }
        public String getImageFixTarget() {
            return this.imageFixTarget;
        }

        public DescribeImageFixCycleConfigResponseBodyData setImageTimeRange(Integer imageTimeRange) {
            this.imageTimeRange = imageTimeRange;
            return this;
        }
        public Integer getImageTimeRange() {
            return this.imageTimeRange;
        }

    }

}
