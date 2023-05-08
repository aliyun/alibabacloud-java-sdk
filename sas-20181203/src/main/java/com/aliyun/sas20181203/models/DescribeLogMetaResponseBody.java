// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogMetaResponseBody extends TeaModel {
    /**
     * <p>The name of the dedicated project in which logs are stored.</p>
     */
    @NameInMap("LogMetaList")
    public java.util.List<DescribeLogMetaResponseBodyLogMetaList> logMetaList;

    /**
     * <p>The name of the dedicated Logstore in which logs are stored.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLogMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMetaResponseBody self = new DescribeLogMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogMetaResponseBody setLogMetaList(java.util.List<DescribeLogMetaResponseBodyLogMetaList> logMetaList) {
        this.logMetaList = logMetaList;
        return this;
    }
    public java.util.List<DescribeLogMetaResponseBodyLogMetaList> getLogMetaList() {
        return this.logMetaList;
    }

    public DescribeLogMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogMetaResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLogMetaResponseBodyLogMetaList extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("HotTtl")
        public Integer hotTtl;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("LogDesc")
        public String logDesc;

        /**
         * <p>Queries the configurations of the log analysis feature provided by Security Center.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

        /**
         * <p>The configurations of the log analysis feature.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("UserLogStore")
        public String userLogStore;

        /**
         * <p>DescribeLogMeta</p>
         */
        @NameInMap("UserProject")
        public String userProject;

        @NameInMap("UserRegion")
        public String userRegion;

        public static DescribeLogMetaResponseBodyLogMetaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMetaResponseBodyLogMetaList self = new DescribeLogMetaResponseBodyLogMetaList();
            return TeaModel.build(map, self);
        }

        public DescribeLogMetaResponseBodyLogMetaList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeLogMetaResponseBodyLogMetaList setHotTtl(Integer hotTtl) {
            this.hotTtl = hotTtl;
            return this;
        }
        public Integer getHotTtl() {
            return this.hotTtl;
        }

        public DescribeLogMetaResponseBodyLogMetaList setLogDesc(String logDesc) {
            this.logDesc = logDesc;
            return this;
        }
        public String getLogDesc() {
            return this.logDesc;
        }

        public DescribeLogMetaResponseBodyLogMetaList setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribeLogMetaResponseBodyLogMetaList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeLogMetaResponseBodyLogMetaList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLogMetaResponseBodyLogMetaList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeLogMetaResponseBodyLogMetaList setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeLogMetaResponseBodyLogMetaList setUserLogStore(String userLogStore) {
            this.userLogStore = userLogStore;
            return this;
        }
        public String getUserLogStore() {
            return this.userLogStore;
        }

        public DescribeLogMetaResponseBodyLogMetaList setUserProject(String userProject) {
            this.userProject = userProject;
            return this;
        }
        public String getUserProject() {
            return this.userProject;
        }

        public DescribeLogMetaResponseBodyLogMetaList setUserRegion(String userRegion) {
            this.userRegion = userRegion;
            return this;
        }
        public String getUserRegion() {
            return this.userRegion;
        }

    }

}
