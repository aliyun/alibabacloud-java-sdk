// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetComputeResultResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 返回内容
    @NameInMap("Data")
    public GetComputeResultResponseBodyData data;

    // 消息描述
    @NameInMap("Msg")
    public String msg;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetComputeResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResultResponseBody self = new GetComputeResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComputeResultResponseBody setData(GetComputeResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComputeResultResponseBodyData getData() {
        return this.data;
    }

    public GetComputeResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetComputeResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComputeResultResponseBodyData extends TeaModel {
        // 计算任务ID
        @NameInMap("bcId")
        public Long bcId;

        // 文件地址
        @NameInMap("exportFileName")
        public String exportFileName;

        // 计算任务名称
        @NameInMap("name")
        public String name;

        // 文件密码
        @NameInMap("password")
        public String password;

        // 任务状态
        @NameInMap("state")
        public String state;

        public static GetComputeResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeResultResponseBodyData self = new GetComputeResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeResultResponseBodyData setBcId(Long bcId) {
            this.bcId = bcId;
            return this;
        }
        public Long getBcId() {
            return this.bcId;
        }

        public GetComputeResultResponseBodyData setExportFileName(String exportFileName) {
            this.exportFileName = exportFileName;
            return this;
        }
        public String getExportFileName() {
            return this.exportFileName;
        }

        public GetComputeResultResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeResultResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetComputeResultResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
