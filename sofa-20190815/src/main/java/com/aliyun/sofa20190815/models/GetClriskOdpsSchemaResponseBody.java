// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskOdpsSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Columns")
    public java.util.List<GetClriskOdpsSchemaResponseBodyColumns> columns;

    public static GetClriskOdpsSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskOdpsSchemaResponseBody self = new GetClriskOdpsSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskOdpsSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskOdpsSchemaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskOdpsSchemaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskOdpsSchemaResponseBody setColumns(java.util.List<GetClriskOdpsSchemaResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<GetClriskOdpsSchemaResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public static class GetClriskOdpsSchemaResponseBodyColumns extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetClriskOdpsSchemaResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            GetClriskOdpsSchemaResponseBodyColumns self = new GetClriskOdpsSchemaResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public GetClriskOdpsSchemaResponseBodyColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskOdpsSchemaResponseBodyColumns setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
