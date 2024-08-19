// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupEncryptedStringResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeBackupEncryptedStringResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupEncryptedStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupEncryptedStringResponseBody self = new DescribeBackupEncryptedStringResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupEncryptedStringResponseBody setData(DescribeBackupEncryptedStringResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupEncryptedStringResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupEncryptedStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupEncryptedStringResponseBodyData extends TeaModel {
        @NameInMap("BackupInfoJson")
        public String backupInfoJson;

        public static DescribeBackupEncryptedStringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupEncryptedStringResponseBodyData self = new DescribeBackupEncryptedStringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupEncryptedStringResponseBodyData setBackupInfoJson(String backupInfoJson) {
            this.backupInfoJson = backupInfoJson;
            return this;
        }
        public String getBackupInfoJson() {
            return this.backupInfoJson;
        }

    }

}
