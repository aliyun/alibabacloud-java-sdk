// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectRequest extends TeaModel {
    /**
     * <p>Specifies whether to identify and decompress compressed files. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Decompress")
    public Boolean decompress;

    /**
     * <p>The maximum number of files to decompress. Maximum value: 1000.</p>
     * <p>This parameter is required when Decompress is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum number of decompression layers when compressed files are nested within a compressed package. Maximum value: 5.</p>
     * <p>This parameter is required when Decompress is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DecompressMaxLayer")
    public Integer decompressMaxLayer;

    /**
     * <p>The download URL of the file. You can pass in a file download URL (public URL) to directly trigger file detection without uploading the file in advance.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The unique identifier of the file. This parameter is required and must be the MD5 or SHA-256 of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>0a212417e65c26ff133cfff28f6c****</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The storage key of the file in the OSS bucket.</p>
     * <p>If you push the file for detection by using DownloadUrl, this parameter is optional. This parameter is obtained from the <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>115.213.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of file to detect. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: malicious file detection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateFileDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectRequest self = new CreateFileDetectRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectRequest setDecompress(Boolean decompress) {
        this.decompress = decompress;
        return this;
    }
    public Boolean getDecompress() {
        return this.decompress;
    }

    public CreateFileDetectRequest setDecompressMaxFileCount(Integer decompressMaxFileCount) {
        this.decompressMaxFileCount = decompressMaxFileCount;
        return this;
    }
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    public CreateFileDetectRequest setDecompressMaxLayer(Integer decompressMaxLayer) {
        this.decompressMaxLayer = decompressMaxLayer;
        return this;
    }
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    public CreateFileDetectRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public CreateFileDetectRequest setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public CreateFileDetectRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CreateFileDetectRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateFileDetectRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
