// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHitResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public GetHitResultResponseBodyData data;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetHitResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHitResultResponseBody self = new GetHitResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHitResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHitResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHitResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetHitResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetHitResultResponseBody setData(GetHitResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHitResultResponseBodyData getData() {
        return this.data;
    }

    public GetHitResultResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetHitResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHitResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHitResultResponseBodyDataResultInfo extends TeaModel {
        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Rid")
        public Long rid;

        public static GetHitResultResponseBodyDataResultInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHitResultResponseBodyDataResultInfo self = new GetHitResultResponseBodyDataResultInfo();
            return TeaModel.build(map, self);
        }

        public GetHitResultResponseBodyDataResultInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetHitResultResponseBodyDataResultInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

    public static class GetHitResultResponseBodyData extends TeaModel {
        @NameInMap("ResultInfo")
        public java.util.List<GetHitResultResponseBodyDataResultInfo> resultInfo;

        public static GetHitResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHitResultResponseBodyData self = new GetHitResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHitResultResponseBodyData setResultInfo(java.util.List<GetHitResultResponseBodyDataResultInfo> resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public java.util.List<GetHitResultResponseBodyDataResultInfo> getResultInfo() {
            return this.resultInfo;
        }

    }

}
