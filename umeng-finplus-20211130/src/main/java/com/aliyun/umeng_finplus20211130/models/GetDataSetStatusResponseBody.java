// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetDataSetStatusResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 返回内容
    @NameInMap("Data")
    public GetDataSetStatusResponseBodyData data;

    // 消息描述
    @NameInMap("Msg")
    public String msg;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // Id of the request
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
        // 创建日期
        @NameInMap("createTime")
        public String createTime;

        // 数据集数据类型
        @NameInMap("dataSetType")
        public Integer dataSetType;

        // 数据集ID
        @NameInMap("datasetId")
        public Long datasetId;

        // id类型描述
        @NameInMap("idTypeDesc")
        public String idTypeDesc;

        // 错误消息描述
        @NameInMap("message")
        public String message;

        // 数据集名称
        @NameInMap("name")
        public String name;

        // 数据集状态
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
