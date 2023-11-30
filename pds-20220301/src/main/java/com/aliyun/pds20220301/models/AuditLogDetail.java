// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLogDetail extends TeaModel {
    @NameInMap("drive_log_detail")
    public DriveLogDetail driveLogDetail;

    @NameInMap("file_log_detail")
    public FileLogDetail fileLogDetail;

    @NameInMap("user_log_detail")
    public UserLogDetail userLogDetail;

    public static AuditLogDetail build(java.util.Map<String, ?> map) throws Exception {
        AuditLogDetail self = new AuditLogDetail();
        return TeaModel.build(map, self);
    }

    public AuditLogDetail setDriveLogDetail(DriveLogDetail driveLogDetail) {
        this.driveLogDetail = driveLogDetail;
        return this;
    }
    public DriveLogDetail getDriveLogDetail() {
        return this.driveLogDetail;
    }

    public AuditLogDetail setFileLogDetail(FileLogDetail fileLogDetail) {
        this.fileLogDetail = fileLogDetail;
        return this;
    }
    public FileLogDetail getFileLogDetail() {
        return this.fileLogDetail;
    }

    public AuditLogDetail setUserLogDetail(UserLogDetail userLogDetail) {
        this.userLogDetail = userLogDetail;
        return this;
    }
    public UserLogDetail getUserLogDetail() {
        return this.userLogDetail;
    }

}
