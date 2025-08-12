// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListAsynJobsResponseBody extends TeaModel {
    /**
     * <p>The queried tasks.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListAsynJobsResponseBodyJobs> jobs;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListAsynJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsynJobsResponseBody self = new ListAsynJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsynJobsResponseBody setJobs(java.util.List<ListAsynJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListAsynJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListAsynJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsynJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListAsynJobsResponseBodyJobs extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B5****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>Succeeded: The task is successful.</li>
         * <li>Failed: The task fails.</li>
         * <li>Processing: The task is being processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAsynJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListAsynJobsResponseBodyJobs self = new ListAsynJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListAsynJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAsynJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
