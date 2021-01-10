// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ModifyAppServiceBuildpackRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ModifyAppServiceBuildpackRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppServiceBuildpackRelationResponseBody self = new ModifyAppServiceBuildpackRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppServiceBuildpackRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAppServiceBuildpackRelationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ModifyAppServiceBuildpackRelationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
