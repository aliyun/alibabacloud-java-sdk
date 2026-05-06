// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateTaskGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public CreateTaskGroupResponseBodyResultObject resultObject;

    public static CreateTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupResponseBody self = new CreateTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskGroupResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTaskGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskGroupResponseBody setResultObject(CreateTaskGroupResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreateTaskGroupResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CreateTaskGroupResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1750645267000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>345298</p>
         */
        @NameInMap("CreatorUserId")
        public Integer creatorUserId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("GroupStatus")
        public String groupStatus;

        @NameInMap("SampleNames")
        public java.util.List<String> sampleNames;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SubTaskCount")
        public Integer subTaskCount;

        /**
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <strong>example:</strong>
         * <p>g-0jlcreertd0p471l6f72</p>
         */
        @NameInMap("TaskGroupId")
        public Integer taskGroupId;

        /**
         * <strong>example:</strong>
         * <p>GroupTest</p>
         */
        @NameInMap("TaskGroupName")
        public String taskGroupName;

        public static CreateTaskGroupResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskGroupResponseBodyResultObject self = new CreateTaskGroupResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreateTaskGroupResponseBodyResultObject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateTaskGroupResponseBodyResultObject setCreatorUserId(Integer creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public Integer getCreatorUserId() {
            return this.creatorUserId;
        }

        public CreateTaskGroupResponseBodyResultObject setGroupStatus(String groupStatus) {
            this.groupStatus = groupStatus;
            return this;
        }
        public String getGroupStatus() {
            return this.groupStatus;
        }

        public CreateTaskGroupResponseBodyResultObject setSampleNames(java.util.List<String> sampleNames) {
            this.sampleNames = sampleNames;
            return this;
        }
        public java.util.List<String> getSampleNames() {
            return this.sampleNames;
        }

        public CreateTaskGroupResponseBodyResultObject setSubTaskCount(Integer subTaskCount) {
            this.subTaskCount = subTaskCount;
            return this;
        }
        public Integer getSubTaskCount() {
            return this.subTaskCount;
        }

        public CreateTaskGroupResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public CreateTaskGroupResponseBodyResultObject setTaskGroupId(Integer taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public Integer getTaskGroupId() {
            return this.taskGroupId;
        }

        public CreateTaskGroupResponseBodyResultObject setTaskGroupName(String taskGroupName) {
            this.taskGroupName = taskGroupName;
            return this;
        }
        public String getTaskGroupName() {
            return this.taskGroupName;
        }

    }

}
