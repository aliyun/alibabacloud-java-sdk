// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetComputeResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetComputeResultResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("bcId")
        public Long bcId;

        @NameInMap("billedNum")
        public Long billedNum;

        @NameInMap("code10000Num")
        public Long code10000Num;

        @NameInMap("code108Num")
        public Long code108Num;

        @NameInMap("code109Num")
        public Long code109Num;

        @NameInMap("exportFileName")
        public String exportFileName;

        @NameInMap("fileLineNumber")
        public Long fileLineNumber;

        @NameInMap("name")
        public String name;

        @NameInMap("password")
        public String password;

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

        public GetComputeResultResponseBodyData setBilledNum(Long billedNum) {
            this.billedNum = billedNum;
            return this;
        }
        public Long getBilledNum() {
            return this.billedNum;
        }

        public GetComputeResultResponseBodyData setCode10000Num(Long code10000Num) {
            this.code10000Num = code10000Num;
            return this;
        }
        public Long getCode10000Num() {
            return this.code10000Num;
        }

        public GetComputeResultResponseBodyData setCode108Num(Long code108Num) {
            this.code108Num = code108Num;
            return this;
        }
        public Long getCode108Num() {
            return this.code108Num;
        }

        public GetComputeResultResponseBodyData setCode109Num(Long code109Num) {
            this.code109Num = code109Num;
            return this;
        }
        public Long getCode109Num() {
            return this.code109Num;
        }

        public GetComputeResultResponseBodyData setExportFileName(String exportFileName) {
            this.exportFileName = exportFileName;
            return this;
        }
        public String getExportFileName() {
            return this.exportFileName;
        }

        public GetComputeResultResponseBodyData setFileLineNumber(Long fileLineNumber) {
            this.fileLineNumber = fileLineNumber;
            return this;
        }
        public Long getFileLineNumber() {
            return this.fileLineNumber;
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
