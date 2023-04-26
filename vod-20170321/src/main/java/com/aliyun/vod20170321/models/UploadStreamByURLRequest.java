// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLRequest extends TeaModel {
    /**
     * <p>The media ID in ApsaraVideo VOD.</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The quality of the video stream.</p>
     * <br>
     * <p>For more information about valid values of this parameter, see [Parameters for media assets](~~124671~~).</p>
     */
    @NameInMap("FileExtension")
    public String fileExtension;

    /**
     * <p>The file name extension of the transcoded stream.</p>
     * <br>
     * <p>For more information, see the Supported media file formats section in [Overview](~~55396~~).</p>
     * <br>
     * <p>If you set a value for this parameter, the file name extension specified in StreamURL is overwritten.</p>
     * <br>
     * <p>>  This parameter is required if you do not specify a file name extension in StreamURL.</p>
     */
    @NameInMap("HDRType")
    public String HDRType;

    /**
     * <p>The URL of the OSS object.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The basic information.</p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The ID of the request.</p>
     */
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
