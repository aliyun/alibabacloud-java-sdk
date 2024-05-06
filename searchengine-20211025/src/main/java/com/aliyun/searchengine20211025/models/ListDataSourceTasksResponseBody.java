// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourceTasksResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the index.</p>
     */
    @NameInMap("result")
    public java.util.List<ListDataSourceTasksResponseBodyResult> result;

    public static ListDataSourceTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTasksResponseBody self = new ListDataSourceTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceTasksResponseBody setResult(java.util.List<ListDataSourceTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourceTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSourceTasksResponseBodyResultTags extends TeaModel {
        /**
         * <p>The content of the tag.</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>The level of the tag.</p>
         */
        @NameInMap("tagLevel")
        public String tagLevel;

        public static ListDataSourceTasksResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceTasksResponseBodyResultTags self = new ListDataSourceTasksResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListDataSourceTasksResponseBodyResultTags setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListDataSourceTasksResponseBodyResultTags setTagLevel(String tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public String getTagLevel() {
            return this.tagLevel;
        }

    }

    public static class ListDataSourceTasksResponseBodyResultTaskNodes extends TeaModel {
        /**
         * <p>The date when the task was completed.</p>
         */
        @NameInMap("finishDate")
        public String finishDate;

        /**
         * <p>The sequence number of the task.</p>
         */
        @NameInMap("index")
        public Long index;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the task.</p>
         */
        @NameInMap("status")
        public String status;

        public static ListDataSourceTasksResponseBodyResultTaskNodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceTasksResponseBodyResultTaskNodes self = new ListDataSourceTasksResponseBodyResultTaskNodes();
            return TeaModel.build(map, self);
        }

        public ListDataSourceTasksResponseBodyResultTaskNodes setFinishDate(String finishDate) {
            this.finishDate = finishDate;
            return this;
        }
        public String getFinishDate() {
            return this.finishDate;
        }

        public ListDataSourceTasksResponseBodyResultTaskNodes setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListDataSourceTasksResponseBodyResultTaskNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceTasksResponseBodyResultTaskNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDataSourceTasksResponseBodyResult extends TeaModel {
        /**
         * <p>The additional attributes of the card.</p>
         */
        @NameInMap("extraAttribute")
        public String extraAttribute;

        /**
         * <p>The field3 field that is passed through when you create a state machine.</p>
         */
        @NameInMap("field3")
        public String field3;

        /**
         * <p>fsmId</p>
         */
        @NameInMap("fsmId")
        public String fsmId;

        /**
         * <p>Indicates whether the change is a data source task change or a cluster task change.</p>
         */
        @NameInMap("groupType")
        public String groupType;

        /**
         * <p>The task name on the card.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The overall status of FSM.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status tag of the progress bar chart.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListDataSourceTasksResponseBodyResultTags> tags;

        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("taskNodes")
        public java.util.List<ListDataSourceTasksResponseBodyResultTaskNodes> taskNodes;

        /**
         * <p>The timestamp of the task on the card.</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The type of the task on the card.</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The user who triggered the finite-state machine (FSM) process.</p>
         */
        @NameInMap("user")
        public String user;

        public static ListDataSourceTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceTasksResponseBodyResult self = new ListDataSourceTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceTasksResponseBodyResult setExtraAttribute(String extraAttribute) {
            this.extraAttribute = extraAttribute;
            return this;
        }
        public String getExtraAttribute() {
            return this.extraAttribute;
        }

        public ListDataSourceTasksResponseBodyResult setField3(String field3) {
            this.field3 = field3;
            return this;
        }
        public String getField3() {
            return this.field3;
        }

        public ListDataSourceTasksResponseBodyResult setFsmId(String fsmId) {
            this.fsmId = fsmId;
            return this;
        }
        public String getFsmId() {
            return this.fsmId;
        }

        public ListDataSourceTasksResponseBodyResult setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListDataSourceTasksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataSourceTasksResponseBodyResult setTags(java.util.List<ListDataSourceTasksResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDataSourceTasksResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListDataSourceTasksResponseBodyResult setTaskNodes(java.util.List<ListDataSourceTasksResponseBodyResultTaskNodes> taskNodes) {
            this.taskNodes = taskNodes;
            return this;
        }
        public java.util.List<ListDataSourceTasksResponseBodyResultTaskNodes> getTaskNodes() {
            return this.taskNodes;
        }

        public ListDataSourceTasksResponseBodyResult setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListDataSourceTasksResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataSourceTasksResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
