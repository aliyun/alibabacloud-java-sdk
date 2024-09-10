// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectRequest extends TeaModel {
    /**
     * <p>Whether to decompress or not. Valid values:</p>
     * <ul>
     * <li>true: To decompress.</li>
     * <li>false: Not to decompress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Decompress")
    public Boolean decompress;

    /**
     * <p>The maximum number of files for decompression. The minimum value is 1, and the maximum value is 1000. If the decompression level exceeds the maximum, the decompression operation will be terminated, but the detection of decompressed files will not be affected.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DecompressMaxFileCount")
    public Integer decompressMaxFileCount;

    /**
     * <p>The maximum level of decompression when dealing with nested compressed files with multiple levels. The minimum value is 1, and the maximum value is 5. If the decompression level exceeds the maximum, the decompression operation will be terminated, but the detection of decompressed files will not be affected.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DecompressMaxLayer")
    public Integer decompressMaxLayer;

    /**
     * <p>The URL that is used to download the file. You can specify this parameter to trigger file detection without the need to upload the file in advance.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The identifier of the file. Only MD5 hash values are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0a212417e65c26ff133cfff28f6c****</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The key of the file that is stored in the Object Storage Service (OSS) bucket. You can call the <a href="~~CreateFileDetectUploadUrl~~">CreateFileDetectUploadUrl</a> operation to query the keys of files.</p>
     * 
     * <strong>example:</strong>
     * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>115.213.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the file. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: unknown files</li>
     * <li><strong>1</strong>: binary files</li>
     * <li><strong>2</strong>: webshell files</li>
     * <li><strong>4</strong>: script files</li>
     * </ul>
     * <blockquote>
     * <p> If you do not know the type of the file, set this parameter to 0.</p>
     * </blockquote>
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
