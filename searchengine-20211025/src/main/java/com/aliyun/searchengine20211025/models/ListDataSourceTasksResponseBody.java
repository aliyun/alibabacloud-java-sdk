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
     * <p>The date when the task was completed.</p>
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
        @NameInMap("msg")
        public String msg;

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
        @NameInMap("finishDate")
        public String finishDate;

        @NameInMap("index")
        public Long index;

        @NameInMap("name")
        public String name;

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
        @NameInMap("extraAttribute")
        public String extraAttribute;

        @NameInMap("field3")
        public String field3;

        /**
         * <p>fsmId</p>
         */
        @NameInMap("fsmId")
        public String fsmId;

        /**
         * <p>### Method</p>
         * <br>
         * <p>```java</p>
         * <p>GET</p>
         * <p>```</p>
         * <br>
         * <p>### URI</p>
         * <br>
         * <p>```java</p>
         * <p>/openapi/ha3/instances/{instanceId}/data-source-tasks</p>
         * <p>```</p>
         */
        @NameInMap("groupType")
        public String groupType;

        /**
         * <p>Displays data source tasks.</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListDataSourceTasksResponseBodyResultTags> tags;

        @NameInMap("taskNodes")
        public java.util.List<ListDataSourceTasksResponseBodyResultTaskNodes> taskNodes;

        @NameInMap("time")
        public String time;

        @NameInMap("type")
        public String type;

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
