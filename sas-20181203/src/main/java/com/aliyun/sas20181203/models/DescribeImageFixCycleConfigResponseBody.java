// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageFixCycleConfigResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeImageFixCycleConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0D****</p>
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
         * <p>The scheduled fix cycle. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ImageFixCycle")
        public Integer imageFixCycle;

        /**
         * <p>The scheduled image fix switch. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ImageFixSwitch")
        public String imageFixSwitch;

        /**
         * <p>The scope of the scheduled image fix. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: The target type. The value is fixed as repo.</li>
         * <li><strong>target</strong>: The target content. Format: namespace/image repository.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;repo\&quot;,\&quot;target\&quot;:[\&quot;qa-dac/yyuan9\&quot;,\&quot;cdp-uat/zentao\&quot;,\&quot;cafdms-qa/xxl-job-admin\&quot;,\&quot;cafdms-qa/utils/jdk\&quot;,\&quot;cafmfbi/ui\&quot;,\&quot;cdp-uat/tradingdesk-webapp\&quot;]}</p>
         */
        @NameInMap("ImageFixTarget")
        public String imageFixTarget;

        /**
         * <p>The time range during which the image was modified. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
