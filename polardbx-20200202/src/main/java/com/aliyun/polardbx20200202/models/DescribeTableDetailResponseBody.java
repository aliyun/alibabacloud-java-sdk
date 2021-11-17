// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeTableDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTableDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTableDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableDetailResponseBody self = new DescribeTableDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableDetailResponseBody setData(DescribeTableDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTableDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeTableDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTableDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTableDetailResponseBodyDataFields extends TeaModel {
        @NameInMap("Column")
        public String column;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Key")
        public String key;

        public static DescribeTableDetailResponseBodyDataFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableDetailResponseBodyDataFields self = new DescribeTableDetailResponseBodyDataFields();
            return TeaModel.build(map, self);
        }

        public DescribeTableDetailResponseBodyDataFields setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DescribeTableDetailResponseBodyDataFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeTableDetailResponseBodyDataFields setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeTableDetailResponseBodyDataFields setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class DescribeTableDetailResponseBodyData extends TeaModel {
        @NameInMap("Fields")
        public java.util.List<DescribeTableDetailResponseBodyDataFields> fields;

        public static DescribeTableDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableDetailResponseBodyData self = new DescribeTableDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTableDetailResponseBodyData setFields(java.util.List<DescribeTableDetailResponseBodyDataFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<DescribeTableDetailResponseBodyDataFields> getFields() {
            return this.fields;
        }

    }

}
