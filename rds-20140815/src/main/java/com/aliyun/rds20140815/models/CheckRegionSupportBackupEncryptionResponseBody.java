// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRegionSupportBackupEncryptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportBackupEncryption")
    public Boolean supportBackupEncryption;

    public static CheckRegionSupportBackupEncryptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRegionSupportBackupEncryptionResponseBody self = new CheckRegionSupportBackupEncryptionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRegionSupportBackupEncryptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRegionSupportBackupEncryptionResponseBody setSupportBackupEncryption(Boolean supportBackupEncryption) {
        this.supportBackupEncryption = supportBackupEncryption;
        return this;
    }
    public Boolean getSupportBackupEncryption() {
        return this.supportBackupEncryption;
    }

}
