// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ApplyServerSideEncryptionByDefault extends TeaModel {
    // description
    @NameInMap("KMSDataEncryption")
    public String KMSDataEncryption;

    // description
    @NameInMap("KMSMasterKeyID")
    public String KMSMasterKeyID;

    // description
    @NameInMap("SSEAlgorithm")
    public String SSEAlgorithm;

    public static ApplyServerSideEncryptionByDefault build(java.util.Map<String, ?> map) throws Exception {
        ApplyServerSideEncryptionByDefault self = new ApplyServerSideEncryptionByDefault();
        return TeaModel.build(map, self);
    }

    public ApplyServerSideEncryptionByDefault setKMSDataEncryption(String KMSDataEncryption) {
        this.KMSDataEncryption = KMSDataEncryption;
        return this;
    }
    public String getKMSDataEncryption() {
        return this.KMSDataEncryption;
    }

    public ApplyServerSideEncryptionByDefault setKMSMasterKeyID(String KMSMasterKeyID) {
        this.KMSMasterKeyID = KMSMasterKeyID;
        return this;
    }
    public String getKMSMasterKeyID() {
        return this.KMSMasterKeyID;
    }

    public ApplyServerSideEncryptionByDefault setSSEAlgorithm(String SSEAlgorithm) {
        this.SSEAlgorithm = SSEAlgorithm;
        return this;
    }
    public String getSSEAlgorithm() {
        return this.SSEAlgorithm;
    }

}
