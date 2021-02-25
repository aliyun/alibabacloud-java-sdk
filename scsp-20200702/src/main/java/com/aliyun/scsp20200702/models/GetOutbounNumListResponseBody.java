// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOutbounNumListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetOutbounNumListResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetOutbounNumListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOutbounNumListResponseBody self = new GetOutbounNumListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOutbounNumListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOutbounNumListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOutbounNumListResponseBody setData(GetOutbounNumListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOutbounNumListResponseBodyData getData() {
        return this.data;
    }

    public GetOutbounNumListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOutbounNumListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOutbounNumListResponseBodyDataNumGroup extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        public static GetOutbounNumListResponseBodyDataNumGroup build(java.util.Map<String, ?> map) throws Exception {
            GetOutbounNumListResponseBodyDataNumGroup self = new GetOutbounNumListResponseBodyDataNumGroup();
            return TeaModel.build(map, self);
        }

        public GetOutbounNumListResponseBodyDataNumGroup setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetOutbounNumListResponseBodyDataNumGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetOutbounNumListResponseBodyDataNumGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetOutbounNumListResponseBodyDataNum extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Value")
        public String value;

        @NameInMap("Description")
        public String description;

        public static GetOutbounNumListResponseBodyDataNum build(java.util.Map<String, ?> map) throws Exception {
            GetOutbounNumListResponseBodyDataNum self = new GetOutbounNumListResponseBodyDataNum();
            return TeaModel.build(map, self);
        }

        public GetOutbounNumListResponseBodyDataNum setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetOutbounNumListResponseBodyDataNum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetOutbounNumListResponseBodyDataNum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetOutbounNumListResponseBodyData extends TeaModel {
        @NameInMap("NumGroup")
        public java.util.List<GetOutbounNumListResponseBodyDataNumGroup> numGroup;

        @NameInMap("Num")
        public java.util.List<GetOutbounNumListResponseBodyDataNum> num;

        public static GetOutbounNumListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOutbounNumListResponseBodyData self = new GetOutbounNumListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOutbounNumListResponseBodyData setNumGroup(java.util.List<GetOutbounNumListResponseBodyDataNumGroup> numGroup) {
            this.numGroup = numGroup;
            return this;
        }
        public java.util.List<GetOutbounNumListResponseBodyDataNumGroup> getNumGroup() {
            return this.numGroup;
        }

        public GetOutbounNumListResponseBodyData setNum(java.util.List<GetOutbounNumListResponseBodyDataNum> num) {
            this.num = num;
            return this;
        }
        public java.util.List<GetOutbounNumListResponseBodyDataNum> getNum() {
            return this.num;
        }

    }

}
