// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetSymUploadParamRequest extends TeaModel {
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

    public static GetSymUploadParamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSymUploadParamRequest self = new GetSymUploadParamRequest();
        return TeaModel.build(map, self);
    }

    public GetSymUploadParamRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetSymUploadParamRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetSymUploadParamRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetSymUploadParamRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

}
