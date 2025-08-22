// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public GetAppResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Not found: appName not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D0DE9C33-992A-580B-89C4-B609A292748D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAppResponseBody setData(GetAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppResponseBodyData getData() {
        return this.data;
    }

    public GetAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppResponseBodyData extends TeaModel {
        /**
         * <p>AccessToken。</p>
         * 
         * <strong>example:</strong>
         * <p>2f4ddeab8e344ed68e0402cf9b8502ffv3</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppType")
        public Integer appType;

        /**
         * <strong>example:</strong>
         * <p>18582193685027xx</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLog")
        public Boolean enableLog;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ExecutorNum")
        public Long executorNum;

        /**
         * <strong>example:</strong>
         * <p>3402</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("JobNum")
        public Integer jobNum;

        @NameInMap("LabelRouteStrategy")
        public Integer labelRouteStrategy;

        /**
         * <strong>example:</strong>
         * <p><a href="http://28.***.***.3:80">http://28.***.***.3:80</a></p>
         */
        @NameInMap("Leader")
        public String leader;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxJobs")
        public Integer maxJobs;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>18582193685027xx</p>
         */
        @NameInMap("Updater")
        public String updater;

        public static GetAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyData self = new GetAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppResponseBodyData setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public GetAppResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetAppResponseBodyData setEnableLog(Boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }
        public Boolean getEnableLog() {
            return this.enableLog;
        }

        public GetAppResponseBodyData setExecutorNum(Long executorNum) {
            this.executorNum = executorNum;
            return this;
        }
        public Long getExecutorNum() {
            return this.executorNum;
        }

        public GetAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAppResponseBodyData setJobNum(Integer jobNum) {
            this.jobNum = jobNum;
            return this;
        }
        public Integer getJobNum() {
            return this.jobNum;
        }

        public GetAppResponseBodyData setLabelRouteStrategy(Integer labelRouteStrategy) {
            this.labelRouteStrategy = labelRouteStrategy;
            return this;
        }
        public Integer getLabelRouteStrategy() {
            return this.labelRouteStrategy;
        }

        public GetAppResponseBodyData setLeader(String leader) {
            this.leader = leader;
            return this;
        }
        public String getLeader() {
            return this.leader;
        }

        public GetAppResponseBodyData setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public GetAppResponseBodyData setMaxJobs(Integer maxJobs) {
            this.maxJobs = maxJobs;
            return this;
        }
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        public GetAppResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAppResponseBodyData setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

    }

}
