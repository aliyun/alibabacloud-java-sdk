// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class InvestigateFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_file_ids")
    public java.util.List<InvestigateFileRequestDriveFileIds> driveFileIds;

    @NameInMap("policy")
    public InvestigateFileRequestPolicy policy;

    @NameInMap("recursive")
    public Boolean recursive;

    @NameInMap("user_data")
    public String userData;

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

    public InvestigateFileRequest setPolicy(InvestigateFileRequestPolicy policy) {
        this.policy = policy;
        return this;
    }
    public InvestigateFileRequestPolicy getPolicy() {
        return this.policy;
    }

    public InvestigateFileRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public InvestigateFileRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class InvestigateFileRequestDriveFileIds extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("drive_id")
        public String driveId;

        /**
         * <p>This parameter is required.</p>
         */
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

    public static class InvestigateFileRequestPolicy extends TeaModel {
        @NameInMap("first_product_name")
        public String firstProductName;

        @NameInMap("mtee_code")
        public String mteeCode;

        @NameInMap("provider")
        public String provider;

        public static InvestigateFileRequestPolicy build(java.util.Map<String, ?> map) throws Exception {
            InvestigateFileRequestPolicy self = new InvestigateFileRequestPolicy();
            return TeaModel.build(map, self);
        }

        public InvestigateFileRequestPolicy setFirstProductName(String firstProductName) {
            this.firstProductName = firstProductName;
            return this;
        }
        public String getFirstProductName() {
            return this.firstProductName;
        }

        public InvestigateFileRequestPolicy setMteeCode(String mteeCode) {
            this.mteeCode = mteeCode;
            return this;
        }
        public String getMteeCode() {
            return this.mteeCode;
        }

        public InvestigateFileRequestPolicy setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

}
