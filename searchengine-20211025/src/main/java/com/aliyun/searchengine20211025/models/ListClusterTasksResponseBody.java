// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClusterTasksResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The date when the task was completed.</p>
     */
    @NameInMap("result")
    public java.util.List<ListClusterTasksResponseBodyResult> result;

    public static ListClusterTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTasksResponseBody self = new ListClusterTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterTasksResponseBody setResult(java.util.List<ListClusterTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListClusterTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListClusterTasksResponseBodyResultTags extends TeaModel {
        @NameInMap("msg")
        public String msg;

        @NameInMap("tagLevel")
        public String tagLevel;

        public static ListClusterTasksResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTasksResponseBodyResultTags self = new ListClusterTasksResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListClusterTasksResponseBodyResultTags setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListClusterTasksResponseBodyResultTags setTagLevel(String tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public String getTagLevel() {
            return this.tagLevel;
        }

    }

    public static class ListClusterTasksResponseBodyResultTaskNodes extends TeaModel {
        @NameInMap("finishDate")
        public String finishDate;

        @NameInMap("index")
        public Long index;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        public static ListClusterTasksResponseBodyResultTaskNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTasksResponseBodyResultTaskNodes self = new ListClusterTasksResponseBodyResultTaskNodes();
            return TeaModel.build(map, self);
        }

        public ListClusterTasksResponseBodyResultTaskNodes setFinishDate(String finishDate) {
            this.finishDate = finishDate;
            return this;
        }
        public String getFinishDate() {
            return this.finishDate;
        }

        public ListClusterTasksResponseBodyResultTaskNodes setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListClusterTasksResponseBodyResultTaskNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterTasksResponseBodyResultTaskNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListClusterTasksResponseBodyResult extends TeaModel {
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
         * <p>/openapi/ha3/instances/{instanceId}/cluster-tasks</p>
         * <p>```</p>
         */
        @NameInMap("groupType")
        public String groupType;

        /**
         * <p>Displays cluster tasks .</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<ListClusterTasksResponseBodyResultTags> tags;

        @NameInMap("taskNodes")
        public java.util.List<ListClusterTasksResponseBodyResultTaskNodes> taskNodes;

        @NameInMap("time")
        public String time;

        @NameInMap("type")
        public String type;

        @NameInMap("user")
        public String user;

        public static ListClusterTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListClusterTasksResponseBodyResult self = new ListClusterTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListClusterTasksResponseBodyResult setExtraAttribute(String extraAttribute) {
            this.extraAttribute = extraAttribute;
            return this;
        }
        public String getExtraAttribute() {
            return this.extraAttribute;
        }

        public ListClusterTasksResponseBodyResult setField3(String field3) {
            this.field3 = field3;
            return this;
        }
        public String getField3() {
            return this.field3;
        }

        public ListClusterTasksResponseBodyResult setFsmId(String fsmId) {
            this.fsmId = fsmId;
            return this;
        }
        public String getFsmId() {
            return this.fsmId;
        }

        public ListClusterTasksResponseBodyResult setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListClusterTasksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterTasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterTasksResponseBodyResult setTags(java.util.List<ListClusterTasksResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListClusterTasksResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListClusterTasksResponseBodyResult setTaskNodes(java.util.List<ListClusterTasksResponseBodyResultTaskNodes> taskNodes) {
            this.taskNodes = taskNodes;
            return this;
        }
        public java.util.List<ListClusterTasksResponseBodyResultTaskNodes> getTaskNodes() {
            return this.taskNodes;
        }

        public ListClusterTasksResponseBodyResult setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListClusterTasksResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClusterTasksResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
