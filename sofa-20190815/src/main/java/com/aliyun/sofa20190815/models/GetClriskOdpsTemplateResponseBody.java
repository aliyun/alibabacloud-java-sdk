// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskOdpsTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Columns")
    public java.util.List<GetClriskOdpsTemplateResponseBodyColumns> columns;

    public static GetClriskOdpsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskOdpsTemplateResponseBody self = new GetClriskOdpsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskOdpsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskOdpsTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskOdpsTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskOdpsTemplateResponseBody setColumns(java.util.List<GetClriskOdpsTemplateResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<GetClriskOdpsTemplateResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public static class GetClriskOdpsTemplateResponseBodyColumns extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetClriskOdpsTemplateResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            GetClriskOdpsTemplateResponseBodyColumns self = new GetClriskOdpsTemplateResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public GetClriskOdpsTemplateResponseBodyColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskOdpsTemplateResponseBodyColumns setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
