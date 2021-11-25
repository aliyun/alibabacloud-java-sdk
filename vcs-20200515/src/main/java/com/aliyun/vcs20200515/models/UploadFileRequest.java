// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadFileRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("FileAliasName")
    public String fileAliasName;

    @NameInMap("FileContent")
    public String fileContent;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("MD5")
    public String MD5;

    public static UploadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileRequest self = new UploadFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UploadFileRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UploadFileRequest setFileAliasName(String fileAliasName) {
        this.fileAliasName = fileAliasName;
        return this;
    }
    public String getFileAliasName() {
        return this.fileAliasName;
    }

    public UploadFileRequest setFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public String getFileContent() {
        return this.fileContent;
    }

    public UploadFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UploadFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UploadFileRequest setMD5(String MD5) {
        this.MD5 = MD5;
        return this;
    }
    public String getMD5() {
        return this.MD5;
    }

}
