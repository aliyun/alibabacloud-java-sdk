// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UploadSymbolFileRequest extends TeaModel {
    @NameInMap("appVersion")
    public String appVersion;

    @NameInMap("dataSourceId")
    public String dataSourceId;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("fileType")
    public Integer fileType;

    @NameInMap("flutterName")
    public String flutterName;

    @NameInMap("ossUrl")
    public String ossUrl;

    public static UploadSymbolFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSymbolFileRequest self = new UploadSymbolFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadSymbolFileRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UploadSymbolFileRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UploadSymbolFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadSymbolFileRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public UploadSymbolFileRequest setFlutterName(String flutterName) {
        this.flutterName = flutterName;
        return this;
    }
    public String getFlutterName() {
        return this.flutterName;
    }

    public UploadSymbolFileRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

}
