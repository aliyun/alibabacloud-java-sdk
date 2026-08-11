// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListClusterTasksResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>CC5EC8FA-5C0D-56AF-BEF4-6FCCEABD0511</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The index information.</p>
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
        /**
         * <p>The tag content.</p>
         * 
         * <strong>example:</strong>
         * <p>test-tag</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>The tag level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The time when the task was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-17 18:40:48</p>
         */
        @NameInMap("finishDate")
        public String finishDate;

        /**
         * <p>The ordinal number of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("index")
        public Long index;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>publish config version</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
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
        /**
         * <p>The additional attributes of the card.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;consoleVersion&quot;: &quot;&quot;,
         *     &quot;domain&quot;: &quot;hz_pre_vpc_domain_1&quot;,
         *     &quot;configType&quot;: &quot;offline&quot;
         * }</p>
         */
        @NameInMap("extraAttribute")
        public String extraAttribute;

        /**
         * <p>The field3 field that was passed when the FSM was created.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ha-cn-pl32rf0****_offline_adv&quot;: 1,
         *     &quot;ha-cn-pl32rf0****_offline_plugin&quot;: 1,
         *     &quot;ha-cn-pl32rf0****_table_ha-cn-35t3r02iq03_test_api&quot;: 1,
         *     &quot;ha-cn-pl32rf0****@ha-cn-pl32rf0****_test_api@hz_pre_vpc_domain_1@test_api@index_config&quot;: 1,
         *     &quot;ha-cn-pl32rf0****_offline_dict&quot;: 1
         * }</p>
         */
        @NameInMap("field3")
        public String field3;

        /**
         * <p>The ID of the finite state machine (FSM).</p>
         * 
         * <strong>example:</strong>
         * <p>tisplus_opensearch@datasource_flow_fsm@1865410598556969-ha-cn-pl32rf0****_api2@bj_vpc_domain_1@null@MANUAL-ha-cn-pl32rf0****_api2@1649729867698@028315</p>
         */
        @NameInMap("fsmId")
        public String fsmId;

        /**
         * <p>The change group type.</p>
         * 
         * <strong>example:</strong>
         * <p>Table_Update</p>
         */
        @NameInMap("groupType")
        public String groupType;

        /**
         * <p>The card name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The FSM status.</p>
         * 
         * <strong>example:</strong>
         * <p>onlyPublished</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags of the progress bar.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListClusterTasksResponseBodyResultTags> tags;

        /**
         * <p>The task information.</p>
         */
        @NameInMap("taskNodes")
        public java.util.List<ListClusterTasksResponseBodyResultTaskNodes> taskNodes;

        /**
         * <p>The timestamp of the card.</p>
         * 
         * <strong>example:</strong>
         * <p>1657610520</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The card type.</p>
         * 
         * <strong>example:</strong>
         * <p>mra_table_config_trace_fsm</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The user who triggered the generation of the FSM process.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
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
