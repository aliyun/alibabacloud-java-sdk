// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListJobInfoResponseBody extends TeaModel {
    @NameInMap("JobInfoList")
    public java.util.List<ListJobInfoResponseBodyJobInfoList> jobInfoList;

    /**
     * <strong>example:</strong>
     * <p>transcode</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <strong>example:</strong>
     * <p>30e5d7**********bd900764de7c0102</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p>6708D849-F109-1A6C-AC91-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfoResponseBody self = new ListJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobInfoResponseBody setJobInfoList(java.util.List<ListJobInfoResponseBodyJobInfoList> jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }
    public java.util.List<ListJobInfoResponseBodyJobInfoList> getJobInfoList() {
        return this.jobInfoList;
    }

    public ListJobInfoResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobInfoResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public ListJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobInfoResponseBodyJobInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:34Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-14T07:39:25Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>5c9dff751ba**********59d50a967f5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>TranscodeSuccess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>139109*****84930</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListJobInfoResponseBodyJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListJobInfoResponseBodyJobInfoList self = new ListJobInfoResponseBodyJobInfoList();
            return TeaModel.build(map, self);
        }

        public ListJobInfoResponseBodyJobInfoList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListJobInfoResponseBodyJobInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListJobInfoResponseBodyJobInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobInfoResponseBodyJobInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobInfoResponseBodyJobInfoList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
