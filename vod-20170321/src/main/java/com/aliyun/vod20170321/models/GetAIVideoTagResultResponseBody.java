// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIVideoTagResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8829B4DB-AFD9-4FF6-12965DBFFA14****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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

    public static class GetAIVideoTagResultResponseBodyVideoTagResultCategory extends TeaModel {
        /**
         * <p>The tag string.</p>
         * 
         * <strong>example:</strong>
         * <p>Retouching</p>
         */
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

    public static class GetAIVideoTagResultResponseBodyVideoTagResultKeyword extends TeaModel {
        /**
         * <p>The tag string.</p>
         * 
         * <strong>example:</strong>
         * <p>Cushion</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
         */
        @NameInMap("Times")
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseBodyVideoTagResultKeyword build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultKeyword self = new GetAIVideoTagResultResponseBodyVideoTagResultKeyword();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultKeyword setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultKeyword setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultLocation extends TeaModel {
        /**
         * <p>The tag string.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
         */
        @NameInMap("Times")
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseBodyVideoTagResultLocation build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultLocation self = new GetAIVideoTagResultResponseBodyVideoTagResultLocation();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultLocation setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultLocation setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultPerson extends TeaModel {
        /**
         * <p>The URL of the profile photo.</p>
         * <blockquote>
         * <p>This parameter is returned only when a figure tag was used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/aivideotag/8829B4DB-AFD9-4F*****F6-12965DBFFA14/Index_****.jpg">http://example.com/aivideotag/8829B4DB-AFD9-4F*****F6-12965DBFFA14/Index_****.jpg</a></p>
         */
        @NameInMap("FaceUrl")
        public String faceUrl;

        /**
         * <p>The tag string.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
         */
        @NameInMap("Times")
        public java.util.List<String> times;

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

        public GetAIVideoTagResultResponseBodyVideoTagResultPerson setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultPerson setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResultTime extends TeaModel {
        /**
         * <p>The tag string.</p>
         * 
         * <strong>example:</strong>
         * <p>Milliseconds</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The points in time when the tags are displayed. Unit: milliseconds.</p>
         */
        @NameInMap("Times")
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseBodyVideoTagResultTime build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResultTime self = new GetAIVideoTagResultResponseBodyVideoTagResultTime();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultTime setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResultTime setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

    }

    public static class GetAIVideoTagResultResponseBodyVideoTagResult extends TeaModel {
        /**
         * <p>The video categories.</p>
         */
        @NameInMap("Category")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultCategory> category;

        /**
         * <p>The keyword tags.</p>
         */
        @NameInMap("Keyword")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultKeyword> keyword;

        /**
         * <p>The location tags.</p>
         */
        @NameInMap("Location")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultLocation> location;

        /**
         * <p>The figure tags.</p>
         */
        @NameInMap("Person")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultPerson> person;

        /**
         * <p>The time tags.</p>
         */
        @NameInMap("Time")
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultTime> time;

        public static GetAIVideoTagResultResponseBodyVideoTagResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseBodyVideoTagResult self = new GetAIVideoTagResultResponseBodyVideoTagResult();
            return TeaModel.build(map, self);
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setCategory(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultCategory> getCategory() {
            return this.category;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setKeyword(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultKeyword> keyword) {
            this.keyword = keyword;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultKeyword> getKeyword() {
            return this.keyword;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setLocation(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultLocation> location) {
            this.location = location;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultLocation> getLocation() {
            return this.location;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setPerson(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultPerson> person) {
            this.person = person;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultPerson> getPerson() {
            return this.person;
        }

        public GetAIVideoTagResultResponseBodyVideoTagResult setTime(java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultTime> time) {
            this.time = time;
            return this;
        }
        public java.util.List<GetAIVideoTagResultResponseBodyVideoTagResultTime> getTime() {
            return this.time;
        }

    }

}
