// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetPersonDetailResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetPersonDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonDetailResponseBody self = new GetPersonDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPersonDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPersonDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPersonDetailResponseBody setData(GetPersonDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPersonDetailResponseBodyData getData() {
        return this.data;
    }

    public GetPersonDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetPersonDetailResponseBodyDataTagList extends TeaModel {
        @NameInMap("TagValueId")
        public String tagValueId;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagCode")
        public String tagCode;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetPersonDetailResponseBodyDataTagList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonDetailResponseBodyDataTagList self = new GetPersonDetailResponseBodyDataTagList();
            return TeaModel.build(map, self);
        }

        public GetPersonDetailResponseBodyDataTagList setTagValueId(String tagValueId) {
            this.tagValueId = tagValueId;
            return this;
        }
        public String getTagValueId() {
            return this.tagValueId;
        }

        public GetPersonDetailResponseBodyDataTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetPersonDetailResponseBodyDataTagList setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public GetPersonDetailResponseBodyDataTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPersonDetailResponseBodyData extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("TagList")
        public java.util.List<GetPersonDetailResponseBodyDataTagList> tagList;

        @NameInMap("PersonId")
        public String personId;

        public static GetPersonDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPersonDetailResponseBodyData self = new GetPersonDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPersonDetailResponseBodyData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetPersonDetailResponseBodyData setTagList(java.util.List<GetPersonDetailResponseBodyDataTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetPersonDetailResponseBodyDataTagList> getTagList() {
            return this.tagList;
        }

        public GetPersonDetailResponseBodyData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

    }

}
