// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentFoldersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FolderIdMapping")
    public java.util.Map<String, java.util.Map<String, ?>> folderIdMapping;

    @NameInMap("Message")
    public String message;

    // Id of the request
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
