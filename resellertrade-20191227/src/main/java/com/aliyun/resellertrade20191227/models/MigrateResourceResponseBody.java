// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class MigrateResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MigrateResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MigrateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateResourceResponseBody self = new MigrateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MigrateResourceResponseBody setData(MigrateResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MigrateResourceResponseBodyData getData() {
        return this.data;
    }

    public MigrateResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MigrateResourceResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ProcEnvir")
        public String procEnvir;

        public static MigrateResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MigrateResourceResponseBodyData self = new MigrateResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MigrateResourceResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public MigrateResourceResponseBodyData setProcEnvir(String procEnvir) {
            this.procEnvir = procEnvir;
            return this;
        }
        public String getProcEnvir() {
            return this.procEnvir;
        }

    }

}
