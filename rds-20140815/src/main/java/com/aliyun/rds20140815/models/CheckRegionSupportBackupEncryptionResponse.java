// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRegionSupportBackupEncryptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SupportBackupEncryption")
    @Validation(required = true)
    public Boolean supportBackupEncryption;

    public static CheckRegionSupportBackupEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRegionSupportBackupEncryptionResponse self = new CheckRegionSupportBackupEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public CheckRegionSupportBackupEncryptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRegionSupportBackupEncryptionResponse setSupportBackupEncryption(Boolean supportBackupEncryption) {
        this.supportBackupEncryption = supportBackupEncryption;
        return this;
    }
    public Boolean getSupportBackupEncryption() {
        return this.supportBackupEncryption;
    }

}
