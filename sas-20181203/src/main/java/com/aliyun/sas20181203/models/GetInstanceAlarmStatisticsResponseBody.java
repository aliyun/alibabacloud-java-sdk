// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAlarmStatisticsResponseBody extends TeaModel {
    /**
     * <p>Data structure.</p>
     */
    @NameInMap("Data")
    public GetInstanceAlarmStatisticsResponseBodyData data;

    /**
     * <p>阿里云为该请求生成的唯一标识符。</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceAlarmStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAlarmStatisticsResponseBody self = new GetInstanceAlarmStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceAlarmStatisticsResponseBody setData(GetInstanceAlarmStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceAlarmStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceAlarmStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceAlarmStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>Reminder alarm count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemindCount")
        public Integer remindCount;

        /**
         * <p>Critical alarm count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeriousCount")
        public Integer seriousCount;

        /**
         * <p>Suspicious alarm count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        public static GetInstanceAlarmStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceAlarmStatisticsResponseBodyData self = new GetInstanceAlarmStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceAlarmStatisticsResponseBodyData setRemindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }
        public Integer getRemindCount() {
            return this.remindCount;
        }

        public GetInstanceAlarmStatisticsResponseBodyData setSeriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }
        public Integer getSeriousCount() {
            return this.seriousCount;
        }

        public GetInstanceAlarmStatisticsResponseBodyData setSuspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

    }

}
