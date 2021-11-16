// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLRequest extends TeaModel {
    @NameInMap("Definition")
    public String definition;

    @NameInMap("FileExtension")
    public String fileExtension;

    // 视频流HDR类型
    @NameInMap("HDRType")
    public String HDRType;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("StreamURL")
    public String streamURL;

    @NameInMap("UserData")
    public String userData;

    public static UploadStreamByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadStreamByURLRequest self = new UploadStreamByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadStreamByURLRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UploadStreamByURLRequest setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public UploadStreamByURLRequest setHDRType(String HDRType) {
        this.HDRType = HDRType;
        return this;
    }
    public String getHDRType() {
        return this.HDRType;
    }

    public UploadStreamByURLRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UploadStreamByURLRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public UploadStreamByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
