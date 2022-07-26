// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetUatDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetUatDataListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static GetUatDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUatDataListResponseBody self = new GetUatDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUatDataListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUatDataListResponseBody setData(java.util.List<GetUatDataListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUatDataListResponseBodyData> getData() {
        return this.data;
    }

    public GetUatDataListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUatDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUatDataListResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetUatDataListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUatDataListResponseBodyDataDsList extends TeaModel {
        @NameInMap("DsData")
        public Long dsData;

        @NameInMap("DsDay")
        public Long dsDay;

        public static GetUatDataListResponseBodyDataDsList build(java.util.Map<String, ?> map) throws Exception {
            GetUatDataListResponseBodyDataDsList self = new GetUatDataListResponseBodyDataDsList();
            return TeaModel.build(map, self);
        }

        public GetUatDataListResponseBodyDataDsList setDsData(Long dsData) {
            this.dsData = dsData;
            return this;
        }
        public Long getDsData() {
            return this.dsData;
        }

        public GetUatDataListResponseBodyDataDsList setDsDay(Long dsDay) {
            this.dsDay = dsDay;
            return this;
        }
        public Long getDsDay() {
            return this.dsDay;
        }

    }

    public static class GetUatDataListResponseBodyData extends TeaModel {
        @NameInMap("DsList")
        public java.util.List<GetUatDataListResponseBodyDataDsList> dsList;

        @NameInMap("SpecType")
        public String specType;

        public static GetUatDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUatDataListResponseBodyData self = new GetUatDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUatDataListResponseBodyData setDsList(java.util.List<GetUatDataListResponseBodyDataDsList> dsList) {
            this.dsList = dsList;
            return this;
        }
        public java.util.List<GetUatDataListResponseBodyDataDsList> getDsList() {
            return this.dsList;
        }

        public GetUatDataListResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

    }

}
