// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListSkillGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListSkillGroupResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupResponseBody self = new ListSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupResponseBody setData(java.util.List<ListSkillGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSkillGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupResponseBodyData extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        @NameInMap("Name")
        public String name;

        public static ListSkillGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupResponseBodyData self = new ListSkillGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSkillGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillGroupResponseBodyData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public ListSkillGroupResponseBodyData setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
