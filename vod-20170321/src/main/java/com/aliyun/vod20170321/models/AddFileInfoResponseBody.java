// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFileInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 文件Id
    @NameInMap("FileId")
    public String fileId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static AddFileInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFileInfoResponseBody self = new AddFileInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFileInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFileInfoResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddFileInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFileInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
