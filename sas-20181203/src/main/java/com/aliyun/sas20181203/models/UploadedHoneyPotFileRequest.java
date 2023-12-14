// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UploadedHoneyPotFileRequest extends TeaModel {
    /**
     * <p>The file key that you use to upload the file.</p>
     * <br>
     * <p>>  The key is in the format of HONEYPOT_FILE/{Timestamp}\_{Custom file name}.</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>The name of the file that you want to upload.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type.</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The name of the honeypot image.</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the management node to which the honeypot belongs.</p>
     * <br>
     * <p>>  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the IDs of management nodes. operation to query the management node ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The prompt template that corresponds to the file.</p>
     */
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
