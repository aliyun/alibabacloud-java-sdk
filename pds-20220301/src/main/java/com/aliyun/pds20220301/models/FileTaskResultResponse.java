// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileTaskResultResponse extends TeaModel {
    @NameInMap("err_code")
    public String errCode;

    @NameInMap("message")
    public String message;

    @NameInMap("rst_file")
    public FileIDInfo rstFile;

    @NameInMap("src_file")
    public FileIDInfo srcFile;

    public static FileTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        FileTaskResultResponse self = new FileTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public FileTaskResultResponse setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public FileTaskResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FileTaskResultResponse setRstFile(FileIDInfo rstFile) {
        this.rstFile = rstFile;
        return this;
    }
    public FileIDInfo getRstFile() {
        return this.rstFile;
    }

    public FileTaskResultResponse setSrcFile(FileIDInfo srcFile) {
        this.srcFile = srcFile;
        return this;
    }
    public FileIDInfo getSrcFile() {
        return this.srcFile;
    }

}
