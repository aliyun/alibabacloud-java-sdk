// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddStoryFile extends TeaModel {
    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_message")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>63e5e4340f76cb3ead5f40f68163f0f967c1a7bf</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>642a88dd06e49d9c0a14411ebae606f70edd9a59</p>
     */
    @NameInMap("revision_id")
    public String revisionId;

    public static AddStoryFile build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFile self = new AddStoryFile();
        return TeaModel.build(map, self);
    }

    public AddStoryFile setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddStoryFile setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddStoryFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AddStoryFile setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

}
