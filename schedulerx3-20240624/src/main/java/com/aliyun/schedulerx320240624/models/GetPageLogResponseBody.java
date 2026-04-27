// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetPageLogResponseBody extends TeaModel {
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
    public GetPageLogResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CalendarName is already existed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPageLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageLogResponseBody self = new GetPageLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPageLogResponseBody setData(GetPageLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPageLogResponseBodyData getData() {
        return this.data;
    }

    public GetPageLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPageLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPageLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPageLogResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("JobExecutionId")
        public String jobExecutionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>[2026-02-10 10:23:36]tStart writing to Recall Enginen</p>
         */
        @NameInMap("Log")
        public String log;

        /**
         * <strong>example:</strong>
         * <p>2024-10-31 16:43:51</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:030225016025_9357_60125@127.0.0.1">030225016025_9357_60125@127.0.0.1</a>:51363</p>
         */
        @NameInMap("WorkerAddr")
        public String workerAddr;

        public static GetPageLogResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetPageLogResponseBodyDataRecords self = new GetPageLogResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetPageLogResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetPageLogResponseBodyDataRecords setJobExecutionId(String jobExecutionId) {
            this.jobExecutionId = jobExecutionId;
            return this;
        }
        public String getJobExecutionId() {
            return this.jobExecutionId;
        }

        public GetPageLogResponseBodyDataRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetPageLogResponseBodyDataRecords setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public GetPageLogResponseBodyDataRecords setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetPageLogResponseBodyDataRecords setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPageLogResponseBodyDataRecords setWorkerAddr(String workerAddr) {
            this.workerAddr = workerAddr;
            return this;
        }
        public String getWorkerAddr() {
            return this.workerAddr;
        }

    }

    public static class GetPageLogResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<GetPageLogResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetPageLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPageLogResponseBodyData self = new GetPageLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPageLogResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetPageLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetPageLogResponseBodyData setRecords(java.util.List<GetPageLogResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetPageLogResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetPageLogResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
