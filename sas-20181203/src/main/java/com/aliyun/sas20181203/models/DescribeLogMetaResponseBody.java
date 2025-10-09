// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogMetaResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the configurations of the log analysis feature.</p>
     */
    @NameInMap("LogMetaList")
    public java.util.List<DescribeLogMetaResponseBodyLogMetaList> logMetaList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA04B21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
        /**
         * <p>The category of logs. Valid values:</p>
         * <ul>
         * <li><strong>host</strong></li>
         * <li><strong>security</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time period after which logs in hot storage are moved to cold storage. Unit: days.</p>
         * <blockquote>
         * <p> If the value is -1, logs that are stored in hot storage are not moved to cold storage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("HotTtl")
        public Integer hotTtl;

        /**
         * <p>The name of the log type.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("LogDesc")
        public String logDesc;

        /**
         * <p>The name of the dedicated Logstore in which logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-login</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The status of the log analysis feature. Valid values:</p>
         * <ul>
         * <li><strong>disabled</strong></li>
         * <li><strong>enabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The topic of logs that are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-login</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The number of days during which logs can be retained.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The name of the dedicated Logstore in which user logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-network</p>
         */
        @NameInMap("UserLogStore")
        public String userLogStore;

        /**
         * <p>The name of the dedicated project in which logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>sasnew-log-XXXX-cn-hangzhou</p>
         */
        @NameInMap("UserProject")
        public String userProject;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
