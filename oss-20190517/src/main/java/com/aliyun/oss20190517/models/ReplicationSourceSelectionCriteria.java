// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationSourceSelectionCriteria extends TeaModel {
    // A short description of SseKmsEncryptedObjects
    @NameInMap("SseKmsEncryptedObjects")
    public SseKmsEncryptedObjects sseKmsEncryptedObjects;

    public static ReplicationSourceSelectionCriteria build(java.util.Map<String, ?> map) throws Exception {
        ReplicationSourceSelectionCriteria self = new ReplicationSourceSelectionCriteria();
        return TeaModel.build(map, self);
    }

    public ReplicationSourceSelectionCriteria setSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
        return this;
    }
    public SseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects;
    }

    public static class SseKmsEncryptedObjects extends TeaModel {
        // A short description of Status
        @NameInMap("Status")
        public String status;

        public static SseKmsEncryptedObjects build(java.util.Map<String, ?> map) throws Exception {
            SseKmsEncryptedObjects self = new SseKmsEncryptedObjects();
            return TeaModel.build(map, self);
        }

        public SseKmsEncryptedObjects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
