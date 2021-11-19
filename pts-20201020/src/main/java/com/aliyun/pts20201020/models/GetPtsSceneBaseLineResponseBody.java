// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneBaseLineResponseBody extends TeaModel {
    @NameInMap("Baseline")
    public GetPtsSceneBaseLineResponseBodyBaseline baseline;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPtsSceneBaseLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneBaseLineResponseBody self = new GetPtsSceneBaseLineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneBaseLineResponseBody setBaseline(GetPtsSceneBaseLineResponseBodyBaseline baseline) {
        this.baseline = baseline;
        return this;
    }
    public GetPtsSceneBaseLineResponseBodyBaseline getBaseline() {
        return this.baseline;
    }

    public GetPtsSceneBaseLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsSceneBaseLineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPtsSceneBaseLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsSceneBaseLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsSceneBaseLineResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetPtsSceneBaseLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPtsSceneBaseLineResponseBodyBaselineApiBaselines extends TeaModel {
        @NameInMap("AvgRt")
        public Float avgRt;

        @NameInMap("AvgTps")
        public Float avgTps;

        @NameInMap("FailCountBiz")
        public Long failCountBiz;

        @NameInMap("FailCountReq")
        public Long failCountReq;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxRt")
        public Integer maxRt;

        @NameInMap("MinRt")
        public Integer minRt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Seg90Rt")
        public Float seg90Rt;

        @NameInMap("Seg99Rt")
        public Float seg99Rt;

        @NameInMap("SuccessRateBiz")
        public Float successRateBiz;

        @NameInMap("SuccessRateReq")
        public Float successRateReq;

        public static GetPtsSceneBaseLineResponseBodyBaselineApiBaselines build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneBaseLineResponseBodyBaselineApiBaselines self = new GetPtsSceneBaseLineResponseBodyBaselineApiBaselines();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setAvgRt(Float avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Float getAvgRt() {
            return this.avgRt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setAvgTps(Float avgTps) {
            this.avgTps = avgTps;
            return this;
        }
        public Float getAvgTps() {
            return this.avgTps;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setFailCountBiz(Long failCountBiz) {
            this.failCountBiz = failCountBiz;
            return this;
        }
        public Long getFailCountBiz() {
            return this.failCountBiz;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setFailCountReq(Long failCountReq) {
            this.failCountReq = failCountReq;
            return this;
        }
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setMaxRt(Integer maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public Integer getMaxRt() {
            return this.maxRt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setMinRt(Integer minRt) {
            this.minRt = minRt;
            return this;
        }
        public Integer getMinRt() {
            return this.minRt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setSeg90Rt(Float seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setSeg99Rt(Float seg99Rt) {
            this.seg99Rt = seg99Rt;
            return this;
        }
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setSuccessRateBiz(Float successRateBiz) {
            this.successRateBiz = successRateBiz;
            return this;
        }
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineApiBaselines setSuccessRateReq(Float successRateReq) {
            this.successRateReq = successRateReq;
            return this;
        }
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

    }

    public static class GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline extends TeaModel {
        @NameInMap("AvgRt")
        public Float avgRt;

        @NameInMap("AvgTps")
        public Float avgTps;

        @NameInMap("FailCountBiz")
        public Long failCountBiz;

        @NameInMap("FailCountReq")
        public Long failCountReq;

        @NameInMap("Seg90Rt")
        public Float seg90Rt;

        @NameInMap("Seg99Rt")
        public Float seg99Rt;

        @NameInMap("SuccessRateBiz")
        public Float successRateBiz;

        @NameInMap("SuccessRateReq")
        public Float successRateReq;

        public static GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline self = new GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setAvgRt(Float avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Float getAvgRt() {
            return this.avgRt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setAvgTps(Float avgTps) {
            this.avgTps = avgTps;
            return this;
        }
        public Float getAvgTps() {
            return this.avgTps;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setFailCountBiz(Long failCountBiz) {
            this.failCountBiz = failCountBiz;
            return this;
        }
        public Long getFailCountBiz() {
            return this.failCountBiz;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setFailCountReq(Long failCountReq) {
            this.failCountReq = failCountReq;
            return this;
        }
        public Long getFailCountReq() {
            return this.failCountReq;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setSeg90Rt(Float seg90Rt) {
            this.seg90Rt = seg90Rt;
            return this;
        }
        public Float getSeg90Rt() {
            return this.seg90Rt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setSeg99Rt(Float seg99Rt) {
            this.seg99Rt = seg99Rt;
            return this;
        }
        public Float getSeg99Rt() {
            return this.seg99Rt;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setSuccessRateBiz(Float successRateBiz) {
            this.successRateBiz = successRateBiz;
            return this;
        }
        public Float getSuccessRateBiz() {
            return this.successRateBiz;
        }

        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline setSuccessRateReq(Float successRateReq) {
            this.successRateReq = successRateReq;
            return this;
        }
        public Float getSuccessRateReq() {
            return this.successRateReq;
        }

    }

    public static class GetPtsSceneBaseLineResponseBodyBaseline extends TeaModel {
        @NameInMap("ApiBaselines")
        public java.util.List<GetPtsSceneBaseLineResponseBodyBaselineApiBaselines> apiBaselines;

        @NameInMap("Name")
        public String name;

        @NameInMap("SceneBaseline")
        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline sceneBaseline;

        public static GetPtsSceneBaseLineResponseBodyBaseline build(java.util.Map<String, ?> map) throws Exception {
            GetPtsSceneBaseLineResponseBodyBaseline self = new GetPtsSceneBaseLineResponseBodyBaseline();
            return TeaModel.build(map, self);
        }

        public GetPtsSceneBaseLineResponseBodyBaseline setApiBaselines(java.util.List<GetPtsSceneBaseLineResponseBodyBaselineApiBaselines> apiBaselines) {
            this.apiBaselines = apiBaselines;
            return this;
        }
        public java.util.List<GetPtsSceneBaseLineResponseBodyBaselineApiBaselines> getApiBaselines() {
            return this.apiBaselines;
        }

        public GetPtsSceneBaseLineResponseBodyBaseline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPtsSceneBaseLineResponseBodyBaseline setSceneBaseline(GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline sceneBaseline) {
            this.sceneBaseline = sceneBaseline;
            return this;
        }
        public GetPtsSceneBaseLineResponseBodyBaselineSceneBaseline getSceneBaseline() {
            return this.sceneBaseline;
        }

    }

}
