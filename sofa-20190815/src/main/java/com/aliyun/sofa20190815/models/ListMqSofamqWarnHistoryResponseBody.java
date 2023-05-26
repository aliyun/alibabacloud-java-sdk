// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqWarnHistoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMqSofamqWarnHistoryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMqSofamqWarnHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqWarnHistoryResponseBody self = new ListMqSofamqWarnHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqWarnHistoryResponseBody setData(ListMqSofamqWarnHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqWarnHistoryResponseBodyData getData() {
        return this.data;
    }

    public ListMqSofamqWarnHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqWarnHistoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqWarnHistoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMqSofamqWarnHistoryResponseBodyDataContent extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Group ID</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("WarnId")
        public Long warnId;

        @NameInMap("WarnInfo")
        public String warnInfo;

        public static ListMqSofamqWarnHistoryResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqWarnHistoryResponseBodyDataContent self = new ListMqSofamqWarnHistoryResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setWarnId(Long warnId) {
            this.warnId = warnId;
            return this;
        }
        public Long getWarnId() {
            return this.warnId;
        }

        public ListMqSofamqWarnHistoryResponseBodyDataContent setWarnInfo(String warnInfo) {
            this.warnInfo = warnInfo;
            return this;
        }
        public String getWarnInfo() {
            return this.warnInfo;
        }

    }

    public static class ListMqSofamqWarnHistoryResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListMqSofamqWarnHistoryResponseBodyDataContent> content;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListMqSofamqWarnHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqWarnHistoryResponseBodyData self = new ListMqSofamqWarnHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqWarnHistoryResponseBodyData setContent(java.util.List<ListMqSofamqWarnHistoryResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqWarnHistoryResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListMqSofamqWarnHistoryResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqWarnHistoryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqWarnHistoryResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
