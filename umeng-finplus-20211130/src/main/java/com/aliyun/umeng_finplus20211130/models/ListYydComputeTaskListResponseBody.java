// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class ListYydComputeTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListYydComputeTaskListResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListYydComputeTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYydComputeTaskListResponseBody self = new ListYydComputeTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYydComputeTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListYydComputeTaskListResponseBody setData(java.util.List<ListYydComputeTaskListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListYydComputeTaskListResponseBodyData> getData() {
        return this.data;
    }

    public ListYydComputeTaskListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListYydComputeTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYydComputeTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListYydComputeTaskListResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public Long appId;

        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("name")
        public String name;

        @NameInMap("remarks")
        public String remarks;

        @NameInMap("state")
        public String state;

        public static ListYydComputeTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListYydComputeTaskListResponseBodyData self = new ListYydComputeTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListYydComputeTaskListResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListYydComputeTaskListResponseBodyData setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public ListYydComputeTaskListResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListYydComputeTaskListResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListYydComputeTaskListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListYydComputeTaskListResponseBodyData setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public ListYydComputeTaskListResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
