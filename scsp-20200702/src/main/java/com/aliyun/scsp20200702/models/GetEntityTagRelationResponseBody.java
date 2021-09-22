// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityTagRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<GetEntityTagRelationResponseBodyData> data;

    public static GetEntityTagRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEntityTagRelationResponseBody self = new GetEntityTagRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEntityTagRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEntityTagRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEntityTagRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEntityTagRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEntityTagRelationResponseBody setData(java.util.List<GetEntityTagRelationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetEntityTagRelationResponseBodyData> getData() {
        return this.data;
    }

    public static class GetEntityTagRelationResponseBodyData extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagGroupCode")
        public String tagGroupCode;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("TagGroupName")
        public String tagGroupName;

        public static GetEntityTagRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEntityTagRelationResponseBodyData self = new GetEntityTagRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEntityTagRelationResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetEntityTagRelationResponseBodyData setTagGroupCode(String tagGroupCode) {
            this.tagGroupCode = tagGroupCode;
            return this;
        }
        public String getTagGroupCode() {
            return this.tagGroupCode;
        }

        public GetEntityTagRelationResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetEntityTagRelationResponseBodyData setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public GetEntityTagRelationResponseBodyData setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetEntityTagRelationResponseBodyData setTagGroupName(String tagGroupName) {
            this.tagGroupName = tagGroupName;
            return this;
        }
        public String getTagGroupName() {
            return this.tagGroupName;
        }

    }

}
