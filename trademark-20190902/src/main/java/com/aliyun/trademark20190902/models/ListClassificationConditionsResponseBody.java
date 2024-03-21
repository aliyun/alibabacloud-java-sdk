// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListClassificationConditionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListClassificationConditionsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClassificationConditionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationConditionsResponseBody self = new ListClassificationConditionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClassificationConditionsResponseBody setData(java.util.List<ListClassificationConditionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClassificationConditionsResponseBodyData> getData() {
        return this.data;
    }

    public ListClassificationConditionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClassificationConditionsResponseBodyData extends TeaModel {
        @NameInMap("ConditionContent")
        public String conditionContent;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Type")
        public Long type;

        @NameInMap("Umid")
        public String umid;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public Long userId;

        public static ListClassificationConditionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClassificationConditionsResponseBodyData self = new ListClassificationConditionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClassificationConditionsResponseBodyData setConditionContent(String conditionContent) {
            this.conditionContent = conditionContent;
            return this;
        }
        public String getConditionContent() {
            return this.conditionContent;
        }

        public ListClassificationConditionsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClassificationConditionsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClassificationConditionsResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListClassificationConditionsResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListClassificationConditionsResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ListClassificationConditionsResponseBodyData setUmid(String umid) {
            this.umid = umid;
            return this;
        }
        public String getUmid() {
            return this.umid;
        }

        public ListClassificationConditionsResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListClassificationConditionsResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
