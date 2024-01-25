// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetAvailableDataSetListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAvailableDataSetListResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAvailableDataSetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableDataSetListResponseBody self = new GetAvailableDataSetListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvailableDataSetListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAvailableDataSetListResponseBody setData(java.util.List<GetAvailableDataSetListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAvailableDataSetListResponseBodyData> getData() {
        return this.data;
    }

    public GetAvailableDataSetListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetAvailableDataSetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvailableDataSetListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAvailableDataSetListResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("dataSetType")
        public Integer dataSetType;

        @NameInMap("datasetId")
        public Long datasetId;

        @NameInMap("idTypeDesc")
        public String idTypeDesc;

        @NameInMap("name")
        public String name;

        @NameInMap("statusDesc")
        public String statusDesc;

        public static GetAvailableDataSetListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAvailableDataSetListResponseBodyData self = new GetAvailableDataSetListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAvailableDataSetListResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAvailableDataSetListResponseBodyData setDataSetType(Integer dataSetType) {
            this.dataSetType = dataSetType;
            return this;
        }
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        public GetAvailableDataSetListResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public GetAvailableDataSetListResponseBodyData setIdTypeDesc(String idTypeDesc) {
            this.idTypeDesc = idTypeDesc;
            return this;
        }
        public String getIdTypeDesc() {
            return this.idTypeDesc;
        }

        public GetAvailableDataSetListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAvailableDataSetListResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

}
