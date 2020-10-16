// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceOptionsResponse extends TeaModel {
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
    public java.util.List<GetFaceOptionsResponseData> data;

    public static GetFaceOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceOptionsResponse self = new GetFaceOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceOptionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFaceOptionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFaceOptionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFaceOptionsResponse setData(java.util.List<GetFaceOptionsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFaceOptionsResponseData> getData() {
        return this.data;
    }

    public static class GetFaceOptionsResponseDataOptionList extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetFaceOptionsResponseDataOptionList build(java.util.Map<String, ?> map) throws Exception {
            GetFaceOptionsResponseDataOptionList self = new GetFaceOptionsResponseDataOptionList();
            return TeaModel.build(map, self);
        }

        public GetFaceOptionsResponseDataOptionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFaceOptionsResponseDataOptionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetFaceOptionsResponseData extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("OptionList")
        @Validation(required = true)
        public java.util.List<GetFaceOptionsResponseDataOptionList> optionList;

        public static GetFaceOptionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceOptionsResponseData self = new GetFaceOptionsResponseData();
            return TeaModel.build(map, self);
        }

        public GetFaceOptionsResponseData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFaceOptionsResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFaceOptionsResponseData setOptionList(java.util.List<GetFaceOptionsResponseDataOptionList> optionList) {
            this.optionList = optionList;
            return this;
        }
        public java.util.List<GetFaceOptionsResponseDataOptionList> getOptionList() {
            return this.optionList;
        }

    }

}
