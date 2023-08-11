// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UploadSymbolFileAdvanceRequest extends TeaModel {
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
    public java.io.InputStream ossUrlObject;

    public static UploadSymbolFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSymbolFileAdvanceRequest self = new UploadSymbolFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadSymbolFileAdvanceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UploadSymbolFileAdvanceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UploadSymbolFileAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadSymbolFileAdvanceRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public UploadSymbolFileAdvanceRequest setFlutterName(String flutterName) {
        this.flutterName = flutterName;
        return this;
    }
    public String getFlutterName() {
        return this.flutterName;
    }

    public UploadSymbolFileAdvanceRequest setOssUrlObject(java.io.InputStream ossUrlObject) {
        this.ossUrlObject = ossUrlObject;
        return this;
    }
    public java.io.InputStream getOssUrlObject() {
        return this.ossUrlObject;
    }

}
