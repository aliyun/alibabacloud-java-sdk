// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAIAnalysisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public StartAIAnalysisResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartAIAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAIAnalysisResponseBody self = new StartAIAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAIAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartAIAnalysisResponseBody setData(StartAIAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartAIAnalysisResponseBodyData getData() {
        return this.data;
    }

    public StartAIAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartAIAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartAIAnalysisResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
         */
        @NameInMap("analysis_id")
        public String analysisId;

        public static StartAIAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartAIAnalysisResponseBodyData self = new StartAIAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartAIAnalysisResponseBodyData setAnalysisId(String analysisId) {
            this.analysisId = analysisId;
            return this;
        }
        public String getAnalysisId() {
            return this.analysisId;
        }

    }

}
