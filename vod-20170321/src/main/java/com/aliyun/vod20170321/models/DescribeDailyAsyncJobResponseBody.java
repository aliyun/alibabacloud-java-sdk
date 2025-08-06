// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeDailyAsyncJobResponseBody extends TeaModel {
    @NameInMap("DailyJobList")
    public java.util.List<DescribeDailyAsyncJobResponseBodyDailyJobList> dailyJobList;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDailyAsyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDailyAsyncJobResponseBody self = new DescribeDailyAsyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDailyAsyncJobResponseBody setDailyJobList(java.util.List<DescribeDailyAsyncJobResponseBodyDailyJobList> dailyJobList) {
        this.dailyJobList = dailyJobList;
        return this;
    }
    public java.util.List<DescribeDailyAsyncJobResponseBodyDailyJobList> getDailyJobList() {
        return this.dailyJobList;
    }

    public DescribeDailyAsyncJobResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DescribeDailyAsyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDailyAsyncJobResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDailyAsyncJobResponseBodyDailyJobList extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("JobCount")
        public Integer jobCount;

        public static DescribeDailyAsyncJobResponseBodyDailyJobList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDailyAsyncJobResponseBodyDailyJobList self = new DescribeDailyAsyncJobResponseBodyDailyJobList();
            return TeaModel.build(map, self);
        }

        public DescribeDailyAsyncJobResponseBodyDailyJobList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeDailyAsyncJobResponseBodyDailyJobList setJobCount(Integer jobCount) {
            this.jobCount = jobCount;
            return this;
        }
        public Integer getJobCount() {
            return this.jobCount;
        }

    }

}
