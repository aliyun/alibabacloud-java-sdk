// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MessageCallback")
    @Validation(required = true)
    public GetMessageCallbackResponseMessageCallback messageCallback;

    public static GetMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackResponse self = new GetMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMessageCallbackResponseMessageCallback extends TeaModel {
        @NameInMap("CallbackType")
        @Validation(required = true)
        public String callbackType;

        @NameInMap("CallbackURL")
        @Validation(required = true)
        public String callbackURL;

        @NameInMap("EventTypeList")
        @Validation(required = true)
        public String eventTypeList;

        @NameInMap("AuthSwitch")
        @Validation(required = true)
        public String authSwitch;

        @NameInMap("AuthKey")
        @Validation(required = true)
        public String authKey;

        @NameInMap("MnsEndpoint")
        @Validation(required = true)
        public String mnsEndpoint;

        @NameInMap("MnsQueueName")
        @Validation(required = true)
        public String mnsQueueName;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        public static GetMessageCallbackResponseMessageCallback build(java.util.Map<String, ?> map) throws Exception {
            GetMessageCallbackResponseMessageCallback self = new GetMessageCallbackResponseMessageCallback();
            return TeaModel.build(map, self);
        }

    }

}
