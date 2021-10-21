// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOssResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryOssResourcesResponseBodyData data;

    public static QueryOssResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOssResourcesResponseBody self = new QueryOssResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOssResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOssResourcesResponseBody setData(QueryOssResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOssResourcesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryOssResourcesResponseBodyDataTaskList extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateTime")
        public Long createTime;

        public static QueryOssResourcesResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            QueryOssResourcesResponseBodyDataTaskList self = new QueryOssResourcesResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public QueryOssResourcesResponseBodyDataTaskList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryOssResourcesResponseBodyDataTaskList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryOssResourcesResponseBodyDataTaskList setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public QueryOssResourcesResponseBodyDataTaskList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOssResourcesResponseBodyDataTaskList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryOssResourcesResponseBodyData extends TeaModel {
        @NameInMap("TaskList")
        public java.util.List<QueryOssResourcesResponseBodyDataTaskList> taskList;

        public static QueryOssResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOssResourcesResponseBodyData self = new QueryOssResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOssResourcesResponseBodyData setTaskList(java.util.List<QueryOssResourcesResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<QueryOssResourcesResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}
