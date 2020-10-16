// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonDetailResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetPersonDetailResponseData data;

    public static GetPersonDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonDetailResponse self = new GetPersonDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPersonDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPersonDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPersonDetailResponse setData(GetPersonDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetPersonDetailResponseData getData() {
        return this.data;
    }

    public static class GetPersonDetailResponseDataTagList extends TeaModel {
        @NameInMap("TagCode")
        @Validation(required = true)
        public String tagCode;

        @NameInMap("TagName")
        @Validation(required = true)
        public String tagName;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        @NameInMap("TagValueId")
        @Validation(required = true)
        public String tagValueId;

        public static GetPersonDetailResponseDataTagList build(java.util.Map<String, ?> map) throws Exception {
            GetPersonDetailResponseDataTagList self = new GetPersonDetailResponseDataTagList();
            return TeaModel.build(map, self);
        }

        public GetPersonDetailResponseDataTagList setTagCode(String tagCode) {
            this.tagCode = tagCode;
            return this;
        }
        public String getTagCode() {
            return this.tagCode;
        }

        public GetPersonDetailResponseDataTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public GetPersonDetailResponseDataTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public GetPersonDetailResponseDataTagList setTagValueId(String tagValueId) {
            this.tagValueId = tagValueId;
            return this;
        }
        public String getTagValueId() {
            return this.tagValueId;
        }

    }

    public static class GetPersonDetailResponseData extends TeaModel {
        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("TagList")
        @Validation(required = true)
        public java.util.List<GetPersonDetailResponseDataTagList> tagList;

        public static GetPersonDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPersonDetailResponseData self = new GetPersonDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetPersonDetailResponseData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetPersonDetailResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public GetPersonDetailResponseData setTagList(java.util.List<GetPersonDetailResponseDataTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetPersonDetailResponseDataTagList> getTagList() {
            return this.tagList;
        }

    }

}
