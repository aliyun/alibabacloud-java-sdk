// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class GetOssUploadParam2Request extends TeaModel {
    // App版本号
    @NameInMap("appVersion")
    public String appVersion;

    // 数据源id（appKey)
    @NameInMap("dataSourceId")
    public String dataSourceId;

    // 文件名称，后缀只允许为txt,so,sym,zip,gz
    @NameInMap("fileName")
    public String fileName;

    // 文件类型(1 mapping文件；2 so文件；3 dSYM文件压缩包)
    @NameInMap("fileType")
    public Integer fileType;

    public static GetOssUploadParam2Request build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadParam2Request self = new GetOssUploadParam2Request();
        return TeaModel.build(map, self);
    }

    public GetOssUploadParam2Request setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetOssUploadParam2Request setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetOssUploadParam2Request setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetOssUploadParam2Request setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

}
