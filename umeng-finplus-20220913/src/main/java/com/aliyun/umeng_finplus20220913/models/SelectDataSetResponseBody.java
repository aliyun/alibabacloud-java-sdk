// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectDataSetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SelectDataSetResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SelectDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectDataSetResponseBody self = new SelectDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SelectDataSetResponseBody setData(SelectDataSetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SelectDataSetResponseBodyData getData() {
        return this.data;
    }

    public SelectDataSetResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SelectDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectDataSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SelectDataSetResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("datasetId")
        public Long datasetId;

        @NameInMap("lineNum")
        public Long lineNum;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("type")
        public String type;

        public static SelectDataSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SelectDataSetResponseBodyData self = new SelectDataSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SelectDataSetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SelectDataSetResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public SelectDataSetResponseBodyData setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

        public SelectDataSetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SelectDataSetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SelectDataSetResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
