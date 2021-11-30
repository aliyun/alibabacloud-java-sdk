// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetAvailableDataSetListResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 数据集列表
    @NameInMap("Data")
    public java.util.List<GetAvailableDataSetListResponseBodyData> data;

    // 状态描述
    @NameInMap("Msg")
    public String msg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
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
        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 数据集类型
        @NameInMap("dataSetType")
        public Integer dataSetType;

        // 数据集id
        @NameInMap("datasetId")
        public Long datasetId;

        // id类型描述
        @NameInMap("idTypeDesc")
        public String idTypeDesc;

        // 数据集名称
        @NameInMap("name")
        public String name;

        // 状态描述
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
