// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetBodyOptionsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<GetBodyOptionsResponseData> data;

    public static GetBodyOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBodyOptionsResponse self = new GetBodyOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetBodyOptionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBodyOptionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBodyOptionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBodyOptionsResponse setData(java.util.List<GetBodyOptionsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBodyOptionsResponseData> getData() {
        return this.data;
    }

    public static class GetBodyOptionsResponseDataOptionList extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetBodyOptionsResponseDataOptionList build(java.util.Map<String, ?> map) throws Exception {
            GetBodyOptionsResponseDataOptionList self = new GetBodyOptionsResponseDataOptionList();
            return TeaModel.build(map, self);
        }

        public GetBodyOptionsResponseDataOptionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBodyOptionsResponseDataOptionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBodyOptionsResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("OptionList")
        @Validation(required = true)
        public java.util.List<GetBodyOptionsResponseDataOptionList> optionList;

        public static GetBodyOptionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBodyOptionsResponseData self = new GetBodyOptionsResponseData();
            return TeaModel.build(map, self);
        }

        public GetBodyOptionsResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBodyOptionsResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBodyOptionsResponseData setOptionList(java.util.List<GetBodyOptionsResponseDataOptionList> optionList) {
            this.optionList = optionList;
            return this;
        }
        public java.util.List<GetBodyOptionsResponseDataOptionList> getOptionList() {
            return this.optionList;
        }

    }

}
