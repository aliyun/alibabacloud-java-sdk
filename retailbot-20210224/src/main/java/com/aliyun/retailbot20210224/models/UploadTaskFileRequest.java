// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadTaskFileRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("UserId")
    public String userId;

    public static UploadTaskFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTaskFileRequest self = new UploadTaskFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadTaskFileRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UploadTaskFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadTaskFileRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public UploadTaskFileRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
