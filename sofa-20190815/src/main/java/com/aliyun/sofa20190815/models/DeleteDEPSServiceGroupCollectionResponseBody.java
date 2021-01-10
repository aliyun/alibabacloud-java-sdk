// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDEPSServiceGroupCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Collections")
    public java.util.List<String> collections;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteDEPSServiceGroupCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDEPSServiceGroupCollectionResponseBody self = new DeleteDEPSServiceGroupCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDEPSServiceGroupCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDEPSServiceGroupCollectionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteDEPSServiceGroupCollectionResponseBody setCollections(java.util.List<String> collections) {
        this.collections = collections;
        return this;
    }
    public java.util.List<String> getCollections() {
        return this.collections;
    }

    public DeleteDEPSServiceGroupCollectionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
