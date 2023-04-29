// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupPolicy")
    public CreateBackupPolicyResponseBodyBackupPolicy backupPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPolicyResponseBody self = new CreateBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupPolicyResponseBody setBackupPolicy(CreateBackupPolicyResponseBodyBackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }
    public CreateBackupPolicyResponseBodyBackupPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    public CreateBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateBackupPolicyResponseBodyBackupPolicy extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Status")
        public String status;

        public static CreateBackupPolicyResponseBodyBackupPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBackupPolicyResponseBodyBackupPolicy self = new CreateBackupPolicyResponseBodyBackupPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBackupPolicyResponseBodyBackupPolicy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateBackupPolicyResponseBodyBackupPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
