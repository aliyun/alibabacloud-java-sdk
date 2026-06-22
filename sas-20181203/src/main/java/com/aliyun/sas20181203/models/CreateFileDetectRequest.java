// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectRequest extends TeaModel {
    /**
     * <p>Specifies whether to decompress the archive for detection. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not supported when <code>Type</code> is set to <code>6</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Decompress")
    public Boolean decompress;

    /**
     * <p>The maximum number of files that can be decompressed from an archive. The maximum value is 1000.</p>
     * <p>This parameter is required if you set <code>Decompress</code> to <code>true</code>.</p>
     * <blockquote>
     * <p>This parameter is not supported when <code>Type</code> is set to <code>6</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum number of decompression layers for nested archives. The maximum value is 5.</p>
     * <p>This parameter is required if you set <code>Decompress</code> to <code>true</code>.</p>
     * <blockquote>
     * <p>This parameter is not supported when <code>Type</code> is set to <code>6</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DecompressMaxLayer")
    public Integer decompressMaxLayer;

    /**
     * <p>The download link for the file. You can provide a public URL to trigger file detection without uploading the file.</p>
     * <blockquote>
     * <p>Skill archives can be submitted only by providing a download link. Therefore, this parameter is required when <code>Type</code> is set to <code>6</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The unique identifier of the file.</p>
     * <p>This parameter is required if <code>Type</code> is <code>0</code>. Its value must be the MD5 or SHA-256 hash of the file.</p>
     * <p>If you set <code>Type</code> to <code>6</code>, you do not need to specify this parameter. The operation returns the file\&quot;s unique identifier in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>0a212417e65c26ff133cfff28f6c****</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The storage key of the file in an Object Storage Service (OSS) bucket.</p>
     * <p>If you submit the file by using the <code>DownloadUrl</code> parameter, you can leave this parameter empty. To obtain the value of this parameter, call the <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> operation.</p>
     * <blockquote>
     * <p>This parameter is not supported when <code>Type</code> is set to <code>6</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The IP address of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>115.213.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the file to detect. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Malicious file detection</p>
     * </li>
     * <li><p><strong>6</strong>: Skill archive detection</p>
     * </li>
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
