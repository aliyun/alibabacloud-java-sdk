// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class QueryFaceVideoTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryFaceVideoTemplateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFaceVideoTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceVideoTemplateResponseBody self = new QueryFaceVideoTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceVideoTemplateResponseBody setData(QueryFaceVideoTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceVideoTemplateResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceVideoTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos extends TeaModel {
        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        @NameInMap("TemplateFaceURL")
        public String templateFaceURL;

        public static QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos self = new QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos();
            return TeaModel.build(map, self);
        }

        public QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

        public QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos setTemplateFaceURL(String templateFaceURL) {
            this.templateFaceURL = templateFaceURL;
            return this;
        }
        public String getTemplateFaceURL() {
            return this.templateFaceURL;
        }

    }

    public static class QueryFaceVideoTemplateResponseBodyDataElements extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FaceInfos")
        public java.util.List<QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos> faceInfos;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateURL")
        public String templateURL;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceVideoTemplateResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceVideoTemplateResponseBodyDataElements self = new QueryFaceVideoTemplateResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public QueryFaceVideoTemplateResponseBodyDataElements setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryFaceVideoTemplateResponseBodyDataElements setFaceInfos(java.util.List<QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos> faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public java.util.List<QueryFaceVideoTemplateResponseBodyDataElementsFaceInfos> getFaceInfos() {
            return this.faceInfos;
        }

        public QueryFaceVideoTemplateResponseBodyDataElements setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryFaceVideoTemplateResponseBodyDataElements setTemplateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }
        public String getTemplateURL() {
            return this.templateURL;
        }

        public QueryFaceVideoTemplateResponseBodyDataElements setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryFaceVideoTemplateResponseBodyDataElements setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryFaceVideoTemplateResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<QueryFaceVideoTemplateResponseBodyDataElements> elements;

        @NameInMap("Total")
        public Long total;

        public static QueryFaceVideoTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceVideoTemplateResponseBodyData self = new QueryFaceVideoTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceVideoTemplateResponseBodyData setElements(java.util.List<QueryFaceVideoTemplateResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<QueryFaceVideoTemplateResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public QueryFaceVideoTemplateResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
