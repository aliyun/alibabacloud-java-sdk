// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordTasksResponseBody extends TeaModel {
    @NameInMap("RecordTasks")
    public java.util.List<DescribeRecordTasksResponseBodyRecordTasks> recordTasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeRecordTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordTasksResponseBody self = new DescribeRecordTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordTasksResponseBody setRecordTasks(java.util.List<DescribeRecordTasksResponseBodyRecordTasks> recordTasks) {
        this.recordTasks = recordTasks;
        return this;
    }
    public java.util.List<DescribeRecordTasksResponseBodyRecordTasks> getRecordTasks() {
        return this.recordTasks;
    }

    public DescribeRecordTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordTasksResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeRecordTasksResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeRecordTasksResponseBodyRecordTasksUserPanes extends TeaModel {
        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("Source")
        public String source;

        @NameInMap("UserId")
        public String userId;

        public static DescribeRecordTasksResponseBodyRecordTasksUserPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTasksResponseBodyRecordTasksUserPanes self = new DescribeRecordTasksResponseBodyRecordTasksUserPanes();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTasksResponseBodyRecordTasksUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public DescribeRecordTasksResponseBodyRecordTasksUserPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeRecordTasksResponseBodyRecordTasksUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeRecordTasksResponseBodyRecordTasks extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubSpecUsers")
        public java.util.List<String> subSpecUsers;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("UserPanes")
        public java.util.List<DescribeRecordTasksResponseBodyRecordTasksUserPanes> userPanes;

        public static DescribeRecordTasksResponseBodyRecordTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTasksResponseBodyRecordTasks self = new DescribeRecordTasksResponseBodyRecordTasks();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTasksResponseBodyRecordTasks setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setSubSpecUsers(java.util.List<String> subSpecUsers) {
            this.subSpecUsers = subSpecUsers;
            return this;
        }
        public java.util.List<String> getSubSpecUsers() {
            return this.subSpecUsers;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeRecordTasksResponseBodyRecordTasks setUserPanes(java.util.List<DescribeRecordTasksResponseBodyRecordTasksUserPanes> userPanes) {
            this.userPanes = userPanes;
            return this;
        }
        public java.util.List<DescribeRecordTasksResponseBodyRecordTasksUserPanes> getUserPanes() {
            return this.userPanes;
        }

    }

}
