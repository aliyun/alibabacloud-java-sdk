// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListDmsWhitelistResponseBodyData data;

    public static ListDmsWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDmsWhitelistResponseBody self = new ListDmsWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDmsWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDmsWhitelistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDmsWhitelistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDmsWhitelistResponseBody setData(ListDmsWhitelistResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDmsWhitelistResponseBodyData getData() {
        return this.data;
    }

    public static class ListDmsWhitelistResponseBodyDataContent extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Groupid")
        public String groupid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Topic")
        public String topic;

        public static ListDmsWhitelistResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDmsWhitelistResponseBodyDataContent self = new ListDmsWhitelistResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDmsWhitelistResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDmsWhitelistResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDmsWhitelistResponseBodyDataContent setGroupid(String groupid) {
            this.groupid = groupid;
            return this;
        }
        public String getGroupid() {
            return this.groupid;
        }

        public ListDmsWhitelistResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDmsWhitelistResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDmsWhitelistResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListDmsWhitelistResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListDmsWhitelistResponseBodyDataContent> content;

        public static ListDmsWhitelistResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDmsWhitelistResponseBodyData self = new ListDmsWhitelistResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDmsWhitelistResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListDmsWhitelistResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDmsWhitelistResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListDmsWhitelistResponseBodyData setContent(java.util.List<ListDmsWhitelistResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDmsWhitelistResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
