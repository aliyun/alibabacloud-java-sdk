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

    }

}
