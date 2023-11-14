// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixCycleConfigResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribeImageFixCycleConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The cycle of the scheduled fix. Unit: day.</p>
         */
        @NameInMap("ImageFixCycle")
        public Integer imageFixCycle;

        /**
         * <p>Indicates whether the scheduled fix of image risks is enabled.</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("ImageFixSwitch")
        public String imageFixSwitch;

        /**
         * <p>The range of the scheduled fix. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <br>
         * <p>*   **type**: The type of the image risk. The value is fixed to repo.</p>
         * <p>*   **target**: The content of the image risk. The value is in the format of Namespace/Image repository.</p>
         */
        @NameInMap("ImageFixTarget")
        public String imageFixTarget;

        /**
         * <p>The time range during which the image was modified. Unit: day.</p>
         */
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
