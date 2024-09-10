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
     * 
     * <strong>example:</strong>
     * <p>B37C9052-A73E-4707-A024-92477028****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1671630647018</p>
         */
        @NameInMap("NextScheduleTime")
        public Long nextScheduleTime;

        /**
         * <p>The collection frequency of asset fingerprints. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.</li>
         * <li><strong>1</strong>: collects asset fingerprints once an hour.</li>
         * <li><strong>3</strong>: collects asset fingerprints once every 3 hours.</li>
         * <li><strong>12</strong>: collects asset fingerprints once every 12 hours.</li>
         * <li><strong>24</strong>: collects asset fingerprints once a day.</li>
         * <li><strong>168</strong>: collects asset fingerprints once every 7 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The type of the asset fingerprints. Valid values:</p>
         * <ul>
         * <li><strong>scheduler_port_period</strong>: listening port</li>
         * <li><strong>scheduler_process_period</strong>: running process</li>
         * <li><strong>scheduler_account_period</strong>: account</li>
         * <li><strong>scheduler_software_period</strong>: software</li>
         * <li><strong>scheduler_cron_period</strong>: scheduled task</li>
         * <li><strong>scheduler_sca_period</strong>: middleware</li>
         * <li><strong>scheduler_autorun_period</strong>: startup item</li>
         * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
         * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scheduler_account_period</p>
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
