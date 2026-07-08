// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadFileRequest extends TeaModel {
    /**
     * <p>The description of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>测试使用</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>A custom file name. The name must be unique and serves as a unique identifier for the file. The name must meet the following requirements:</p>
     * <ol>
     * <li><p>It must be 8 to 255 characters in length.</p>
     * </li>
     * <li><p>It can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * </li>
     * <li><p>The first and last characters must be a letter or a digit.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mytest</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The MD5 hash of the file. This is used to verify the integrity of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150b6083f50dd08159d45a0d5e4b56f9</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The download URL of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.xxx.xxx.tar">https://xxx.xxx.xxx.tar</a></p>
     */
    @NameInMap("OriginUrl")
    public String originUrl;

    /**
     * <p>The destination path on the service instance. This must be an absolute path to a file. You cannot specify only a folder. The parent folder of the destination path is restricted to the following locations:</p>
     * <ol>
     * <li><p>/data/local</p>
     * </li>
     * <li><p>/data/user</p>
     * </li>
     * <li><p>/data/data</p>
     * </li>
     * <li><p>/data/cache</p>
     * </li>
     * <li><p>/data/tmp</p>
     * </li>
     * <li><p>/data/storage</p>
     * </li>
     * <li><p>/data/media/0</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/tmp/test/xxx.tar</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    public static UploadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileRequest self = new UploadFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadFileRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UploadFileRequest setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }
    public String getOriginUrl() {
        return this.originUrl;
    }

    public UploadFileRequest setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

}
