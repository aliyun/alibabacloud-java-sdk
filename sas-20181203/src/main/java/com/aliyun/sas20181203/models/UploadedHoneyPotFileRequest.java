// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UploadedHoneyPotFileRequest extends TeaModel {
    /**
     * <p>The file key that you use to upload the file.</p>
     * <blockquote>
     * <p> The key is in the format of HONEYPOT_FILE/{Timestamp}_{Custom file name}.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HONEYPOT_FILE/1601097845544644_********</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>The name of the file that you want to upload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trojan.zip</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The name of the honeypot image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ruoyi</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the management node to which the honeypot belongs.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain the IDs of management nodes. operation to query the management node ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cc427e14-f257-4670-9d2b-d83bbbe*****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The prompt template that corresponds to the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;help\&quot;:\&quot;.zip\&quot;,\&quot;label\&quot;:\&quot;file\&quot;,\&quot;type\&quot;:\&quot;file\&quot;,\&quot;key\&quot;:\&quot;ftpfiles.zip\&quot;}</p>
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
