// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadFileRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    @NameInMap("MD5")
    public String MD5;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("FileContent")
    public String fileContent;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileAliasName")
    public String fileAliasName;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("FilePath")
    public String filePath;

    public static UploadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileRequest self = new UploadFileRequest();
        return TeaModel.build(map, self);
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

    public UploadFileRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
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

    public UploadFileRequest setFileAliasName(String fileAliasName) {
        this.fileAliasName = fileAliasName;
        return this;
    }
    public String getFileAliasName() {
        return this.fileAliasName;
    }

    public UploadFileRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UploadFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
