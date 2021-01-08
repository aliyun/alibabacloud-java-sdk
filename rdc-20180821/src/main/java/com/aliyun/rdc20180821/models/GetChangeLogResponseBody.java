// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetChangeLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetChangeLogResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetChangeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeLogResponseBody self = new GetChangeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeLogResponseBody setData(java.util.List<GetChangeLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetChangeLogResponseBodyData> getData() {
        return this.data;
    }

    public GetChangeLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetChangeLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChangeLogResponseBodyData extends TeaModel {
        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("PropertyType")
        public String propertyType;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("TargetId")
        public Integer targetId;

        @NameInMap("Other")
        public String other;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("TargetType")
        public String targetType;

        public static GetChangeLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChangeLogResponseBodyData self = new GetChangeLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChangeLogResponseBodyData setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public GetChangeLogResponseBodyData setPropertyType(String propertyType) {
            this.propertyType = propertyType;
            return this;
        }
        public String getPropertyType() {
            return this.propertyType;
        }

        public GetChangeLogResponseBodyData setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public GetChangeLogResponseBodyData setTargetId(Integer targetId) {
            this.targetId = targetId;
            return this;
        }
        public Integer getTargetId() {
            return this.targetId;
        }

        public GetChangeLogResponseBodyData setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

        public GetChangeLogResponseBodyData setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public GetChangeLogResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
