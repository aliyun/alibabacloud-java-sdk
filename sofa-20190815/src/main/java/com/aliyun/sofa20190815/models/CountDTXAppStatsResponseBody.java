// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountDTXAppStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CountDTXAppStatsResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Success")
    public Boolean success;

    public static CountDTXAppStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountDTXAppStatsResponseBody self = new CountDTXAppStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountDTXAppStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountDTXAppStatsResponseBody setData(CountDTXAppStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CountDTXAppStatsResponseBodyData getData() {
        return this.data;
    }

    public CountDTXAppStatsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountDTXAppStatsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDTXAppStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CountDTXAppStatsResponseBodyDataStatsToday extends TeaModel {
        @NameInMap("ActivityNum")
        public Long activityNum;

        @NameInMap("ActionNum")
        public Long actionNum;

        public static CountDTXAppStatsResponseBodyDataStatsToday build(java.util.Map<String, ?> map) throws Exception {
            CountDTXAppStatsResponseBodyDataStatsToday self = new CountDTXAppStatsResponseBodyDataStatsToday();
            return TeaModel.build(map, self);
        }

        public CountDTXAppStatsResponseBodyDataStatsToday setActivityNum(Long activityNum) {
            this.activityNum = activityNum;
            return this;
        }
        public Long getActivityNum() {
            return this.activityNum;
        }

        public CountDTXAppStatsResponseBodyDataStatsToday setActionNum(Long actionNum) {
            this.actionNum = actionNum;
            return this;
        }
        public Long getActionNum() {
            return this.actionNum;
        }

    }

    public static class CountDTXAppStatsResponseBodyDataStatsException extends TeaModel {
        @NameInMap("Total")
        public Long total;

        public static CountDTXAppStatsResponseBodyDataStatsException build(java.util.Map<String, ?> map) throws Exception {
            CountDTXAppStatsResponseBodyDataStatsException self = new CountDTXAppStatsResponseBodyDataStatsException();
            return TeaModel.build(map, self);
        }

        public CountDTXAppStatsResponseBodyDataStatsException setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class CountDTXAppStatsResponseBodyDataStatsOngoing extends TeaModel {
        @NameInMap("ActivityNum")
        public Long activityNum;

        @NameInMap("ActionNum")
        public Long actionNum;

        public static CountDTXAppStatsResponseBodyDataStatsOngoing build(java.util.Map<String, ?> map) throws Exception {
            CountDTXAppStatsResponseBodyDataStatsOngoing self = new CountDTXAppStatsResponseBodyDataStatsOngoing();
            return TeaModel.build(map, self);
        }

        public CountDTXAppStatsResponseBodyDataStatsOngoing setActivityNum(Long activityNum) {
            this.activityNum = activityNum;
            return this;
        }
        public Long getActivityNum() {
            return this.activityNum;
        }

        public CountDTXAppStatsResponseBodyDataStatsOngoing setActionNum(Long actionNum) {
            this.actionNum = actionNum;
            return this;
        }
        public Long getActionNum() {
            return this.actionNum;
        }

    }

    public static class CountDTXAppStatsResponseBodyDataStats extends TeaModel {
        @NameInMap("Today")
        public CountDTXAppStatsResponseBodyDataStatsToday today;

        @NameInMap("Exception")
        public CountDTXAppStatsResponseBodyDataStatsException exception;

        @NameInMap("Ongoing")
        public CountDTXAppStatsResponseBodyDataStatsOngoing ongoing;

        public static CountDTXAppStatsResponseBodyDataStats build(java.util.Map<String, ?> map) throws Exception {
            CountDTXAppStatsResponseBodyDataStats self = new CountDTXAppStatsResponseBodyDataStats();
            return TeaModel.build(map, self);
        }

        public CountDTXAppStatsResponseBodyDataStats setToday(CountDTXAppStatsResponseBodyDataStatsToday today) {
            this.today = today;
            return this;
        }
        public CountDTXAppStatsResponseBodyDataStatsToday getToday() {
            return this.today;
        }

        public CountDTXAppStatsResponseBodyDataStats setException(CountDTXAppStatsResponseBodyDataStatsException exception) {
            this.exception = exception;
            return this;
        }
        public CountDTXAppStatsResponseBodyDataStatsException getException() {
            return this.exception;
        }

        public CountDTXAppStatsResponseBodyDataStats setOngoing(CountDTXAppStatsResponseBodyDataStatsOngoing ongoing) {
            this.ongoing = ongoing;
            return this;
        }
        public CountDTXAppStatsResponseBodyDataStatsOngoing getOngoing() {
            return this.ongoing;
        }

    }

    public static class CountDTXAppStatsResponseBodyDataAppInfo extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Creator")
        public String creator;

        public static CountDTXAppStatsResponseBodyDataAppInfo build(java.util.Map<String, ?> map) throws Exception {
            CountDTXAppStatsResponseBodyDataAppInfo self = new CountDTXAppStatsResponseBodyDataAppInfo();
            return TeaModel.build(map, self);
        }

        public CountDTXAppStatsResponseBodyDataAppInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CountDTXAppStatsResponseBodyDataAppInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CountDTXAppStatsResponseBodyDataAppInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CountDTXAppStatsResponseBodyDataAppInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CountDTXAppStatsResponseBodyDataAppInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CountDTXAppStatsResponseBodyDataAppInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

    public static class CountDTXAppStatsResponseBodyData extends TeaModel {
        @NameInMap("Stats")
        public CountDTXAppStatsResponseBodyDataStats stats;

        @NameInMap("AppInfo")
        public CountDTXAppStatsResponseBodyDataAppInfo appInfo;

        public static CountDTXAppStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CountDTXAppStatsResponseBodyData self = new CountDTXAppStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CountDTXAppStatsResponseBodyData setStats(CountDTXAppStatsResponseBodyDataStats stats) {
            this.stats = stats;
            return this;
        }
        public CountDTXAppStatsResponseBodyDataStats getStats() {
            return this.stats;
        }

        public CountDTXAppStatsResponseBodyData setAppInfo(CountDTXAppStatsResponseBodyDataAppInfo appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public CountDTXAppStatsResponseBodyDataAppInfo getAppInfo() {
            return this.appInfo;
        }

    }

}
