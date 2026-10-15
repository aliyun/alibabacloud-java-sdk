// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadMaterialFileForAdminRequest extends TeaModel {
    /**
     * <p>The ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BelongId")
    public String belongId;

    /**
     * <p>The business instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The file URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://docmind-api-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/4a7f_209934244261306272_14fd429b731245a79f291c64acf3ac77">http://docmind-api-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/4a7f_209934244261306272_14fd429b731245a79f291c64acf3ac77</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>Video</p>
     */
    @NameInMap("Name")
    public String name;

    public static UploadMaterialFileForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMaterialFileForAdminRequest self = new UploadMaterialFileForAdminRequest();
        return TeaModel.build(map, self);
    }

    public UploadMaterialFileForAdminRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public UploadMaterialFileForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UploadMaterialFileForAdminRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadMaterialFileForAdminRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
