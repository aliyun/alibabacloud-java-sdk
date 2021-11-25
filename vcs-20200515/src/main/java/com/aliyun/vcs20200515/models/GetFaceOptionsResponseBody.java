// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceOptionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetFaceOptionsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFaceOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFaceOptionsResponseBody self = new GetFaceOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFaceOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFaceOptionsResponseBody setData(java.util.List<GetFaceOptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFaceOptionsResponseBodyData> getData() {
        return this.data;
    }

    public GetFaceOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFaceOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFaceOptionsResponseBodyDataOptionList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        public static GetFaceOptionsResponseBodyDataOptionList build(java.util.Map<String, ?> map) throws Exception {
            GetFaceOptionsResponseBodyDataOptionList self = new GetFaceOptionsResponseBodyDataOptionList();
            return TeaModel.build(map, self);
        }

        public GetFaceOptionsResponseBodyDataOptionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFaceOptionsResponseBodyDataOptionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetFaceOptionsResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("OptionList")
        public java.util.List<GetFaceOptionsResponseBodyDataOptionList> optionList;

        public static GetFaceOptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceOptionsResponseBodyData self = new GetFaceOptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFaceOptionsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFaceOptionsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFaceOptionsResponseBodyData setOptionList(java.util.List<GetFaceOptionsResponseBodyDataOptionList> optionList) {
            this.optionList = optionList;
            return this;
        }
        public java.util.List<GetFaceOptionsResponseBodyDataOptionList> getOptionList() {
            return this.optionList;
        }

    }

}
