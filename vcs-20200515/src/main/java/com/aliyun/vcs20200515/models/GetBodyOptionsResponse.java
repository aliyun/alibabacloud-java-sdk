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

    }

}
