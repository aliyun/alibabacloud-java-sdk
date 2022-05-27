// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class ListYydDataSetResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListYydDataSetResponseBodyData> data;

    // 状态描述
    @NameInMap("Msg")
    public String msg;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListYydDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYydDataSetResponseBody self = new ListYydDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYydDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListYydDataSetResponseBody setData(java.util.List<ListYydDataSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListYydDataSetResponseBodyData> getData() {
        return this.data;
    }

    public ListYydDataSetResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListYydDataSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListYydDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListYydDataSetResponseBodyData extends TeaModel {
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

        public static ListYydDataSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListYydDataSetResponseBodyData self = new ListYydDataSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListYydDataSetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListYydDataSetResponseBodyData setDataSetType(Integer dataSetType) {
            this.dataSetType = dataSetType;
            return this;
        }
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        public ListYydDataSetResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public ListYydDataSetResponseBodyData setIdTypeDesc(String idTypeDesc) {
            this.idTypeDesc = idTypeDesc;
            return this;
        }
        public String getIdTypeDesc() {
            return this.idTypeDesc;
        }

        public ListYydDataSetResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListYydDataSetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListYydDataSetResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

}
