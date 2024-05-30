// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateResponseBody extends TeaModel {
    @NameInMap("Date")
    public AddFaceVideoTemplateResponseBodyDate date;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddFaceVideoTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateResponseBody self = new AddFaceVideoTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateResponseBody setDate(AddFaceVideoTemplateResponseBodyDate date) {
        this.date = date;
        return this;
    }
    public AddFaceVideoTemplateResponseBodyDate getDate() {
        return this.date;
    }

    public AddFaceVideoTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddFaceVideoTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFaceVideoTemplateResponseBodyDateFaceInfos extends TeaModel {
        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        @NameInMap("TemplateFaceURL")
        public String templateFaceURL;

        public static AddFaceVideoTemplateResponseBodyDateFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            AddFaceVideoTemplateResponseBodyDateFaceInfos self = new AddFaceVideoTemplateResponseBodyDateFaceInfos();
            return TeaModel.build(map, self);
        }

        public AddFaceVideoTemplateResponseBodyDateFaceInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

        public AddFaceVideoTemplateResponseBodyDateFaceInfos setTemplateFaceURL(String templateFaceURL) {
            this.templateFaceURL = templateFaceURL;
            return this;
        }
        public String getTemplateFaceURL() {
            return this.templateFaceURL;
        }

    }

    public static class AddFaceVideoTemplateResponseBodyDate extends TeaModel {
        @NameInMap("FaceInfos")
        public java.util.List<AddFaceVideoTemplateResponseBodyDateFaceInfos> faceInfos;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TransResult")
        public String transResult;

        public static AddFaceVideoTemplateResponseBodyDate build(java.util.Map<String, ?> map) throws Exception {
            AddFaceVideoTemplateResponseBodyDate self = new AddFaceVideoTemplateResponseBodyDate();
            return TeaModel.build(map, self);
        }

        public AddFaceVideoTemplateResponseBodyDate setFaceInfos(java.util.List<AddFaceVideoTemplateResponseBodyDateFaceInfos> faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public java.util.List<AddFaceVideoTemplateResponseBodyDateFaceInfos> getFaceInfos() {
            return this.faceInfos;
        }

        public AddFaceVideoTemplateResponseBodyDate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public AddFaceVideoTemplateResponseBodyDate setTransResult(String transResult) {
            this.transResult = transResult;
            return this;
        }
        public String getTransResult() {
            return this.transResult;
        }

    }

}
