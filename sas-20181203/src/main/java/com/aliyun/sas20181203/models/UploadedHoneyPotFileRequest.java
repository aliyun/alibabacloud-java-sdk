// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UploadedHoneyPotFileRequest extends TeaModel {
    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TemplateExtra")
    public String templateExtra;

    public static UploadedHoneyPotFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadedHoneyPotFileRequest self = new UploadedHoneyPotFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadedHoneyPotFileRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public UploadedHoneyPotFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadedHoneyPotFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UploadedHoneyPotFileRequest setHoneypotImageName(String honeypotImageName) {
        this.honeypotImageName = honeypotImageName;
        return this;
    }
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    public UploadedHoneyPotFileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadedHoneyPotFileRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UploadedHoneyPotFileRequest setTemplateExtra(String templateExtra) {
        this.templateExtra = templateExtra;
        return this;
    }
    public String getTemplateExtra() {
        return this.templateExtra;
    }

}
