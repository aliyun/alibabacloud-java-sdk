// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentFoldersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NO_PERMISSION</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("FolderIdMapping")
    public java.util.Map<String, java.util.Map<String, ?>> folderIdMapping;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9CFA2665-1FFE-5929-8468-C14C25890486</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateExperimentFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateExperimentFoldersResponseBody self = new MigrateExperimentFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateExperimentFoldersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MigrateExperimentFoldersResponseBody setFolderIdMapping(java.util.Map<String, java.util.Map<String, ?>> folderIdMapping) {
        this.folderIdMapping = folderIdMapping;
        return this;
    }
    public java.util.Map<String, java.util.Map<String, ?>> getFolderIdMapping() {
        return this.folderIdMapping;
    }

    public MigrateExperimentFoldersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateExperimentFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
