// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateBackupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setData(CreateBackupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBackupResponseBodyData getData() {
        return this.data;
    }

    public CreateBackupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBackupResponseBodyData extends TeaModel {
        @NameInMap("BackupSetId")
        public String backupSetId;

        public static CreateBackupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBackupResponseBodyData self = new CreateBackupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBackupResponseBodyData setBackupSetId(String backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public String getBackupSetId() {
            return this.backupSetId;
        }

    }

}
