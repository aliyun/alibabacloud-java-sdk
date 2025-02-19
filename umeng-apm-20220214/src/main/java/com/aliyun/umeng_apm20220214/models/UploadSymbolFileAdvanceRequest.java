// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UploadSymbolFileAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.3</p>
     */
    @NameInMap("appVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5fb6001a73749c24fd9cb356</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>symbol.zip</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("fileType")
    public Integer fileType;

    /**
     * <strong>example:</strong>
     * <p>my-flutter-app</p>
     */
    @NameInMap("flutterName")
    public String flutterName;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
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
