// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListScenesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrMessage")
    @Validation(required = true)
    public String errMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListScenesResponseData> data;

    public static ListScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponse self = new ListScenesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListScenesResponseData extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        public static ListScenesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseData self = new ListScenesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
