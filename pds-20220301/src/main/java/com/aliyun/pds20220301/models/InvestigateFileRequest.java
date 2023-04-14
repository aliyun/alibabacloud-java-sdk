// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class InvestigateFileRequest extends TeaModel {
    @NameInMap("drive_file_ids")
    public java.util.List<InvestigateFileRequestDriveFileIds> driveFileIds;

    public static InvestigateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        InvestigateFileRequest self = new InvestigateFileRequest();
        return TeaModel.build(map, self);
    }

    public InvestigateFileRequest setDriveFileIds(java.util.List<InvestigateFileRequestDriveFileIds> driveFileIds) {
        this.driveFileIds = driveFileIds;
        return this;
    }
    public java.util.List<InvestigateFileRequestDriveFileIds> getDriveFileIds() {
        return this.driveFileIds;
    }

    public static class InvestigateFileRequestDriveFileIds extends TeaModel {
        @NameInMap("drive_id")
        public String driveId;

        @NameInMap("file_id")
        public String fileId;

        public static InvestigateFileRequestDriveFileIds build(java.util.Map<String, ?> map) throws Exception {
            InvestigateFileRequestDriveFileIds self = new InvestigateFileRequestDriveFileIds();
            return TeaModel.build(map, self);
        }

        public InvestigateFileRequestDriveFileIds setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public InvestigateFileRequestDriveFileIds setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
