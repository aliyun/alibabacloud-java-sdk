// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIVideoTagResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoTagResult")
    public GetAIVideoTagResultResponseBodyVideoTagResult videoTagResult;

    public static GetAIVideoTagResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIVideoTagResultResponseBody self = new GetAIVideoTagResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIVideoTagResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIVideoTagResultResponseBody setVideoTagResult(GetAIVideoTagResultResponseBodyVideoTagResult videoTagResult) {
        this.videoTagResult = videoTagResult;
        return this;
    }
    public GetAIVideoTagResultResponseBodyVideoTagResult getVideoTagResult() {
        return this.videoTagResult;
    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultTime extends TeaModel {
        @NameInMap("Times")
        public java.util.List<String> times;

        @NameInMap("Tag")
        public String tag;

        public static GetAIVideoTagResultResponseBodyVideoTagResultTime build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultTime self = new GetAIVideoTagResultResponseBodyVideoTagResultTime();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultTime setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultTime setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultKeyword extends TeaModel {
        @NameInMap("Times")
        public java.util.List<String> times;

        @NameInMap("Tag")
        public String tag;

        public static GetAIVideoTagResultResponseBodyVideoTagResultKeyword build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultKeyword self = new GetAIVideoTagResultResponseBodyVideoTagResultKeyword();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultKeyword setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultKeyword setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultCategory extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        public static GetAIVideoTagResultResponseBodyVideoTagResultCategory build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultCategory self = new GetAIVideoTagResultResponseBodyVideoTagResultCategory();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultCategory setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultPerson extends TeaModel {
        @NameInMap("FaceUrl")
        public String faceUrl;

        @NameInMap("Times")
        public java.util.List<String> times;

        @NameInMap("Tag")
        public String tag;

        public static GetAIVideoTagResultResponseBodyVideoTagResultPerson build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultPerson self = new GetAIVideoTagResultResponseBodyVideoTagResultPerson();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultPerson setFaceUrl(String faceUrl) {
            this.faceUrl = faceUrl;
            return this;
        }
        public String getFaceUrl() {
            return this.faceUrl;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultPerson setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultPerson setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultLocation extends TeaModel {
        @NameInMap("Times")
        public java.util.List<String> times;

        @NameInMap("Tag")
        public String tag;

        public static GetAIVideoTagResultResponseBodyVideoTagResultLocation build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultLocation self = new GetAIVideoTagResultResponseBodyVideoTagResultLocation();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultLocation setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultLocation setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResult extends TeaModel {
        @NameInMap("Time")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultTime> time;

        @NameInMap("Keyword")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultKeyword> keyword;

        @NameInMap("Category")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultCategory> category;

        @NameInMap("Person")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultPerson> person;

        @NameInMap("Location")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultLocation> location;

        public static GetAIVideoTagResultResponseBodyVideoTagResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResult self = new GetAIVideoTagResultResponseBodyVideoTagResult();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setTime(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultTime> time) {
            this.time = time;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultTime> getTime() {
            return this.time;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setKeyword(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultKeyword> keyword) {
            this.keyword = keyword;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultKeyword> getKeyword() {
            return this.keyword;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setCategory(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultCategory> getCategory() {
            return this.category;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setPerson(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultPerson> person) {
            this.person = person;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultPerson> getPerson() {
            return this.person;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setLocation(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultLocation> location) {
            this.location = location;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultLocation> getLocation() {
            return this.location;
        }

    }

}
