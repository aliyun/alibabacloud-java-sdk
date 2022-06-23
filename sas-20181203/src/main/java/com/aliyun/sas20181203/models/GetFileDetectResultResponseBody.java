// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultResponseBody extends TeaModel {
    // Id of the request
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

    public static class GetFileDetectResultResponseBodyResultListExt extends TeaModel {
        @NameInMap("VirusName")
        public String virusName;

        public static GetFileDetectResultResponseBodyResultListExt build(java.util.Map<String, ?> map) throws Exception {
            GetFileDetectResultResponseBodyResultListExt self = new GetFileDetectResultResponseBodyResultListExt();
            return TeaModel.build(map, self);
        }

        public GetFileDetectResultResponseBodyResultListExt setVirusName(String virusName) {
            this.virusName = virusName;
            return this;
        }
        public String getVirusName() {
            return this.virusName;
        }

    }

    public static class GetFileDetectResultResponseBodyResultList extends TeaModel {
        @NameInMap("Ext")
        public GetFileDetectResultResponseBodyResultListExt ext;

        @NameInMap("HashKey")
        public String hashKey;

        @NameInMap("Result")
        public Integer result;

        public static GetFileDetectResultResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            GetFileDetectResultResponseBodyResultList self = new GetFileDetectResultResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public GetFileDetectResultResponseBodyResultList setExt(GetFileDetectResultResponseBodyResultListExt ext) {
            this.ext = ext;
            return this;
        }
        public GetFileDetectResultResponseBodyResultListExt getExt() {
            return this.ext;
        }

        public GetFileDetectResultResponseBodyResultList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public GetFileDetectResultResponseBodyResultList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

    }

}
