// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppMaterialFile extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>image/png</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>2025-11-03 02:05:01</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2025-11-03 02:05:01</p>
     */
    @NameInMap("DeletedTime")
    public String deletedTime;

    /**
     * <strong>example:</strong>
     * <p>ddddwww</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <strong>example:</strong>
     * <p>d75e1e9693cc460da218419d67735567</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://demo-moshicloud-test.oss-cn-hangzhou-internal.aliyuncs.com/document/testcase/aliyun/api_case/pdf_angle90_page1.pdf">https://demo-moshicloud-test.oss-cn-hangzhou-internal.aliyuncs.com/document/testcase/aliyun/api_case/pdf_angle90_page1.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Height")
    public Integer height;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>23M</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    /**
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("Suffix")
    public String suffix;

    /**
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static AppMaterialFile build(java.util.Map<String, ?> map) throws Exception {
        AppMaterialFile self = new AppMaterialFile();
        return TeaModel.build(map, self);
    }

    public AppMaterialFile setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppMaterialFile setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public AppMaterialFile setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AppMaterialFile setDeletedTime(String deletedTime) {
        this.deletedTime = deletedTime;
        return this;
    }
    public String getDeletedTime() {
        return this.deletedTime;
    }

    public AppMaterialFile setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public AppMaterialFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public AppMaterialFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AppMaterialFile setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AppMaterialFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppMaterialFile setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppMaterialFile setStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public String getStorageSize() {
        return this.storageSize;
    }

    public AppMaterialFile setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

    public AppMaterialFile setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AppMaterialFile setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
