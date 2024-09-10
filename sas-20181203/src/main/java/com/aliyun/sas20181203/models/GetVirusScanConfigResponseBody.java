// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVirusScanConfigResponseBody extends TeaModel {
    /**
     * <p>The data returned if the request was successful.</p>
     */
    @NameInMap("Data")
    public GetVirusScanConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6BDEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVirusScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanConfigResponseBody self = new GetVirusScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVirusScanConfigResponseBody setData(GetVirusScanConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVirusScanConfigResponseBodyData getData() {
        return this.data;
    }

    public GetVirusScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVirusScanConfigResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the task configuration.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCycleTaskList~~">DescribeCycleTaskList</a> operation to query the IDs of task configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>97a1fed216908e417407344e1505xxxx</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>Indicates whether the periodic scan feature is enabled. Valid value:</p>
         * <ul>
         * <li><strong>1</strong>: The feature is enabled</li>
         * <li><strong>0</strong>: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The interval at which virus scan tasks are run.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("IntervalPeriod")
        public Integer intervalPeriod;

        /**
         * <p>The unit of the interval at which virus scan tasks are run.</p>
         * <ul>
         * <li>The value is fixed as <strong>day</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The file paths.</p>
         */
        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        /**
         * <p>The type of the virus scan task. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: automatic scan.</li>
         * <li><strong>user</strong>: custom scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The key that stores the asset information.</p>
         * <blockquote>
         * <p>You can call the <a href="~~GetAssetSelectionConfig~~">GetAssetSelectionConfig</a> operation to obtain the key value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>345ddbea-a57f-437e-832f-fb7a1202xxxx</p>
         */
        @NameInMap("SelectionKey")
        public String selectionKey;

        /**
         * <p>The end time of the virus scan task. The time is a time frame.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("TargetEndTime")
        public Integer targetEndTime;

        /**
         * <p>The start time of the virus scan task. The time is a time frame.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TargetStartTime")
        public Integer targetStartTime;

        /**
         * <p>The type of the task. Valid value:</p>
         * <ul>
         * <li><strong>VIRUS_VUL_SCHEDULE_SCAN</strong>: a virus scan task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static GetVirusScanConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVirusScanConfigResponseBodyData self = new GetVirusScanConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVirusScanConfigResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public GetVirusScanConfigResponseBodyData setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public GetVirusScanConfigResponseBodyData setIntervalPeriod(Integer intervalPeriod) {
            this.intervalPeriod = intervalPeriod;
            return this;
        }
        public Integer getIntervalPeriod() {
            return this.intervalPeriod;
        }

        public GetVirusScanConfigResponseBodyData setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public GetVirusScanConfigResponseBodyData setScanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        public GetVirusScanConfigResponseBodyData setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public GetVirusScanConfigResponseBodyData setSelectionKey(String selectionKey) {
            this.selectionKey = selectionKey;
            return this;
        }
        public String getSelectionKey() {
            return this.selectionKey;
        }

        public GetVirusScanConfigResponseBodyData setTargetEndTime(Integer targetEndTime) {
            this.targetEndTime = targetEndTime;
            return this;
        }
        public Integer getTargetEndTime() {
            return this.targetEndTime;
        }

        public GetVirusScanConfigResponseBodyData setTargetStartTime(Integer targetStartTime) {
            this.targetStartTime = targetStartTime;
            return this;
        }
        public Integer getTargetStartTime() {
            return this.targetStartTime;
        }

        public GetVirusScanConfigResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
