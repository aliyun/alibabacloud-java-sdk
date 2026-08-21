// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAiAnalysisResponseBody extends TeaModel {
    @NameInMap("AiAnalysisResultList")
    public GetMediaAiAnalysisResponseBodyAiAnalysisResultList aiAnalysisResultList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>746FFA07-8BBB-46B1-3E94E3B2915E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaAiAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAiAnalysisResponseBody self = new GetMediaAiAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAiAnalysisResponseBody setAiAnalysisResultList(GetMediaAiAnalysisResponseBodyAiAnalysisResultList aiAnalysisResultList) {
        this.aiAnalysisResultList = aiAnalysisResultList;
        return this;
    }
    public GetMediaAiAnalysisResponseBodyAiAnalysisResultList getAiAnalysisResultList() {
        return this.aiAnalysisResultList;
    }

    public GetMediaAiAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("ResultType")
        public String resultType;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        public static GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult self = new GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

        public GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetMediaAiAnalysisResponseBodyAiAnalysisResultList extends TeaModel {
        @NameInMap("AiAnalysisResult")
        public java.util.List<GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult> aiAnalysisResult;

        public static GetMediaAiAnalysisResponseBodyAiAnalysisResultList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAiAnalysisResponseBodyAiAnalysisResultList self = new GetMediaAiAnalysisResponseBodyAiAnalysisResultList();
            return TeaModel.build(map, self);
        }

        public GetMediaAiAnalysisResponseBodyAiAnalysisResultList setAiAnalysisResult(java.util.List<GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult> aiAnalysisResult) {
            this.aiAnalysisResult = aiAnalysisResult;
            return this;
        }
        public java.util.List<GetMediaAiAnalysisResponseBodyAiAnalysisResultListAiAnalysisResult> getAiAnalysisResult() {
            return this.aiAnalysisResult;
        }

    }

}
