// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetDataSetStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataSetStatusResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("requestId")
    public String requestId;

    public static GetDataSetStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSetStatusResponseBody self = new GetDataSetStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSetStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataSetStatusResponseBody setData(GetDataSetStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataSetStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDataSetStatusResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetDataSetStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataSetStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataSetStatusResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("dataSetType")
        public Integer dataSetType;

        @NameInMap("datasetId")
        public Long datasetId;

        @NameInMap("idTypeDesc")
        public String idTypeDesc;

        @NameInMap("message")
        public String message;

        @NameInMap("name")
        public String name;

        @NameInMap("statusDesc")
        public String statusDesc;

        public static GetDataSetStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataSetStatusResponseBodyData self = new GetDataSetStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataSetStatusResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDataSetStatusResponseBodyData setDataSetType(Integer dataSetType) {
            this.dataSetType = dataSetType;
            return this;
        }
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        public GetDataSetStatusResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public GetDataSetStatusResponseBodyData setIdTypeDesc(String idTypeDesc) {
            this.idTypeDesc = idTypeDesc;
            return this;
        }
        public String getIdTypeDesc() {
            return this.idTypeDesc;
        }

        public GetDataSetStatusResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDataSetStatusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSetStatusResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

}
