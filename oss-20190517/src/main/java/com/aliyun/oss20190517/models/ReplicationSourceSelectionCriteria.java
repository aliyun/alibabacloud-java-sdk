// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationSourceSelectionCriteria extends TeaModel {
    // A short description of SseKmsEncryptedObjects
    @NameInMap("SseKmsEncryptedObjects")
    public ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects;

    public static ReplicationSourceSelectionCriteria build(java.util.Map<String, ?> map) throws Exception {
        ReplicationSourceSelectionCriteria self = new ReplicationSourceSelectionCriteria();
        return TeaModel.build(map, self);
    }

    public ReplicationSourceSelectionCriteria setSseKmsEncryptedObjects(ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
        return this;
    }
    public ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return this.sseKmsEncryptedObjects;
    }

    public static class ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects extends TeaModel {
        // A short description of Status
        @NameInMap("Status")
        public String status;

        public static ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects build(java.util.Map<String, ?> map) throws Exception {
            ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects self = new ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects();
            return TeaModel.build(map, self);
        }

        public ReplicationSourceSelectionCriteriaSseKmsEncryptedObjects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
