// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BaseAlbumFileOperationResult extends TeaModel {
    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_message")
    public String errorMessage;

    @NameInMap("file")
    public CommonFileItem file;

    @NameInMap("is_succeed")
    public Boolean isSucceed;

    public static BaseAlbumFileOperationResult build(java.util.Map<String, ?> map) throws Exception {
        BaseAlbumFileOperationResult self = new BaseAlbumFileOperationResult();
        return TeaModel.build(map, self);
    }

    public BaseAlbumFileOperationResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BaseAlbumFileOperationResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BaseAlbumFileOperationResult setFile(CommonFileItem file) {
        this.file = file;
        return this;
    }
    public CommonFileItem getFile() {
        return this.file;
    }

    public BaseAlbumFileOperationResult setIsSucceed(Boolean isSucceed) {
        this.isSucceed = isSucceed;
        return this;
    }
    public Boolean getIsSucceed() {
        return this.isSucceed;
    }

}
