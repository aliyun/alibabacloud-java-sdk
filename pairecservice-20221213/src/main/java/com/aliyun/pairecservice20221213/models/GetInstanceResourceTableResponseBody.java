// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResourceTableResponseBody extends TeaModel {
    @NameInMap("Fields")
    public java.util.List<GetInstanceResourceTableResponseBodyFields> fields;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TableName")
    public String tableName;

    public static GetInstanceResourceTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResourceTableResponseBody self = new GetInstanceResourceTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResourceTableResponseBody setFields(java.util.List<GetInstanceResourceTableResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetInstanceResourceTableResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetInstanceResourceTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResourceTableResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class GetInstanceResourceTableResponseBodyFields extends TeaModel {
        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        @NameInMap("Meaning")
        public String meaning;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetInstanceResourceTableResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResourceTableResponseBodyFields self = new GetInstanceResourceTableResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetInstanceResourceTableResponseBodyFields setIsDimensionField(Boolean isDimensionField) {
            this.isDimensionField = isDimensionField;
            return this;
        }
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        public GetInstanceResourceTableResponseBodyFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public GetInstanceResourceTableResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceResourceTableResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
