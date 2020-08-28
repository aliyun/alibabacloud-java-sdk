// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIVideoTagResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VideoTagResult")
    @Validation(required = true)
    public GetAIVideoTagResultResponseVideoTagResult videoTagResult;

    public static GetAIVideoTagResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIVideoTagResultResponse self = new GetAIVideoTagResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAIVideoTagResultResponseVideoTagResultCategory extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        public static GetAIVideoTagResultResponseVideoTagResultCategory build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseVideoTagResultCategory self = new GetAIVideoTagResultResponseVideoTagResultCategory();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIVideoTagResultResponseVideoTagResultPerson extends TeaModel {
        @NameInMap("FaceUrl")
        @Validation(required = true)
        public String faceUrl;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("Times")
        @Validation(required = true)
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseVideoTagResultPerson build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseVideoTagResultPerson self = new GetAIVideoTagResultResponseVideoTagResultPerson();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIVideoTagResultResponseVideoTagResultTime extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("Times")
        @Validation(required = true)
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseVideoTagResultTime build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseVideoTagResultTime self = new GetAIVideoTagResultResponseVideoTagResultTime();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIVideoTagResultResponseVideoTagResultLocation extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("Times")
        @Validation(required = true)
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseVideoTagResultLocation build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseVideoTagResultLocation self = new GetAIVideoTagResultResponseVideoTagResultLocation();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIVideoTagResultResponseVideoTagResultKeyword extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("Times")
        @Validation(required = true)
        public java.util.List<String> times;

        public static GetAIVideoTagResultResponseVideoTagResultKeyword build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseVideoTagResultKeyword self = new GetAIVideoTagResultResponseVideoTagResultKeyword();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAIVideoTagResultResponseVideoTagResult extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public java.util.List<GetAIVideoTagResultResponseVideoTagResultCategory> category;

        @NameInMap("Person")
        @Validation(required = true)
        public java.util.List<GetAIVideoTagResultResponseVideoTagResultPerson> person;

        @NameInMap("Time")
        @Validation(required = true)
        public java.util.List<GetAIVideoTagResultResponseVideoTagResultTime> time;

        @NameInMap("Location")
        @Validation(required = true)
        public java.util.List<GetAIVideoTagResultResponseVideoTagResultLocation> location;

        @NameInMap("Keyword")
        @Validation(required = true)
        public java.util.List<GetAIVideoTagResultResponseVideoTagResultKeyword> keyword;

        public static GetAIVideoTagResultResponseVideoTagResult build(java.util.Map<String, ?> map) throws Exception {
            GetAIVideoTagResultResponseVideoTagResult self = new GetAIVideoTagResultResponseVideoTagResult();
            return TeaModel.build(map, self);
        }

    }

}
