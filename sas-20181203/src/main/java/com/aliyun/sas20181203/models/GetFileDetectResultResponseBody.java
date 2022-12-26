// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultList")
    public java.util.List<GetFileDetectResultResponseBodyResultList> resultList;

    public static GetFileDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectResultResponseBody self = new GetFileDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileDetectResultResponseBody setResultList(java.util.List<GetFileDetectResultResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<GetFileDetectResultResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class GetFileDetectResultResponseBodyResultList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("HashKey")
        public String hashKey;

        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("VirusType")
        public String virusType;

        public static GetFileDetectResultResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            GetFileDetectResultResponseBodyResultList self = new GetFileDetectResultResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public GetFileDetectResultResponseBodyResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetFileDetectResultResponseBodyResultList setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public GetFileDetectResultResponseBodyResultList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public GetFileDetectResultResponseBodyResultList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetFileDetectResultResponseBodyResultList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public GetFileDetectResultResponseBodyResultList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetFileDetectResultResponseBodyResultList setVirusType(String virusType) {
            this.virusType = virusType;
            return this;
        }
        public String getVirusType() {
            return this.virusType;
        }

    }

}
