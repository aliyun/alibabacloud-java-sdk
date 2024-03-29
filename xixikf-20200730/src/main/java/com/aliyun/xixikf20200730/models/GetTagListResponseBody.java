// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetTagListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetTagListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagListResponseBody self = new GetTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTagListResponseBody setData(java.util.List<GetTagListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetTagListResponseBodyData> getData() {
        return this.data;
    }

    public GetTagListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTagListResponseBodyDataTagValues extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EntityRelationNumber")
        public String entityRelationNumber;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagGroupCode")
        public String tagGroupCode;

        @NameInMap("TagGroupName")
        public String tagGroupName;

        @NameInMap("TagName")
        public String tagName;

        public static GetTagListResponseBodyDataTagValues build(java.util.Map<String, ?> map) throws Exception {
            GetTagListResponseBodyDataTagValues self = new GetTagListResponseBodyDataTagValues();
            return TeaModel.build(map, self);
        }

        public GetTagListResponseBodyDataTagValues setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTagListResponseBodyDataTagValues setEntityRelationNumber(String entityRelationNumber) {
            this.entityRelationNumber = entityRelationNumber;
            return this;
        }
        public String getEntityRelationNumber() {
            return this.entityRelationNumber;
        }

        public GetTagListResponseBodyDataTagValues setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTagListResponseBodyDataTagValues setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public GetTagListResponseBodyDataTagValues setTagGroupCode(String tagGroupCode) {
            this.tagGroupCode = tagGroupCode;
            return this;
        }
        public String getTagGroupCode() {
            return this.tagGroupCode;
        }

        public GetTagListResponseBodyDataTagValues setTagGroupName(String tagGroupName) {
            this.tagGroupName = tagGroupName;
            return this;
        }
        public String getTagGroupName() {
            return this.tagGroupName;
        }

        public GetTagListResponseBodyDataTagValues setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetTagListResponseBodyData extends TeaModel {
        @NameInMap("ScenarioCode")
        public String scenarioCode;

        @NameInMap("TagGroupCode")
        public String tagGroupCode;

        @NameInMap("TagGroupName")
        public String tagGroupName;

        @NameInMap("TagValues")
        public java.util.List<GetTagListResponseBodyDataTagValues> tagValues;

        public static GetTagListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTagListResponseBodyData self = new GetTagListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTagListResponseBodyData setScenarioCode(String scenarioCode) {
            this.scenarioCode = scenarioCode;
            return this;
        }
        public String getScenarioCode() {
            return this.scenarioCode;
        }

        public GetTagListResponseBodyData setTagGroupCode(String tagGroupCode) {
            this.tagGroupCode = tagGroupCode;
            return this;
        }
        public String getTagGroupCode() {
            return this.tagGroupCode;
        }

        public GetTagListResponseBodyData setTagGroupName(String tagGroupName) {
            this.tagGroupName = tagGroupName;
            return this;
        }
        public String getTagGroupName() {
            return this.tagGroupName;
        }

        public GetTagListResponseBodyData setTagValues(java.util.List<GetTagListResponseBodyDataTagValues> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<GetTagListResponseBodyDataTagValues> getTagValues() {
            return this.tagValues;
        }

    }

}
