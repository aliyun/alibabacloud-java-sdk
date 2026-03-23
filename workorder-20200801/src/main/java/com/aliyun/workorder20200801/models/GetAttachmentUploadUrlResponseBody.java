// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class GetAttachmentUploadUrlResponseBody extends TeaModel {
    @NameInMap("AccessFileUrl")
    public String accessFileUrl;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("PutObjectUrl")
    public String putObjectUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAttachmentUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUploadUrlResponseBody self = new GetAttachmentUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUploadUrlResponseBody setAccessFileUrl(String accessFileUrl) {
        this.accessFileUrl = accessFileUrl;
        return this;
    }
    public String getAccessFileUrl() {
        return this.accessFileUrl;
    }

    public GetAttachmentUploadUrlResponseBody setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public GetAttachmentUploadUrlResponseBody setPutObjectUrl(String putObjectUrl) {
        this.putObjectUrl = putObjectUrl;
        return this;
    }
    public String getPutObjectUrl() {
        return this.putObjectUrl;
    }

    public GetAttachmentUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
