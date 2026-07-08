// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDataUploadUrlRequest extends TeaModel {
    /**
     * <p>The content type of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application/jpeg</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The MD5 hash of the file to be uploaded. This value must be the file\&quot;s actual MD5 hash. The file size is also verified during the upload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54d6911ba6d59dbe68990835a409f18c</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>The name of the file to upload. The filename can be a single file, such as \<code>1.jpg\\</code>, or include a path, such as \<code>directory1/1.jpg\\</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myfile</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The actual size of the file in bytes. This value must be the exact size of the file. The file size is verified when you use the upload URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("FileSizeBytes")
    public Long fileSizeBytes;

    public static DescribeComfyUserDataUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDataUploadUrlRequest self = new DescribeComfyUserDataUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDataUploadUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public DescribeComfyUserDataUploadUrlRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public DescribeComfyUserDataUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeComfyUserDataUploadUrlRequest setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
        return this;
    }
    public Long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

}
