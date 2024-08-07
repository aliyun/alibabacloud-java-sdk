// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetScoreInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetScoreInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScoreInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScoreInfoResponseBody self = new GetScoreInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScoreInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScoreInfoResponseBody setData(GetScoreInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScoreInfoResponseBodyData getData() {
        return this.data;
    }

    public GetScoreInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScoreInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScoreInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <strong>example:</strong>
         * <p>3422</p>
         */
        @NameInMap("ScoreSubId")
        public Integer scoreSubId;

        @NameInMap("ScoreSubName")
        public String scoreSubName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        public static GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam build(java.util.Map<String, ?> map) throws Exception {
            GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam self = new GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam();
            return TeaModel.build(map, self);
        }

        public GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam setScoreSubId(Integer scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Integer getScoreSubId() {
            return this.scoreSubId;
        }

        public GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

    }

    public static class GetScoreInfoResponseBodyDataScorePoScoreInfos extends TeaModel {
        @NameInMap("ScoreParam")
        public java.util.List<GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam> scoreParam;

        public static GetScoreInfoResponseBodyDataScorePoScoreInfos build(java.util.Map<String, ?> map) throws Exception {
            GetScoreInfoResponseBodyDataScorePoScoreInfos self = new GetScoreInfoResponseBodyDataScorePoScoreInfos();
            return TeaModel.build(map, self);
        }

        public GetScoreInfoResponseBodyDataScorePoScoreInfos setScoreParam(java.util.List<GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam> scoreParam) {
            this.scoreParam = scoreParam;
            return this;
        }
        public java.util.List<GetScoreInfoResponseBodyDataScorePoScoreInfosScoreParam> getScoreParam() {
            return this.scoreParam;
        }

    }

    public static class GetScoreInfoResponseBodyDataScorePo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("ScoreId")
        public Integer scoreId;

        @NameInMap("ScoreInfos")
        public GetScoreInfoResponseBodyDataScorePoScoreInfos scoreInfos;

        @NameInMap("ScoreName")
        public String scoreName;

        public static GetScoreInfoResponseBodyDataScorePo build(java.util.Map<String, ?> map) throws Exception {
            GetScoreInfoResponseBodyDataScorePo self = new GetScoreInfoResponseBodyDataScorePo();
            return TeaModel.build(map, self);
        }

        public GetScoreInfoResponseBodyDataScorePo setScoreId(Integer scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Integer getScoreId() {
            return this.scoreId;
        }

        public GetScoreInfoResponseBodyDataScorePo setScoreInfos(GetScoreInfoResponseBodyDataScorePoScoreInfos scoreInfos) {
            this.scoreInfos = scoreInfos;
            return this;
        }
        public GetScoreInfoResponseBodyDataScorePoScoreInfos getScoreInfos() {
            return this.scoreInfos;
        }

        public GetScoreInfoResponseBodyDataScorePo setScoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }
        public String getScoreName() {
            return this.scoreName;
        }

    }

    public static class GetScoreInfoResponseBodyData extends TeaModel {
        @NameInMap("ScorePo")
        public java.util.List<GetScoreInfoResponseBodyDataScorePo> scorePo;

        public static GetScoreInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScoreInfoResponseBodyData self = new GetScoreInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScoreInfoResponseBodyData setScorePo(java.util.List<GetScoreInfoResponseBodyDataScorePo> scorePo) {
            this.scorePo = scorePo;
            return this;
        }
        public java.util.List<GetScoreInfoResponseBodyDataScorePo> getScorePo() {
            return this.scorePo;
        }

    }

}
