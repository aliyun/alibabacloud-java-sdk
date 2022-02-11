// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFileInfoRequest extends TeaModel {
    // 应用
    @NameInMap("AppId")
    public String appId;

    // 文件业务类型
    @NameInMap("BusinessType")
    public Long businessType;

    // 文件类型
    @NameInMap("FileType")
    public Long fileType;

    // 文件oss地址
    @NameInMap("FileUrl")
    public String fileUrl;

    // 文件标题
    @NameInMap("Filename")
    public String filename;

    // 媒资Id
    @NameInMap("MediaId")
    public String mediaId;

    public static AddFileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFileInfoRequest self = new AddFileInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddFileInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddFileInfoRequest setBusinessType(Long businessType) {
        this.businessType = businessType;
        return this;
    }
    public Long getBusinessType() {
        return this.businessType;
    }

    public AddFileInfoRequest setFileType(Long fileType) {
        this.fileType = fileType;
        return this;
    }
    public Long getFileType() {
        return this.fileType;
    }

    public AddFileInfoRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AddFileInfoRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public AddFileInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
