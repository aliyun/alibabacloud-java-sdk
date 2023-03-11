// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetPropertyScheduleConfigResponseBody extends TeaModel {
    /**
     * <p>The configurations for the collection frequency of asset fingerprints.</p>
     */
    @NameInMap("PropertyScheduleConfig")
    public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig propertyScheduleConfig;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPropertyScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPropertyScheduleConfigResponseBody self = new GetPropertyScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPropertyScheduleConfigResponseBody setPropertyScheduleConfig(GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig propertyScheduleConfig) {
        this.propertyScheduleConfig = propertyScheduleConfig;
        return this;
    }
    public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig getPropertyScheduleConfig() {
        return this.propertyScheduleConfig;
    }

    public GetPropertyScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig extends TeaModel {
        /**
         * <p>The timestamp when the next collection of asset fingerprints starts. Unit: milliseconds.</p>
         */
        @NameInMap("NextScheduleTime")
        public Long nextScheduleTime;

        /**
         * <p>The collection frequency of asset fingerprints. Valid values:</p>
         * <br>
         * <p>*   **0**: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.</p>
         * <p>*   **1**: collects asset fingerprints once an hour.</p>
         * <p>*   **3**: collects asset fingerprints once every 3 hours.</p>
         * <p>*   **12**: collects asset fingerprints once every 12 hours.</p>
         * <p>*   **24**: collects asset fingerprints once a day.</p>
         * <p>*   **168**: collects asset fingerprints once every 7 days.</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The type of the asset fingerprints. Valid values:</p>
         * <br>
         * <p>*   **scheduler_port_period**: listening port</p>
         * <p>*   **scheduler_process_period**: running process</p>
         * <p>*   **scheduler_account_period**: account</p>
         * <p>*   **scheduler_software_period**: software</p>
         * <p>*   **scheduler_cron_period**: scheduled task</p>
         * <p>*   **scheduler_sca_period**: middleware</p>
         * <p>*   **scheduler_autorun_period**: startup item</p>
         * <p>*   **scheduler_lkm_period**: kernel module</p>
         * <p>*   **scheduler_sca_proxy_period**: website</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig self = new GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig setNextScheduleTime(Long nextScheduleTime) {
            this.nextScheduleTime = nextScheduleTime;
            return this;
        }
        public Long getNextScheduleTime() {
            return this.nextScheduleTime;
        }

        public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public GetPropertyScheduleConfigResponseBodyPropertyScheduleConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
