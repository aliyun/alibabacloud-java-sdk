// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListDataSet2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDataSet2ResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataSet2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSet2ResponseBody self = new ListDataSet2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSet2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSet2ResponseBody setData(ListDataSet2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataSet2ResponseBodyData getData() {
        return this.data;
    }

    public ListDataSet2ResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListDataSet2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSet2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataSet2ResponseBodyDataData extends TeaModel {
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

        public static ListDataSet2ResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSet2ResponseBodyDataData self = new ListDataSet2ResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListDataSet2ResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataSet2ResponseBodyDataData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public ListDataSet2ResponseBodyDataData setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

        public ListDataSet2ResponseBodyDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSet2ResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataSet2ResponseBodyDataData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataSet2ResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListDataSet2ResponseBodyDataData> data;

        @NameInMap("totalNum")
        public Integer totalNum;

        public static ListDataSet2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSet2ResponseBodyData self = new ListDataSet2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSet2ResponseBodyData setData(java.util.List<ListDataSet2ResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListDataSet2ResponseBodyDataData> getData() {
            return this.data;
        }

        public ListDataSet2ResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
