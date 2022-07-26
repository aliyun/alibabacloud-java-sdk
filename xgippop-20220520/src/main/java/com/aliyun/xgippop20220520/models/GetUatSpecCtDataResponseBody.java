// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetUatSpecCtDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetUatSpecCtDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetUatSpecCtDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUatSpecCtDataResponseBody self = new GetUatSpecCtDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUatSpecCtDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUatSpecCtDataResponseBody setData(java.util.List<GetUatSpecCtDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUatSpecCtDataResponseBodyData> getData() {
        return this.data;
    }

    public GetUatSpecCtDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUatSpecCtDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUatSpecCtDataResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetUatSpecCtDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUatSpecCtDataResponseBodyData extends TeaModel {
        @NameInMap("MonthCount")
        public Long monthCount;

        @NameInMap("SpecType")
        public String specType;

        public static GetUatSpecCtDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUatSpecCtDataResponseBodyData self = new GetUatSpecCtDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUatSpecCtDataResponseBodyData setMonthCount(Long monthCount) {
            this.monthCount = monthCount;
            return this;
        }
        public Long getMonthCount() {
            return this.monthCount;
        }

        public GetUatSpecCtDataResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

    }

}
