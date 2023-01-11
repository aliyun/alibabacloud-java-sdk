// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectDataSet2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SelectDataSet2ResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SelectDataSet2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectDataSet2ResponseBody self = new SelectDataSet2ResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectDataSet2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SelectDataSet2ResponseBody setData(SelectDataSet2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SelectDataSet2ResponseBodyData getData() {
        return this.data;
    }

    public SelectDataSet2ResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SelectDataSet2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectDataSet2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SelectDataSet2ResponseBodyData extends TeaModel {
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

        public static SelectDataSet2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SelectDataSet2ResponseBodyData self = new SelectDataSet2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SelectDataSet2ResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SelectDataSet2ResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public SelectDataSet2ResponseBodyData setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

        public SelectDataSet2ResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SelectDataSet2ResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SelectDataSet2ResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
