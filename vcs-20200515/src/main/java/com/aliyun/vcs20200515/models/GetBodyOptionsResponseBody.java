// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetBodyOptionsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetBodyOptionsResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static GetBodyOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBodyOptionsResponseBody self = new GetBodyOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBodyOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBodyOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBodyOptionsResponseBody setData(java.util.List<GetBodyOptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBodyOptionsResponseBodyData> getData() {
        return this.data;
    }

    public GetBodyOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetBodyOptionsResponseBodyDataOptionList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        public static GetBodyOptionsResponseBodyDataOptionList build(java.util.Map<String, ?> map) throws Exception {
            GetBodyOptionsResponseBodyDataOptionList self = new GetBodyOptionsResponseBodyDataOptionList();
            return TeaModel.build(map, self);
        }

        public GetBodyOptionsResponseBodyDataOptionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBodyOptionsResponseBodyDataOptionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBodyOptionsResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("OptionList")
        public java.util.List<GetBodyOptionsResponseBodyDataOptionList> optionList;

        @NameInMap("Name")
        public String name;

        public static GetBodyOptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBodyOptionsResponseBodyData self = new GetBodyOptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBodyOptionsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBodyOptionsResponseBodyData setOptionList(java.util.List<GetBodyOptionsResponseBodyDataOptionList> optionList) {
            this.optionList = optionList;
            return this;
        }
        public java.util.List<GetBodyOptionsResponseBodyDataOptionList> getOptionList() {
            return this.optionList;
        }

        public GetBodyOptionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
